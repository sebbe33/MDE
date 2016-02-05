/**
 */
package requirements_editor.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import requirements_editor.Argument;
import requirements_editor.BinaryOperator;
import requirements_editor.BinaryOperatorArgument;
import requirements_editor.CValue;
import requirements_editor.Category;
import requirements_editor.Dependency;
import requirements_editor.Description;
import requirements_editor.DocumentRoot;
import requirements_editor.FunctionalRequirement;
import requirements_editor.ICost;
import requirements_editor.NOTOperator;
import requirements_editor.Person;
import requirements_editor.QualityRequirement;
import requirements_editor.Refines;
import requirements_editor.Requirement;
import requirements_editor.RequirementArgument;
import requirements_editor.Requirements_editorFactory;
import requirements_editor.Requirements_editorPackage;
import requirements_editor.Requires;
import requirements_editor.SimpleDependency;
import requirements_editor.TextualDescription;
import requirements_editor.util.Requirements_editorValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Requirements_editorPackageImpl extends EPackageImpl implements Requirements_editorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textualDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refinesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iCostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryOperatorArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryOperatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see requirements_editor.Requirements_editorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Requirements_editorPackageImpl() {
		super(eNS_URI, Requirements_editorFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Requirements_editorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Requirements_editorPackage init() {
		if (isInited) return (Requirements_editorPackage)EPackage.Registry.INSTANCE.getEPackage(Requirements_editorPackage.eNS_URI);

		// Obtain or create and register package
		Requirements_editorPackageImpl theRequirements_editorPackage = (Requirements_editorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Requirements_editorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Requirements_editorPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRequirements_editorPackage.createPackageContents();

		// Initialize created meta-data
		theRequirements_editorPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRequirements_editorPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Requirements_editorValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRequirements_editorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Requirements_editorPackage.eNS_URI, theRequirements_editorPackage);
		return theRequirements_editorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Identifier() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Name() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Priority() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_IsMandatory() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Description() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_RequirementOwnedBy() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_DependencySource() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategory() {
		return categoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategory_Name() {
		return (EAttribute)categoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategory_SubcategoryOf() {
		return (EReference)categoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategory_CategoryOwnedBy() {
		return (EReference)categoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategory_Requirement() {
		return (EReference)categoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescription() {
		return descriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextualDescription() {
		return textualDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextualDescription_Description() {
		return (EAttribute)textualDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualityRequirement() {
		return qualityRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalRequirement() {
		return functionalRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Firstname() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Lastname() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_PersonOwnsRequirement() {
		return (EReference)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_PersonOwnsCategory() {
		return (EReference)personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleDependency() {
		return simpleDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDependency_Comment() {
		return (EAttribute)simpleDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleDependency_DependencyTarget() {
		return (EReference)simpleDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefines() {
		return refinesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getICost() {
		return iCostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCValue() {
		return cValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequires() {
		return requiresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequires_Argument() {
		return (EReference)requiresEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgument() {
		return argumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryOperatorArgument() {
		return binaryOperatorArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryOperatorArgument_RightSideArgument() {
		return (EReference)binaryOperatorArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryOperatorArgument_LeftSideArgument() {
		return (EReference)binaryOperatorArgumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryOperatorArgument_Operator() {
		return (EAttribute)binaryOperatorArgumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementArgument() {
		return requirementArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementArgument_Requirement() {
		return (EReference)requirementArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RootCategories() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Person() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNOTOperator() {
		return notOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNOTOperator_Argument() {
		return (EReference)notOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBinaryOperator() {
		return binaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirements_editorFactory getRequirements_editorFactory() {
		return (Requirements_editorFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__IDENTIFIER);
		createEAttribute(requirementEClass, REQUIREMENT__NAME);
		createEAttribute(requirementEClass, REQUIREMENT__PRIORITY);
		createEAttribute(requirementEClass, REQUIREMENT__IS_MANDATORY);
		createEReference(requirementEClass, REQUIREMENT__DESCRIPTION);
		createEReference(requirementEClass, REQUIREMENT__REQUIREMENT_OWNED_BY);
		createEReference(requirementEClass, REQUIREMENT__DEPENDENCY_SOURCE);

		categoryEClass = createEClass(CATEGORY);
		createEAttribute(categoryEClass, CATEGORY__NAME);
		createEReference(categoryEClass, CATEGORY__SUBCATEGORY_OF);
		createEReference(categoryEClass, CATEGORY__CATEGORY_OWNED_BY);
		createEReference(categoryEClass, CATEGORY__REQUIREMENT);

		descriptionEClass = createEClass(DESCRIPTION);

		textualDescriptionEClass = createEClass(TEXTUAL_DESCRIPTION);
		createEAttribute(textualDescriptionEClass, TEXTUAL_DESCRIPTION__DESCRIPTION);

		qualityRequirementEClass = createEClass(QUALITY_REQUIREMENT);

		functionalRequirementEClass = createEClass(FUNCTIONAL_REQUIREMENT);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__FIRSTNAME);
		createEAttribute(personEClass, PERSON__LASTNAME);
		createEReference(personEClass, PERSON__PERSON_OWNS_REQUIREMENT);
		createEReference(personEClass, PERSON__PERSON_OWNS_CATEGORY);

		dependencyEClass = createEClass(DEPENDENCY);

		simpleDependencyEClass = createEClass(SIMPLE_DEPENDENCY);
		createEAttribute(simpleDependencyEClass, SIMPLE_DEPENDENCY__COMMENT);
		createEReference(simpleDependencyEClass, SIMPLE_DEPENDENCY__DEPENDENCY_TARGET);

		refinesEClass = createEClass(REFINES);

		iCostEClass = createEClass(ICOST);

		cValueEClass = createEClass(CVALUE);

		requiresEClass = createEClass(REQUIRES);
		createEReference(requiresEClass, REQUIRES__ARGUMENT);

		argumentEClass = createEClass(ARGUMENT);

		binaryOperatorArgumentEClass = createEClass(BINARY_OPERATOR_ARGUMENT);
		createEReference(binaryOperatorArgumentEClass, BINARY_OPERATOR_ARGUMENT__RIGHT_SIDE_ARGUMENT);
		createEReference(binaryOperatorArgumentEClass, BINARY_OPERATOR_ARGUMENT__LEFT_SIDE_ARGUMENT);
		createEAttribute(binaryOperatorArgumentEClass, BINARY_OPERATOR_ARGUMENT__OPERATOR);

		requirementArgumentEClass = createEClass(REQUIREMENT_ARGUMENT);
		createEReference(requirementArgumentEClass, REQUIREMENT_ARGUMENT__REQUIREMENT);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ROOT_CATEGORIES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PERSON);

		notOperatorEClass = createEClass(NOT_OPERATOR);
		createEReference(notOperatorEClass, NOT_OPERATOR__ARGUMENT);

		// Create enums
		binaryOperatorEEnum = createEEnum(BINARY_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		textualDescriptionEClass.getESuperTypes().add(this.getDescription());
		qualityRequirementEClass.getESuperTypes().add(this.getRequirement());
		functionalRequirementEClass.getESuperTypes().add(this.getRequirement());
		simpleDependencyEClass.getESuperTypes().add(this.getDependency());
		refinesEClass.getESuperTypes().add(this.getSimpleDependency());
		iCostEClass.getESuperTypes().add(this.getSimpleDependency());
		cValueEClass.getESuperTypes().add(this.getSimpleDependency());
		requiresEClass.getESuperTypes().add(this.getDependency());
		binaryOperatorArgumentEClass.getESuperTypes().add(this.getArgument());
		requirementArgumentEClass.getESuperTypes().add(this.getArgument());
		notOperatorEClass.getESuperTypes().add(this.getArgument());

		// Initialize classes, features, and operations; add parameters
		initEClass(requirementEClass, Requirement.class, "Requirement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_IsMandatory(), ecorePackage.getEBoolean(), "isMandatory", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Description(), this.getDescription(), null, "description", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_RequirementOwnedBy(), this.getPerson(), this.getPerson_PersonOwnsRequirement(), "requirementOwnedBy", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_DependencySource(), this.getDependency(), null, "dependencySource", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategory_Name(), ecorePackage.getEString(), "name", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategory_SubcategoryOf(), this.getCategory(), null, "subcategoryOf", null, 0, -1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategory_CategoryOwnedBy(), this.getPerson(), this.getPerson_PersonOwnsCategory(), "categoryOwnedBy", null, 1, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategory_Requirement(), this.getRequirement(), null, "requirement", null, 0, -1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptionEClass, Description.class, "Description", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textualDescriptionEClass, TextualDescription.class, "TextualDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextualDescription_Description(), ecorePackage.getEString(), "description", null, 0, 1, TextualDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualityRequirementEClass, QualityRequirement.class, "QualityRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionalRequirementEClass, FunctionalRequirement.class, "FunctionalRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Firstname(), ecorePackage.getEString(), "firstname", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Lastname(), ecorePackage.getEString(), "lastname", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_PersonOwnsRequirement(), this.getRequirement(), this.getRequirement_RequirementOwnedBy(), "personOwnsRequirement", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_PersonOwnsCategory(), this.getCategory(), this.getCategory_CategoryOwnedBy(), "personOwnsCategory", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyEClass, Dependency.class, "Dependency", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleDependencyEClass, SimpleDependency.class, "SimpleDependency", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleDependency_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, SimpleDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleDependency_DependencyTarget(), this.getRequirement(), null, "dependencyTarget", null, 1, 1, SimpleDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refinesEClass, Refines.class, "Refines", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iCostEClass, ICost.class, "ICost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cValueEClass, CValue.class, "CValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requiresEClass, Requires.class, "Requires", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequires_Argument(), this.getArgument(), null, "argument", null, 1, 1, Requires.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentEClass, Argument.class, "Argument", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryOperatorArgumentEClass, BinaryOperatorArgument.class, "BinaryOperatorArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryOperatorArgument_RightSideArgument(), this.getArgument(), null, "rightSideArgument", null, 1, 1, BinaryOperatorArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryOperatorArgument_LeftSideArgument(), this.getArgument(), null, "leftSideArgument", null, 1, 1, BinaryOperatorArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryOperatorArgument_Operator(), this.getBinaryOperator(), "operator", null, 0, 1, BinaryOperatorArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementArgumentEClass, RequirementArgument.class, "RequirementArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementArgument_Requirement(), this.getRequirement(), null, "requirement", null, 1, 1, RequirementArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentRoot_RootCategories(), this.getCategory(), null, "rootCategories", null, 0, -1, DocumentRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Person(), this.getPerson(), null, "person", null, 0, -1, DocumentRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notOperatorEClass, NOTOperator.class, "NOTOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNOTOperator_Argument(), this.getArgument(), null, "argument", null, 1, 1, NOTOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(binaryOperatorEEnum, BinaryOperator.class, "BinaryOperator");
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.OR);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.AND);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (requirementEClass, 
		   source, 
		   new String[] {
			 "constraints", "differentResponsible"
		   });	
		addAnnotation
		  (categoryEClass, 
		   source, 
		   new String[] {
			 "constraints", "moreRequirementsThanCategories"
		   });	
		addAnnotation
		  (personEClass, 
		   source, 
		   new String[] {
			 "constraints", "isResponsible"
		   });	
		addAnnotation
		  (simpleDependencyEClass, 
		   source, 
		   new String[] {
			 "constraints", "targetNotSource"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (requirementEClass, 
		   source, 
		   new String[] {
			 "differentResponsible", "self.requirementOwnedBy.personOwnsCategory->forAll(c | not c.requirement->includes(self))"
		   });	
		addAnnotation
		  (categoryEClass, 
		   source, 
		   new String[] {
			 "moreRequirementsThanCategories", "Category.allInstances()->size() <= Requirement.allInstances()->size()"
		   });	
		addAnnotation
		  (personEClass, 
		   source, 
		   new String[] {
			 "isResponsible", "self.personOwnsCategory->size() + self.personOwnsRequirement->size() > 0"
		   });	
		addAnnotation
		  (simpleDependencyEClass, 
		   source, 
		   new String[] {
			 "targetNotSource", "not self.dependencyTarget.dependencySource->includes(self)"
		   });
	}

} //Requirements_editorPackageImpl
