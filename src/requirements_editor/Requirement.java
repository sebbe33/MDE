/**
 */
package requirements_editor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link requirements_editor.Requirement#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link requirements_editor.Requirement#getName <em>Name</em>}</li>
 *   <li>{@link requirements_editor.Requirement#getPriority <em>Priority</em>}</li>
 *   <li>{@link requirements_editor.Requirement#isIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link requirements_editor.Requirement#getDescription <em>Description</em>}</li>
 *   <li>{@link requirements_editor.Requirement#getRequirementOwnedBy <em>Requirement Owned By</em>}</li>
 *   <li>{@link requirements_editor.Requirement#getDependencySource <em>Dependency Source</em>}</li>
 * </ul>
 *
 * @see requirements_editor.Requirements_editorPackage#getRequirement()
 * @model interface="true" abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='differentResponsible notItself'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot differentResponsible='self.requirementOwnedBy.personOwnsCategory->forAll(c | not c.requirement->includes(self))' notItself='self.dependencySource->select(oclIsTypeOf(Requires))->forAll(requires: Dependency | findLeafNodes(requires.oclAsType(Requires).argument)->forAll(ra: RequirementArgument | ra.requirement <> self))'"
 * @generated
 */
public interface Requirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see requirements_editor.Requirements_editorPackage#getRequirement_Identifier()
	 * @model id="true"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link requirements_editor.Requirement#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see requirements_editor.Requirements_editorPackage#getRequirement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link requirements_editor.Requirement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see requirements_editor.Requirements_editorPackage#getRequirement_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link requirements_editor.Requirement#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Mandatory</em>' attribute.
	 * @see #setIsMandatory(boolean)
	 * @see requirements_editor.Requirements_editorPackage#getRequirement_IsMandatory()
	 * @model
	 * @generated
	 */
	boolean isIsMandatory();

	/**
	 * Sets the value of the '{@link requirements_editor.Requirement#isIsMandatory <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Mandatory</em>' attribute.
	 * @see #isIsMandatory()
	 * @generated
	 */
	void setIsMandatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Description)
	 * @see requirements_editor.Requirements_editorPackage#getRequirement_Description()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Description getDescription();

	/**
	 * Sets the value of the '{@link requirements_editor.Requirement#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Description value);

	/**
	 * Returns the value of the '<em><b>Requirement Owned By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link requirements_editor.Person#getPersonOwnsRequirement <em>Person Owns Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Owned By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Owned By</em>' reference.
	 * @see #setRequirementOwnedBy(Person)
	 * @see requirements_editor.Requirements_editorPackage#getRequirement_RequirementOwnedBy()
	 * @see requirements_editor.Person#getPersonOwnsRequirement
	 * @model opposite="personOwnsRequirement" required="true"
	 * @generated
	 */
	Person getRequirementOwnedBy();

	/**
	 * Sets the value of the '{@link requirements_editor.Requirement#getRequirementOwnedBy <em>Requirement Owned By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Owned By</em>' reference.
	 * @see #getRequirementOwnedBy()
	 * @generated
	 */
	void setRequirementOwnedBy(Person value);

	/**
	 * Returns the value of the '<em><b>Dependency Source</b></em>' containment reference list.
	 * The list contents are of type {@link requirements_editor.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency Source</em>' containment reference list.
	 * @see requirements_editor.Requirements_editorPackage#getRequirement_DependencySource()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dependency> getDependencySource();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tif argument.oclIsKindOf(BinaryOperatorArgument) then\n\t\t\t\tfindLeafNodes(argument.oclAsType(BinaryOperatorArgument).leftSideArgument)->union(findLeafNodes(argument.oclAsType(BinaryOperatorArgument).rightSideArgument))\n\t\t\telse\n\t\t\t\tif argument.oclIsKindOf(NOTOperator) then\n\t\t\t\t\tfindLeafNodes(argument.oclAsType(NOTOperator).argument)\n\t\t\t\telse\n\t\t\t\t\tSet{argument.oclAsType(RequirementArgument)}\n\t\t\t\tendif\n\t\t\tendif'"
	 * @generated
	 */
	EList<RequirementArgument> findLeafNodes(Argument argument);

} // Requirement
