/**
 */
package requirements_editor.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import requirements_editor.Category;
import requirements_editor.Person;
import requirements_editor.Requirement;
import requirements_editor.Requirements_editorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link requirements_editor.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link requirements_editor.impl.PersonImpl#getPersonOwnsRequirement <em>Person Owns Requirement</em>}</li>
 *   <li>{@link requirements_editor.impl.PersonImpl#getPersonOwnsCategory <em>Person Owns Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPersonOwnsRequirement() <em>Person Owns Requirement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonOwnsRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> personOwnsRequirement;

	/**
	 * The cached value of the '{@link #getPersonOwnsCategory() <em>Person Owns Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonOwnsCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> personOwnsCategory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Requirements_editorPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirements_editorPackage.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getPersonOwnsRequirement() {
		if (personOwnsRequirement == null) {
			personOwnsRequirement = new EObjectWithInverseResolvingEList<Requirement>(Requirement.class, this, Requirements_editorPackage.PERSON__PERSON_OWNS_REQUIREMENT, Requirements_editorPackage.REQUIREMENT__REQUIREMENT_OWNED_BY);
		}
		return personOwnsRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getPersonOwnsCategory() {
		if (personOwnsCategory == null) {
			personOwnsCategory = new EObjectWithInverseResolvingEList<Category>(Category.class, this, Requirements_editorPackage.PERSON__PERSON_OWNS_CATEGORY, Requirements_editorPackage.CATEGORY__CATEGORY_OWNED_BY);
		}
		return personOwnsCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Requirements_editorPackage.PERSON__PERSON_OWNS_REQUIREMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPersonOwnsRequirement()).basicAdd(otherEnd, msgs);
			case Requirements_editorPackage.PERSON__PERSON_OWNS_CATEGORY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPersonOwnsCategory()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Requirements_editorPackage.PERSON__PERSON_OWNS_REQUIREMENT:
				return ((InternalEList<?>)getPersonOwnsRequirement()).basicRemove(otherEnd, msgs);
			case Requirements_editorPackage.PERSON__PERSON_OWNS_CATEGORY:
				return ((InternalEList<?>)getPersonOwnsCategory()).basicRemove(otherEnd, msgs);
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
			case Requirements_editorPackage.PERSON__NAME:
				return getName();
			case Requirements_editorPackage.PERSON__PERSON_OWNS_REQUIREMENT:
				return getPersonOwnsRequirement();
			case Requirements_editorPackage.PERSON__PERSON_OWNS_CATEGORY:
				return getPersonOwnsCategory();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Requirements_editorPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case Requirements_editorPackage.PERSON__PERSON_OWNS_REQUIREMENT:
				getPersonOwnsRequirement().clear();
				getPersonOwnsRequirement().addAll((Collection<? extends Requirement>)newValue);
				return;
			case Requirements_editorPackage.PERSON__PERSON_OWNS_CATEGORY:
				getPersonOwnsCategory().clear();
				getPersonOwnsCategory().addAll((Collection<? extends Category>)newValue);
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
			case Requirements_editorPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Requirements_editorPackage.PERSON__PERSON_OWNS_REQUIREMENT:
				getPersonOwnsRequirement().clear();
				return;
			case Requirements_editorPackage.PERSON__PERSON_OWNS_CATEGORY:
				getPersonOwnsCategory().clear();
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
			case Requirements_editorPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Requirements_editorPackage.PERSON__PERSON_OWNS_REQUIREMENT:
				return personOwnsRequirement != null && !personOwnsRequirement.isEmpty();
			case Requirements_editorPackage.PERSON__PERSON_OWNS_CATEGORY:
				return personOwnsCategory != null && !personOwnsCategory.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
