/*
 * generated by Xtext 2.25.0
 */
grammar InternalLoopsDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.loops.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.loops.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.loops.services.LoopsDslGrammarAccess;

}

@parser::members {

 	private LoopsDslGrammarAccess grammarAccess;

    public InternalLoopsDslParser(TokenStream input, LoopsDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Script";
   	}

   	@Override
   	protected LoopsDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleScript
entryRuleScript returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScriptRule()); }
	iv_ruleScript=ruleScript
	{ $current=$iv_ruleScript.current; }
	EOF;

// Rule Script
ruleScript returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='script'
		{
			newLeafNode(otherlv_0, grammarAccess.getScriptAccess().getScriptKeyword_0());
		}
		(
			(
				lv_scriptName_1_0=RULE_EXPRESSION
				{
					newLeafNode(lv_scriptName_1_0, grammarAccess.getScriptAccess().getScriptNameEXPRESSIONTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getScriptRule());
					}
					setWithLastConsumed(
						$current,
						"scriptName",
						lv_scriptName_1_0,
						"org.xtext.example.loops.LoopsDsl.EXPRESSION");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getScriptAccess().getRepeatRepeatParserRuleCall_2_0());
				}
				lv_repeat_2_0=ruleRepeat
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScriptRule());
					}
					set(
						$current,
						"repeat",
						lv_repeat_2_0,
						"org.xtext.example.loops.LoopsDsl.Repeat");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleRepeat
entryRuleRepeat returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRepeatRule()); }
	iv_ruleRepeat=ruleRepeat
	{ $current=$iv_ruleRepeat.current; }
	EOF;

// Rule Repeat
ruleRepeat returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='repeat'
		{
			newLeafNode(otherlv_0, grammarAccess.getRepeatAccess().getRepeatKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getRepeatAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				lv_expression_2_0=RULE_EXPRESSION
				{
					newLeafNode(lv_expression_2_0, grammarAccess.getRepeatAccess().getExpressionEXPRESSIONTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRepeatRule());
					}
					setWithLastConsumed(
						$current,
						"expression",
						lv_expression_2_0,
						"org.xtext.example.loops.LoopsDsl.EXPRESSION");
				}
			)
		)
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getRepeatAccess().getRightCurlyBracketKeyword_3());
		}
		(
			(
				lv_num_4_0=RULE_INT
				{
					newLeafNode(lv_num_4_0, grammarAccess.getRepeatAccess().getNumINTTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRepeatRule());
					}
					setWithLastConsumed(
						$current,
						"num",
						lv_num_4_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_5='times'
		{
			newLeafNode(otherlv_5, grammarAccess.getRepeatAccess().getTimesKeyword_5());
		}
	)
;

RULE_EXPRESSION : ('a'..'z'|'A'..'Z'|'_'|'"'|'('|')'|'.'|',') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'"'|'('|')'|'.'|',')*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
