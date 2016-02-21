/**
 */
package requirements_editor.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import requirements_editor.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see requirements_editor.Requirements_editorPackage
 * @generated
 */
public class Requirements_editorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Requirements_editorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirements_editorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Requirements_editorPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Requirements_editorSwitch<Adapter> modelSwitch =
		new Requirements_editorSwitch<Adapter>() {
			@Override
			public Adapter caseRequirement(Requirement object) {
				return createRequirementAdapter();
			}
			@Override
			public Adapter caseCategory(Category object) {
				return createCategoryAdapter();
			}
			@Override
			public Adapter caseDescription(Description object) {
				return createDescriptionAdapter();
			}
			@Override
			public Adapter caseTextualDescription(TextualDescription object) {
				return createTextualDescriptionAdapter();
			}
			@Override
			public Adapter caseQualityRequirement(QualityRequirement object) {
				return createQualityRequirementAdapter();
			}
			@Override
			public Adapter caseFunctionalRequirement(FunctionalRequirement object) {
				return createFunctionalRequirementAdapter();
			}
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter caseDependency(Dependency object) {
				return createDependencyAdapter();
			}
			@Override
			public Adapter caseSimpleDependency(SimpleDependency object) {
				return createSimpleDependencyAdapter();
			}
			@Override
			public Adapter caseRefines(Refines object) {
				return createRefinesAdapter();
			}
			@Override
			public Adapter caseICost(ICost object) {
				return createICostAdapter();
			}
			@Override
			public Adapter caseCValue(CValue object) {
				return createCValueAdapter();
			}
			@Override
			public Adapter caseRequires(Requires object) {
				return createRequiresAdapter();
			}
			@Override
			public Adapter caseArgument(Argument object) {
				return createArgumentAdapter();
			}
			@Override
			public Adapter caseBinaryOperatorArgument(BinaryOperatorArgument object) {
				return createBinaryOperatorArgumentAdapter();
			}
			@Override
			public Adapter caseRequirementArgument(RequirementArgument object) {
				return createRequirementArgumentAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseNOTOperator(NOTOperator object) {
				return createNOTOperatorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link requirements_editor.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirements_editor.Requirement
	 * @generated
	 */
	public Adapter createRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirements_editor.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirements_editor.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirements_editor.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirements_editor.Description
	 * @generated
	 */
	public Adapter createDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirements_editor.TextualDescription <em>Textual Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirements_editor.TextualDescription
	 * @generated
	 */
	public Adapter createTextualDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirements_editor.QualityRequirement <em>Quality Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirements_editor.QualityRequirement
	 * @generated
	 */
	public Adapter createQualityRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirements_editor.FunctionalRequirement <em>Functional Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirements_editor.FunctionalRequirement
	 * @generated
	 */
	public Adapter createFunctionalRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirements_editor.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirements_editor.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirements_editor.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirements_editor.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirements_editor.SimpleDependency <em>Simple Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirements_editor.SimpleDependency
	 * @generated
	 */
	public Adapter createSimpleDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirements_editor.Refines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirements_editor.Refines
	 * @generated
	 */
	public Adapter createRefinesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirements_editor.ICost <em>ICost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirements_editor.ICost
	 * @generated
	 */
	public Adapter createICostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirements_editor.CValue <em>CValue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirements_editor.CValue
	 * @generated
	 */
	public Adapter createCValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirements_editor.Requires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirements_editor.Requires
	 * @generated
	 */
	public Adapter createRequiresAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirements_editor.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirements_editor.Argument
	 * @generated
	 */
	public Adapter createArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirements_editor.BinaryOperatorArgument <em>Binary Operator Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirements_editor.BinaryOperatorArgument
	 * @generated
	 */
	public Adapter createBinaryOperatorArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirements_editor.RequirementArgument <em>Requirement Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirements_editor.RequirementArgument
	 * @generated
	 */
	public Adapter createRequirementArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirements_editor.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirements_editor.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirements_editor.NOTOperator <em>NOT Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirements_editor.NOTOperator
	 * @generated
	 */
	public Adapter createNOTOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Requirements_editorAdapterFactory
