/**
 */
package requirements_editor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see requirements_editor.Requirements_editorFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface Requirements_editorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "requirements_editor";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/requirements_editor";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "requirements_editor";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Requirements_editorPackage eINSTANCE = requirements_editor.impl.Requirements_editorPackageImpl.init();

	/**
	 * The meta object id for the '{@link requirements_editor.Requirement <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirements_editor.Requirement
	 * @see requirements_editor.impl.Requirements_editorPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PRIORITY = 2;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__IS_MANDATORY = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Requirement Owned By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REQUIREMENT_OWNED_BY = 5;

	/**
	 * The feature id for the '<em><b>Dependency Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DEPENDENCY_SOURCE = 6;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Find Leaf Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT___FIND_LEAF_NODES__ARGUMENT = 0;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link requirements_editor.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirements_editor.impl.CategoryImpl
	 * @see requirements_editor.impl.Requirements_editorPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Subcategory Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__SUBCATEGORY_OF = 1;

	/**
	 * The feature id for the '<em><b>Category Owned By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CATEGORY_OWNED_BY = 2;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__REQUIREMENT = 3;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link requirements_editor.Description <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirements_editor.Description
	 * @see requirements_editor.impl.Requirements_editorPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link requirements_editor.impl.TextualDescriptionImpl <em>Textual Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirements_editor.impl.TextualDescriptionImpl
	 * @see requirements_editor.impl.Requirements_editorPackageImpl#getTextualDescription()
	 * @generated
	 */
	int TEXTUAL_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_DESCRIPTION__DESCRIPTION = DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Textual Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_DESCRIPTION_FEATURE_COUNT = DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Textual Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_DESCRIPTION_OPERATION_COUNT = DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link requirements_editor.impl.QualityRequirementImpl <em>Quality Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirements_editor.impl.QualityRequirementImpl
	 * @see requirements_editor.impl.Requirements_editorPackageImpl#getQualityRequirement()
	 * @generated
	 */
	int QUALITY_REQUIREMENT = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__IDENTIFIER = REQUIREMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__PRIORITY = REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__IS_MANDATORY = REQUIREMENT__IS_MANDATORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__DESCRIPTION = REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requirement Owned By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__REQUIREMENT_OWNED_BY = REQUIREMENT__REQUIREMENT_OWNED_BY;

	/**
	 * The feature id for the '<em><b>Dependency Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__DEPENDENCY_SOURCE = REQUIREMENT__DEPENDENCY_SOURCE;

	/**
	 * The number of structural features of the '<em>Quality Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Find Leaf Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT___FIND_LEAF_NODES__ARGUMENT = REQUIREMENT___FIND_LEAF_NODES__ARGUMENT;

	/**
	 * The number of operations of the '<em>Quality Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link requirements_editor.impl.FunctionalRequirementImpl <em>Functional Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirements_editor.impl.FunctionalRequirementImpl
	 * @see requirements_editor.impl.Requirements_editorPackageImpl#getFunctionalRequirement()
	 * @generated
	 */
	int FUNCTIONAL_REQUIREMENT = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__IDENTIFIER = REQUIREMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__PRIORITY = REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__IS_MANDATORY = REQUIREMENT__IS_MANDATORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__DESCRIPTION = REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Requirement Owned By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__REQUIREMENT_OWNED_BY = REQUIREMENT__REQUIREMENT_OWNED_BY;

	/**
	 * The feature id for the '<em><b>Dependency Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__DEPENDENCY_SOURCE = REQUIREMENT__DEPENDENCY_SOURCE;

	/**
	 * The number of structural features of the '<em>Functional Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Find Leaf Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT___FIND_LEAF_NODES__ARGUMENT = REQUIREMENT___FIND_LEAF_NODES__ARGUMENT;

	/**
	 * The number of operations of the '<em>Functional Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link requirements_editor.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirements_editor.impl.PersonImpl
	 * @see requirements_editor.impl.Requirements_editorPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Person Owns Requirement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PERSON_OWNS_REQUIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Person Owns Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PERSON_OWNS_CATEGORY = 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link requirements_editor.Dependency <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirements_editor.Dependency
	 * @see requirements_editor.impl.Requirements_editorPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 7;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link requirements_editor.impl.SimpleDependencyImpl <em>Simple Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirements_editor.impl.SimpleDependencyImpl
	 * @see requirements_editor.impl.Requirements_editorPackageImpl#getSimpleDependency()
	 * @generated
	 */
	int SIMPLE_DEPENDENCY = 8;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DEPENDENCY__COMMENT = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependency Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DEPENDENCY__DEPENDENCY_TARGET = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Simple Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DEPENDENCY_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link requirements_editor.impl.RefinesImpl <em>Refines</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirements_editor.impl.RefinesImpl
	 * @see requirements_editor.impl.Requirements_editorPackageImpl#getRefines()
	 * @generated
	 */
	int REFINES = 9;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINES__COMMENT = SIMPLE_DEPENDENCY__COMMENT;

	/**
	 * The feature id for the '<em><b>Dependency Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINES__DEPENDENCY_TARGET = SIMPLE_DEPENDENCY__DEPENDENCY_TARGET;

	/**
	 * The number of structural features of the '<em>Refines</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINES_FEATURE_COUNT = SIMPLE_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Refines</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINES_OPERATION_COUNT = SIMPLE_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link requirements_editor.impl.ICostImpl <em>ICost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirements_editor.impl.ICostImpl
	 * @see requirements_editor.impl.Requirements_editorPackageImpl#getICost()
	 * @generated
	 */
	int ICOST = 10;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOST__COMMENT = SIMPLE_DEPENDENCY__COMMENT;

	/**
	 * The feature id for the '<em><b>Dependency Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOST__DEPENDENCY_TARGET = SIMPLE_DEPENDENCY__DEPENDENCY_TARGET;

	/**
	 * The number of structural features of the '<em>ICost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOST_FEATURE_COUNT = SIMPLE_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ICost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOST_OPERATION_COUNT = SIMPLE_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link requirements_editor.impl.CValueImpl <em>CValue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirements_editor.impl.CValueImpl
	 * @see requirements_editor.impl.Requirements_editorPackageImpl#getCValue()
	 * @generated
	 */
	int CVALUE = 11;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVALUE__COMMENT = SIMPLE_DEPENDENCY__COMMENT;

	/**
	 * The feature id for the '<em><b>Dependency Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVALUE__DEPENDENCY_TARGET = SIMPLE_DEPENDENCY__DEPENDENCY_TARGET;

	/**
	 * The number of structural features of the '<em>CValue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVALUE_FEATURE_COUNT = SIMPLE_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CValue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVALUE_OPERATION_COUNT = SIMPLE_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link requirements_editor.impl.RequiresImpl <em>Requires</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirements_editor.impl.RequiresImpl
	 * @see requirements_editor.impl.Requirements_editorPackageImpl#getRequires()
	 * @generated
	 */
	int REQUIRES = 12;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES__ARGUMENT = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Requires</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Requires</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link requirements_editor.Argument <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirements_editor.Argument
	 * @see requirements_editor.impl.Requirements_editorPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 13;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link requirements_editor.impl.BinaryOperatorArgumentImpl <em>Binary Operator Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirements_editor.impl.BinaryOperatorArgumentImpl
	 * @see requirements_editor.impl.Requirements_editorPackageImpl#getBinaryOperatorArgument()
	 * @generated
	 */
	int BINARY_OPERATOR_ARGUMENT = 14;

	/**
	 * The feature id for the '<em><b>Right Side Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_ARGUMENT__RIGHT_SIDE_ARGUMENT = ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left Side Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_ARGUMENT__LEFT_SIDE_ARGUMENT = ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_ARGUMENT__OPERATOR = ARGUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Operator Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_ARGUMENT_FEATURE_COUNT = ARGUMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Operator Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_ARGUMENT_OPERATION_COUNT = ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link requirements_editor.impl.RequirementArgumentImpl <em>Requirement Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirements_editor.impl.RequirementArgumentImpl
	 * @see requirements_editor.impl.Requirements_editorPackageImpl#getRequirementArgument()
	 * @generated
	 */
	int REQUIREMENT_ARGUMENT = 15;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ARGUMENT__REQUIREMENT = ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Requirement Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ARGUMENT_FEATURE_COUNT = ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Requirement Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ARGUMENT_OPERATION_COUNT = ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link requirements_editor.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirements_editor.impl.DocumentRootImpl
	 * @see requirements_editor.impl.Requirements_editorPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 16;

	/**
	 * The feature id for the '<em><b>Root Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROOT_CATEGORIES = 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PERSON = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link requirements_editor.impl.NOTOperatorImpl <em>NOT Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirements_editor.impl.NOTOperatorImpl
	 * @see requirements_editor.impl.Requirements_editorPackageImpl#getNOTOperator()
	 * @generated
	 */
	int NOT_OPERATOR = 17;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR__ARGUMENT = ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NOT Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR_FEATURE_COUNT = ARGUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>NOT Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATOR_OPERATION_COUNT = ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link requirements_editor.BinaryOperator <em>Binary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirements_editor.BinaryOperator
	 * @see requirements_editor.impl.Requirements_editorPackageImpl#getBinaryOperator()
	 * @generated
	 */
	int BINARY_OPERATOR = 18;


	/**
	 * Returns the meta object for class '{@link requirements_editor.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see requirements_editor.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link requirements_editor.Requirement#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see requirements_editor.Requirement#getIdentifier()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link requirements_editor.Requirement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see requirements_editor.Requirement#getName()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Name();

	/**
	 * Returns the meta object for the attribute '{@link requirements_editor.Requirement#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see requirements_editor.Requirement#getPriority()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Priority();

	/**
	 * Returns the meta object for the attribute '{@link requirements_editor.Requirement#isIsMandatory <em>Is Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Mandatory</em>'.
	 * @see requirements_editor.Requirement#isIsMandatory()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_IsMandatory();

	/**
	 * Returns the meta object for the containment reference '{@link requirements_editor.Requirement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see requirements_editor.Requirement#getDescription()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Description();

	/**
	 * Returns the meta object for the reference '{@link requirements_editor.Requirement#getRequirementOwnedBy <em>Requirement Owned By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement Owned By</em>'.
	 * @see requirements_editor.Requirement#getRequirementOwnedBy()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_RequirementOwnedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link requirements_editor.Requirement#getDependencySource <em>Dependency Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependency Source</em>'.
	 * @see requirements_editor.Requirement#getDependencySource()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_DependencySource();

	/**
	 * Returns the meta object for the '{@link requirements_editor.Requirement#findLeafNodes(requirements_editor.Argument) <em>Find Leaf Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Leaf Nodes</em>' operation.
	 * @see requirements_editor.Requirement#findLeafNodes(requirements_editor.Argument)
	 * @generated
	 */
	EOperation getRequirement__FindLeafNodes__Argument();

	/**
	 * Returns the meta object for class '{@link requirements_editor.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see requirements_editor.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link requirements_editor.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see requirements_editor.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link requirements_editor.Category#getSubcategoryOf <em>Subcategory Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subcategory Of</em>'.
	 * @see requirements_editor.Category#getSubcategoryOf()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_SubcategoryOf();

	/**
	 * Returns the meta object for the reference '{@link requirements_editor.Category#getCategoryOwnedBy <em>Category Owned By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category Owned By</em>'.
	 * @see requirements_editor.Category#getCategoryOwnedBy()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_CategoryOwnedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link requirements_editor.Category#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement</em>'.
	 * @see requirements_editor.Category#getRequirement()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Requirement();

	/**
	 * Returns the meta object for class '{@link requirements_editor.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see requirements_editor.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for class '{@link requirements_editor.TextualDescription <em>Textual Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Description</em>'.
	 * @see requirements_editor.TextualDescription
	 * @generated
	 */
	EClass getTextualDescription();

	/**
	 * Returns the meta object for the attribute '{@link requirements_editor.TextualDescription#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see requirements_editor.TextualDescription#getDescription()
	 * @see #getTextualDescription()
	 * @generated
	 */
	EAttribute getTextualDescription_Description();

	/**
	 * Returns the meta object for class '{@link requirements_editor.QualityRequirement <em>Quality Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Requirement</em>'.
	 * @see requirements_editor.QualityRequirement
	 * @generated
	 */
	EClass getQualityRequirement();

	/**
	 * Returns the meta object for class '{@link requirements_editor.FunctionalRequirement <em>Functional Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Requirement</em>'.
	 * @see requirements_editor.FunctionalRequirement
	 * @generated
	 */
	EClass getFunctionalRequirement();

	/**
	 * Returns the meta object for class '{@link requirements_editor.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see requirements_editor.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link requirements_editor.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see requirements_editor.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the reference list '{@link requirements_editor.Person#getPersonOwnsRequirement <em>Person Owns Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Person Owns Requirement</em>'.
	 * @see requirements_editor.Person#getPersonOwnsRequirement()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_PersonOwnsRequirement();

	/**
	 * Returns the meta object for the reference list '{@link requirements_editor.Person#getPersonOwnsCategory <em>Person Owns Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Person Owns Category</em>'.
	 * @see requirements_editor.Person#getPersonOwnsCategory()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_PersonOwnsCategory();

	/**
	 * Returns the meta object for class '{@link requirements_editor.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see requirements_editor.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for class '{@link requirements_editor.SimpleDependency <em>Simple Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Dependency</em>'.
	 * @see requirements_editor.SimpleDependency
	 * @generated
	 */
	EClass getSimpleDependency();

	/**
	 * Returns the meta object for the attribute '{@link requirements_editor.SimpleDependency#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see requirements_editor.SimpleDependency#getComment()
	 * @see #getSimpleDependency()
	 * @generated
	 */
	EAttribute getSimpleDependency_Comment();

	/**
	 * Returns the meta object for the reference '{@link requirements_editor.SimpleDependency#getDependencyTarget <em>Dependency Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependency Target</em>'.
	 * @see requirements_editor.SimpleDependency#getDependencyTarget()
	 * @see #getSimpleDependency()
	 * @generated
	 */
	EReference getSimpleDependency_DependencyTarget();

	/**
	 * Returns the meta object for class '{@link requirements_editor.Refines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refines</em>'.
	 * @see requirements_editor.Refines
	 * @generated
	 */
	EClass getRefines();

	/**
	 * Returns the meta object for class '{@link requirements_editor.ICost <em>ICost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ICost</em>'.
	 * @see requirements_editor.ICost
	 * @generated
	 */
	EClass getICost();

	/**
	 * Returns the meta object for class '{@link requirements_editor.CValue <em>CValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CValue</em>'.
	 * @see requirements_editor.CValue
	 * @generated
	 */
	EClass getCValue();

	/**
	 * Returns the meta object for class '{@link requirements_editor.Requires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requires</em>'.
	 * @see requirements_editor.Requires
	 * @generated
	 */
	EClass getRequires();

	/**
	 * Returns the meta object for the containment reference '{@link requirements_editor.Requires#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument</em>'.
	 * @see requirements_editor.Requires#getArgument()
	 * @see #getRequires()
	 * @generated
	 */
	EReference getRequires_Argument();

	/**
	 * Returns the meta object for class '{@link requirements_editor.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see requirements_editor.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for class '{@link requirements_editor.BinaryOperatorArgument <em>Binary Operator Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Operator Argument</em>'.
	 * @see requirements_editor.BinaryOperatorArgument
	 * @generated
	 */
	EClass getBinaryOperatorArgument();

	/**
	 * Returns the meta object for the containment reference '{@link requirements_editor.BinaryOperatorArgument#getRightSideArgument <em>Right Side Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Side Argument</em>'.
	 * @see requirements_editor.BinaryOperatorArgument#getRightSideArgument()
	 * @see #getBinaryOperatorArgument()
	 * @generated
	 */
	EReference getBinaryOperatorArgument_RightSideArgument();

	/**
	 * Returns the meta object for the containment reference '{@link requirements_editor.BinaryOperatorArgument#getLeftSideArgument <em>Left Side Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Side Argument</em>'.
	 * @see requirements_editor.BinaryOperatorArgument#getLeftSideArgument()
	 * @see #getBinaryOperatorArgument()
	 * @generated
	 */
	EReference getBinaryOperatorArgument_LeftSideArgument();

	/**
	 * Returns the meta object for the attribute '{@link requirements_editor.BinaryOperatorArgument#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see requirements_editor.BinaryOperatorArgument#getOperator()
	 * @see #getBinaryOperatorArgument()
	 * @generated
	 */
	EAttribute getBinaryOperatorArgument_Operator();

	/**
	 * Returns the meta object for class '{@link requirements_editor.RequirementArgument <em>Requirement Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Argument</em>'.
	 * @see requirements_editor.RequirementArgument
	 * @generated
	 */
	EClass getRequirementArgument();

	/**
	 * Returns the meta object for the reference '{@link requirements_editor.RequirementArgument#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see requirements_editor.RequirementArgument#getRequirement()
	 * @see #getRequirementArgument()
	 * @generated
	 */
	EReference getRequirementArgument_Requirement();

	/**
	 * Returns the meta object for class '{@link requirements_editor.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see requirements_editor.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link requirements_editor.DocumentRoot#getRootCategories <em>Root Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Categories</em>'.
	 * @see requirements_editor.DocumentRoot#getRootCategories()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RootCategories();

	/**
	 * Returns the meta object for the containment reference list '{@link requirements_editor.DocumentRoot#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person</em>'.
	 * @see requirements_editor.DocumentRoot#getPerson()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Person();

	/**
	 * Returns the meta object for the attribute '{@link requirements_editor.DocumentRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see requirements_editor.DocumentRoot#getName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Name();

	/**
	 * Returns the meta object for class '{@link requirements_editor.NOTOperator <em>NOT Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NOT Operator</em>'.
	 * @see requirements_editor.NOTOperator
	 * @generated
	 */
	EClass getNOTOperator();

	/**
	 * Returns the meta object for the containment reference '{@link requirements_editor.NOTOperator#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument</em>'.
	 * @see requirements_editor.NOTOperator#getArgument()
	 * @see #getNOTOperator()
	 * @generated
	 */
	EReference getNOTOperator_Argument();

	/**
	 * Returns the meta object for enum '{@link requirements_editor.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Operator</em>'.
	 * @see requirements_editor.BinaryOperator
	 * @generated
	 */
	EEnum getBinaryOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Requirements_editorFactory getRequirements_editorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link requirements_editor.Requirement <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirements_editor.Requirement
		 * @see requirements_editor.impl.Requirements_editorPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__IDENTIFIER = eINSTANCE.getRequirement_Identifier();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__NAME = eINSTANCE.getRequirement_Name();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__PRIORITY = eINSTANCE.getRequirement_Priority();

		/**
		 * The meta object literal for the '<em><b>Is Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__IS_MANDATORY = eINSTANCE.getRequirement_IsMandatory();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__DESCRIPTION = eINSTANCE.getRequirement_Description();

		/**
		 * The meta object literal for the '<em><b>Requirement Owned By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__REQUIREMENT_OWNED_BY = eINSTANCE.getRequirement_RequirementOwnedBy();

		/**
		 * The meta object literal for the '<em><b>Dependency Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__DEPENDENCY_SOURCE = eINSTANCE.getRequirement_DependencySource();

		/**
		 * The meta object literal for the '<em><b>Find Leaf Nodes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUIREMENT___FIND_LEAF_NODES__ARGUMENT = eINSTANCE.getRequirement__FindLeafNodes__Argument();

		/**
		 * The meta object literal for the '{@link requirements_editor.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirements_editor.impl.CategoryImpl
		 * @see requirements_editor.impl.Requirements_editorPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Subcategory Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__SUBCATEGORY_OF = eINSTANCE.getCategory_SubcategoryOf();

		/**
		 * The meta object literal for the '<em><b>Category Owned By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__CATEGORY_OWNED_BY = eINSTANCE.getCategory_CategoryOwnedBy();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__REQUIREMENT = eINSTANCE.getCategory_Requirement();

		/**
		 * The meta object literal for the '{@link requirements_editor.Description <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirements_editor.Description
		 * @see requirements_editor.impl.Requirements_editorPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '{@link requirements_editor.impl.TextualDescriptionImpl <em>Textual Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirements_editor.impl.TextualDescriptionImpl
		 * @see requirements_editor.impl.Requirements_editorPackageImpl#getTextualDescription()
		 * @generated
		 */
		EClass TEXTUAL_DESCRIPTION = eINSTANCE.getTextualDescription();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTUAL_DESCRIPTION__DESCRIPTION = eINSTANCE.getTextualDescription_Description();

		/**
		 * The meta object literal for the '{@link requirements_editor.impl.QualityRequirementImpl <em>Quality Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirements_editor.impl.QualityRequirementImpl
		 * @see requirements_editor.impl.Requirements_editorPackageImpl#getQualityRequirement()
		 * @generated
		 */
		EClass QUALITY_REQUIREMENT = eINSTANCE.getQualityRequirement();

		/**
		 * The meta object literal for the '{@link requirements_editor.impl.FunctionalRequirementImpl <em>Functional Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirements_editor.impl.FunctionalRequirementImpl
		 * @see requirements_editor.impl.Requirements_editorPackageImpl#getFunctionalRequirement()
		 * @generated
		 */
		EClass FUNCTIONAL_REQUIREMENT = eINSTANCE.getFunctionalRequirement();

		/**
		 * The meta object literal for the '{@link requirements_editor.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirements_editor.impl.PersonImpl
		 * @see requirements_editor.impl.Requirements_editorPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Person Owns Requirement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__PERSON_OWNS_REQUIREMENT = eINSTANCE.getPerson_PersonOwnsRequirement();

		/**
		 * The meta object literal for the '<em><b>Person Owns Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__PERSON_OWNS_CATEGORY = eINSTANCE.getPerson_PersonOwnsCategory();

		/**
		 * The meta object literal for the '{@link requirements_editor.Dependency <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirements_editor.Dependency
		 * @see requirements_editor.impl.Requirements_editorPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '{@link requirements_editor.impl.SimpleDependencyImpl <em>Simple Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirements_editor.impl.SimpleDependencyImpl
		 * @see requirements_editor.impl.Requirements_editorPackageImpl#getSimpleDependency()
		 * @generated
		 */
		EClass SIMPLE_DEPENDENCY = eINSTANCE.getSimpleDependency();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_DEPENDENCY__COMMENT = eINSTANCE.getSimpleDependency_Comment();

		/**
		 * The meta object literal for the '<em><b>Dependency Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_DEPENDENCY__DEPENDENCY_TARGET = eINSTANCE.getSimpleDependency_DependencyTarget();

		/**
		 * The meta object literal for the '{@link requirements_editor.impl.RefinesImpl <em>Refines</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirements_editor.impl.RefinesImpl
		 * @see requirements_editor.impl.Requirements_editorPackageImpl#getRefines()
		 * @generated
		 */
		EClass REFINES = eINSTANCE.getRefines();

		/**
		 * The meta object literal for the '{@link requirements_editor.impl.ICostImpl <em>ICost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirements_editor.impl.ICostImpl
		 * @see requirements_editor.impl.Requirements_editorPackageImpl#getICost()
		 * @generated
		 */
		EClass ICOST = eINSTANCE.getICost();

		/**
		 * The meta object literal for the '{@link requirements_editor.impl.CValueImpl <em>CValue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirements_editor.impl.CValueImpl
		 * @see requirements_editor.impl.Requirements_editorPackageImpl#getCValue()
		 * @generated
		 */
		EClass CVALUE = eINSTANCE.getCValue();

		/**
		 * The meta object literal for the '{@link requirements_editor.impl.RequiresImpl <em>Requires</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirements_editor.impl.RequiresImpl
		 * @see requirements_editor.impl.Requirements_editorPackageImpl#getRequires()
		 * @generated
		 */
		EClass REQUIRES = eINSTANCE.getRequires();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRES__ARGUMENT = eINSTANCE.getRequires_Argument();

		/**
		 * The meta object literal for the '{@link requirements_editor.Argument <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirements_editor.Argument
		 * @see requirements_editor.impl.Requirements_editorPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '{@link requirements_editor.impl.BinaryOperatorArgumentImpl <em>Binary Operator Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirements_editor.impl.BinaryOperatorArgumentImpl
		 * @see requirements_editor.impl.Requirements_editorPackageImpl#getBinaryOperatorArgument()
		 * @generated
		 */
		EClass BINARY_OPERATOR_ARGUMENT = eINSTANCE.getBinaryOperatorArgument();

		/**
		 * The meta object literal for the '<em><b>Right Side Argument</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATOR_ARGUMENT__RIGHT_SIDE_ARGUMENT = eINSTANCE.getBinaryOperatorArgument_RightSideArgument();

		/**
		 * The meta object literal for the '<em><b>Left Side Argument</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATOR_ARGUMENT__LEFT_SIDE_ARGUMENT = eINSTANCE.getBinaryOperatorArgument_LeftSideArgument();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_OPERATOR_ARGUMENT__OPERATOR = eINSTANCE.getBinaryOperatorArgument_Operator();

		/**
		 * The meta object literal for the '{@link requirements_editor.impl.RequirementArgumentImpl <em>Requirement Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirements_editor.impl.RequirementArgumentImpl
		 * @see requirements_editor.impl.Requirements_editorPackageImpl#getRequirementArgument()
		 * @generated
		 */
		EClass REQUIREMENT_ARGUMENT = eINSTANCE.getRequirementArgument();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_ARGUMENT__REQUIREMENT = eINSTANCE.getRequirementArgument_Requirement();

		/**
		 * The meta object literal for the '{@link requirements_editor.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirements_editor.impl.DocumentRootImpl
		 * @see requirements_editor.impl.Requirements_editorPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Root Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ROOT_CATEGORIES = eINSTANCE.getDocumentRoot_RootCategories();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PERSON = eINSTANCE.getDocumentRoot_Person();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__NAME = eINSTANCE.getDocumentRoot_Name();

		/**
		 * The meta object literal for the '{@link requirements_editor.impl.NOTOperatorImpl <em>NOT Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirements_editor.impl.NOTOperatorImpl
		 * @see requirements_editor.impl.Requirements_editorPackageImpl#getNOTOperator()
		 * @generated
		 */
		EClass NOT_OPERATOR = eINSTANCE.getNOTOperator();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_OPERATOR__ARGUMENT = eINSTANCE.getNOTOperator_Argument();

		/**
		 * The meta object literal for the '{@link requirements_editor.BinaryOperator <em>Binary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirements_editor.BinaryOperator
		 * @see requirements_editor.impl.Requirements_editorPackageImpl#getBinaryOperator()
		 * @generated
		 */
		EEnum BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

	}

} //Requirements_editorPackage
