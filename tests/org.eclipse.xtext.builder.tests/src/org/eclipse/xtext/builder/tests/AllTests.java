package org.eclipse.xtext.builder.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.xtext.builder.impl.BuilderTest;

/*
 * automatically generated by org.eclipse.emf.mwe.releng.GenerateTestSuite 
 * 
 * @generated 
 */
public class AllTests {
   public static Test suite() {
      TestSuite suite = new TestSuite("Tests for org.eclipse.xtext.builder.tests");
      suite.addTestSuite(org.eclipse.xtext.builder.builderState.PersistableResourceDescriptionsTest.class);
      suite.addTestSuite(BuilderTest.class);
      return suite;
   }
}
