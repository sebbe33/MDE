/**
 */
package requirements_editor.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import requirements_editor.Requirement;
import requirements_editor.RequirementArgument;
import requirements_editor.Requirements_editorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link requirements_editor.impl.RequirementArgumentImpl#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementArgumentImpl extends MinimalEObjectImpl.Container implements RequirementArgument {
	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected Requirement requirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Requirements_editorPackage.Literals.REQUIREMENT_ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getRequirement() {
		if (requirement != null && requirement.eIsProxy()) {
			InternalEObject oldRequirement = (InternalEObject)requirement;
			requirement = (Requirement)eResolveProxy(oldRequirement);
			if (requirement != oldRequirement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Requirements_editorPackage.REQUIREMENT_ARGUMENT__REQUIREMENT, oldRequirement, requirement));
			}
		}
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetRequirement() {
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirement(Requirement newRequirement) {
		Requirement oldRequirement = requirement;
		requirement = newRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirements_editorPackage.REQUIREMENT_ARGUMENT__REQUIREMENT, oldRequirement, requirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Requirements_editorPackage.REQUIREMENT_ARGUMENT__REQUIREMENT:
				if (resolve) return getRequirement();
				return basicGetRequirement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Requirements_editorPackage.REQUIREMENT_ARGUMENT__REQUIREMENT:
				setRequirement((Requirement)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Requirements_editorPackage.REQUIREMENT_ARGUMENT__REQUIREMENT:
				setRequirement((Requirement)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Requirements_editorPackage.REQUIREMENT_ARGUMENT__REQUIREMENT:
				return requirement != null;
		}
		return super.eIsSet(featureID);
	}

} //RequirementArgumentImpl
