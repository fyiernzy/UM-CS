*(2018Q1a)* **Importance of requirement documentation**
1. Serves as a reference for all stakeholders, ensuring a shared understanding.
2. Helps identify gaps and inconsistencies in understanding among stakeholders.
3. Maps the requirements to the project objective.
4. Facilitates communications among stakeholders by ensuring a shared understanding
5. Preserves organizational and project knowledge
6. Provides a historical record of decisions and changes for future reference.
7. Serves as a reference for other phases of the software development process, ensuring alignment with requirements during design, development, and testing.
8. Helps overcome legal conflicts between parties, as requirements have legal relevance. *(Pohl & Rupp, 2011, p. 59)*
9. Helps keep track of how a system behaves and evolves as it becomes more complex. *(Pohl & Rupp, 2011, p. 59)* 
10. Facilitates understanding of the system for newcomers. *(Pohl & Rupp, 2011, p. 59)* 

**References**
1. Pohl, K., & Rupp, C. (2011b). _Requirements Engineering Fundamentals: A Study Guide for the Certified Professional for Requirements Engineering Exam - Foundation Level - IREB compliant_. http://www.gbv.de/dms/tib-ub-hannover/642716781.pdf

---
(*2017Q3, 2019Q3c*) **Compares Requirement Document and System Requirement Specification (SRS)**

> The SRS and the requirement document are not equal or on the same level. The SRS *is a subset of* the requirement document; while the requirement document *contains* the SRS.

**Requirement Document/ Requirement Specification**
- *(Pohl & Rupp, 2011, p. 59)* A systematically represented collection of requirements, typically for a system or component, that satisfies given criteria.
- Provides a broad view of the system, focusing on goals and objectives.

**System Requirement Specification (SRS)**
- *(Pohl & Rupp, 2011, pg. 65)* A refinement of the requirements and constraints of the Customer Requirements Specification.
- A detailed, formal document that serves as a reference for development activities such as designing and testing. It also acts as a contract.
- ***Notes***: Contains specific, measurable, and detailed requirements, along with relevant information, to guide developers and testers.

---
*(2017Q4, 2018Q1c)* **Compare lexical ambiguity and syntactic ambiguity**

**Lexical ambiguity**
- Occurs when a word in the sentence has multiple meanings.
- Examples:
	1. *The system shall calculate the distance of bank from center point*. 
		- The word *bank* can refer to 
			- A financial institute
			- The side of a river.
	2. *The system shall display the image of wood*. 
		- The word *wood* can refer to
			- The materials forming the trunk or branches of a tree
			- Forested areas or trees in general
	
**Syntactic ambiguity**
- Occurs when the sentence can be interpretated in multiple ways.
- Examples:
	1. *The system shall allow the admin enters the access card with the access code*
		- The manager uses the access card *and* enter the access code into the system.
		- The manager uses the access card *which* contains the access code to access the system.
	2. *The system shall allow all users to enter a coupon code*
		- All users enter the same coupon code
		- Each user enters a different coupon code.
	3. *The system shall display the list ordered by created time and rating*
		- The system shall display two sorting options by*created time* and by *rating*.
		- The system shall sort the list first by created time, then by rating.
	4. *The system shall send notifications to users who subscribed and completed their profiles*
		- The system shall send notifications to users who have both subscribed and completed their profiles.
		- The system shall send notifications to users who have either subscribed or completed their profiles.

---
*(PY2017Q3)* **Important information that need to be documented during requirements engineering process.**
- **Change Request.**
	- Documenting change requests helps in validating their importance and understanding their impact on the project.
	- Ensures all changes are tracked and managed systematically.
- **Interview Minutes.** 
	- Recording interview minutes provides a reference for future decisions.
	- Captures stakeholders' insights and requirements accurately.
- **Stakeholders information**
	- Documenting stakeholders involved ensures the correct individuals are included in conflict resolution and discussions.
	- Helps in understanding their roles and influence on the project.
---
*(2018Q1d)* **Describe about glossary and its benefits in the software requirements engineering process.**
- A glossary is a collection of technical terms relevant to a specific project or domain.
- It defines specific meaning of each term and may include references to related terms and examples that explain the term.
- **Benefits**
	- Avoids lexical ambiguity by defining each terminology, reducing misunderstandings.
	- Ensures consistent meaning and interpretation of each term.
	- Promotes consistent use of terms across all documents.
	- Facilitates communication among stakeholders by eliminating ambiguity.	
---
*(2018Q1b)* **Define ambiguously documented requirement.**
An ambiguously documented requirement lacks necessary details and descriptions, causing misinterpretations among different stakeholders.

---
*(2018Q1b)* **Causes of Ambiguous Requirements**
*(Lecture 7, pg. 17)*

**Nominalization** 
-  **Definition**: The requirement lacks necessary information to describe a process and converts multiple processes into a singular event. *(Pohl & Rupp, 2011, p. 76)*
- **Solution**: Defines process completely.
- **Example**: 
	- *The system shall assign the task automatically to the staffs.* 
		- This requirement is unclear because it doesn't specify
			- How tasks are assigned (e.g., based on workload, expertise, or manager's settings).
			- How automation occurs.
			- When automation occurs.

**Nouns Without Reference Index**
- **Definition**
	- The requirement contains incompletely specified nouns.
	- Examples: *the user, the controller, the system, the message, the data* or *the function.*
- **Solution**
	- Specify data types (e.g., numbers, images, videos).
	- Define how data is displayed, including layout and design.
	- Include details of any interactive features.
	- Include accessibility requirements.
- **Example**: *The system shall allow only the permitted users to enter the dashboard*. 
	- This is unclear because it doesn't specify who the *permitted users* are.
	- It should specify a role, such as *admin*, for clarity.

**Universal Quantifiers**
- Examples: each, every, never, always, all, some, nothing, none
- Universal quantifiers specify amounts or frequencies, grouping a set of objects and making a statement about their behaviour. *(Pohl & Rupp, 2011, p. 78)*
- **Disadvantages**:
	- Causes ambiguity if used imprecisely or without sufficient context.
	- Adds complexity to testing and validation, especially in systems with many different types of users, inputs, and outputs.
	- May set difficult or impossible goals
	- Risk that the specified behavior or property does not apply to all objects in the set
- **Solution**: 
	- Avoid vague statements and provide specific details.
	- Verify if the specified behavior truly applies to all objects in the set.

**Incompletely Specified Conditions**
- Missing behaviors for a condition, especially in exception or alternative flows. 
- Solution
	- Use trigger words, such as if, then, in case, whether, depending on.
	- If there are many conditions, use decision chart to identify unspecified condition combinations 

**Incompletely Specified Process Verbs**
- **Definition**: Action words used without enough details on how the process should be executed.
- **Solution**: 
	- Use active voice instead of passive voice.
	- Uses the 5W1H method to complete the sentence

> Some process verbs require more than one noun to be considered completely specified. The verb *transmit*, for instance, requires at least three supplements to be considered complete: *what* is being transmitted, from *where* it is being transmitted, and to *where* it is being transmitted. *(Pohl & Rupp, 2011, p. 79)*


