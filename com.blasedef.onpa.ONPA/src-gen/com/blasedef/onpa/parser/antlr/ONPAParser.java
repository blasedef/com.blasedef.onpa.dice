/*
* generated by Xtext
*/
package com.blasedef.onpa.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import com.blasedef.onpa.services.ONPAGrammarAccess;

public class ONPAParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ONPAGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected com.blasedef.onpa.parser.antlr.internal.InternalONPAParser createParser(XtextTokenStream stream) {
		return new com.blasedef.onpa.parser.antlr.internal.InternalONPAParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public ONPAGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ONPAGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}