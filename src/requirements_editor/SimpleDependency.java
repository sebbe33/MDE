/**
 */
package requirements_editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link requirements_editor.SimpleDependency#getComment <em>Comment</em>}</li>
 *   <li>{@link requirements_editor.SimpleDependency#getDependencyTarget <em>Dependency Target</em>}</li>
 * </ul>
 *
 * @see requirements_editor.Requirements_editorPackage#getSimpleDependency()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='targetNotSource'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot targetNotSource='not self.dependencyTarget.dependencySource->includes(self)'"
 * @generated
 */
public interface SimpleDependency extends Dependency {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see requirements_editor.Requirements_editorPackage#getSimpleDependency_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link requirements_editor.SimpleDependency#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Dependency Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency Target</em>' reference.
	 * @see #setDependencyTarget(Requirement)
	 * @see requirements_editor.Requirements_editorPackage#getSimpleDependency_DependencyTarget()
	 * @model required="true"
	 * @generated
	 */
	Requirement getDependencyTarget();

	/**
	 * Sets the value of the '{@link requirements_editor.SimpleDependency#getDependencyTarget <em>Dependency Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency Target</em>' reference.
	 * @see #getDependencyTarget()
	 * @generated
	 */
	void setDependencyTarget(Requirement value);

} // SimpleDependency
