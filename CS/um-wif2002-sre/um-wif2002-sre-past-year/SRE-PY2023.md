# Question 1
---
## Q1.a)
Kano classification can be used when there are many requirements to be prioritized. It provides a rough yet effective way to categorize them. This method can be used in conjunction with other techniques to enhance the prioritization process.

It categorizes requirements into three types: dissatisfiers, satisfiers and delighters. 
- Dissatisfiers allows a company to enter the market and are given the highest priority. 
- Satisfiers are explicitly requested by customers and are given the next highest priority.
- Delighters are nice to have but not necessary, so they should be given the lowest priority.

## Q1.b)
1. **Dissatisfiers/Basic/Expected Quality**
	1. Questionnaires can collect a lot of information from a large audience at a low cost, allowing requirement engineers to determine basic functionalities the system must provide.
2. **Satisfiers/Performance/Desired Quality**
	1. Interviews allow for obtaining detailed information by probing deeper into the questions, helping to understand the customer's requirements.
3. **Delighters/Excitement/Excited Quality**
	1. Brainstorming encourages creative thinking and innovative solutions, allowing participants to inspire each other with their ideas.

## Q1.d)
Questionnaires
- Can collect a lot of information at a low cost
- Can be distributed widely, covering diverse regions and reaching a large audience.
- Allow participants to respond at their convenience.
- Can inspire participants to give ideas.

# Question 2
---
- FR1
	- **Cause**: Incomplete specified condition
	- **Rationale**: It doesn't describe the process executed if the student passes the exam.
	- **Solution**: Describe the process executed if a student passes the exam. Example: *"If a student fails an exam, the system shall inform the examination office via email at 12:00 AM (0:00) (GMT+08) every day. Otherwise, the system shall not inform the examination office through any means."*
	
- FR2
	- **Cause**: Universal Quantifiers
	- **Rationale**: The word *all* causes ambiguity. It can mean
		- Class instructors can view the grades of the students who enroll their courses.
		- Class instructors can view the grades of all students regardless of the courses the students enroll in.
	- **Solution**: Provide detailed information to provide a complete context and eliminate ambiguity. Example: *"The system shall provide class instructors with the ability to view the grades of all students who have enrolled in their classes. The grades shall be listed along with students' names, matriculation numbers, and grades."*
- FR3
	- **Cause**: Nominalization
	- **Rationale**: It doesn't describe how a user can change the username and password. There are hidden processes.
	- **Solution**: Describe the process completely. For example:
		- FR3.1 - *The system shall display an "Edit" button displayed as a pencil icon at the bottom left to the profile image.*
		- FR3.2 - *After the user clicks the "Edit" button, the system shall provide the user with the ability to fill in the username and password fields for changes.*
		- FR3.3 - *The system shall display a "Confirm" button at the bottom of the page for the user to confirm the changes.*
- FR4
	- **Cause**: Incomplete specified process verb
	- **Rationale**: It doesn't specify what is registered by the students.
	- **Solution**: Specify what is registered. For examples: *"The system shall provide the student with the ability to register for a course by clicking "Add" button, represented by a 'Plus' sign, at the leftmost of each course record. "*
- FR5
	- **Cause**: Nouns without Reference Index
	- **Rationale**: It doesn't specify what data is referred to and how the data is displayed.
	- **Solution**: Specify what data is referred to and how the data is displayed. For examples, "*The system shall provide the course instructor with the ability to view students' information, including their name, emails and CGPAs, in a table format. Each page shall display 20 records.*"

# Question 3
---
## Q3.a)
1. Changes in organization's structure or operational processes.
2. Errors, conflicts, or inconsistencies in the initial requirements.
3. Discovery of new requirements at the later stage of development.
4. Evolving stakeholder knowledge of  the system as they gain deeper understanding of the system.
5. Changes in requirement priorities due to new competitors, changes in staff, or a revised business vision.
6. Constraints and issues related to technology, project timelines, or budget.

## Q3.b)
1. Determine the purpose of prioritization and group requirements accordingly
2. Based on the purpose, select the at least one criteria for prioritization. Criteria can include cost, risk, stability, business value, damage due to unsuccessful implementation, implementation duration.
3. Involves relevant stakeholders with specific knowledge and view about the project such as developers, project managers, customers and testers.
4. Choose an appropriate prioritization technique to perform, including Kano classification, top-ten, one-criterion classification and ranking.

# Question 4
---
## Q4.a)
- **Seller**: A user who sells eco-friendly products and manages their business on the website.
- **Customer**: A user who tracks their carbon footprint and browses and purchases eco-friendly products from various sellers.
- **Administrators:** A user who updates information related to sustainable living, including successful eco-friendly projects.
- Others: Web Developers, Testers, Software Requirement Engineers, Project Managers

## Q4.b)
- Interviewing stakeholders
	- Asks a member from an NGO who is concerned about sustainable living and carbon footprints. Questions:
		- Are you interested in analyzing the daily carbon footprint you emit? If yes, how could this analysis help you to achieve a sustainable living?
		- What are the weaknesses of existing applications in helping you to achieve sustainable living?
	- Ask a university student who doesn't prioritize sustainable living and carbon footprints. Questions:
		- Do you think purchasing eco-friendly products is good for fostering a sustainable green environment?
		- What prevents you from buying eco-friendly products? 
		- Do you have any ideas on how to address theses issues?
