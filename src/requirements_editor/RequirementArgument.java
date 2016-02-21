/**
 */
package requirements_editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link requirements_editor.RequirementArgument#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @see requirements_editor.Requirements_editorPackage#getRequirementArgument()
 * @model
 * @generated
 */
public interface RequirementArgument extends Argument {
	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' reference.
	 * @see #setRequirement(Requirement)
	 * @see requirements_editor.Requirements_editorPackage#getRequirementArgument_Requirement()
	 * @model required="true"
	 * @generated
	 */
	Requirement getRequirement();

	/**
	 * Sets the value of the '{@link requirements_editor.RequirementArgument#getRequirement <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(Requirement value);

} // RequirementArgument
