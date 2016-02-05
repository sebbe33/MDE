/**
 */
package requirements_editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NOT Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link requirements_editor.NOTOperator#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see requirements_editor.Requirements_editorPackage#getNOTOperator()
 * @model
 * @generated
 */
public interface NOTOperator extends Argument {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference.
	 * @see #setArgument(Argument)
	 * @see requirements_editor.Requirements_editorPackage#getNOTOperator_Argument()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Argument getArgument();

	/**
	 * Sets the value of the '{@link requirements_editor.NOTOperator#getArgument <em>Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' containment reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(Argument value);

} // NOTOperator
