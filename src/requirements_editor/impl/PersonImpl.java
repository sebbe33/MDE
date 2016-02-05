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
 *   <li>{@link requirements_editor.impl.PersonImpl#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link requirements_editor.impl.PersonImpl#getLastname <em>Lastname</em>}</li>
 *   <li>{@link requirements_editor.impl.PersonImpl#getPersonOwnsRequirement <em>Person Owns Requirement</em>}</li>
 *   <li>{@link requirements_editor.impl.PersonImpl#getPersonOwnsCategory <em>Person Owns Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The default value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected String firstname = FIRSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
	protected static final String LASTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
	protected String lastname = LASTNAME_EDEFAULT;

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
	public String getFirstname() {
		return firstname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstname(String newFirstname) {
		String oldFirstname = firstname;
		firstname = newFirstname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirements_editorPackage.PERSON__FIRSTNAME, oldFirstname, firstname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastname(String newLastname) {
		String oldLastname = lastname;
		lastname = newLastname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirements_editorPackage.PERSON__LASTNAME, oldLastname, lastname));
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
			case Requirements_editorPackage.PERSON__FIRSTNAME:
				return getFirstname();
			case Requirements_editorPackage.PERSON__LASTNAME:
				return getLastname();
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
			case Requirements_editorPackage.PERSON__FIRSTNAME:
				setFirstname((String)newValue);
				return;
			case Requirements_editorPackage.PERSON__LASTNAME:
				setLastname((String)newValue);
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
			case Requirements_editorPackage.PERSON__FIRSTNAME:
				setFirstname(FIRSTNAME_EDEFAULT);
				return;
			case Requirements_editorPackage.PERSON__LASTNAME:
				setLastname(LASTNAME_EDEFAULT);
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
			case Requirements_editorPackage.PERSON__FIRSTNAME:
				return FIRSTNAME_EDEFAULT == null ? firstname != null : !FIRSTNAME_EDEFAULT.equals(firstname);
			case Requirements_editorPackage.PERSON__LASTNAME:
				return LASTNAME_EDEFAULT == null ? lastname != null : !LASTNAME_EDEFAULT.equals(lastname);
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
		result.append(" (firstname: ");
		result.append(firstname);
		result.append(", lastname: ");
		result.append(lastname);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