- Analogy
	- Open analogy:
		- "Our website is indeed an online e-commerce platform, but it is specifically designed for business between eco-friendly products. Like Shopee, you can buy groceries, stationary and clothes on our website. However, what makes our website special is that it sells only eco-friendly goods. So, while you are enjoying online-shopping, you can still contribute for a better, sustainable community."
	- Closed analogy
		- "Imagine we are playing a civilization game. Initially, the kingdom has experienced a war. Everyone in the kingdom is disunited, dissatisfied, and resources are scarce. Your goal is to revitalize the kingdom, ensuring everyone is content and prosperous. From the player's perspective, where you can assist the king indirectly, for example, by building a castle, what can we do to help the kingdom thrive?"
- Prototyping
	- Build a prototype using tools like Figma for designing user interfaces and Protopie for user interactions, allowing stakeholders to quickly see how the system (GreenLife) would look and how they can interact with it.

## Q4.c)
For examples, please refer back to Q4.b).

- Interviewing stakeholders
	- Advantages:
		- Can collect numerous responses at a low cost
		- Ideal for identifying basic factors
		- Can be widely distributed, covering diverse regions and reaching a broad audience.
	- Disadvantages
		- Limited to known questions
		- Further inquiries are impossible

- Analogy
	- Advantages:
		- Ideal for discovering delighters/ excitement factors
	- Disadvantages
		- Difficult to find a suitable analogy
	
- Prototyping
	- Advantages:
		- Provides a quick overview of the product's appearance and functionality.
		- Allows for the discovery of errors and inconsistencies in requirements at an early stage.
		- Reduces the understanding gap among stakeholders.
		- Encourages the generation of creative solutions to problems through visual representation.
	- Disadvantages
		- Developing a prototype is time-consuming
		- Not feasible when requirements or detailed descriptions are lacking.
		- Can be costly in terms of effort.

## Q4.d)
**Functional Requirements**
- The system shall display eco-friendly products in a 3 X 3 grid system. Each cell in the grid should contain a product image, product name, price, rating and origin.
- The system shall provide customers with the ability to scroll through eco-friendly products indefinitely on the vertical axis.

**Non-Functional Requirements**
- The system shall encrypt all user data using secure algorithm such as bcrypt.
- The system shall authenticate the user's identities and authorize them correctly by assigning the appropriate access level to prevent unauthorized access or transactions.

**Constraint Requirement**
- The website shall be built using Django web framework.

## Q4.e)
Complete

| Req. ID | Description                                                                                                                                                  | Version | Requirement Type           | Kano Type    |
| ------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------- | -------------------------- | ------------ |
| 1.1.1.0 | The system shall display eco-friendly products in a 3x3 grid. Each cell in the grid should contain a product image, product name, price, rating, and origin. | 1.0     | Functional Requirement     | Satisfier    |
| 1.2.1.0 | The system shall provide customers with the ability to scroll through eco-friendly products indefinitely on the vertical axis.                               | 1.0     | Functional Requirement     | Dissatisfier |
| 2.1.1.0 | The system shall encrypt all user data using a secure algorithm such as bcrypt.                                                                              | 1.0     | Non-Functional Requirement | Dissatisfier |
| 3.1.1.0 | The website shall be built using the Django web framework.                                                                                                   | 1.0     | Constraint Requirement     | Satisfier    |



Customer

| Req. ID | Description                                                                                                                                                  | Version | Requirement Type       | Kano Type    |
| ------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------- | ---------------------- | ------------ |
| 1.1.1.0 | The system shall display eco-friendly products in a 3x3 grid. Each cell in the grid should contain a product image, product name, price, rating, and origin. | 1.0     | Functional Requirement | Satisfier    |
| 1.2.1.0 | The system shall provide customers with the ability to scroll through eco-friendly products indefinitely on the vertical axis.                               | 1.0     | Functional Requirement | Dissatisfier |

Developers/ Testers/ Software Requirement Engineers/ Project Managers

| Req. ID | Description                                                                                                                                                  | Version | Requirement Type           | Kano Type    |
| ------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------- | -------------------------- | ------------ |
| 1.1.1.0 | The system shall display eco-friendly products in a 3x3 grid. Each cell in the grid should contain a product image, product name, price, rating, and origin. | 1.0     | Functional Requirement     | Satisfier    |
| 1.2.1.0 | The system shall provide customers with the ability to scroll through eco-friendly products indefinitely on the vertical axis.                               | 1.0     | Functional Requirement     | Dissatisfier |
| 2.1.1.0 | The system shall encrypt all user data using a secure algorithm such as bcrypt.                                                                              | 1.0     | Non-Functional Requirement | Dissatisfier |
| 3.1.1.0 | The website shall be built using the Django web framework.                                                                                                   | 1.0     | Constraint Requirement     | Satisfier    |
## Q4.f)
1. The Kano classification categorizes requirements into dissatisfiers, satisfiers, and delighters. Dissatisfiers are given the highest priority, satisfiers the next, and delighters the lowest.
2. The one-criterion classification method selects one criterion and allows stakeholders to assign points to each requirement based on the chosen criterion.
3. The top-ten method selects multiple criteria, assigns weights to each, and asks stakeholders to assign points to the requirements based on each criterion. The ranking points are then summed, with requirements having higher ranking points being prioritized.
