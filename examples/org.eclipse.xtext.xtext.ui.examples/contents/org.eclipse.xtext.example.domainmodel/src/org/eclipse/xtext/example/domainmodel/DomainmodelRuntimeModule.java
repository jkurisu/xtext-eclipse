/*
Generated with Xtext
*/
package org.eclipse.xtext.example.domainmodel;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.example.domainmodel.jvmmodel.DomainmodelIdentifiableSimpleNameProvider;
import org.eclipse.xtext.example.domainmodel.jvmmodel.DomainmodelJvmModelInferrer;
import org.eclipse.xtext.example.domainmodel.scoping.DomainmodelScopeProvider;
import org.eclipse.xtext.example.domainmodel.valueconverter.DomainmodelValueConverterService;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer;


/**
 * used to register components to be used within the IDE.
 */
public class DomainmodelRuntimeModule extends AbstractDomainmodelRuntimeModule {
	
	@Override
	public Class<? extends IScopeProvider> bindIScopeProvider() {
		return DomainmodelScopeProvider.class;
	}
	
	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return DomainmodelValueConverterService.class;
	}
	
	public Class<? extends IJvmModelInferrer> bindIJvmModelInferrer() {
		return DomainmodelJvmModelInferrer.class;
	}

	@Override
	public Class<? extends IdentifiableSimpleNameProvider> bindIdentifiableSimpleNameProvider() {
		return DomainmodelIdentifiableSimpleNameProvider.class;
	}
}