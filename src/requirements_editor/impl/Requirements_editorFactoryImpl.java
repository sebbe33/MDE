/**
 */
package requirements_editor.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import requirements_editor.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Requirements_editorFactoryImpl extends EFactoryImpl implements Requirements_editorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Requirements_editorFactory init() {
		try {
			Requirements_editorFactory theRequirements_editorFactory = (Requirements_editorFactory)EPackage.Registry.INSTANCE.getEFactory(Requirements_editorPackage.eNS_URI);
			if (theRequirements_editorFactory != null) {
				return theRequirements_editorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Requirements_editorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirements_editorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Requirements_editorPackage.CATEGORY: return createCategory();
			case Requirements_editorPackage.TEXTUAL_DESCRIPTION: return createTextualDescription();
			case Requirements_editorPackage.QUALITY_REQUIREMENT: return createQualityRequirement();
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT: return createFunctionalRequirement();
			case Requirements_editorPackage.PERSON: return createPerson();
			case Requirements_editorPackage.REFINES: return createRefines();
			case Requirements_editorPackage.ICOST: return createICost();
			case Requirements_editorPackage.CVALUE: return createCValue();
			case Requirements_editorPackage.REQUIRES: return createRequires();
			case Requirements_editorPackage.BINARY_OPERATOR_ARGUMENT: return createBinaryOperatorArgument();
			case Requirements_editorPackage.REQUIREMENT_ARGUMENT: return createRequirementArgument();
			case Requirements_editorPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case Requirements_editorPackage.NOT_OPERATOR: return createNOTOperator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Requirements_editorPackage.BINARY_OPERATOR:
				return createBinaryOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Requirements_editorPackage.BINARY_OPERATOR:
				return convertBinaryOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextualDescription createTextualDescription() {
		TextualDescriptionImpl textualDescription = new TextualDescriptionImpl();
		return textualDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityRequirement createQualityRequirement() {
		QualityRequirementImpl qualityRequirement = new QualityRequirementImpl();
		return qualityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalRequirement createFunctionalRequirement() {
		FunctionalRequirementImpl functionalRequirement = new FunctionalRequirementImpl();
		return functionalRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Refines createRefines() {
		RefinesImpl refines = new RefinesImpl();
		return refines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICost createICost() {
		ICostImpl iCost = new ICostImpl();
		return iCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CValue createCValue() {
		CValueImpl cValue = new CValueImpl();
		return cValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requires createRequires() {
		RequiresImpl requires = new RequiresImpl();
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperatorArgument createBinaryOperatorArgument() {
		BinaryOperatorArgumentImpl binaryOperatorArgument = new BinaryOperatorArgumentImpl();
		return binaryOperatorArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementArgument createRequirementArgument() {
		RequirementArgumentImpl requirementArgument = new RequirementArgumentImpl();
		return requirementArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NOTOperator createNOTOperator() {
		NOTOperatorImpl notOperator = new NOTOperatorImpl();
		return notOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperator createBinaryOperatorFromString(EDataType eDataType, String initialValue) {
		BinaryOperator result = BinaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirements_editorPackage getRequirements_editorPackage() {
		return (Requirements_editorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Requirements_editorPackage getPackage() {
		return Requirements_editorPackage.eINSTANCE;
	}

} //Requirements_editorFactoryImpl
