/**
 */
package com.blasedef.onpa.oNPA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.blasedef.onpa.oNPA.ActionComparison#getLeft <em>Left</em>}</li>
 *   <li>{@link com.blasedef.onpa.oNPA.ActionComparison#getOp <em>Op</em>}</li>
 *   <li>{@link com.blasedef.onpa.oNPA.ActionComparison#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.blasedef.onpa.oNPA.ONPAPackage#getActionComparison()
 * @model
 * @generated
 */
public interface ActionComparison extends ActionExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(ActionExpression)
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getActionComparison_Left()
   * @model containment="true"
   * @generated
   */
  ActionExpression getLeft();

  /**
   * Sets the value of the '{@link com.blasedef.onpa.oNPA.ActionComparison#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(ActionExpression value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getActionComparison_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link com.blasedef.onpa.oNPA.ActionComparison#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(ActionExpression)
   * @see com.blasedef.onpa.oNPA.ONPAPackage#getActionComparison_Right()
   * @model containment="true"
   * @generated
   */
  ActionExpression getRight();

  /**
   * Sets the value of the '{@link com.blasedef.onpa.oNPA.ActionComparison#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(ActionExpression value);

} // ActionComparison
