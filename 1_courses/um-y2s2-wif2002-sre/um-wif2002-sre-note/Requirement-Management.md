
**Requirements Management Processes**

1. Assigning Attributes to Requirements
2. Defining Views on Requirements
3. Prioritizing Requirements
4. Tracing Requirements
5. Versioning Requirements
6. Managing Requirements Changes
7. Measuring Requirements

- An obsolete requirement is one that has significantly changed during system development or no longer applies to the new system.

# 1 - Assigning Attributes to Requirements
---
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
- Most projects have many requirements that cannot be implemented within schedule, budget, resource, and quality constraints. 
- Prioritization helps identify the most valuable requirements or gives precedence to some requirements based on stakeholder feedback.

**Process of Requirements Prioritization:**

1. **Determine Purpose**: Group requirements needing prioritization.
2. **Choose Prioritization Criteria**: Based on the purpose, select criteria such as:
	- Cost
	- Implementation duration
	- Risk (possibility of implementation failure)
	- Stability (probability of changes)
	- Importance/Damage due to unsuccessful implementation
	- Business value
3. **Invite Relevant Stakeholders**: Involve stakeholders with specific knowledge/views about the project (e.g., development teams, project management, users, testers, quality managers)![[Pasted image 20240628182133.png]]
4. **Choose Prioritization Techniques & Prioritize**
	1. Techniques include One-Criterion Classification, Kano Classification, Ranking, and Top-Ten.
	2. Consideration of technique selection :
		1. Number of requirements
		2. The complexity of the requirements
		3. Efforts of applying the technique![[Pasted image 20240628182145.png]]

**One-Criterion Classification**:

- Mandatory requirements.
- Conditional requirements (enhances system, but not necessary).
- Nice-to-have requirements.

From the master list of requirements, stakeholders need to determine what are mandatory and what are not.


**Kano Classification:**

Based on customer satisfaction, requirements are prioritized according to their influence on customer satisfaction:

- **Dissatisfier (Must-Have Requirement)**: Necessary for market entry.
- **Satisfier (Customer-Requested Requirement)**: Consciously demanded by the customer.
- **Delighter (Attractive Requirement)**: Unexpected but appreciated by customers.

**Requirements Ranking**: Stakeholders rank requirements to a chosen criterion, and ranking points are summed to determine priority. ![[Pasted image 20240628182316.png]]


**Top Ten Technique**: Stakeholders distribute points, and the sum determines priority.

▪ Everybody has n point (Example 10 point, or 1.0)
▪ Everybody can distribute the points at discretion
▪ The sum of the points determine the priority

![[Pasted image 20240628182327.png]]


# 4 - Tracing Requirements
---
- **Definition**
	- **Pre-RS Traceability**: Traceability of requirements towards origin is necessary to demonstrate the reaching of vision and needs.
	- **Post-RS Traceability**: Traceability of requirements towards the solution is necessary to evaluate the results of changes.
	- **Traceability Between Requirements**: To manage dependencies.

- **Implementation**
	- For small numbers of requirements (up to 250), traceability tables can be implemented using a spreadsheet.
	- Larger numbers require a Requirements Management System

![[Pasted image 20240628182446.png]]

![[Pasted image 20240628182455.png]]

### 5. Versioning Requirements
---
1. **The need for versioning**
	1. **Versioning Each SRS**: The whole document needs version control.
	2. **Versioning Each Requirement**: Individual requirements within a document can also have versions.
2. **Typical Properties of Requirements Configurations:**
	1. Logical connection to meet the goal of the configuration (e.g., iOS 16).
		1. IOS 16 brings a redesigned Lock Screen with new ways to customize and widgets for for information at a glance.
	2. Consistency: Requirements within configuration must not conflict. 
		1. An example of a conflicting requirement might be that the Human Resources stakeholder group explicitly requests to capture the age of an employee, but the Data Privacy team is saying that the age of the employee may not be captured or used in reporting.
	3. Unique identification (e.g., iOS 15, iOS 16, iOS 16.4.1).
	4. Ability to rollback to earlier versions without errors.

![[Pasted image 20240628182531.png]]

# 6 - Managing Requirements Changes
---
**Reasons for Change:**

- Requirements errors, conflicts, and inconsistencies.
- Evolving stakeholder knowledge of the system as they develop better understanding of what required.
- Technical, schedule, or cost problems.
- Changing customer priorities. ((i.e., new competitor, change of staff, change of business vision))
- Changes in the installation environment.
- Organizational changes. (structure / operation processes)

**Change Analysis Activities:**

1. CCB checks for validity. Customers can misunderstand requirements and suggest unnecessary changes.
2. Trace information to find dependent requirements affected by the changes.
3. Approve/Reject/Suggest requirement alternatives.
4. Estimate costs of approved changes.
5. Discuss with the change requester.

**Change Request Items:**

1. Unique identifier.
2. Functional/Non-functional requirement.
3. Description.
4. Justification.
5. Date.
6. Requester.
7. Priority.

**Elements by Change Control Board (CCB):**

1. Estimate cost of change.
2. CCB decision status.
3. CCB priority.
4. Assign a person responsible for implementing the change.
5. Re-plan system release.

Change Control Board (CCB)
- Group having expertise
- Decide based on Change Management Plan
- Can be formed at multiple level
- Can approve, reject or postpone change
- Usually have sponsor, customer representative, project manager, technical experts, and subject matter experts

### 7. Measuring Requirements
---

**Improving Requirements Documentation via Measurement:**

- Analyze quality requirements documents and processes based on validation and management information:
	- - Errors found.
	- Attributes (ID, source, risk, priority).
	- Traces (forward, backward, between requirements).
	- Changes.
- This enables the identification of improvement possibilities. 


**Typical Measurements:**

- Requirements change rates.