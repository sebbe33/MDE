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
import requirements_editor.Dependency;
import requirements_editor.Description;
import requirements_editor.FunctionalRequirement;
import requirements_editor.Person;
import requirements_editor.Requirements_editorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link requirements_editor.impl.FunctionalRequirementImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link requirements_editor.impl.FunctionalRequirementImpl#getName <em>Name</em>}</li>
 *   <li>{@link requirements_editor.impl.FunctionalRequirementImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link requirements_editor.impl.FunctionalRequirementImpl#isIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link requirements_editor.impl.FunctionalRequirementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link requirements_editor.impl.FunctionalRequirementImpl#getRequirementOwnedBy <em>Requirement Owned By</em>}</li>
 *   <li>{@link requirements_editor.impl.FunctionalRequirementImpl#getDependencySource <em>Dependency Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalRequirementImpl extends MinimalEObjectImpl.Container implements FunctionalRequirement {
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

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
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean isMandatory = IS_MANDATORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Description description;

	/**
	 * The cached value of the '{@link #getRequirementOwnedBy() <em>Requirement Owned By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementOwnedBy()
	 * @generated
	 * @ordered
	 */
	protected Person requirementOwnedBy;

	/**
	 * The cached value of the '{@link #getDependencySource() <em>Dependency Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencySource()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> dependencySource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Requirements_editorPackage.Literals.FUNCTIONAL_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__IDENTIFIER, oldIdentifier, identifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMandatory() {
		return isMandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMandatory(boolean newIsMandatory) {
		boolean oldIsMandatory = isMandatory;
		isMandatory = newIsMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__IS_MANDATORY, oldIsMandatory, isMandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Description newDescription, NotificationChain msgs) {
		Description oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Description newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getRequirementOwnedBy() {
		if (requirementOwnedBy != null && requirementOwnedBy.eIsProxy()) {
			InternalEObject oldRequirementOwnedBy = (InternalEObject)requirementOwnedBy;
			requirementOwnedBy = (Person)eResolveProxy(oldRequirementOwnedBy);
			if (requirementOwnedBy != oldRequirementOwnedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__REQUIREMENT_OWNED_BY, oldRequirementOwnedBy, requirementOwnedBy));
			}
		}
		return requirementOwnedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetRequirementOwnedBy() {
		return requirementOwnedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirementOwnedBy(Person newRequirementOwnedBy, NotificationChain msgs) {
		Person oldRequirementOwnedBy = requirementOwnedBy;
		requirementOwnedBy = newRequirementOwnedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__REQUIREMENT_OWNED_BY, oldRequirementOwnedBy, newRequirementOwnedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirementOwnedBy(Person newRequirementOwnedBy) {
		if (newRequirementOwnedBy != requirementOwnedBy) {
			NotificationChain msgs = null;
			if (requirementOwnedBy != null)
				msgs = ((InternalEObject)requirementOwnedBy).eInverseRemove(this, Requirements_editorPackage.PERSON__PERSON_OWNS_REQUIREMENT, Person.class, msgs);
			if (newRequirementOwnedBy != null)
				msgs = ((InternalEObject)newRequirementOwnedBy).eInverseAdd(this, Requirements_editorPackage.PERSON__PERSON_OWNS_REQUIREMENT, Person.class, msgs);
			msgs = basicSetRequirementOwnedBy(newRequirementOwnedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__REQUIREMENT_OWNED_BY, newRequirementOwnedBy, newRequirementOwnedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getDependencySource() {
		if (dependencySource == null) {
			dependencySource = new EObjectContainmentEList<Dependency>(Dependency.class, this, Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__DEPENDENCY_SOURCE);
		}
		return dependencySource;
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
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__REQUIREMENT_OWNED_BY:
				if (requirementOwnedBy != null)
					msgs = ((InternalEObject)requirementOwnedBy).eInverseRemove(this, Requirements_editorPackage.PERSON__PERSON_OWNS_REQUIREMENT, Person.class, msgs);
				return basicSetRequirementOwnedBy((Person)otherEnd, msgs);
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
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__REQUIREMENT_OWNED_BY:
				return basicSetRequirementOwnedBy(null, msgs);
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__DEPENDENCY_SOURCE:
				return ((InternalEList<?>)getDependencySource()).basicRemove(otherEnd, msgs);
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
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__IDENTIFIER:
				return getIdentifier();
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__NAME:
				return getName();
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__PRIORITY:
				return getPriority();
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__IS_MANDATORY:
				return isIsMandatory();
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__DESCRIPTION:
				return getDescription();
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__REQUIREMENT_OWNED_BY:
				if (resolve) return getRequirementOwnedBy();
				return basicGetRequirementOwnedBy();
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__DEPENDENCY_SOURCE:
				return getDependencySource();
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
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__NAME:
				setName((String)newValue);
				return;
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__IS_MANDATORY:
				setIsMandatory((Boolean)newValue);
				return;
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__DESCRIPTION:
				setDescription((Description)newValue);
				return;
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__REQUIREMENT_OWNED_BY:
				setRequirementOwnedBy((Person)newValue);
				return;
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__DEPENDENCY_SOURCE:
				getDependencySource().clear();
				getDependencySource().addAll((Collection<? extends Dependency>)newValue);
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
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__IS_MANDATORY:
				setIsMandatory(IS_MANDATORY_EDEFAULT);
				return;
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__DESCRIPTION:
				setDescription((Description)null);
				return;
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__REQUIREMENT_OWNED_BY:
				setRequirementOwnedBy((Person)null);
				return;
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__DEPENDENCY_SOURCE:
				getDependencySource().clear();
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
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__IS_MANDATORY:
				return isMandatory != IS_MANDATORY_EDEFAULT;
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__DESCRIPTION:
				return description != null;
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__REQUIREMENT_OWNED_BY:
				return requirementOwnedBy != null;
			case Requirements_editorPackage.FUNCTIONAL_REQUIREMENT__DEPENDENCY_SOURCE:
				return dependencySource != null && !dependencySource.isEmpty();
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
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(", name: ");
		result.append(name);
		result.append(", priority: ");
		result.append(priority);
		result.append(", isMandatory: ");
		result.append(isMandatory);
		result.append(')');
		return result.toString();
	}

} //FunctionalRequirementImpl
