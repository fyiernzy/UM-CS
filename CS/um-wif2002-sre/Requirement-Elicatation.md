*References: Lecture 3, Lecture 5*

**What is requirement elicitation?**
Requirement elicitation is the process of discovering and gathering the requirements of a system.

**Define Functional Requirement, Quality Requirement and Constraints.**
1. **Functional Requirements** **(FR)** are functions or behaviors that the system must provide.
2. **Quality Requirements** are quality concerns not covered by functional requirements.
3. **Constraints** are requirements that limit the solution space beyond what is necessary to meet functional requirement and quality requirement.

**Why is effective requirement elicitation important?**
- To avoid customer dissatisfaction due to unmet real requirements.
- To prevent discovering new requirements at the later stage of software development process.

**What are the challenges in requirement elicitation?**
- Doman knowledge comes from various sources, introducing new terminologies for requirement engineers.
- Organizational issues and political factors
- Stakeholders may struggle to articulate what they want or may have unrealistic demands or conflicting requirements.
- Constant changes in the economy, business environment and technologies can invalidate parts of the development, slowing progress.
- Stakeholders may change jobs, causing a lack of sources for negotiation or clarification.
- Multiple stakeholders are needed for a comprehensive understanding of the app domain and the problem to be solved.

**What are the activities involved in elicitation process?**
1. **Establish Objectives**: Understand business goals, problems to be solved, and system constraints.
2. **Understand Background**: Analyze the organization structure, application domain, existing or new systems, and specific customer problems and constraints.
3. **Organize Knowledge**: Identify stakeholders, prioritize goals, and filter domain knowledge.
4. **Collect Requirements**: Gather stakeholder, domain, and organizational requirements, understanding the conditions and capabilities needed.

**What are the potential sources of requirements?**
Vision documents, project initialization deliverables, stakeholder needs, existing software and hardware information, business and technical processes, physical and technical events, and relevant documents.

**Describe guideline to get requirements from stakeholders**
1. Identify the stakeholders involved
2. Refer to organizational rules for collaboration with stakeholders.
3. Understand the tasks of stakeholders and requirement engineers.
4. Recognize and address conflict or unrealistic requirements, negotiating to achieve consensus.

**List possible stakeholders.**
- **Outside a Company**: Customers, other authorities, software development vendors, external systems to be integrated, competitors' systems.
- **Inside a Company**: Management, business process owners, IT managers, IT staff, internal systems to be integrated, existing systems, developing systems, operations managers, operations staff.

**What information should be included during stakeholder identification?** Stakeholder name, role, contact information, availability, relevance, area of expertise, goals and interests in the project, assigned tasks.

**What are the rules for collaboration?**
1. Management needs to monitor stakeholder involvement in the project.
2. A project manager should organize people and manage tasks to reach goals.
3. A requirement engineer should document tasks, responsibilities, and stakeholder authorities.
4. The level of formality depends on the organizational culture.

**What are the tasks and responsibilities of stakeholders?**
1. Explain domain knowledge.
2. Supply requirements based on the project vision.
3. Make decisions.
4. Respect cost, schedule, and feasibility constraints.
5. Review the system requirements specification.
6. Communicate organizational changes that affect requirements.
7. Comply with the changes in management process.
8. Respect requirement engineering procedures.

**What are the tasks and responsibilities of requirement engineers?**
1. Understand the domain knowledge and project vision.
2. Create clear and understandable requirements documentation.
3. Analyze problems and present ideas and alternatives.
4. Ensure the requirements align with the stakeholders' vision.

# Chapter 5

![[Pasted image 20240628131344.png]]

**Describe Kano Analysis and three types of customer requirements.**
- Kano Analysis is a technique used to analyze and address customer needs. 
- The Kano Model suggests three types of customer requirements:
  
1. **Delighters/ Excitement/ Excited Quality**
	1. System properties the stakeholder don't initially know they want but find useful once discovered.
	2. Satisfies excitement needs, helping a company to excel and be world class.
2. **Satisfiers/ Performance/ Desired Quality**
	1. System properties explicitly requested by stakeholders.
	2. Satisfies performance needs, allowing a company to remain competitive.
3. **Dissatisfiers/ Basic/ Must Be/ Expected Quality**
	1. System properties taken for granted by stakeholders.
	2. Satisfies basic needs, allowing a company to enter the market

**What are influences in choosing elicitation techniques**
- **Stakeholder Influences**: Domain knowledge, communication skills, homogeneity of interest, group dynamics, implicit knowledge, culture.
- **Function-Content Influences**: Domain complexity, system size, norms, and standards.
- **Organization Influences**: Processes and structures, system landscape, budget, availability of stakeholders and resources.
- **Risk Factors**: Potential damage to humans and nature, contract penalties, system criticality, reputation damage.


**Describe Survey Techniques**
- **Interview**
	- **Closed Interviews**: Use yes/no, agree/disagree, Likert scale questions. Example: “Have you used the system as follows?”
	- **Open Interviews**: Use questions like Where?, Who?, Why?, When?, How? Avoid preconceived notions.
	- **Reminders**: Listen actively, ask detailed questions, summarize answers, convey concerns.
	- **Strengths**: Can address new topics immediately, ideal for discovering performance factors.
	- **Weaknesses**: Time-consuming, depends on the moderator's capabilities.
