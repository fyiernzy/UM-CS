Traceability Matrix

---

### Requirements Management Processes

1. Assigning Attributes to Requirements
2. Defining Views on Requirements
3. Prioritizing Requirements
4. Tracing Requirements
5. Versioning Requirements
6. Managing Requirements Changes
7. Measuring Requirements

---

# 1 - Assigning Attributes to Requirements

The most important attribute of a requirement is its identifier (ID):

- Must be uniquely assigned at creation time.
- Never modified.
- Valid for the entire SDLC.
- Preserved even if the requirement is discarded.

![[Pasted image 20240628181855.png]]

**Other Typical Attributes:**

- Priority (sequence of realization).
- Benefit of the requirement.
- Effort to implement (e.g., 100 person-days, 2 hours).
- Status (e.g., change request, agreed, conflicted).
- Requirement type (e.g., functional, quality, constraint).
- Kano model type (e.g., dissatisfier, excitement, satisfier).
- Cost (e.g., RM).


# 2 - Defining Views on Requirements
---
- Each stakeholder has specific interest in requirements. ![[Pasted image 20240628181919.png]]
- There are two types of views:
	- **Selective Views**: Contain part of the requirements information.
	- **Condensed Views**: Aggregated information, such as calculated data in terms of percentage.


# 3 - Prioritizing requirements
---
Most projects have many requirements which cannot be implemented within the schedule, budget, resource and quality constraints. Prioritization helps identify the most valuable requirements or giving precedence to some requirements over other requirements based on the feedback from the stakeholders.

Process of requirements prioritization

1. Determine purpose of prioritization and group requirements which need to be prioritized
2. based on the purpose of prioritization, Choose (1 or more) prioritization criteria such as cost, implementation duration, risk (possibilities that the requirements cannot be implemented), stability (probability that the requirements changes),  Importance / Damage due to unsuccessfull implementation, business value.
3. **Invite Relevant Stakeholders**: Involve stakeholders with specific knowledge/views about the project, such as development teams, project mgt, user , tester , quality managerr![[Pasted image 20240628182133.png]]
4. **Choose Prioritization Techniques & Prioritize**: Techniques include One-Criterion Classification, Kano Classification, Ranking, Top-Ten.

Consideration of technique selection :

a) Number of requirements
b) The complexity of the requirements
c) Efforts of applying the technique

![[Pasted image 20240628182145.png]]

Technique 1: One-Criterion Classification, IEEE Std. 830-1998
Mandatory requirements.

▪ Conditional requirements: These

requirements would enhance the system,

but the system is acceptable without it.

▪ Nice to have requirements

Technique 2: Kano classification

Kano Classification relates on customer satisfaction. Therefore, requirements are

prioritized according to their influence on customer satisfaction.

❑Dissatisfier (a must-have requirement)

The system must realize this requirement to enable market entry.

❑Satisfier (requested by customer)

The customer consciously demands the realization in the system

❑Delighter (attractive requirement)

Customers do not expect its realization

echnique 3: Requirements Ranking

▪ Single / multiple stakeholders rank the module OR requirements according to a

chosen criterion.

▪ The ranking point are added

▪ The sum of the ranking points determines the priorit
![[Pasted image 20240628182316.png]]

Technique 4: Top Ten technique

▪ Everybody has n point (Example 10 point, or 1.0)

▪ Everybody can distribute the points at discretion

▪ The sum of the points determine the priority
![[Pasted image 20240628182327.png]]

---

Obsolete requirement is one that has changed significantly (during system development) or no longer applies to the new system.

4. Tracing requirements (cont…)

▪ Traceability of requirements towards origin is necessary, to

demonstrate the reaching of vision and needs.

PRE-RS Traceability

▪ Traceability of requirements towards solution is necessary.

To evaluate results of changes

POST-RS Traceability

▪ Traceability between requirements is necessary, to manage

dependencies between requirements

Traceability

between

requirements

![[Pasted image 20240628182446.png]]

![[Pasted image 20240628182455.png]]

If a relatively small number of requirements have to be managed (up to 250),

traceability tables can be implemented using a spreadsheet.

•

Hundreds or thousands of requirements requires Requirements Management

System for traceability

---

5. Versioning Requirements

1. VERSIONING EACH SRS

At least the whole document needs to be version control

2. VERSIONING EACH REQUIREMENT

Within a document, individual requirements can have versions too.

![[Pasted image 20240628182531.png]]

![[Pasted image 20240628182544.png]]

Typical Propertise of Requirements Configurations

•

Logical connection to meet the goal of the configuration e.g: iOS 16.![[Pasted image 20240628182617.png]]

Consistency: the requirements within configuration must not be conflicted with

one another.![[Pasted image 20240628182626.png]]

Unique identification. i.e., iOS 15, iOS 16, iOS 16.4.1

• Able to rollback to earlier versions without errors.

---

6. Managing Requirements Changes

•

procedures, processes and standards which are used to manage changes

•

Changes of agreed requirements in signed SRS, changes of requirements

configurations.


Why need change?
•

Requirements errors, conflicts and inconsistencies

•

Evolving stakeholder knowledge of the system as they develop better

understanding of what required.

•

Technical, schedule or cost problems

•

Changing customer priorities (i.e., new competitor, change of staff, change of

business vision)

•

Environment that the system install has changed

•

Organisational changes (structure / operation processes)


Items change request from:

1. Unique identifier

2. FR / NFR

3. Description

4. Justification

5. Date

6. Requester

7. Priority

Elements by Change Control

Board (CCB)

1. Estimate cost of change

2. CCB decision status

3. CCB priority

4. Assign a person responsible

for implementing the change.

5. Re-plan system release.
![[Pasted image 20240628182711.png]]
Change analysis activities

1.

CCB checks for validity. Customers can misunderstand requirements and

suggest unnecessary changes.

2. Trace information to find dependent requirements affected by the change.

3. Approve/Reject/Suggest requirement alternatives.

4.

If approved/suggest an alternative: Estimate costs of making the changes.

5.

Discuss with the change requester


---

7. Measuring Requirements

Improving requirements documentation via measurement.

•

Quality requirements documents and processes can be analyzed based on

the following requirements validation and management information

❑ Error found

❑ Attributes (i.e., ID, source, risk, priority)

❑ Traces (trace forward, trace backward, trace between requirements)

❑ Changes

•

This enables the identification of improvement possibilities. Typical

measurements includes:

❑ requirements change rates