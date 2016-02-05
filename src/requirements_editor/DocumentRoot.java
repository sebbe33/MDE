/**
 */
package requirements_editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link requirements_editor.DocumentRoot#getRootCategories <em>Root Categories</em>}</li>
 *   <li>{@link requirements_editor.DocumentRoot#getPerson <em>Person</em>}</li>
 * </ul>
 *
 * @see requirements_editor.Requirements_editorPackage#getDocumentRoot()
 * @model
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Root Categories</b></em>' containment reference list.
	 * The list contents are of type {@link requirements_editor.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Categories</em>' containment reference list.
	 * @see requirements_editor.Requirements_editorPackage#getDocumentRoot_RootCategories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Category> getRootCategories();

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference list.
	 * The list contents are of type {@link requirements_editor.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' containment reference list.
	 * @see requirements_editor.Requirements_editorPackage#getDocumentRoot_Person()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPerson();

} // DocumentRoot
