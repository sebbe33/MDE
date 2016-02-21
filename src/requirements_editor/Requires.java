/**
 */
package requirements_editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requires</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link requirements_editor.Requires#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see requirements_editor.Requirements_editorPackage#getRequires()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='selfDependency'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot selfDependency='self.argument.oclAsSet()->closure(arg : Argument | \n\t\t\tif arg.oclIsKindOf(BinaryOperatorArgument) then arg.oclAsType(BinaryOperatorArgument).leftSideArgument.oclAsSet()->including(arg.oclAsType(BinaryOperatorArgument).rightSideArgument) \n\t\t\telse \n\t\t\t\tif arg.oclIsKindOf(NOTOperator) then arg.oclAsType(NOTOperator).argument.oclAsSet() \n\t\t\t\telse arg.oclAsSet() \n\t\t\t\tendif \n\t\t\tendif\n\t\t)->select(arg : Argument | arg.oclIsKindOf(RequirementArgument))->forAll(arg : Argument | not arg.oclAsType(RequirementArgument).requirement.dependencySource->includes(self))'"
 * @generated
 */
public interface Requires extends Dependency {
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
	 * @see requirements_editor.Requirements_editorPackage#getRequires_Argument()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Argument getArgument();

	/**
	 * Sets the value of the '{@link requirements_editor.Requires#getArgument <em>Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' containment reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(Argument value);

} // Requires
