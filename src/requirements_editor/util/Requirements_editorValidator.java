/**
 */
package requirements_editor.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import requirements_editor.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see requirements_editor.Requirements_editorPackage
 * @generated
 */
public class Requirements_editorValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Requirements_editorValidator INSTANCE = new Requirements_editorValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "requirements_editor";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirements_editorValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Requirements_editorPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Requirements_editorPackage.REQUIREMENT:
				return validateRequirement((Requirement)value, diagnostics, context);
			case Requirements_editorPackage.CATEGORY:
				return validateCategory((Category)value, diagnostics, context);
			case Requirements_editorPackage.DESCRIPTION:
				return validateDescription((Description)value, diagnostics, context);
			case Requirements_editorPackage.TEXTUAL_DESCRIPTION:
				return validateTextualDescription((TextualDescription)value, diagnostics, context);
			case Requirements_editorPackage.QUALITY_REQUIREMENT:
				return validateQualityRequirement((QualityRequirement)value, diagnostics, context);
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT:
				return validateFunctionalRequirement((FunctionalRequirement)value, diagnostics, context);
			case Requirements_editorPackage.PERSON:
				return validatePerson((Person)value, diagnostics, context);
			case Requirements_editorPackage.DEPENDENCY:
				return validateDependency((Dependency)value, diagnostics, context);
			case Requirements_editorPackage.SIMPLE_DEPENDENCY:
				return validateSimpleDependency((SimpleDependency)value, diagnostics, context);
			case Requirements_editorPackage.REFINES:
				return validateRefines((Refines)value, diagnostics, context);
			case Requirements_editorPackage.ICOST:
				return validateICost((ICost)value, diagnostics, context);
			case Requirements_editorPackage.CVALUE:
				return validateCValue((CValue)value, diagnostics, context);
			case Requirements_editorPackage.REQUIRES:
				return validateRequires((Requires)value, diagnostics, context);
			case Requirements_editorPackage.ARGUMENT:
				return validateArgument((Argument)value, diagnostics, context);
			case Requirements_editorPackage.BINARY_OPERATOR_ARGUMENT:
				return validateBinaryOperatorArgument((BinaryOperatorArgument)value, diagnostics, context);
			case Requirements_editorPackage.REQUIREMENT_ARGUMENT:
				return validateRequirementArgument((RequirementArgument)value, diagnostics, context);
			case Requirements_editorPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case Requirements_editorPackage.NOT_OPERATOR:
				return validateNOTOperator((NOTOperator)value, diagnostics, context);
			case Requirements_editorPackage.BINARY_OPERATOR:
				return validateBinaryOperator((BinaryOperator)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement(Requirement requirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requirement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_differentResponsible(requirement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the differentResponsible constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REQUIREMENT__DIFFERENT_RESPONSIBLE__EEXPRESSION = "self.requirementOwnedBy.personOwnsCategory->forAll(c | not c.requirement->includes(self))";

	/**
	 * Validates the differentResponsible constraint of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement_differentResponsible(Requirement requirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Requirements_editorPackage.Literals.REQUIREMENT,
				 requirement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "differentResponsible",
				 REQUIREMENT__DIFFERENT_RESPONSIBLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategory(Category category, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(category, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(category, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(category, diagnostics, context);
		if (result || diagnostics != null) result &= validateCategory_moreRequirementsThanCategories(category, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the moreRequirementsThanCategories constraint of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CATEGORY__MORE_REQUIREMENTS_THAN_CATEGORIES__EEXPRESSION = "Category.allInstances()->size() <= Requirement.allInstances()->size()";

	/**
	 * Validates the moreRequirementsThanCategories constraint of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategory_moreRequirementsThanCategories(Category category, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Requirements_editorPackage.Literals.CATEGORY,
				 category,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "moreRequirementsThanCategories",
				 CATEGORY__MORE_REQUIREMENTS_THAN_CATEGORIES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescription(Description description, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(description, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextualDescription(TextualDescription textualDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textualDescription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualityRequirement(QualityRequirement qualityRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(qualityRequirement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(qualityRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(qualityRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(qualityRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(qualityRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(qualityRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(qualityRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(qualityRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(qualityRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_differentResponsible(qualityRequirement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalRequirement(FunctionalRequirement functionalRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(functionalRequirement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(functionalRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(functionalRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(functionalRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(functionalRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(functionalRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(functionalRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(functionalRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(functionalRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequirement_differentResponsible(functionalRequirement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(person, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(person, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(person, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerson_isResponsible(person, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the isResponsible constraint of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PERSON__IS_RESPONSIBLE__EEXPRESSION = "self.personOwnsCategory->size() + self.personOwnsRequirement->size() > 0";

	/**
	 * Validates the isResponsible constraint of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerson_isResponsible(Person person, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Requirements_editorPackage.Literals.PERSON,
				 person,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "isResponsible",
				 PERSON__IS_RESPONSIBLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependency(Dependency dependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dependency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleDependency(SimpleDependency simpleDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(simpleDependency, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(simpleDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(simpleDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(simpleDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(simpleDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(simpleDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(simpleDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(simpleDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(simpleDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateSimpleDependency_targetNotSource(simpleDependency, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the targetNotSource constraint of '<em>Simple Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SIMPLE_DEPENDENCY__TARGET_NOT_SOURCE__EEXPRESSION = "not self.dependencyTarget.dependencySource->includes(self)";

	/**
	 * Validates the targetNotSource constraint of '<em>Simple Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleDependency_targetNotSource(SimpleDependency simpleDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Requirements_editorPackage.Literals.SIMPLE_DEPENDENCY,
				 simpleDependency,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "targetNotSource",
				 SIMPLE_DEPENDENCY__TARGET_NOT_SOURCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefines(Refines refines, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(refines, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(refines, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(refines, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(refines, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(refines, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(refines, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(refines, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(refines, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(refines, diagnostics, context);
		if (result || diagnostics != null) result &= validateSimpleDependency_targetNotSource(refines, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateICost(ICost iCost, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(iCost, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(iCost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(iCost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(iCost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(iCost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(iCost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(iCost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(iCost, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(iCost, diagnostics, context);
		if (result || diagnostics != null) result &= validateSimpleDependency_targetNotSource(iCost, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCValue(CValue cValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cValue, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cValue, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cValue, diagnostics, context);
		if (result || diagnostics != null) result &= validateSimpleDependency_targetNotSource(cValue, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequires(Requires requires, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requires, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArgument(Argument argument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(argument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryOperatorArgument(BinaryOperatorArgument binaryOperatorArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binaryOperatorArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementArgument(RequirementArgument requirementArgument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requirementArgument, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNOTOperator(NOTOperator notOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(notOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryOperator(BinaryOperator binaryOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Requirements_editorValidator
