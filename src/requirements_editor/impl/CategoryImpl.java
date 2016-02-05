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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import requirements_editor.Category;
import requirements_editor.Person;
import requirements_editor.Requirement;
import requirements_editor.Requirements_editorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link requirements_editor.impl.CategoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link requirements_editor.impl.CategoryImpl#getSubcategoryOf <em>Subcategory Of</em>}</li>
 *   <li>{@link requirements_editor.impl.CategoryImpl#getCategoryOwnedBy <em>Category Owned By</em>}</li>
 *   <li>{@link requirements_editor.impl.CategoryImpl#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoryImpl extends MinimalEObjectImpl.Container implements Category {
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
	 * The cached value of the '{@link #getSubcategoryOf() <em>Subcategory Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubcategoryOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> subcategoryOf;

	/**
	 * The cached value of the '{@link #getCategoryOwnedBy() <em>Category Owned By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryOwnedBy()
	 * @generated
	 * @ordered
	 */
	protected Person categoryOwnedBy;

	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> requirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Requirements_editorPackage.Literals.CATEGORY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Requirements_editorPackage.CATEGORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getSubcategoryOf() {
		if (subcategoryOf == null) {
			subcategoryOf = new EObjectContainmentEList<Category>(Category.class, this, Requirements_editorPackage.CATEGORY__SUBCATEGORY_OF);
		}
		return subcategoryOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getCategoryOwnedBy() {
		if (categoryOwnedBy != null && categoryOwnedBy.eIsProxy()) {
			InternalEObject oldCategoryOwnedBy = (InternalEObject)categoryOwnedBy;
			categoryOwnedBy = (Person)eResolveProxy(oldCategoryOwnedBy);
			if (categoryOwnedBy != oldCategoryOwnedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Requirements_editorPackage.CATEGORY__CATEGORY_OWNED_BY, oldCategoryOwnedBy, categoryOwnedBy));
			}
		}
		return categoryOwnedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetCategoryOwnedBy() {
		return categoryOwnedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategoryOwnedBy(Person newCategoryOwnedBy, NotificationChain msgs) {
		Person oldCategoryOwnedBy = categoryOwnedBy;
		categoryOwnedBy = newCategoryOwnedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Requirements_editorPackage.CATEGORY__CATEGORY_OWNED_BY, oldCategoryOwnedBy, newCategoryOwnedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategoryOwnedBy(Person newCategoryOwnedBy) {
		if (newCategoryOwnedBy != categoryOwnedBy) {
			NotificationChain msgs = null;
			if (categoryOwnedBy != null)
				msgs = ((InternalEObject)categoryOwnedBy).eInverseRemove(this, Requirements_editorPackage.PERSON__PERSON_OWNS_CATEGORY, Person.class, msgs);
			if (newCategoryOwnedBy != null)
				msgs = ((InternalEObject)newCategoryOwnedBy).eInverseAdd(this, Requirements_editorPackage.PERSON__PERSON_OWNS_CATEGORY, Person.class, msgs);
			msgs = basicSetCategoryOwnedBy(newCategoryOwnedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirements_editorPackage.CATEGORY__CATEGORY_OWNED_BY, newCategoryOwnedBy, newCategoryOwnedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getRequirement() {
		if (requirement == null) {
			requirement = new EObjectContainmentEList<Requirement>(Requirement.class, this, Requirements_editorPackage.CATEGORY__REQUIREMENT);
		}
		return requirement;
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
			case Requirements_editorPackage.CATEGORY__CATEGORY_OWNED_BY:
				if (categoryOwnedBy != null)
					msgs = ((InternalEObject)categoryOwnedBy).eInverseRemove(this, Requirements_editorPackage.PERSON__PERSON_OWNS_CATEGORY, Person.class, msgs);
				return basicSetCategoryOwnedBy((Person)otherEnd, msgs);
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
			case Requirements_editorPackage.CATEGORY__SUBCATEGORY_OF:
				return ((InternalEList<?>)getSubcategoryOf()).basicRemove(otherEnd, msgs);
			case Requirements_editorPackage.CATEGORY__CATEGORY_OWNED_BY:
				return basicSetCategoryOwnedBy(null, msgs);
			case Requirements_editorPackage.CATEGORY__REQUIREMENT:
				return ((InternalEList<?>)getRequirement()).basicRemove(otherEnd, msgs);
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
			case Requirements_editorPackage.CATEGORY__NAME:
				return getName();
			case Requirements_editorPackage.CATEGORY__SUBCATEGORY_OF:
				return getSubcategoryOf();
			case Requirements_editorPackage.CATEGORY__CATEGORY_OWNED_BY:
				if (resolve) return getCategoryOwnedBy();
				return basicGetCategoryOwnedBy();
			case Requirements_editorPackage.CATEGORY__REQUIREMENT:
				return getRequirement();
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
			case Requirements_editorPackage.CATEGORY__NAME:
				setName((String)newValue);
				return;
			case Requirements_editorPackage.CATEGORY__SUBCATEGORY_OF:
				getSubcategoryOf().clear();
				getSubcategoryOf().addAll((Collection<? extends Category>)newValue);
				return;
			case Requirements_editorPackage.CATEGORY__CATEGORY_OWNED_BY:
				setCategoryOwnedBy((Person)newValue);
				return;
			case Requirements_editorPackage.CATEGORY__REQUIREMENT:
				getRequirement().clear();
				getRequirement().addAll((Collection<? extends Requirement>)newValue);
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
			case Requirements_editorPackage.CATEGORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Requirements_editorPackage.CATEGORY__SUBCATEGORY_OF:
				getSubcategoryOf().clear();
				return;
			case Requirements_editorPackage.CATEGORY__CATEGORY_OWNED_BY:
				setCategoryOwnedBy((Person)null);
				return;
			case Requirements_editorPackage.CATEGORY__REQUIREMENT:
				getRequirement().clear();
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
			case Requirements_editorPackage.CATEGORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Requirements_editorPackage.CATEGORY__SUBCATEGORY_OF:
				return subcategoryOf != null && !subcategoryOf.isEmpty();
			case Requirements_editorPackage.CATEGORY__CATEGORY_OWNED_BY:
				return categoryOwnedBy != null;
			case Requirements_editorPackage.CATEGORY__REQUIREMENT:
				return requirement != null && !requirement.isEmpty();
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

} //CategoryImpl
