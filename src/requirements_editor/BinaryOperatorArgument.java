/**
 */
package requirements_editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Operator Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link requirements_editor.BinaryOperatorArgument#getRightSideArgument <em>Right Side Argument</em>}</li>
 *   <li>{@link requirements_editor.BinaryOperatorArgument#getLeftSideArgument <em>Left Side Argument</em>}</li>
 *   <li>{@link requirements_editor.BinaryOperatorArgument#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see requirements_editor.Requirements_editorPackage#getBinaryOperatorArgument()
 * @model
 * @generated
 */
public interface BinaryOperatorArgument extends Argument {
	/**
	 * Returns the value of the '<em><b>Right Side Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Side Argument</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Side Argument</em>' containment reference.
	 * @see #setRightSideArgument(Argument)
	 * @see requirements_editor.Requirements_editorPackage#getBinaryOperatorArgument_RightSideArgument()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Argument getRightSideArgument();

	/**
	 * Sets the value of the '{@link requirements_editor.BinaryOperatorArgument#getRightSideArgument <em>Right Side Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Side Argument</em>' containment reference.
	 * @see #getRightSideArgument()
	 * @generated
	 */
	void setRightSideArgument(Argument value);

	/**
	 * Returns the value of the '<em><b>Left Side Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Side Argument</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Side Argument</em>' containment reference.
	 * @see #setLeftSideArgument(Argument)
	 * @see requirements_editor.Requirements_editorPackage#getBinaryOperatorArgument_LeftSideArgument()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Argument getLeftSideArgument();

	/**
	 * Sets the value of the '{@link requirements_editor.BinaryOperatorArgument#getLeftSideArgument <em>Left Side Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Side Argument</em>' containment reference.
	 * @see #getLeftSideArgument()
	 * @generated
	 */
	void setLeftSideArgument(Argument value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link requirements_editor.BinaryOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see requirements_editor.BinaryOperator
	 * @see #setOperator(BinaryOperator)
	 * @see requirements_editor.Requirements_editorPackage#getBinaryOperatorArgument_Operator()
	 * @model
	 * @generated
	 */
	BinaryOperator getOperator();

	/**
	 * Sets the value of the '{@link requirements_editor.BinaryOperatorArgument#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see requirements_editor.BinaryOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BinaryOperator value);

} // BinaryOperatorArgument
