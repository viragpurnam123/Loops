/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.loops.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.loops.loopsDsl.LoopsDslPackage;
import org.xtext.example.loops.loopsDsl.Repeat;
import org.xtext.example.loops.loopsDsl.Script;
import org.xtext.example.loops.services.LoopsDslGrammarAccess;

@SuppressWarnings("all")
public class LoopsDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LoopsDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == LoopsDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case LoopsDslPackage.REPEAT:
				sequence_Repeat(context, (Repeat) semanticObject); 
				return; 
			case LoopsDslPackage.SCRIPT:
				sequence_Script(context, (Script) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Repeat returns Repeat
	 *
	 * Constraint:
	 *     (expression=EXPRESSION num=INT)
	 */
	protected void sequence_Repeat(ISerializationContext context, Repeat semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LoopsDslPackage.Literals.REPEAT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LoopsDslPackage.Literals.REPEAT__EXPRESSION));
			if (transientValues.isValueTransient(semanticObject, LoopsDslPackage.Literals.REPEAT__NUM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LoopsDslPackage.Literals.REPEAT__NUM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRepeatAccess().getExpressionEXPRESSIONTerminalRuleCall_2_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getRepeatAccess().getNumINTTerminalRuleCall_4_0(), semanticObject.getNum());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Script returns Script
	 *
	 * Constraint:
	 *     (scriptName=EXPRESSION repeat=Repeat)
	 */
	protected void sequence_Script(ISerializationContext context, Script semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LoopsDslPackage.Literals.SCRIPT__SCRIPT_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LoopsDslPackage.Literals.SCRIPT__SCRIPT_NAME));
			if (transientValues.isValueTransient(semanticObject, LoopsDslPackage.Literals.SCRIPT__REPEAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LoopsDslPackage.Literals.SCRIPT__REPEAT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getScriptAccess().getScriptNameEXPRESSIONTerminalRuleCall_1_0(), semanticObject.getScriptName());
		feeder.accept(grammarAccess.getScriptAccess().getRepeatRepeatParserRuleCall_2_0(), semanticObject.getRepeat());
		feeder.finish();
	}
	
	
}
