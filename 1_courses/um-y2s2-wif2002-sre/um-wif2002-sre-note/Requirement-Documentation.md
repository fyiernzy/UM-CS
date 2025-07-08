> *Information established during requirement engineering activities must be documented.*

### Examples of Requirements Documentation:

- **Software Requirements Specification (SRS)**: The most important documentation.
- Other artifacts include system context, interview protocols, elicitation techniques, validation reports, agreement reports, and change requests.

---
### Requirements Documents vs. System Requirements Specification (SRS):

**Requirements Documents**:

- Contain requirements and other information defined for a specific system.
- Content, format, and quality may vary for different purposes.

**System Requirements Specification (SRS)**:

- Serves as input for subsequent development activities (e.g., software design) and acts as a contract.
- It may contain requirements and their relevant information.
- Should be complete, well-agreed, and well-specified.
![[Pasted image 20240628163907.png]]
\

---
### Importance of Requirements Documents:

1. Serve as a reference for all stakeholders.
    - Provide a common reference, identify gaps and inconsistencies, and map requirements to project objectives.
2. Act as a basis for communication.
3. Preserve organizational/project knowledge.
4. Serve as input for other software development processes.

---

### Influencing Factors on Requirements Documentation:

**Criticality of the System**:

- *Critical systems (causes death in the event of failure)* require more documentation (e.g., aircraft systems).

**Legal Commitment and Liability**:

- *Legal-bound systems need thorough documentation (e.g., tax payment systems) as failure to comply the regulation may result legal actions to be taken.*

**Standardization Degree**:

- Documentation depends on organizational standards (e.g., ISO standards).

**Experience and Competence of the Development Team**:

- Inexperienced teams require more documentation.

---
### Three Perspectives of Functional Requirements:

**Data Perspective**:

- Structure of input and output data, usage, and dependency relationships.
    - Example: Database specification, entity-relationship diagram.

**Functional Perspective**:

- Data flow between system context and system, processing/ manipulation of data in the system
    - Example: DFD diagram, use case diagram and description, activity diagram.

**Behavioral Perspective**:

- System reactions to events, state change constraints.
    - Example: State diagram and description.


---
### Quality Criteria

**Define the quality expected from:**

**A) Single Requirement:**

- The quality criteria to be met by each specified requirement.

**B) Requirement Document:**

- The quality criteria to be met by documented requirements.

---

**Quality Criteria for a Single Requirement**

- **Agreed**: Important stakeholders agree on the requirement.
- **Atomic**: Describes only one single functionality.
- **Complete**: Includes all relevant information; no further explanation needed.
- **Comprehensible**: Easy to understand.
- **Consistent**: No contradictory statements.
- **Correct**: Confirmed as correct by stakeholders.
- **Feasible**: Can be technically realized.
- **Identifiable**: Uniquely differentiated with a valid identifier.
- **Necessary**: Defines a significant system property.
- **Rated**: Has relevance, priority, and stability (checked during requirements management).
- **Traceable**: Source and evolution are documented (checked during requirements management).
- **Unambiguous**: All readers interpret it the same way.
- **Verifiable**: Can prove whether the implemented system meets the requirement.

---

**SRS Quality Criteria**

- **Affordable**: A possible solution exists that satisfies all requirements.
- **Bounded**: Requirements are within the system scope.
- **Clearly Structured**: Supports selective reading.
- **Complete**: Contains all relevant information.
- **Consistent**: All single requirements are consistently defined.
- **Modifiable and Extendable**: Easy to modify and add.
- **Traceable**: Enables traceability between different versions.
- **Unambiguous**: Only allows one valid interpretation.

---

### Acceptance Criteria:

Acceptance criteria should be defined early by requirements engineers and stakeholders. They set verifiable conditions for accepting single requirements.

**Example**:

- **Quality Requirement**: When the stop button is pushed, the control system must stop the engine within 2 seconds.
- **Acceptance Criterion**:
    - Prove the requirement with an acceptance test in the real operational environment with maximum load and vertical speed.
    - Perform at least 20 test runs; in at least 15 of the runs, the engine must stop within 1.5 seconds.

---
### Benefits of Using Natural Language in SRS

