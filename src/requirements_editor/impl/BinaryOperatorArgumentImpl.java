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
import requirements_editor.BinaryOperator;
import requirements_editor.BinaryOperatorArgument;
import requirements_editor.Requirements_editorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Operator Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link requirements_editor.impl.BinaryOperatorArgumentImpl#getRightSideArgument <em>Right Side Argument</em>}</li>
 *   <li>{@link requirements_editor.impl.BinaryOperatorArgumentImpl#getLeftSideArgument <em>Left Side Argument</em>}</li>
 *   <li>{@link requirements_editor.impl.BinaryOperatorArgumentImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryOperatorArgumentImpl extends MinimalEObjectImpl.Container implements BinaryOperatorArgument {
	/**
	 * The cached value of the '{@link #getRightSideArgument() <em>Right Side Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightSideArgument()
	 * @generated
	 * @ordered
	 */
	protected Argument rightSideArgument;

	/**
	 * The cached value of the '{@link #getLeftSideArgument() <em>Left Side Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftSideArgument()
	 * @generated
	 * @ordered
	 */
	protected Argument leftSideArgument;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final BinaryOperator OPERATOR_EDEFAULT = BinaryOperator.OR;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected BinaryOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryOperatorArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Requirements_editorPackage.Literals.BINARY_OPERATOR_ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument getRightSideArgument() {
		return rightSideArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightSideArgument(Argument newRightSideArgument, NotificationChain msgs) {
		Argument oldRightSideArgument = rightSideArgument;
		rightSideArgument = newRightSideArgument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Requirements_editorPackage.BINARY_OPERATOR_ARGUMENT__RIGHT_SIDE_ARGUMENT, oldRightSideArgument, newRightSideArgument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightSideArgument(Argument newRightSideArgument) {
		if (newRightSideArgument != rightSideArgument) {
			NotificationChain msgs = null;
			if (rightSideArgument != null)
				msgs = ((InternalEObject)rightSideArgument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Requirements_editorPackage.BINARY_OPERATOR_ARGUMENT__RIGHT_SIDE_ARGUMENT, null, msgs);
			if (newRightSideArgument != null)
				msgs = ((InternalEObject)newRightSideArgument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Requirements_editorPackage.BINARY_OPERATOR_ARGUMENT__RIGHT_SIDE_ARGUMENT, null, msgs);
			msgs = basicSetRightSideArgument(newRightSideArgument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirements_editorPackage.BINARY_OPERATOR_ARGUMENT__RIGHT_SIDE_ARGUMENT, newRightSideArgument, newRightSideArgument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument getLeftSideArgument() {
		return leftSideArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftSideArgument(Argument newLeftSideArgument, NotificationChain msgs) {
		Argument oldLeftSideArgument = leftSideArgument;
		leftSideArgument = newLeftSideArgument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Requirements_editorPackage.BINARY_OPERATOR_ARGUMENT__LEFT_SIDE_ARGUMENT, oldLeftSideArgument, newLeftSideArgument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftSideArgument(Argument newLeftSideArgument) {
		if (newLeftSideArgument != leftSideArgument) {
			NotificationChain msgs = null;
			if (leftSideArgument != null)
				msgs = ((InternalEObject)leftSideArgument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Requirements_editorPackage.BINARY_OPERATOR_ARGUMENT__LEFT_SIDE_ARGUMENT, null, msgs);
			if (newLeftSideArgument != null)
				msgs = ((InternalEObject)newLeftSideArgument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Requirements_editorPackage.BINARY_OPERATOR_ARGUMENT__LEFT_SIDE_ARGUMENT, null, msgs);
			msgs = basicSetLeftSideArgument(newLeftSideArgument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirements_editorPackage.BINARY_OPERATOR_ARGUMENT__LEFT_SIDE_ARGUMENT, newLeftSideArgument, newLeftSideArgument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(BinaryOperator newOperator) {
		BinaryOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirements_editorPackage.BINARY_OPERATOR_ARGUMENT__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Requirements_editorPackage.BINARY_OPERATOR_ARGUMENT__RIGHT_SIDE_ARGUMENT:
				return basicSetRightSideArgument(null, msgs);
			case Requirements_editorPackage.BINARY_OPERATOR_ARGUMENT__LEFT_SIDE_ARGUMENT:
				return basicSetLeftSideArgument(null, msgs);
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
			case Requirements_editorPackage.BINARY_OPERATOR_ARGUMENT__RIGHT_SIDE_ARGUMENT:
				return getRightSideArgument();
			case Requirements_editorPackage.BINARY_OPERATOR_ARGUMENT__LEFT_SIDE_ARGUMENT:
				return getLeftSideArgument();
			case Requirements_editorPackage.BINARY_OPERATOR_ARGUMENT__OPERATOR:
				return getOperator();
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
			case Requirements_editorPackage.BINARY_OPERATOR_ARGUMENT__RIGHT_SIDE_ARGUMENT:
				setRightSideArgument((Argument)newValue);
				return;
			case Requirements_editorPackage.BINARY_OPERATOR_ARGUMENT__LEFT_SIDE_ARGUMENT:
				setLeftSideArgument((Argument)newValue);
				return;
			case Requirements_editorPackage.BINARY_OPERATOR_ARGUMENT__OPERATOR:
				setOperator((BinaryOperator)newValue);
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
			case Requirements_editorPackage.BINARY_OPERATOR_ARGUMENT__RIGHT_SIDE_ARGUMENT:
				setRightSideArgument((Argument)null);
				return;
			case Requirements_editorPackage.BINARY_OPERATOR_ARGUMENT__LEFT_SIDE_ARGUMENT:
				setLeftSideArgument((Argument)null);
				return;
			case Requirements_editorPackage.BINARY_OPERATOR_ARGUMENT__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
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
			case Requirements_editorPackage.BINARY_OPERATOR_ARGUMENT__RIGHT_SIDE_ARGUMENT:
				return rightSideArgument != null;
			case Requirements_editorPackage.BINARY_OPERATOR_ARGUMENT__LEFT_SIDE_ARGUMENT:
				return leftSideArgument != null;
			case Requirements_editorPackage.BINARY_OPERATOR_ARGUMENT__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //BinaryOperatorArgumentImpl
