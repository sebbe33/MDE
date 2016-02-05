/**
 */
package requirements_editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link requirements_editor.Category#getName <em>Name</em>}</li>
 *   <li>{@link requirements_editor.Category#getSubcategoryOf <em>Subcategory Of</em>}</li>
 *   <li>{@link requirements_editor.Category#getCategoryOwnedBy <em>Category Owned By</em>}</li>
 *   <li>{@link requirements_editor.Category#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @see requirements_editor.Requirements_editorPackage#getCategory()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='moreRequirementsThanCategories'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot moreRequirementsThanCategories='Category.allInstances()->size() <= Requirement.allInstances()->size()'"
 * @generated
 */
public interface Category extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see requirements_editor.Requirements_editorPackage#getCategory_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link requirements_editor.Category#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Subcategory Of</b></em>' containment reference list.
	 * The list contents are of type {@link requirements_editor.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subcategory Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subcategory Of</em>' containment reference list.
	 * @see requirements_editor.Requirements_editorPackage#getCategory_SubcategoryOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<Category> getSubcategoryOf();

	/**
	 * Returns the value of the '<em><b>Category Owned By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link requirements_editor.Person#getPersonOwnsCategory <em>Person Owns Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Owned By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Owned By</em>' reference.
	 * @see #setCategoryOwnedBy(Person)
	 * @see requirements_editor.Requirements_editorPackage#getCategory_CategoryOwnedBy()
	 * @see requirements_editor.Person#getPersonOwnsCategory
	 * @model opposite="personOwnsCategory" required="true"
	 * @generated
	 */
	Person getCategoryOwnedBy();

	/**
	 * Sets the value of the '{@link requirements_editor.Category#getCategoryOwnedBy <em>Category Owned By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Owned By</em>' reference.
	 * @see #getCategoryOwnedBy()
	 * @generated
	 */
	void setCategoryOwnedBy(Person value);

	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link requirements_editor.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' containment reference list.
	 * @see requirements_editor.Requirements_editorPackage#getCategory_Requirement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getRequirement();

} // Category
