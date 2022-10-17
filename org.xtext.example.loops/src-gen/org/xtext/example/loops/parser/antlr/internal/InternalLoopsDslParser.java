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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLoopsDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EXPRESSION", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'script'", "'repeat'", "'{'", "'}'", "'times'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_EXPRESSION=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalLoopsDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLoopsDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLoopsDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLoopsDsl.g"; }



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




    // $ANTLR start "entryRuleScript"
    // InternalLoopsDsl.g:64:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // InternalLoopsDsl.g:64:47: (iv_ruleScript= ruleScript EOF )
            // InternalLoopsDsl.g:65:2: iv_ruleScript= ruleScript EOF
            {
             newCompositeNode(grammarAccess.getScriptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScript=ruleScript();

            state._fsp--;

             current =iv_ruleScript; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // InternalLoopsDsl.g:71:1: ruleScript returns [EObject current=null] : (otherlv_0= 'script' ( (lv_scriptName_1_0= RULE_EXPRESSION ) ) ( (lv_repeat_2_0= ruleRepeat ) ) ) ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_scriptName_1_0=null;
        EObject lv_repeat_2_0 = null;



        	enterRule();

        try {
            // InternalLoopsDsl.g:77:2: ( (otherlv_0= 'script' ( (lv_scriptName_1_0= RULE_EXPRESSION ) ) ( (lv_repeat_2_0= ruleRepeat ) ) ) )
            // InternalLoopsDsl.g:78:2: (otherlv_0= 'script' ( (lv_scriptName_1_0= RULE_EXPRESSION ) ) ( (lv_repeat_2_0= ruleRepeat ) ) )
            {
            // InternalLoopsDsl.g:78:2: (otherlv_0= 'script' ( (lv_scriptName_1_0= RULE_EXPRESSION ) ) ( (lv_repeat_2_0= ruleRepeat ) ) )
            // InternalLoopsDsl.g:79:3: otherlv_0= 'script' ( (lv_scriptName_1_0= RULE_EXPRESSION ) ) ( (lv_repeat_2_0= ruleRepeat ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScriptAccess().getScriptKeyword_0());
            		
            // InternalLoopsDsl.g:83:3: ( (lv_scriptName_1_0= RULE_EXPRESSION ) )
            // InternalLoopsDsl.g:84:4: (lv_scriptName_1_0= RULE_EXPRESSION )
            {
            // InternalLoopsDsl.g:84:4: (lv_scriptName_1_0= RULE_EXPRESSION )
            // InternalLoopsDsl.g:85:5: lv_scriptName_1_0= RULE_EXPRESSION
            {
            lv_scriptName_1_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_4); 

            					newLeafNode(lv_scriptName_1_0, grammarAccess.getScriptAccess().getScriptNameEXPRESSIONTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScriptRule());
            					}
            					setWithLastConsumed(
            						current,
            						"scriptName",
            						lv_scriptName_1_0,
            						"org.xtext.example.loops.LoopsDsl.EXPRESSION");
            				

            }


            }

            // InternalLoopsDsl.g:101:3: ( (lv_repeat_2_0= ruleRepeat ) )
            // InternalLoopsDsl.g:102:4: (lv_repeat_2_0= ruleRepeat )
            {
            // InternalLoopsDsl.g:102:4: (lv_repeat_2_0= ruleRepeat )
            // InternalLoopsDsl.g:103:5: lv_repeat_2_0= ruleRepeat
            {

            					newCompositeNode(grammarAccess.getScriptAccess().getRepeatRepeatParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_repeat_2_0=ruleRepeat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScriptRule());
            					}
            					set(
            						current,
            						"repeat",
            						lv_repeat_2_0,
            						"org.xtext.example.loops.LoopsDsl.Repeat");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleRepeat"
    // InternalLoopsDsl.g:124:1: entryRuleRepeat returns [EObject current=null] : iv_ruleRepeat= ruleRepeat EOF ;
    public final EObject entryRuleRepeat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeat = null;


        try {
            // InternalLoopsDsl.g:124:47: (iv_ruleRepeat= ruleRepeat EOF )
            // InternalLoopsDsl.g:125:2: iv_ruleRepeat= ruleRepeat EOF
            {
             newCompositeNode(grammarAccess.getRepeatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepeat=ruleRepeat();

            state._fsp--;

             current =iv_ruleRepeat; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepeat"


    // $ANTLR start "ruleRepeat"
    // InternalLoopsDsl.g:131:1: ruleRepeat returns [EObject current=null] : (otherlv_0= 'repeat' otherlv_1= '{' ( (lv_expression_2_0= RULE_EXPRESSION ) ) otherlv_3= '}' ( (lv_num_4_0= RULE_INT ) ) otherlv_5= 'times' ) ;
    public final EObject ruleRepeat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_expression_2_0=null;
        Token otherlv_3=null;
        Token lv_num_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalLoopsDsl.g:137:2: ( (otherlv_0= 'repeat' otherlv_1= '{' ( (lv_expression_2_0= RULE_EXPRESSION ) ) otherlv_3= '}' ( (lv_num_4_0= RULE_INT ) ) otherlv_5= 'times' ) )
            // InternalLoopsDsl.g:138:2: (otherlv_0= 'repeat' otherlv_1= '{' ( (lv_expression_2_0= RULE_EXPRESSION ) ) otherlv_3= '}' ( (lv_num_4_0= RULE_INT ) ) otherlv_5= 'times' )
            {
            // InternalLoopsDsl.g:138:2: (otherlv_0= 'repeat' otherlv_1= '{' ( (lv_expression_2_0= RULE_EXPRESSION ) ) otherlv_3= '}' ( (lv_num_4_0= RULE_INT ) ) otherlv_5= 'times' )
            // InternalLoopsDsl.g:139:3: otherlv_0= 'repeat' otherlv_1= '{' ( (lv_expression_2_0= RULE_EXPRESSION ) ) otherlv_3= '}' ( (lv_num_4_0= RULE_INT ) ) otherlv_5= 'times'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRepeatAccess().getRepeatKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRepeatAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLoopsDsl.g:147:3: ( (lv_expression_2_0= RULE_EXPRESSION ) )
            // InternalLoopsDsl.g:148:4: (lv_expression_2_0= RULE_EXPRESSION )
            {
            // InternalLoopsDsl.g:148:4: (lv_expression_2_0= RULE_EXPRESSION )
            // InternalLoopsDsl.g:149:5: lv_expression_2_0= RULE_EXPRESSION
            {
            lv_expression_2_0=(Token)match(input,RULE_EXPRESSION,FOLLOW_6); 

            					newLeafNode(lv_expression_2_0, grammarAccess.getRepeatAccess().getExpressionEXPRESSIONTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRepeatRule());
            					}
            					setWithLastConsumed(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"org.xtext.example.loops.LoopsDsl.EXPRESSION");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getRepeatAccess().getRightCurlyBracketKeyword_3());
            		
            // InternalLoopsDsl.g:169:3: ( (lv_num_4_0= RULE_INT ) )
            // InternalLoopsDsl.g:170:4: (lv_num_4_0= RULE_INT )
            {
            // InternalLoopsDsl.g:170:4: (lv_num_4_0= RULE_INT )
            // InternalLoopsDsl.g:171:5: lv_num_4_0= RULE_INT
            {
            lv_num_4_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            					newLeafNode(lv_num_4_0, grammarAccess.getRepeatAccess().getNumINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRepeatRule());
            					}
            					setWithLastConsumed(
            						current,
            						"num",
            						lv_num_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRepeatAccess().getTimesKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepeat"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});

}