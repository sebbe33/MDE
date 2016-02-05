/**
 */
package requirements_editor.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import requirements_editor.Argument;
import requirements_editor.NOTOperator;
import requirements_editor.Requirements_editorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NOT Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link requirements_editor.impl.NOTOperatorImpl#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NOTOperatorImpl extends MinimalEObjectImpl.Container implements NOTOperator {
	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected Argument argument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NOTOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Requirements_editorPackage.Literals.NOT_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument getArgument() {
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgument(Argument newArgument, NotificationChain msgs) {
		Argument oldArgument = argument;
		argument = newArgument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Requirements_editorPackage.NOT_OPERATOR__ARGUMENT, oldArgument, newArgument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgument(Argument newArgument) {
		if (newArgument != argument) {
			NotificationChain msgs = null;
			if (argument != null)
				msgs = ((InternalEObject)argument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Requirements_editorPackage.NOT_OPERATOR__ARGUMENT, null, msgs);
			if (newArgument != null)
				msgs = ((InternalEObject)newArgument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Requirements_editorPackage.NOT_OPERATOR__ARGUMENT, null, msgs);
			msgs = basicSetArgument(newArgument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirements_editorPackage.NOT_OPERATOR__ARGUMENT, newArgument, newArgument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Requirements_editorPackage.NOT_OPERATOR__ARGUMENT:
				return basicSetArgument(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Requirements_editorPackage.NOT_OPERATOR__ARGUMENT:
				return getArgument();
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
			case Requirements_editorPackage.NOT_OPERATOR__ARGUMENT:
				setArgument((Argument)newValue);
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
			case Requirements_editorPackage.NOT_OPERATOR__ARGUMENT:
				setArgument((Argument)null);
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
			case Requirements_editorPackage.NOT_OPERATOR__ARGUMENT:
				return argument != null;
		}
		return super.eIsSet(featureID);
	}

} //NOTOperatorImpl
