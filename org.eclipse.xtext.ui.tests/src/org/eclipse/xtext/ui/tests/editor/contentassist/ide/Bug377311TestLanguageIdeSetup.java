/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.ui.tests.editor.contentassist.Bug377311TestLanguageRuntimeModule;
import org.eclipse.xtext.ui.tests.editor.contentassist.Bug377311TestLanguageStandaloneSetup;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class Bug377311TestLanguageIdeSetup extends Bug377311TestLanguageStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(new Bug377311TestLanguageRuntimeModule(), new Bug377311TestLanguageIdeModule());
	}
}