- **Easy and understandable**: Suitable for non-technical stakeholders (clients, vendors, managers).
- **Context preservation**: Maintains the context of the requirements.
- **Universality**: Appropriate for describing most situations.

---

### Weaknesses of Using Natural Language

1. **Ambiguity**: Words or phrases can have multiple interpretations.
    - Example: "User-friendly" can mean different things to different people.


---

### Lexical (Word) Ambiguity

- **Definition**: Caused by words with multiple meanings.
- **Examples**: Words that are spelled the same but have different meanings.

---
### Techniques for Addressing Lexical Ambiguities

- **Glossaries**: Collections of technical terms relevant to a project or domain.
    - A glossary defines specific meaning of each term and may contain references to related terms as well as examples that explain the term.

---

### Benefits of Glossaries

- Enable stakeholders to have a common understanding of terms.
- Ensure consistent use of terms for similar real-world objects.
- Prevent lexical ambiguities.

---
### Sentence Ambiguity

- **Definition**: Sentences that have multiple meanings.
    - Example: "The system shall allow the admin to enter the access card with the access code."
        - Meaning 1: The admin enters both the access card and the access code.
        - Meaning 2: The admin uses the access card to enter the access code. (The access card contains access code)

---
### Weaknesses of Using Natural Language in SRS

1. **Nominalization (Hidden Processes)**: Multiple processes are condensed into a single term, leaving out essential details.
    
    - Solution: Describe conditions and factors clearly.
        - Example: "When a new task is added by the manager, the system must allocate tasks based on skill sets, experience, and availability."
2. **Nouns Without Reference Index**: Lack of specific descriptions.
    
    - Solution: Specify types, formats, and interactions.
        - Example: "The system shall display product images in a grid format with a resolution of at least 800x600 pixels."
3. **Universal Quantifiers**: Words like "each," "every," "all" can be vague.
    
    - Solution: Provide specific details.
        - Example: "All employees must log in using their unique username and password."
4. **Incompletely Specified Conditions**: Missing actions for conditions.
    
    - Solution: Use trigger words like "if," "then," "in case."
        - Example: "If the client is over 18, prompt for MyKAD number; otherwise, proceed without it."
5. **Incompletely Specified Process Verbs**: Vague actions without details.
    
    - Solution: Provide detailed descriptions.
        - Example: "The system shall calculate the price based on cost, markup, and taxes, rounding up to the nearest cent."

---

**Nominalization (Hidden Processes)**

Nominalization occurs when multiple processes are condensed into a single term, omitting necessary details.
The information necessary to accurately describe the process is not explained


**Example:**

- "The system shall automatically assign tasks to staff."

**Issues:**

