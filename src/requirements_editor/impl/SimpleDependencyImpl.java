/**
 */
package requirements_editor.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import requirements_editor.Requirement;
import requirements_editor.Requirements_editorPackage;
import requirements_editor.SimpleDependency;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link requirements_editor.impl.SimpleDependencyImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link requirements_editor.impl.SimpleDependencyImpl#getDependencyTarget <em>Dependency Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SimpleDependencyImpl extends MinimalEObjectImpl.Container implements SimpleDependency {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependencyTarget() <em>Dependency Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyTarget()
	 * @generated
	 * @ordered
	 */
	protected Requirement dependencyTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Requirements_editorPackage.Literals.SIMPLE_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirements_editorPackage.SIMPLE_DEPENDENCY__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getDependencyTarget() {
		if (dependencyTarget != null && dependencyTarget.eIsProxy()) {
			InternalEObject oldDependencyTarget = (InternalEObject)dependencyTarget;
			dependencyTarget = (Requirement)eResolveProxy(oldDependencyTarget);
			if (dependencyTarget != oldDependencyTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Requirements_editorPackage.SIMPLE_DEPENDENCY__DEPENDENCY_TARGET, oldDependencyTarget, dependencyTarget));
			}
		}
		return dependencyTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetDependencyTarget() {
		return dependencyTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependencyTarget(Requirement newDependencyTarget) {
		Requirement oldDependencyTarget = dependencyTarget;
		dependencyTarget = newDependencyTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirements_editorPackage.SIMPLE_DEPENDENCY__DEPENDENCY_TARGET, oldDependencyTarget, dependencyTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Requirements_editorPackage.SIMPLE_DEPENDENCY__COMMENT:
				return getComment();
			case Requirements_editorPackage.SIMPLE_DEPENDENCY__DEPENDENCY_TARGET:
				if (resolve) return getDependencyTarget();
				return basicGetDependencyTarget();
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
			case Requirements_editorPackage.SIMPLE_DEPENDENCY__COMMENT:
				setComment((String)newValue);
				return;
			case Requirements_editorPackage.SIMPLE_DEPENDENCY__DEPENDENCY_TARGET:
				setDependencyTarget((Requirement)newValue);
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
			case Requirements_editorPackage.SIMPLE_DEPENDENCY__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case Requirements_editorPackage.SIMPLE_DEPENDENCY__DEPENDENCY_TARGET:
				setDependencyTarget((Requirement)null);
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
			case Requirements_editorPackage.SIMPLE_DEPENDENCY__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case Requirements_editorPackage.SIMPLE_DEPENDENCY__DEPENDENCY_TARGET:
				return dependencyTarget != null;
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //SimpleDependencyImpl
