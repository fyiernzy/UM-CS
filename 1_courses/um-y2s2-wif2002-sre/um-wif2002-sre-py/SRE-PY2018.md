# Question 1
---
## Q1.a)
*(Lecture 6, pg. 9)* Importance of requirement documentation:
1. Serves as a reference for all stakeholders, ensuring a shared understanding
2. Helps in identifying gaps and inconsistencies
3. Map the requirements to the project objective.
4. Facilitates communications among stakeholders, ensuring everyone is on the same page regarding project requirements.
5. Preserve organizational and project knowledge
6. Provides a historical record of decisions and changes for future reference.
7. Acts as an a reference for other phases of the software development process, ensuring that design, development and testing are aligned with the requirement.
8. Provides a basis for scheduling , resource allocation and risk management.

// Books pg 59

## Q1.b)
- An ambiguously documented requirement lacks necessary details and descriptions, causing misinterpretations among different stakeholders.
- *(Lecture 7, pg. 17)* Causes of Ambiguous Requirements
	- **Nominalization** 
		- The requirement does not describe the process completely.
		- Example: *The system shall assign the task automatically to the staffs.* 
			- This requirement is unclear because it doesn't specify
				- How the system will assign the tasks. It might be based on the workload, expertise or manager's settings.
				- How the automation occurs.
				- When the automation occurs.
	- **Use of Nouns Without Reference Index**. 
		- The requirement includes nouns without clear references. 
		- Example: *The system shall allow only the permitted users to enter the dashboard*. 
			- This requirement is unclear because it doesn't specify who the *permitted users* are.
			- It should specify a role, such as *admin*, for clarity.

# Q1.c)
**Lexical ambiguity** occurs when a word in the sentence has multiple meanings, leading to different interpretations. 
- Example 1: *The system shall display the image of woods*
	- The word *wood* can refers to:
		- The materials forming the trunk or branches of a tree
		- Forested areas or trees in general
- Example 2: *The system shall calculate the distance from the bank*
	- The word *bank* can refer to:
		- A financial institute
		- The side of a river.
- Example 3: *The system shall record the date of the event.*
	- The word *date* can refer to:
		- The specific day of the event
		- A romantic outing or social engagement
- Example 4: *The system shall back up the files daily.*
	- The word *back up* can refer to
		- Creating a copy of the files for safety
		- Physically moving backwards
	
**Syntactic ambiguity** occurs when the sentence structure allows for multiple interpretations.
- Example 1: *The system shall provide the users with the ability to click on the "Register" button and "Confirm" button*
	- Meaning 1: The system shall display two buttons, "Register" and "Confirm", on the same page.
	- Meaning 2: The system shall display "Register" button first, and then the "Confirm" button after the user clicked  "Register".
- Example 2: *The system shall display the list ordered by created time and rating*
	- Meaning 1: The system shall display two sorting options by*created time* and by *rating*.
	- Meaning 2: The system shall sort the list first by created time, then by rating.
- Example 3: *The system shall send notifications to users who subscribed and completed their profiles*
	- Meaning 1: The system shall send notifications to users who have both subscribed and completed their profiles.
	- Meaning 2: The system shall send notifications to users who have either subscribed or completed their profiles.
- Example 4: *The system shall generate reports for sales managers and clients*.
	- Meaning 1: The system shall generate reports for both sales managers and clients
	- Meaning 2: The system shall generate separate reports for sales managers and clients.

## Q1.d)
- A glossary is a list of terminologies with definitions.
- **Benefits**
	- Avoids lexical ambiguity by defining each terminology used in the documents, thereby reducing misunderstandings.
	- Ensures standardized understanding of terms among stakeholders.
	- Ensures each term is used consistently across all documents.
	- Facilitates communication among stakeholders by eliminating ambiguity.
	- Enhances the understanding of the documents.

# Question 2
---
## Q2.a)
*(Lecture 3, pg. 6)* Goals of requirement elicitation:
1. Discover all requirements from stakeholders
2. Avoid customer dissatisfaction due to unmet real requirements.
3. Prevent discovering new requirements at the later stage of software development process.
4. Understands how the system shall behave and perform

