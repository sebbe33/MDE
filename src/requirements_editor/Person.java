/**
 */
package requirements_editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link requirements_editor.Person#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link requirements_editor.Person#getLastname <em>Lastname</em>}</li>
 *   <li>{@link requirements_editor.Person#getPersonOwnsRequirement <em>Person Owns Requirement</em>}</li>
 *   <li>{@link requirements_editor.Person#getPersonOwnsCategory <em>Person Owns Category</em>}</li>
 * </ul>
 *
 * @see requirements_editor.Requirements_editorPackage#getPerson()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='isResponsible'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot isResponsible='self.personOwnsCategory->size() + self.personOwnsRequirement->size() > 0'"
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firstname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firstname</em>' attribute.
	 * @see #setFirstname(String)
	 * @see requirements_editor.Requirements_editorPackage#getPerson_Firstname()
	 * @model
	 * @generated
	 */
	String getFirstname();

	/**
	 * Sets the value of the '{@link requirements_editor.Person#getFirstname <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firstname</em>' attribute.
	 * @see #getFirstname()
	 * @generated
	 */
	void setFirstname(String value);

	/**
	 * Returns the value of the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lastname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lastname</em>' attribute.
	 * @see #setLastname(String)
	 * @see requirements_editor.Requirements_editorPackage#getPerson_Lastname()
	 * @model
	 * @generated
	 */
	String getLastname();

	/**
	 * Sets the value of the '{@link requirements_editor.Person#getLastname <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lastname</em>' attribute.
	 * @see #getLastname()
	 * @generated
	 */
	void setLastname(String value);

	/**
	 * Returns the value of the '<em><b>Person Owns Requirement</b></em>' reference list.
	 * The list contents are of type {@link requirements_editor.Requirement}.
	 * It is bidirectional and its opposite is '{@link requirements_editor.Requirement#getRequirementOwnedBy <em>Requirement Owned By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person Owns Requirement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person Owns Requirement</em>' reference list.
	 * @see requirements_editor.Requirements_editorPackage#getPerson_PersonOwnsRequirement()
	 * @see requirements_editor.Requirement#getRequirementOwnedBy
	 * @model opposite="requirementOwnedBy"
	 * @generated
	 */
	EList<Requirement> getPersonOwnsRequirement();

	/**
	 * Returns the value of the '<em><b>Person Owns Category</b></em>' reference list.
	 * The list contents are of type {@link requirements_editor.Category}.
	 * It is bidirectional and its opposite is '{@link requirements_editor.Category#getCategoryOwnedBy <em>Category Owned By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person Owns Category</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person Owns Category</em>' reference list.
	 * @see requirements_editor.Requirements_editorPackage#getPerson_PersonOwnsCategory()
	 * @see requirements_editor.Category#getCategoryOwnedBy
	 * @model opposite="categoryOwnedBy"
	 * @generated
	 */
	EList<Category> getPersonOwnsCategory();

} // Person
