/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.builder.builderState;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.builder.builderState.impl.ResourceDescriptionImpl;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.resource.impl.AbstractResourceDescriptionChangeEventSource;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionDelta;
import org.eclipse.xtext.resource.impl.ResourceDescriptionChangeEvent;
import org.eclipse.xtext.scoping.namespaces.DefaultGlobalScopeProvider;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * @author Sven Efftinge - Initial contribution and API
 */
public class PersistableResourceDescriptionsImpl extends AbstractResourceDescriptionChangeEventSource implements
		IBuilderState {

	private volatile Map<URI, IResourceDescription> resourceDescriptionMap = Collections.emptyMap();

	@Inject
	private ResourceDescriptionsUpdater updater;

	@Inject
	private IMarkerUpdater markerUpdater;

	@Inject
	private Provider<ResourceSet> resourceSetProvider;

	public void setResourceSetProvider(Provider<ResourceSet> resourceSetProvider) {
		this.resourceSetProvider = resourceSetProvider;
	}

	public synchronized ImmutableList<IResourceDescription.Delta> update(Map<URI, IStorage> toBeAddedOrUpdated,
			Set<URI> toBeRemoved, IProgressMonitor monitor) {
		if (monitor.isCanceled())
			return ImmutableList.of();
		ResourceSet resourceSet = resourceSetProvider.get();
		resourceSet.eAdapters().add(new ShadowingResourceDescriptions.Adapter(this, toBeAddedOrUpdated, toBeRemoved));
		resourceSet.getLoadOptions().put(DefaultGlobalScopeProvider.NAMED_BUILDER_SCOPE, Boolean.TRUE);
		
		Iterable<Delta> deltas = updater.transitiveUpdate(this, resourceSet, toBeAddedOrUpdated.keySet(), toBeRemoved,
				monitor);
		Set<Delta> copiedDeltas = Sets.newHashSet();
		Map<URI, IResourceDescription> newMap = Maps.newHashMap(resourceDescriptionMap);
		for (Delta delta : deltas) {
			if (monitor.isCanceled())
				return ImmutableList.of();
			DefaultResourceDescriptionDelta copiedDelta = new DefaultResourceDescriptionDelta(delta.getOld(),
					createNew(delta, toBeAddedOrUpdated));
			copiedDeltas.add(copiedDelta);
			if (delta.getNew() == null) {
				newMap.remove(copiedDelta.getOld().getURI());
			} else {
				newMap.put(copiedDelta.getNew().getURI(), copiedDelta.getNew());
			}
		}
		ResourceDescriptionChangeEvent event = new ResourceDescriptionChangeEvent(copiedDeltas, this);
		if (monitor.isCanceled())
			return ImmutableList.of();
		doValidate(resourceSet, event.getDeltas(), monitor);

		// update the reference
		resourceDescriptionMap = Collections.unmodifiableMap(newMap);
		notifyListeners(event);
		return event.getDeltas();
	}

	protected void doValidate(ResourceSet rs, ImmutableList<Delta> deltas, IProgressMonitor monitor) {
		markerUpdater.updateMarker(rs, deltas, monitor);
	}

	private IResourceDescription createNew(Delta delta, Map<URI, IStorage> toBeAddedOrUpdated) {
		if (delta.getNew() == null)
			return null;
		IResourceDescription toCopy = delta.getNew();
		ResourceDescriptionImpl copied = BuilderStateUtil.create(toCopy);
		IStorage storage = toBeAddedOrUpdated.get(toCopy.getURI());
		if (storage == null) {
			ResourceDescriptionImpl resourceDescriptionImpl = (ResourceDescriptionImpl) delta.getOld();
			if (resourceDescriptionImpl != null)
				storage = resourceDescriptionImpl.getStorage();
		}
		copied.setStorage(storage);
		return copied;
	}

	public Iterable<IResourceDescription> getAllResourceDescriptions() {
		return resourceDescriptionMap.values();
	}

	public IResourceDescription getResourceDescription(URI uri) {
		return resourceDescriptionMap.get(uri);
	}

}