## Q2.b)
1. Questionnaires
	1. **Questionnaires** are printed documents or online forms with multiple choice questions or Likert scale items.
	2. Advantages: 
		1. Gather a lot of information at a low cost
		2. Reach a distributed audience for broader analysis.
		3. Ideal for discovering basic factors.
		4. Can be easily anonymized, encouraging honest responses.
		5. Can be distributed and completed at the respondent’s convenience.
		6. Inspires stakeholders to give ideas.
	3. Disadvantages
		1. Limited to only known questions.
		2. Efficiency depends heavily on the question structure.
		3. Impossible to conduct further inquiry on questions.
		4. May have low response rates.
		5. Cannot capture non-verbal cues or emotions.
2. **Interviews**
	1. Interviews are one-on-one sessions with stakeholders involving ask-answer cycles.
	2. Advantages
		1. Ideal for discovering satisfiers
		2. Can obtain detailed information.
		3. Can clarify and probe deeper into responses.
		4. Allows for the collection of non-verbal cues and emotions.
	3. Disadvantages
		1. Time consuming.
		2. Efficiency depends heavily on how the interviewer asks questions.
		3. Can be costly if many stakeholders need to be interviewed.
		4. Responses can be biased by the interviewer's influence.
3. **Brainstorming**
	1. Brainstorming involves discussions with stakeholders to generate new solutions to problems or replace the current ones.
	2. Advantages
		1. Ideal for discovering excitement factors
		2. Can cause 'popcorn effect', where one idea inspires others.
		3. Able to generate creative solutions to problems.
	3. Disadvantages
		1. Cannot get detailed information.
		2. Time consuming
		3. Efficiency depends on the moderator's ability to control the situation, as criticism may frequently occur.
		4. Risk of dominance by loud participants. Dominant participants may overshadow quieter ones.
		5. May result in a large number of ideas, making it difficult to prioritize.
4. Brainstorming Paradox
5. Six thinking hats
6. Analogy
7. System archaeology
8. Requirement Reuse
9. Field Observation
10. Apprenticeship

## Q2.c)
*Chapter 1 is not included in Final*

# Question 4
---
## Q4.a)
Goals of requirement management:
1. To trace the requirements, including their sources and versions
2. To manage changes in requirements effectively.
3. To prepare requirements views tailored for different stakeholders.
4. To prioritize requirements based on specific criteria.
5. *(Lecture 1, pg.32)* To ensure complete implementation of the requirements.
6. *([IBM - Requirement Management](https://www.ibm.com/topics/what-is-requirements-management#:~:text=Requirements%20management%20provides%20a%20way,project%20throughout%20the%20engineering%20lifecycle.))* To avoid errors by tracking changes in requirements.

## Q4.b)
- **Pre-traceability**
	- The traceability of requirements back to their origins. It aims to ensure that the requirements align with the project's vision and stakeholder needs.
- **Post-traceability**
	- The traceability of requirements forward to their implementation and evaluation. It aims to assess the impact of changes and ensure that the final solution meets the specified requirements.

- **Pre-RS Traceability:** Focuses on the "why" of requirements, ensuring alignment with initial goals.
- **Post-RS Traceability:** Focuses on the "how" of requirements, ensuring that the solution fulfills the requirements.

- *Definition, example, reason*

## Q4.c)
1. **Traceability Matrix**
   - **Definition:** 
	   - A table that maps and tracks the relationships between requirements and other project artifacts.
   - **Usage:** 
	   - The matrix usually includes columns for requirement IDs, source documents, design specifications, test cases, and implementation modules.
   - **Importance:** 
	   - Ensures all requirements are addressed throughout the project lifecycle.
	   - Facilitates impact analysis when changes occur.

   **Example:**

| Requirement ID | Source Document | Design Specification | Test case ID | Implementation Module |
|----------------|-----------------|----------------------|--------------|-----------------------|
| RQ-01          | BRD-01          | DS-01                | TC-01        | Module-01             |
| RQ-02          | BRD-02          | DS-02                | TC-02        | Module-02             |


2. **Requirement Traceability Graphs**
   - **Definition:** Visual representations showing relationships and dependencies between requirements and other project elements.
   - **Usage:** Illustrates connections between requirements, design elements, and test cases.
   - **Importance:** Helps understand the impact of changes, manage dependencies, and identify gaps or missing links between requirements and other project elements.