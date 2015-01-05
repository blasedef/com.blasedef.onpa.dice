/*
* generated by Xtext
*/
package com.blasedef.onpa.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class ONPAGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Assignment cRatesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cRatesRateParserRuleCall_0 = (RuleCall)cRatesAssignment.eContents().get(0);
		
		//Model:
		//	rates+=Rate+;
		public ParserRule getRule() { return rule; }

		//rates+=Rate+
		public Assignment getRatesAssignment() { return cRatesAssignment; }

		//Rate
		public RuleCall getRatesRateParserRuleCall_0() { return cRatesRateParserRuleCall_0; }
	}

	public class RateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Rate");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameLOWERTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueExpressionParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Rate:
		//	name=LOWER "=" value=Expression ";";
		public ParserRule getRule() { return rule; }

		//name=LOWER "=" value=Expression ";"
		public Group getGroup() { return cGroup; }

		//name=LOWER
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//LOWER
		public RuleCall getNameLOWERTerminalRuleCall_0_0() { return cNameLOWERTerminalRuleCall_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }

		//value=Expression
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }

		//Expression
		public RuleCall getValueExpressionParserRuleCall_2_0() { return cValueExpressionParserRuleCall_2_0; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}

	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Expression");
		private final RuleCall cSubtractionParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Expression:
		//	Subtraction;
		public ParserRule getRule() { return rule; }

		//Subtraction
		public RuleCall getSubtractionParserRuleCall() { return cSubtractionParserRuleCall; }
	}

	public class SubtractionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Subtraction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAdditionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cSubLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightAdditionParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Subtraction returns Expression:
		//	Addition ({Sub.left=current} "-" right=Addition)*;
		public ParserRule getRule() { return rule; }

		//Addition ({Sub.left=current} "-" right=Addition)*
		public Group getGroup() { return cGroup; }

		//Addition
		public RuleCall getAdditionParserRuleCall_0() { return cAdditionParserRuleCall_0; }

		//({Sub.left=current} "-" right=Addition)*
		public Group getGroup_1() { return cGroup_1; }

		//{Sub.left=current}
		public Action getSubLeftAction_1_0() { return cSubLeftAction_1_0; }

		//"-"
		public Keyword getHyphenMinusKeyword_1_1() { return cHyphenMinusKeyword_1_1; }

		//right=Addition
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }

		//Addition
		public RuleCall getRightAdditionParserRuleCall_1_2_0() { return cRightAdditionParserRuleCall_1_2_0; }
	}

	public class AdditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Addition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMultiplicationParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cPluLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cPlusSignKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightMultiplicationParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Addition returns Expression:
		//	Multiplication ({Plu.left=current} "+" right=Multiplication)*;
		public ParserRule getRule() { return rule; }

		//Multiplication ({Plu.left=current} "+" right=Multiplication)*
		public Group getGroup() { return cGroup; }

		//Multiplication
		public RuleCall getMultiplicationParserRuleCall_0() { return cMultiplicationParserRuleCall_0; }

		//({Plu.left=current} "+" right=Multiplication)*
		public Group getGroup_1() { return cGroup_1; }

		//{Plu.left=current}
		public Action getPluLeftAction_1_0() { return cPluLeftAction_1_0; }

		//"+"
		public Keyword getPlusSignKeyword_1_1() { return cPlusSignKeyword_1_1; }

		//right=Multiplication
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }

		//Multiplication
		public RuleCall getRightMultiplicationParserRuleCall_1_2_0() { return cRightMultiplicationParserRuleCall_1_2_0; }
	}

	public class MultiplicationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Multiplication");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cDivisionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cMulLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cAsteriskKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightDivisionParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Multiplication returns Expression:
		//	Division ({Mul.left=current} "*" right=Division)*;
		public ParserRule getRule() { return rule; }

		//Division ({Mul.left=current} "*" right=Division)*
		public Group getGroup() { return cGroup; }

		//Division
		public RuleCall getDivisionParserRuleCall_0() { return cDivisionParserRuleCall_0; }

		//({Mul.left=current} "*" right=Division)*
		public Group getGroup_1() { return cGroup_1; }

		//{Mul.left=current}
		public Action getMulLeftAction_1_0() { return cMulLeftAction_1_0; }

		//"*"
		public Keyword getAsteriskKeyword_1_1() { return cAsteriskKeyword_1_1; }

		//right=Division
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }

		//Division
		public RuleCall getRightDivisionParserRuleCall_1_2_0() { return cRightDivisionParserRuleCall_1_2_0; }
	}

	public class DivisionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Division");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPrimaryExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cDivLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cSolidusKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightPrimaryExpressionParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Division returns Expression:
		//	PrimaryExpression ({Div.left=current} "/" right=PrimaryExpression)*;
		public ParserRule getRule() { return rule; }

		//PrimaryExpression ({Div.left=current} "/" right=PrimaryExpression)*
		public Group getGroup() { return cGroup; }

		//PrimaryExpression
		public RuleCall getPrimaryExpressionParserRuleCall_0() { return cPrimaryExpressionParserRuleCall_0; }

		//({Div.left=current} "/" right=PrimaryExpression)*
		public Group getGroup_1() { return cGroup_1; }

		//{Div.left=current}
		public Action getDivLeftAction_1_0() { return cDivLeftAction_1_0; }

		//"/"
		public Keyword getSolidusKeyword_1_1() { return cSolidusKeyword_1_1; }

		//right=PrimaryExpression
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }

		//PrimaryExpression
		public RuleCall getRightPrimaryExpressionParserRuleCall_1_2_0() { return cRightPrimaryExpressionParserRuleCall_1_2_0; }
	}

	public class PrimaryExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PrimaryExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cExpressionParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cConstantAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cValueDoubleParserRuleCall_1_1_0 = (RuleCall)cValueAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cRateAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Assignment cRateAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cRateRateCrossReference_2_1_0 = (CrossReference)cRateAssignment_2_1.eContents().get(0);
		private final RuleCall cRateRateLOWERTerminalRuleCall_2_1_0_1 = (RuleCall)cRateRateCrossReference_2_1_0.eContents().get(1);
		
		//PrimaryExpression returns Expression:
		//	"(" Expression ")" | {Constant} value=Double | {Rate} rate=[Rate|LOWER];
		public ParserRule getRule() { return rule; }

		//"(" Expression ")" | {Constant} value=Double | {Rate} rate=[Rate|LOWER]
		public Alternatives getAlternatives() { return cAlternatives; }

		//"(" Expression ")"
		public Group getGroup_0() { return cGroup_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_0_0() { return cLeftParenthesisKeyword_0_0; }

		//Expression
		public RuleCall getExpressionParserRuleCall_0_1() { return cExpressionParserRuleCall_0_1; }

		//")"
		public Keyword getRightParenthesisKeyword_0_2() { return cRightParenthesisKeyword_0_2; }

		//{Constant} value=Double
		public Group getGroup_1() { return cGroup_1; }

		//{Constant}
		public Action getConstantAction_1_0() { return cConstantAction_1_0; }

		//value=Double
		public Assignment getValueAssignment_1_1() { return cValueAssignment_1_1; }

		//Double
		public RuleCall getValueDoubleParserRuleCall_1_1_0() { return cValueDoubleParserRuleCall_1_1_0; }

		//{Rate} rate=[Rate|LOWER]
		public Group getGroup_2() { return cGroup_2; }

		//{Rate}
		public Action getRateAction_2_0() { return cRateAction_2_0; }

		//rate=[Rate|LOWER]
		public Assignment getRateAssignment_2_1() { return cRateAssignment_2_1; }

		//[Rate|LOWER]
		public CrossReference getRateRateCrossReference_2_1_0() { return cRateRateCrossReference_2_1_0; }

		//LOWER
		public RuleCall getRateRateLOWERTerminalRuleCall_2_1_0_1() { return cRateRateLOWERTerminalRuleCall_2_1_0_1; }
	}

	public class DoubleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Double");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Alternatives cAlternatives_1_2 = (Alternatives)cGroup_1.eContents().get(2);
		private final Keyword cEKeyword_1_2_0 = (Keyword)cAlternatives_1_2.eContents().get(0);
		private final Group cGroup_1_2_1 = (Group)cAlternatives_1_2.eContents().get(1);
		private final Keyword cEKeyword_1_2_1_0 = (Keyword)cGroup_1_2_1.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1_2_1_1 = (Keyword)cGroup_1_2_1.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_2_1_2 = (RuleCall)cGroup_1_2_1.eContents().get(2);
		
		//Double returns ecore::EDouble:
		//	INT ("." INT ("e" | "E" "-"? INT)?)?;
		public ParserRule getRule() { return rule; }

		//INT ("." INT ("e" | "E" "-"? INT)?)?
		public Group getGroup() { return cGroup; }

		//INT
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }

		//("." INT ("e" | "E" "-"? INT)?)?
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//INT
		public RuleCall getINTTerminalRuleCall_1_1() { return cINTTerminalRuleCall_1_1; }

		//("e" | "E" "-"? INT)?
		public Alternatives getAlternatives_1_2() { return cAlternatives_1_2; }

		//"e"
		public Keyword getEKeyword_1_2_0() { return cEKeyword_1_2_0; }

		//"E" "-"? INT
		public Group getGroup_1_2_1() { return cGroup_1_2_1; }

		//"E"
		public Keyword getEKeyword_1_2_1_0() { return cEKeyword_1_2_1_0; }

		//"-"?
		public Keyword getHyphenMinusKeyword_1_2_1_1() { return cHyphenMinusKeyword_1_2_1_1; }

		//INT
		public RuleCall getINTTerminalRuleCall_1_2_1_2() { return cINTTerminalRuleCall_1_2_1_2; }
	}
	
	
	private final ModelElements pModel;
	private final RateElements pRate;
	private final ExpressionElements pExpression;
	private final SubtractionElements pSubtraction;
	private final AdditionElements pAddition;
	private final MultiplicationElements pMultiplication;
	private final DivisionElements pDivision;
	private final PrimaryExpressionElements pPrimaryExpression;
	private final DoubleElements pDouble;
	private final TerminalRule tLOWER;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ONPAGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pRate = new RateElements();
		this.pExpression = new ExpressionElements();
		this.pSubtraction = new SubtractionElements();
		this.pAddition = new AdditionElements();
		this.pMultiplication = new MultiplicationElements();
		this.pDivision = new DivisionElements();
		this.pPrimaryExpression = new PrimaryExpressionElements();
		this.pDouble = new DoubleElements();
		this.tLOWER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "LOWER");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.blasedef.onpa.ONPA".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	rates+=Rate+;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Rate:
	//	name=LOWER "=" value=Expression ";";
	public RateElements getRateAccess() {
		return pRate;
	}
	
	public ParserRule getRateRule() {
		return getRateAccess().getRule();
	}

	//Expression:
	//	Subtraction;
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}

	//Subtraction returns Expression:
	//	Addition ({Sub.left=current} "-" right=Addition)*;
	public SubtractionElements getSubtractionAccess() {
		return pSubtraction;
	}
	
	public ParserRule getSubtractionRule() {
		return getSubtractionAccess().getRule();
	}

	//Addition returns Expression:
	//	Multiplication ({Plu.left=current} "+" right=Multiplication)*;
	public AdditionElements getAdditionAccess() {
		return pAddition;
	}
	
	public ParserRule getAdditionRule() {
		return getAdditionAccess().getRule();
	}

	//Multiplication returns Expression:
	//	Division ({Mul.left=current} "*" right=Division)*;
	public MultiplicationElements getMultiplicationAccess() {
		return pMultiplication;
	}
	
	public ParserRule getMultiplicationRule() {
		return getMultiplicationAccess().getRule();
	}

	//Division returns Expression:
	//	PrimaryExpression ({Div.left=current} "/" right=PrimaryExpression)*;
	public DivisionElements getDivisionAccess() {
		return pDivision;
	}
	
	public ParserRule getDivisionRule() {
		return getDivisionAccess().getRule();
	}

	//PrimaryExpression returns Expression:
	//	"(" Expression ")" | {Constant} value=Double | {Rate} rate=[Rate|LOWER];
	public PrimaryExpressionElements getPrimaryExpressionAccess() {
		return pPrimaryExpression;
	}
	
	public ParserRule getPrimaryExpressionRule() {
		return getPrimaryExpressionAccess().getRule();
	}

	//Double returns ecore::EDouble:
	//	INT ("." INT ("e" | "E" "-"? INT)?)?;
	public DoubleElements getDoubleAccess() {
		return pDouble;
	}
	
	public ParserRule getDoubleRule() {
		return getDoubleAccess().getRule();
	}

	//terminal LOWER:
	//	"a".."z"+ ID?;
	public TerminalRule getLOWERRule() {
		return tLOWER;
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
