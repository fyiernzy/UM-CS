# Question 2
---
## Q2.a)
1. Dissatisfiers/ Must-Have/ Expected Quality
2. Satisfiers/ Performance/ Desired Quality
4. Delighters/ Excitement/ Excited Quality

## Q2.b)
1. **Satisfiers/ Performance/ Desired Quality**
	1. Interview
		1. Interviews allow for detailed questions and  clarifications, ensuring an in-depth understanding of desired system functionalities and capturing performance requirements accurately.
	2. Other possible methods: System archaeology

2. **Dissatisfiers/ Must-Have/ Expected Quality**
	1. **Questionnaires** can collect feedback from a large, distributed audience about the essential functionalities of the system. It can reach a broad audience quickly and gather a wide range of responses.
	3. Other possible methods: 
		1. **Field Observation**: Observing users in their natural environment helps identify implicit needs and expectations that users might not articulate in other settings.
		2. **Apprenticeship**: Working alongside users helps in understanding the tasks and processes they follow, ensuring that the system meets their fundamental needs.
		3. **System archaeology**: Analyzing existing systems can provide insights into essential requirements that need to be retained or improved in the new system.
3. **Delighters/ Excitement/ Excited Quality**
	1. Brainstorming sessions encourage creative thinking and the generation of innovative ideas by allowing participants to build on each other's suggestions (*popcorn reactions*). It fosters an open an collaborative environment.
	3. Other possible methods: Brainstorming paradox, Analogy, 6 thinking hats

## Q2.c)
**Questionnaires.**
- Gather a lot of information at a low cost.
- Can be distributed widely, covering diverse regions and reaching distributed audience.
- Users can respond at their convenience
- Reduce interviewer bias, leading to more objective results.

# Question 3
---
## Q3.a)

| Req               | Transformation Defect                               | Rationale                                                                                                                                                                                                                                                                                                                                   | Ways to address the defect                                                                                                                                                                                                                                                                                                            |
| ----------------- | --------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| *R1*              | **Nouns without Reference Index**                   | It is unclear what "informed" entails (e.g. email, phone call, system notification)                                                                                                                                                                                                                                                         | Specify the method and timing of notification, e.g. <br><br>*If a student fails an exam, the examination office shall be informed via email within 24 hours.*                                                                                                                                                                         |
| *R2*              | **Nouns without Reference Index**                   | It is unclear if 'all students' grades' includes only the grades for the instructor's courses or for all courses.<br><br>It is also unclear if 'view all the students' grades' means:<br><br>The instructor can view each student's grade individually.<br><br>**OR**<br><br>The instructor can view the aggregated grades of all students. | Clarify the scope., e.g: *Class instructors shall be able to view all grades of the students enrolled in their class*<br><br>Describe properly how the grade will be displayed. For example, <br><br>*Class instructors shall be able to view all students' aggregated grades in a pie chart, displaying the distribution of grades.* |
| *R3*<br><br>DUNNO | *change the username and password*                  | ***Syntactic ambiguity**:<br>Meaning 1:<br>Users should change both username and password at the same time.<br><br>Meaning 2:<br>Users are allowed to change either username or password one at a time.*                                                                                                                                    | *Describe properly how the change can be made. For example:<br><br>Users shall be able to change either username and password one at a time*                                                                                                                                                                                          |
| *R4*              | Nouns without Reference Index<br><br>Nominalization | It is not clear if "register" refers to course registration, system registration, or another type of registration.<br><br>The requirement is unclear about how the registration is performed<br><br><br><br>                                                                                                                                | Describe the registration process. For example, <br><br>*Students shall be able to fill in the registration form consisting of username, email and password and click the 'Register' button to register.*<br><br>Specify the type of registration, e.g. "*Students shall be able to register for courses.*"                           |
| *R5*<br><br>DUNNO | *able to change username*                           | Nominalization:<br><br>The requirement is unclear about how the change can be made.                                                                                                                                                                                                                                                         | Describe how changing username can be performed. For example, <br><br>*Users shall be able to fill in the new username and click 'Confirm" to change the username.*                                                                                                                                                                   |