- **Questionnaire**
	- Printed documents or online forms with multiple-choice or open questions.
	- **Strengths**: Gathers a lot of information at low cost, reaches a distributed audience, helps stakeholders start giving ideas, ideal for discovering basic factors.
	- **Weaknesses**: Limited to known topics, difficult to produce a good questionnaire, often no possibility for further enquiry.

**Describe four types of creativity techniques**
- **Classical brainstorming**
	- Stakeholders generate ideas spontaneously to solve problems or obtain new exciting ideas.
	- Basic Rules: 
		- Start by clearly stating the objective of the brainstorming session
		- Generate as many idea as possible
		- Allows imagination to soar
		- Don't criticize or debate while gathering information
		- Reshape and combine idea when information is gathered.
	- **Strengths**: Generates new ideas quickly, participants inspire each other (popcorn reaction), ideal for discovering excitement factors.
	- **Weakness**: Time-consuming, risk of dominance by loud participants, needs to be combined with interviews for detailed requirements.
- **Brainstorming Paradox**
	- Focus on what is undesirable to find preventative measures.
	- **Strengths**: Identifies risks, allows the moderator to assess ideas.
	- **Weaknesses**: Time-consuming, risk of dominance by loud participants, needs to be combined with interviews for detailed requirements.
- **Change of Perspective (Six Thinking Hats)**
	- Participants view the problem from different perspectives
		- Blue Hats (Process)
		- White Hat (Facts) - Information and data
		- Red Hat (Feelings) - Intuition, hunches, gut instinct
		- Green (Creativity) - Ideas, alternatives, possibilities. SOlutions to black hat problems
		- Yellow (Benefits) - Positivies, plus points,. Logical reasons are given.
		- Black (Cautions) - Difficulties, weaknesses, dangers, spotting the risks. Logical reason are given.
- **Analogy**
	- Stakeholders analyze analogies from other domains.
	- There are two types of analogy:
		- **Open analogy**: Analyze the analogy while letting stakeholders know the software problem to be solved.
		- **Close analogy**: Hide information about the software until stakeholders realize an analogy is being made.
	- **Strengths**:
		- Provides new inspiration and perspectives.
		- Ideal for discovering excitement factors.
	- **Weaknesses**:
		- Difficult if participants lack deep knowledge.
		- Finding a fitting analogy can be challenging.

**What are the observation techniques?**
- **Field observation**
	- Observe users at work, including planning, preparation, recording and deriving requirements.
	- **Strengths**: 
		- Elicits requirements from busy stakeholders or those who are not good at describing their operations
		- Ideal for discovering basic factors
	- **Weaknesses**:
		- Limited to existing requirements.
		- Not suitable for new processes.
- **Apprenticing**
	- Perform the work under stakeholder guidance.
	- **Strengths**: Ideal for basic factors, allows for challenging existing solutions and suggesting improvements.
	- **Weaknesses**: Time-consuming for stakeholders, requires domain knowledge from the requirement engineer.

**Briefly explain Document-centric techniques.**
- **System archaeology**
	- Extract information from existing documentation or implementation.
	- **Strengths**:
	    - Independent of stakeholders (requires validation from them later).
	    - Discovers existing requirements in detail.
	- **Weaknesses**:
	    - May involve irrelevant work since not everything is related to the current project.
	    - Unfamiliarity with the system can pose challenges.
	
- **Requirement reuse**
	- Reuse requirements from other projects.
	- Existing requirements need to be detailed enough for requirements engineers to decide their suitability for reuse.
	- Existing requirements should be retrievable by requirements engineers.
	- **Strengths and Weaknesses**: Similar to system archaeology; reduces cost, time, and effort but may include irrelevant information.
	
- **Perspective-based learning**
	- Read documents with a specific perspective, like a programmer's viewpoint.
	- Allows the requirements engineer to focus on and filter information from a particular perspective while reading and analyzing a document.
	- **Strengths and Weaknesses**: Same as system archaeology.


**List supporting techniques that can be used in requirement elicitation.**
1. **Audio/Video Recording**
   - Recordings can support requirements reuse or document interviews and observations.

2. **Workshops**
   - **Preparation:**
     1. Define the workshop goal
     2. Describe the procedure.
     3. Deliver materials and tutorials on time.
     4. Confirm that the information is received.
     5. Develop the central theme for the workshop.
   - **Execution:**
     1. Lead the teamwork towards the goal.
     2. Document the results permanently.
   - **Post-Processing:**
     1. Set the protocol.
     2. Inform about the next steps.
     3. Inform about the end results.
     4. Compare the outcomes to the established goals for the workshop.

3. **Use Case Modeling**
   - Describes how a user uses a system to accomplish a particular goal.

4. **Prototyping**
   - Help stakeholders:
     1. When they have an unclear image of the future system.
     2. To easily understand the consequences of new requirements.
     3. Prototypes help requirements engineers improve established requirements.

5. **CRC Cards**
   - Facilitate the design of object-oriented software, ensuring active stakeholder participation.
   - Evaluate candidate classes by identifying responsibilities and collaborations with other classes.
   - Remove classes with no responsibilities as they do not add value.
   - Responsibilities are categorized into knowing (e.g., values, relationships) and doing (e.g., operations, collaborations).
     - *Knowing responsibilities are things an instance of a class must know (e.g., values of its attributes, relationships).*
     - *Doing responsibilities are things an instance of a class must do (e.g., executing operations, sending messages to collaborators).*

6. **Mind Mapping**
   - Graphical representation to refine relationships.
   - Often used to support brainstorming and brainstorming paradox.