/*
* generated by Xtext
*/
package org.eclipse.xtext.example.domainmodel.ui.outline;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode;

/**
 * customization of the default outline structure
 * 
 */
public class DomainmodelOutlineTreeProvider extends DefaultOutlineTreeProvider {

	@Override
	protected void _createChildren(DocumentRootNode parentNode, EObject rootElement) {
		for (EObject content : rootElement.eContents()) {
			createNode(parentNode, content);
		}
	}
}