/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.tests.editor.contentassist.ide.contentassist.antlr.internal.InternalParametersTestLanguageExParser;
import org.eclipse.xtext.ui.tests.editor.contentassist.services.ParametersTestLanguageExGrammarAccess;

public class ParametersTestLanguageExParser extends AbstractContentAssistParser {

	@Inject
	private ParametersTestLanguageExGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalParametersTestLanguageExParser createParser() {
		InternalParametersTestLanguageExParser result = new InternalParametersTestLanguageExParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getAlternatives_1(), "superParserRuleParameters__Alternatives_1");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getAlternatives_1_8_1(), "superParserRuleParameters__Alternatives_1_8_1");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getAlternatives_1_9_1(), "superParserRuleParameters__Alternatives_1_9_1");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getAlternatives_1_10_1(), "superParserRuleParameters__Alternatives_1_10_1");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getAlternatives_1_11_1(), "superParserRuleParameters__Alternatives_1_11_1");
					put(grammarAccess.getParametersTestLanguageScenario1Access().getAlternatives(), "superScenario1__Alternatives");
					put(grammarAccess.getScenario3Access().getAlternatives(), "rule__Scenario3__Alternatives");
					put(grammarAccess.getScenario5Access().getAlternatives(), "rule__Scenario5__Alternatives");
					put(grammarAccess.getIdOrKeywordAccess().getAlternatives(), "rule__IdOrKeyword__Alternatives");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getGroup(), "superParserRuleParameters__Group__0");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getGroup_1_0(), "superParserRuleParameters__Group_1_0__0");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getGroup_1_1(), "superParserRuleParameters__Group_1_1__0");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getGroup_1_2(), "superParserRuleParameters__Group_1_2__0");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getGroup_1_3(), "superParserRuleParameters__Group_1_3__0");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getGroup_1_4(), "superParserRuleParameters__Group_1_4__0");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getGroup_1_4_0(), "superParserRuleParameters__Group_1_4_0__0");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getGroup_1_5(), "superParserRuleParameters__Group_1_5__0");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getGroup_1_5_0(), "superParserRuleParameters__Group_1_5_0__0");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getGroup_1_6(), "superParserRuleParameters__Group_1_6__0");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getGroup_1_7(), "superParserRuleParameters__Group_1_7__0");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getGroup_1_8(), "superParserRuleParameters__Group_1_8__0");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getGroup_1_8_1_1(), "superParserRuleParameters__Group_1_8_1_1__0");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getGroup_1_9(), "superParserRuleParameters__Group_1_9__0");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getGroup_1_9_1_1(), "superParserRuleParameters__Group_1_9_1_1__0");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getGroup_1_10(), "superParserRuleParameters__Group_1_10__0");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getGroup_1_10_1_1(), "superParserRuleParameters__Group_1_10_1_1__0");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getGroup_1_11(), "superParserRuleParameters__Group_1_11__0");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getGroup_1_11_1_1(), "superParserRuleParameters__Group_1_11_1_1__0");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getGroup_1_12(), "superParserRuleParameters__Group_1_12__0");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getGroup_1_13(), "superParserRuleParameters__Group_1_13__0");
					put(grammarAccess.getParametersTestLanguageScenario1Access().getGroup_0(), "superScenario1__Group_0__0");
					put(grammarAccess.getParametersTestLanguageScenario1Access().getGroup_1(), "superScenario1__Group_1__0");
					put(grammarAccess.getScenario4Access().getGroup(), "rule__Scenario4__Group__0");
					put(grammarAccess.getScenario5Access().getGroup_0(), "rule__Scenario5__Group_0__0");
					put(grammarAccess.getScenario5Access().getGroup_1(), "rule__Scenario5__Group_1__0");
					put(grammarAccess.getScenario5Access().getGroup_2(), "rule__Scenario5__Group_2__0");
					put(grammarAccess.getScenario5Access().getGroup_2_2(), "rule__Scenario5__Group_2_2__0");
					put(grammarAccess.getIdOrKeywordAccess().getGroup_0(), "rule__IdOrKeyword__Group_0__0");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioAssignment_1_0_1(), "superParserRuleParameters__ScenarioAssignment_1_0_1");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioAssignment_1_1_1(), "superParserRuleParameters__ScenarioAssignment_1_1_1");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioAssignment_1_2_1(), "superParserRuleParameters__ScenarioAssignment_1_2_1");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioAssignment_1_3_1(), "superParserRuleParameters__ScenarioAssignment_1_3_1");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioAssignment_1_4_0_1(), "superParserRuleParameters__ScenarioAssignment_1_4_0_1");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioAssignment_1_5_0_1(), "superParserRuleParameters__ScenarioAssignment_1_5_0_1");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioAssignment_1_6_1(), "superParserRuleParameters__ScenarioAssignment_1_6_1");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioAssignment_1_7_1(), "superParserRuleParameters__ScenarioAssignment_1_7_1");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioAssignment_1_8_1_0(), "superParserRuleParameters__ScenarioAssignment_1_8_1_0");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioAssignment_1_8_1_1_0(), "superParserRuleParameters__ScenarioAssignment_1_8_1_1_0");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioAssignment_1_9_1_0(), "superParserRuleParameters__ScenarioAssignment_1_9_1_0");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioAssignment_1_9_1_1_0(), "superParserRuleParameters__ScenarioAssignment_1_9_1_1_0");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioAssignment_1_10_1_0(), "superParserRuleParameters__ScenarioAssignment_1_10_1_0");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioAssignment_1_10_1_1_0(), "superParserRuleParameters__ScenarioAssignment_1_10_1_1_0");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioAssignment_1_11_1_0(), "superParserRuleParameters__ScenarioAssignment_1_11_1_0");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioAssignment_1_11_1_1_0(), "superParserRuleParameters__ScenarioAssignment_1_11_1_1_0");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioAssignment_1_12_1(), "superParserRuleParameters__ScenarioAssignment_1_12_1");
					put(grammarAccess.getParametersTestLanguageParserRuleParametersAccess().getScenarioAssignment_1_13_1(), "superParserRuleParameters__ScenarioAssignment_1_13_1");
					put(grammarAccess.getParametersTestLanguageScenario1Access().getFirstAssignment_0_0(), "superScenario1__FirstAssignment_0_0");
					put(grammarAccess.getParametersTestLanguageScenario1Access().getSecondAssignment_1_0(), "superScenario1__SecondAssignment_1_0");
					put(grammarAccess.getScenario2Access().getFirstAssignment(), "rule__Scenario2__FirstAssignment");
					put(grammarAccess.getScenario3Access().getFirstAssignment_0(), "rule__Scenario3__FirstAssignment_0");
					put(grammarAccess.getScenario3Access().getSecondAssignment_1(), "rule__Scenario3__SecondAssignment_1");
					put(grammarAccess.getScenario4Access().getSecondAssignment_0(), "rule__Scenario4__SecondAssignment_0");
					put(grammarAccess.getScenario5Access().getFirstAssignment_2_3(), "rule__Scenario5__FirstAssignment_2_3");
					put(grammarAccess.getScenario5Access().getSecondAssignment_2_4(), "rule__Scenario5__SecondAssignment_2_4");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalParametersTestLanguageExParser typedParser = (InternalParametersTestLanguageExParser) parser;
			typedParser.entryRuleParserRuleParameters();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ParametersTestLanguageExGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ParametersTestLanguageExGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}