- What triggers task assignment? (e.g., manager action, new task creation)
- How are tasks assigned? (e.g., based on workload, expertise, manager's settings)
- Who receives the tasks? (e.g., all staff, specific departments)

**Solution:** Describe the conditions and factors in task assignment and analyze all possible functional requirements.


**Fixed Example:**

1. **FR1:** When a new task is added by the manager, the system must automatically allocate tasks to employees based on their skill sets, experience, availability, and workload, ensuring an even distribution of work across all project members.
    
2. **FR2:** The system must track and monitor all assigned tasks, sending notifications to staff members upon task completion or when new tasks are assigned.
    
3. **FR3:** The system should provide a dashboard where managers can view the status of assigned tasks and make necessary adjustments to the assignment process.
    
4. **FR4:** The system must have the ability to reassign tasks to other staff members if the original assignee is unavailable or unable to complete the task.

---
### Nouns Without Reference Index

Nouns need to be properly described to avoid ambiguity.

**Example:**

- "The data shall be displayed for the user on the screen."
    - Which data?
    - Which user?

### Solution to Fix Nouns Without Reference Index

1. **Specify the Type of Data**: Instead of using the generic term "data Be specific about the type of data displayed (e.g., text, numbers, images, videos). Indicate where the data comes from.
    
2. **Define the Format and Layout**: Specify how the data will be presented (e.g., table, list, chart). Include any formatting requirements, such as font size or color.
    
3. **Mention Interactive Features**: Indicate whether the user can interact with the data (e.g., sorting, filtering). Include these details in the functional requirements.
    
4. **Consider Accessibility Requirements**: Ensure the data is accessible to all users, including those with visual impairments. Include requirements like screen reader compatibility and appropriate contrast ratios.

**FR-1:** When the shopper clicks the "view product" button in the catalog, the system shall display product images to the shopper in a grid format with a minimum resolution of 800x600 pixels. The shopper shall be able to zoom in and out of the images, which must be accessible to users with color vision deficiencies.

---

### Universal Quantifiers (Each, Every, Never, Always, All, Some, Nothing, None)

**Overview:** Universal quantifiers specify amounts or frequencies and define a set of objects. For example:

- "For all users of the system, the login process must require a valid username and password."

This ensures the requirement applies to all users without exception, regardless of their role or level of access in the system. Using universal quantifiers can help ensure consistent and correct system performance for all users under all circumstances

**Disadvantages:**

1. **Ambiguity**: Without sufficient context, it can create confusion.
    
    - Example: "All users must be able to access the system." (What constitutes "access"? Which users?)
2. **Increased Complexity**: Adds complexity, especially in systems with many different types of users, inputs, and outputs, making it harder to test and validate all aspects.
    
3. **Potentially Unrealistic Expectations**: May set goals that are difficult or impossible to achieve.
    
    - Example: "All users must complete a task in 30 seconds or less."

**Solution to Fix Universal Quantifiers:** Avoid vague statements and provide specific details.

**Example Fixed Requirement:**

**FR-1:** All employees of the organization must be able to log in to the system using their unique username and password and access the dashboard displaying their personal information, including their work schedule and performance metrics. External partners and customers shall have access to a separate dashboard with relevant information and tools specific to their needs.

---
### Incompletely Specified Conditions

Often, the action for a condition is missing if the condition is not fulfilled (exception flow or alternative flow).

**Example:**
- "The shop system shall prompt the user to enter MyKAD number if the client is over the age of 18."
  - What about clients under 18? Specify all relevant cases.

**Solution:**
- Use trigger words: If, then, in case, whether, depending on.
- For many conditions, use a decision chart to identify non-specified condition combinations.

**Fixed Example:**
- "The shop system shall prompt the user to enter their MyKAD number if the client is over the age of 18. If the client is under 18, the system shall prompt the user to enter a guardian's consent form."

---

### Incompletely Specified Process Verbs

Incompletely specified process verbs in functional requirements describe actions without providing sufficient detail about how the process should be executed.

**Example:**

- "The system shall calculate the price of an item" is vague because it doesn't specify how the price should be calculated or what formula should be used.

**Other Examples:**

- "display", "generate", "validate", "sort", "search" – These require detailed descriptions of how the process should be executed or the criteria to be used.

**Fixed Example:**

**Original:**

- "The system shall calculate the price of an item."

**Revised:**

- **FR-1:** The system shall calculate the price of an item based on a pricing table specified in price.docx. This calculation will consider the cost of the item, a standard markup percentage, and any applicable taxes. The system shall round the calculated price up to the nearest cent. If a promotional discount is applicable, the system shall apply the discount to the calculated price. If a tax exemption applies, the system shall exclude the applicable tax from the price calculation.

---

![[Pasted image 20240628165501.png]]

### Requirements Template/Pattern

- **Purpose**: Facilitate documenting individual requirements in natural language.
- **Steps**:
    1. Determine the core of the requirement (process verb).
    2. Characterize the system activity.
    3. Insert objects as needed.  some process verb require one or more objects. Example, printing requires what will be printed
    4. Specify logical and temporal conditions (e.g., "if...then" or "during...").
-> logical condition if... Then OR
-> temporary condition: as soon as, after, during, as long as

![[Pasted image 20240628165518.png]]

### Examples of Autonomous System Activities

1. **End-of-Day Processing**:
    - FR-1: "During end-of-day processing (22:00-23:59 GMT+1), the system shall print a vehicle reservation list for the day."
2. **Monthly Invoice Check**:
    - FR-1: "At the end of each month, if payments have been received, the system shall check all invoices. If unpaid, the system shall send a payment reminder."

### Examples of User Interaction

1. **Reservation Cancellation**:
    - FR-1: "If a client has reserved a vehicle temporarily, the system shall allow the client to cancel the reservation."
2. **Viewing Client Information**:
    - FR-1: "If a sales agent selects a client, the system shall provide the agent with the client's name, address, and account balance."