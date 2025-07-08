*(2018Q4a)* **Goals of requirement management**
1. *([IBM - Requirement Management](https://www.ibm.com/topics/what-is-requirements-management#:~:text=Requirements%20management%20provides%20a%20way,project%20throughout%20the%20engineering%20lifecycle.))* To avoid errors by tracking changes in requirements.
3. To prepare requirements views tailored for different stakeholders.
4. To prioritize requirements based on specific criteria.
5. *(Lecture 1, pg.32)* To ensure complete implementation of the requirements.
---
*(2018Q4b)* **Differentiate between pre-traceability and post-traceability for system requirement.**

| Pre-traceability                                                                                                | Post-traceability                                                                                                          |
| --------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| Tracks requirements back to their origins to ensure they align with the project's vision and stakeholder needs. | Tracks requirements forward to their implementation and evaluation to ensure the solution meets the specified requirement. |
| Focuses on the "why" the requirements exist, ensuring alignment with initial goals.                             | Focuses on the "how" the requirements are fulfilled by the the solution.                                                   |

---
*(2018Q4c)* **Describes techniques that can be used to document requirement traceability relationships.**

1. **Traceability Matrix**
	   - **Definition:** 
		   - A table that maps and tracks the relationships between requirements and other project artifacts.
	   - **Usage:** 
		   - The matrix usually includes columns for requirement IDs, source documents, design specifications, test cases, and implementation modules.
	   - **Importance:** 
		   - Ensures all requirements are addressed throughout the project lifecycle.
		   - Facilitates impact analysis when changes occur.

2. **Requirement Traceability Graphs**
	   - **Definition:** A visual representation that shows the relationships and dependencies between requirements and other project elements.
	   - **Usage:** Illustrates connections between requirements, design elements, and test cases.
	   - **Importance:** Helps understand the impact of changes, manage dependencies, and identify gaps or missing links between requirements and other project elements.

---
*(2019Q4a)* **Discuss factors that can cause change to requirement for a software project.**
1. Discovery of new requirements during implementation of testing stages.
2. Errors, conflicts, or inconsistencies in the initial requirements
3. Evolving stakeholder knowledge of the system as they gain a deeper understanding of the system.
4. Changes in the organization's structure or operational processes.
5. Constraints and issues related to technology, project timelines, or budget.
6. Changes in requirement priorities due to new competitors, changes in staff, or a revised business vision.
---
*(2019Q4b)* **Importance of attribute identifiers**
1. Uniquely identify each requirement
2. Facilitate traceability between requirements
3. Indicate version control
4. Improve communication among stakeholders by referring to a specific requirement using clear identifiers.

---
*(2019Q4b)* **Typical attributes of software requirements**
- Identifiers
- Requirement Description (The system shall/must/will/should ...)
- Source
- Status
- Cost
- Priority (Sequence of realization)
- Benefit of the requirement
- Effort to implement
- Kano model type (Dissatisfier, Satisfier, Delighter)
- Requirement type (Functional, Quality)
- SRS Version
- Requirement Stability (Low, Medium, High)

---
*(2019Q4c)* **Important steps of requirement prioritization process for software requirement.**
1. Determine the purpose of prioritization and group the requirements accordingly.
2. Choose criteria for prioritization based on the purpose. Criteria can include cost, implementation duration, risk, stability, business value and damage due to unsuccessful implementation.
	1. Risk: The possibility that an implementation fails
	2. Stability: The possibility that a requirement changes.
3. Invite relevant stakeholders with specific knowledge or view about the project, such as development teams, project managers, users, testers and quality managers
4. Choose an appropriate prioritization technique to perform, such as *one-criterion classification, Kano classification, ranking and top-ten.*
---
*(2019Q4d)* **Explain the model of Kano classification as a requirement prioritization technique and suggest one situation in which is it suitable to be used.**
- Kano classification categorizes requirements into three types:
	- **Dissatisfiers**: Basic requirements that must be met for the software to be acceptable in the market. They are given the highest priority.
	- **Satisfiers**: Performance requirements that fulfill customer needs and should be prioritized next.
	- **Delighters**. Excitement factors that exceed customer expectations but are not necessary. These are prioritized last as they act as bonus features.
- **Suitable situation**:
	- Kano classification is ideal when there are many requirements to be prioritized, providing a rough yet effective way to classify and manage them.
	- It can be used in conjunction with other techniques to enhance the precision of the prioritization process.