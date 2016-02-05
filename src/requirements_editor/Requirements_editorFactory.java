/**
 */
package requirements_editor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see requirements_editor.Requirements_editorPackage
 * @generated
 */
public interface Requirements_editorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Requirements_editorFactory eINSTANCE = requirements_editor.impl.Requirements_editorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category</em>'.
	 * @generated
	 */
	Category createCategory();

	/**
	 * Returns a new object of class '<em>Textual Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Textual Description</em>'.
	 * @generated
	 */
	TextualDescription createTextualDescription();

	/**
	 * Returns a new object of class '<em>Quality Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quality Requirement</em>'.
	 * @generated
	 */
	QualityRequirement createQualityRequirement();

	/**
	 * Returns a new object of class '<em>Functional Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Requirement</em>'.
	 * @generated
	 */
	FunctionalRequirement createFunctionalRequirement();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Refines</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refines</em>'.
	 * @generated
	 */
	Refines createRefines();

	/**
	 * Returns a new object of class '<em>ICost</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ICost</em>'.
	 * @generated
	 */
	ICost createICost();

	/**
	 * Returns a new object of class '<em>CValue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CValue</em>'.
	 * @generated
	 */
	CValue createCValue();

	/**
	 * Returns a new object of class '<em>Requires</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requires</em>'.
	 * @generated
	 */
	Requires createRequires();

	/**
	 * Returns a new object of class '<em>Binary Operator Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Operator Argument</em>'.
	 * @generated
	 */
	BinaryOperatorArgument createBinaryOperatorArgument();

	/**
	 * Returns a new object of class '<em>Requirement Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Argument</em>'.
	 * @generated
	 */
	RequirementArgument createRequirementArgument();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>NOT Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NOT Operator</em>'.
	 * @generated
	 */
	NOTOperator createNOTOperator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Requirements_editorPackage getRequirements_editorPackage();

} //Requirements_editorFactory
