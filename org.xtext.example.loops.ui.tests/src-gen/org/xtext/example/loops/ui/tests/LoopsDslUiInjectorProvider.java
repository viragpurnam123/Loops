/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.loops.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.loops.ui.internal.LoopsActivator;

public class LoopsDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return LoopsActivator.getInstance().getInjector("org.xtext.example.loops.LoopsDsl");
	}

}