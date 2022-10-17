/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.loops.loopsDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.loops.loopsDsl.LoopsDslFactory
 * @model kind="package"
 * @generated
 */
public interface LoopsDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "loopsDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/loops/LoopsDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "loopsDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LoopsDslPackage eINSTANCE = org.xtext.example.loops.loopsDsl.impl.LoopsDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.loops.loopsDsl.impl.ScriptImpl <em>Script</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.loops.loopsDsl.impl.ScriptImpl
   * @see org.xtext.example.loops.loopsDsl.impl.LoopsDslPackageImpl#getScript()
   * @generated
   */
  int SCRIPT = 0;

  /**
   * The feature id for the '<em><b>Script Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__SCRIPT_NAME = 0;

  /**
   * The feature id for the '<em><b>Repeat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__REPEAT = 1;

  /**
   * The number of structural features of the '<em>Script</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.loops.loopsDsl.impl.RepeatImpl <em>Repeat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.loops.loopsDsl.impl.RepeatImpl
   * @see org.xtext.example.loops.loopsDsl.impl.LoopsDslPackageImpl#getRepeat()
   * @generated
   */
  int REPEAT = 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT__NUM = 1;

  /**
   * The number of structural features of the '<em>Repeat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.example.loops.loopsDsl.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script</em>'.
   * @see org.xtext.example.loops.loopsDsl.Script
   * @generated
   */
  EClass getScript();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.loops.loopsDsl.Script#getScriptName <em>Script Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Script Name</em>'.
   * @see org.xtext.example.loops.loopsDsl.Script#getScriptName()
   * @see #getScript()
   * @generated
   */
  EAttribute getScript_ScriptName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.loops.loopsDsl.Script#getRepeat <em>Repeat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Repeat</em>'.
   * @see org.xtext.example.loops.loopsDsl.Script#getRepeat()
   * @see #getScript()
   * @generated
   */
  EReference getScript_Repeat();

  /**
   * Returns the meta object for class '{@link org.xtext.example.loops.loopsDsl.Repeat <em>Repeat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repeat</em>'.
   * @see org.xtext.example.loops.loopsDsl.Repeat
   * @generated
   */
  EClass getRepeat();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.loops.loopsDsl.Repeat#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see org.xtext.example.loops.loopsDsl.Repeat#getExpression()
   * @see #getRepeat()
   * @generated
   */
  EAttribute getRepeat_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.loops.loopsDsl.Repeat#getNum <em>Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num</em>'.
   * @see org.xtext.example.loops.loopsDsl.Repeat#getNum()
   * @see #getRepeat()
   * @generated
   */
  EAttribute getRepeat_Num();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LoopsDslFactory getLoopsDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.loops.loopsDsl.impl.ScriptImpl <em>Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.loops.loopsDsl.impl.ScriptImpl
     * @see org.xtext.example.loops.loopsDsl.impl.LoopsDslPackageImpl#getScript()
     * @generated
     */
    EClass SCRIPT = eINSTANCE.getScript();

    /**
     * The meta object literal for the '<em><b>Script Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT__SCRIPT_NAME = eINSTANCE.getScript_ScriptName();

    /**
     * The meta object literal for the '<em><b>Repeat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__REPEAT = eINSTANCE.getScript_Repeat();

    /**
     * The meta object literal for the '{@link org.xtext.example.loops.loopsDsl.impl.RepeatImpl <em>Repeat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.loops.loopsDsl.impl.RepeatImpl
     * @see org.xtext.example.loops.loopsDsl.impl.LoopsDslPackageImpl#getRepeat()
     * @generated
     */
    EClass REPEAT = eINSTANCE.getRepeat();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPEAT__EXPRESSION = eINSTANCE.getRepeat_Expression();

    /**
     * The meta object literal for the '<em><b>Num</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPEAT__NUM = eINSTANCE.getRepeat_Num();

  }

} //LoopsDslPackage
