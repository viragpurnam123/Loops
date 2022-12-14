/*
 * generated by Xtext 2.25.0
 */
grammar InternalLoopsDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.loops.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.loops.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.loops.services.LoopsDslGrammarAccess;

}
@parser::members {
	private LoopsDslGrammarAccess grammarAccess;

	public void setGrammarAccess(LoopsDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleScript
entryRuleScript
:
{ before(grammarAccess.getScriptRule()); }
	 ruleScript
{ after(grammarAccess.getScriptRule()); } 
	 EOF 
;

// Rule Script
ruleScript 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScriptAccess().getGroup()); }
		(rule__Script__Group__0)
		{ after(grammarAccess.getScriptAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRepeat
entryRuleRepeat
:
{ before(grammarAccess.getRepeatRule()); }
	 ruleRepeat
{ after(grammarAccess.getRepeatRule()); } 
	 EOF 
;

// Rule Repeat
ruleRepeat 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRepeatAccess().getGroup()); }
		(rule__Repeat__Group__0)
		{ after(grammarAccess.getRepeatAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Script__Group__0__Impl
	rule__Script__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScriptAccess().getScriptKeyword_0()); }
	'script'
	{ after(grammarAccess.getScriptAccess().getScriptKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Script__Group__1__Impl
	rule__Script__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScriptAccess().getScriptNameAssignment_1()); }
	(rule__Script__ScriptNameAssignment_1)
	{ after(grammarAccess.getScriptAccess().getScriptNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Script__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScriptAccess().getRepeatAssignment_2()); }
	(rule__Script__RepeatAssignment_2)
	{ after(grammarAccess.getScriptAccess().getRepeatAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Repeat__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Repeat__Group__0__Impl
	rule__Repeat__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Repeat__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRepeatAccess().getRepeatKeyword_0()); }
	'repeat'
	{ after(grammarAccess.getRepeatAccess().getRepeatKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Repeat__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Repeat__Group__1__Impl
	rule__Repeat__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Repeat__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRepeatAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getRepeatAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Repeat__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Repeat__Group__2__Impl
	rule__Repeat__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Repeat__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRepeatAccess().getExpressionAssignment_2()); }
	(rule__Repeat__ExpressionAssignment_2)
	{ after(grammarAccess.getRepeatAccess().getExpressionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Repeat__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Repeat__Group__3__Impl
	rule__Repeat__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Repeat__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRepeatAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getRepeatAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Repeat__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Repeat__Group__4__Impl
	rule__Repeat__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Repeat__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRepeatAccess().getNumAssignment_4()); }
	(rule__Repeat__NumAssignment_4)
	{ after(grammarAccess.getRepeatAccess().getNumAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Repeat__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Repeat__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Repeat__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRepeatAccess().getTimesKeyword_5()); }
	'times'
	{ after(grammarAccess.getRepeatAccess().getTimesKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Script__ScriptNameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScriptAccess().getScriptNameEXPRESSIONTerminalRuleCall_1_0()); }
		RULE_EXPRESSION
		{ after(grammarAccess.getScriptAccess().getScriptNameEXPRESSIONTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__RepeatAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScriptAccess().getRepeatRepeatParserRuleCall_2_0()); }
		ruleRepeat
		{ after(grammarAccess.getScriptAccess().getRepeatRepeatParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Repeat__ExpressionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRepeatAccess().getExpressionEXPRESSIONTerminalRuleCall_2_0()); }
		RULE_EXPRESSION
		{ after(grammarAccess.getRepeatAccess().getExpressionEXPRESSIONTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Repeat__NumAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRepeatAccess().getNumINTTerminalRuleCall_4_0()); }
		RULE_INT
		{ after(grammarAccess.getRepeatAccess().getNumINTTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_EXPRESSION : ('a'..'z'|'A'..'Z'|'_'|'"'|'('|')'|'.'|',') ('a'..'z'|'A'..'Z'|'_'|'0'..'9'|'"'|'('|')'|'.'|',')*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
