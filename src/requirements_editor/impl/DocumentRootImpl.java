/**
 */
package requirements_editor.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import requirements_editor.Category;
import requirements_editor.DocumentRoot;
import requirements_editor.Person;
import requirements_editor.Requirements_editorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link requirements_editor.impl.DocumentRootImpl#getRootCategories <em>Root Categories</em>}</li>
 *   <li>{@link requirements_editor.impl.DocumentRootImpl#getPerson <em>Person</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getRootCategories() <em>Root Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> rootCategories;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> person;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Requirements_editorPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getRootCategories() {
		if (rootCategories == null) {
			rootCategories = new EObjectContainmentEList<Category>(Category.class, this, Requirements_editorPackage.DOCUMENT_ROOT__ROOT_CATEGORIES);
		}
		return rootCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPerson() {
		if (person == null) {
			person = new EObjectContainmentEList<Person>(Person.class, this, Requirements_editorPackage.DOCUMENT_ROOT__PERSON);
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Requirements_editorPackage.DOCUMENT_ROOT__ROOT_CATEGORIES:
				return ((InternalEList<?>)getRootCategories()).basicRemove(otherEnd, msgs);
			case Requirements_editorPackage.DOCUMENT_ROOT__PERSON:
				return ((InternalEList<?>)getPerson()).basicRemove(otherEnd, msgs);
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
			case Requirements_editorPackage.DOCUMENT_ROOT__ROOT_CATEGORIES:
				return getRootCategories();
			case Requirements_editorPackage.DOCUMENT_ROOT__PERSON:
				return getPerson();
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
			case Requirements_editorPackage.DOCUMENT_ROOT__ROOT_CATEGORIES:
				getRootCategories().clear();
				getRootCategories().addAll((Collection<? extends Category>)newValue);
				return;
			case Requirements_editorPackage.DOCUMENT_ROOT__PERSON:
				getPerson().clear();
				getPerson().addAll((Collection<? extends Person>)newValue);
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
			case Requirements_editorPackage.DOCUMENT_ROOT__ROOT_CATEGORIES:
				getRootCategories().clear();
				return;
			case Requirements_editorPackage.DOCUMENT_ROOT__PERSON:
				getPerson().clear();
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
			case Requirements_editorPackage.DOCUMENT_ROOT__ROOT_CATEGORIES:
				return rootCategories != null && !rootCategories.isEmpty();
			case Requirements_editorPackage.DOCUMENT_ROOT__PERSON:
				return person != null && !person.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DocumentRootImpl
