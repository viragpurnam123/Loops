/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.loops.loopsDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.loops.loopsDsl.Repeat#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.loops.loopsDsl.Repeat#getNum <em>Num</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.loops.loopsDsl.LoopsDslPackage#getRepeat()
 * @model
 * @generated
 */
public interface Repeat extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' attribute.
   * @see #setExpression(String)
   * @see org.xtext.example.loops.loopsDsl.LoopsDslPackage#getRepeat_Expression()
   * @model
   * @generated
   */
  String getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.loops.loopsDsl.Repeat#getExpression <em>Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' attribute.
   * @see #getExpression()
   * @generated
   */
  void setExpression(String value);

  /**
   * Returns the value of the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num</em>' attribute.
   * @see #setNum(int)
   * @see org.xtext.example.loops.loopsDsl.LoopsDslPackage#getRepeat_Num()
   * @model
   * @generated
   */
  int getNum();

  /**
   * Sets the value of the '{@link org.xtext.example.loops.loopsDsl.Repeat#getNum <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num</em>' attribute.
   * @see #getNum()
   * @generated
   */
  void setNum(int value);

} // Repeat