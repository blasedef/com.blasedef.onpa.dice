/*
* generated by Xtext
*/
package com.blasedef.onpa.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.blasedef.onpa.services.ONPAGrammarAccess;

public class ONPAParser extends AbstractContentAssistParser {
	
	@Inject
	private ONPAGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.blasedef.onpa.ui.contentassist.antlr.internal.InternalONPAParser createParser() {
		com.blasedef.onpa.ui.contentassist.antlr.internal.InternalONPAParser result = new com.blasedef.onpa.ui.contentassist.antlr.internal.InternalONPAParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
					put(grammarAccess.getDoubleAccess().getAlternatives_1_2(), "rule__Double__Alternatives_1_2");
					put(grammarAccess.getRateAccess().getGroup(), "rule__Rate__Group__0");
					put(grammarAccess.getSubtractionAccess().getGroup(), "rule__Subtraction__Group__0");
					put(grammarAccess.getSubtractionAccess().getGroup_1(), "rule__Subtraction__Group_1__0");
					put(grammarAccess.getAdditionAccess().getGroup(), "rule__Addition__Group__0");
					put(grammarAccess.getAdditionAccess().getGroup_1(), "rule__Addition__Group_1__0");
					put(grammarAccess.getMultiplicationAccess().getGroup(), "rule__Multiplication__Group__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1(), "rule__Multiplication__Group_1__0");
					put(grammarAccess.getDivisionAccess().getGroup(), "rule__Division__Group__0");
					put(grammarAccess.getDivisionAccess().getGroup_1(), "rule__Division__Group_1__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_0(), "rule__PrimaryExpression__Group_0__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_1(), "rule__PrimaryExpression__Group_1__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_2(), "rule__PrimaryExpression__Group_2__0");
					put(grammarAccess.getDoubleAccess().getGroup(), "rule__Double__Group__0");
					put(grammarAccess.getDoubleAccess().getGroup_1(), "rule__Double__Group_1__0");
					put(grammarAccess.getDoubleAccess().getGroup_1_2_1(), "rule__Double__Group_1_2_1__0");
					put(grammarAccess.getModelAccess().getRatesAssignment(), "rule__Model__RatesAssignment");
					put(grammarAccess.getRateAccess().getNameAssignment_0(), "rule__Rate__NameAssignment_0");
					put(grammarAccess.getRateAccess().getValueAssignment_2(), "rule__Rate__ValueAssignment_2");
					put(grammarAccess.getSubtractionAccess().getRightAssignment_1_2(), "rule__Subtraction__RightAssignment_1_2");
					put(grammarAccess.getAdditionAccess().getRightAssignment_1_2(), "rule__Addition__RightAssignment_1_2");
					put(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2(), "rule__Multiplication__RightAssignment_1_2");
					put(grammarAccess.getDivisionAccess().getRightAssignment_1_2(), "rule__Division__RightAssignment_1_2");
					put(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1(), "rule__PrimaryExpression__ValueAssignment_1_1");
					put(grammarAccess.getPrimaryExpressionAccess().getRateAssignment_2_1(), "rule__PrimaryExpression__RateAssignment_2_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.blasedef.onpa.ui.contentassist.antlr.internal.InternalONPAParser typedParser = (com.blasedef.onpa.ui.contentassist.antlr.internal.InternalONPAParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ONPAGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ONPAGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