## Q3.b)
- **Functional requirements** 
	- **Formal Definition**
		- *(Pohl & Rupp, 2011)* A functional requirement is a requirement concerning a result of behavior that shall be provided by a function of the system.
	- **Simplified definitions**
		- Functions or behaviors that the system must provide.
		- Describe how the system should behave. 
		- Describes the system in terms of layout designs, functionalities, and sequences in different conditions. 
- **Quality requirements** 
	- **Definition**
		- *(Pohl & Rupp, 2011)*  A quality requirement is a requirement that pertains to a quality concern that is not covered by functional requirements.
	- **Simplified definitions**
		- Quality concerns not covered by functional requirements.
		- Describe how the system should perform. 
		- Specify the criteria or regulations that the system should comply with.

## Q3.c)
- **Requirement document**
	- A high-level document that contains the vision and objective of the system. 
	- Ensures that the implementation meets the system goals.
	- Provides a broad overview of what the system should achieve.
	- **Characteristics**
		- **High-Level Overview**: It provides a broad view of the system, focusing on the goals and objectives.
		- **Vision and Objectives**: Describes the purpose and aims of the system.
		- **Scope**: Defines the boundaries of the system and its functionalities.
		- **Stakeholder Alignment**: Ensures all stakeholders have a common understanding of the system's goals.
- **Requirement specification**
	- Contains detailed description of the system's implementation. 
	- Serves as a reference for other phases in software development cycle.
	- Includes precise and specific requirements that guide the design and development processes.
	- **Characteristics**
		- **Detailed Implementation**: Provides in-depth details about the system’s functionalities and behaviors.
		- **Reference for Development**: Used as a guide during the design, development, and testing phases.
		- **Precision**: Contains specific and clear requirements to avoid ambiguities.
		- **Traceability**: Facilitates tracking of requirements throughout the project lifecycle.

# Question 4
---
## Q4.a)
1. Discovery of new requirements during implementation of testing stages.
2. Changes in the organization's structure or operational processes.
3. Evolving stakeholder knowledge of the system as they gain a deeper understanding of the system.
4. Changes in customer priorities due to new competitors, changes in staff, or a revised business vision.
10. Constraints and issues related to technology, project timelines, or budget.
12. Errors, conflicts, or inconsistencies in the initial requirements

## Q4.b)
Importance of attribute identifiers
- Uniquely identify each requirement
- Facilitate traceability between requirements
- Indicate version control
- Improve communication among stakeholders by referring to a specific requirement using clear identifiers.

Three typical attributes of software requirements
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

## Q4.c)
- Determine the purpose of prioritization and group the requirements accordingly.
- Choose criteria for prioritization based on the purpose. Criteria can include cost, implementation duration, risk (possibility of implementation failure), stability (probability of changes), business value and importance/ damage due to unsuccessful implementation.
- Invite relevant stakeholders with specific knowledge or view about the project, such as development teams, project managers, users, testers and quality managers.
- Choose an appropriate prioritization technique to perform, such as one-criterion classification, Kano classification, ranking and top-ten.

## Q4.d)
- Kano classification categorizes requirements into three types:
	- **Dissatisfiers**: Basic requirements that must be met for the software to be acceptable in the market. They are given the highest priority.
	- **Satisfiers**: Performance requirements that fulfill customer needs and should be prioritized next.
	- **Delighters**. Excitement factors that exceed customer expectations but are not necessary. These are prioritized last as they act as bonus features.
- **Suitable situation**:
	- Kano classification is ideal when there are many requirements to be prioritized, providing a rough yet effective way to classify and manage them.
	- It can be used in conjunction with other techniques to enhance the precision of the prioritization process.


