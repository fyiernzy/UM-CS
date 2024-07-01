# Question 1
---
## Q1.a)
Requirement Ranking involves multiple stakeholders ranking modules or requirements based on a chosen criterion. The ranking points are then summed, and requirements with higher points are prioritized. This technique includes relevant stakeholders and using quantitative approach, making it objective and less biased.

## Q1.b)
- This situation occurs when the requirements are equally important from a specific perspective. This can happen if they receive the same ranking points using requirement ranking or fall into the same category in the Kano classification.
- Action Plan:
	- **Implements All Scenarios**: If there are no constraints, such as sufficient and flexible timeline, implement all the high-priority scenarios. Prioritization helps when there are restrictions, but without them, implementing all scenarios can be more efficient because resources are utilized completely.
	- Re-Evaluate with Constraints. If constraints exist, re-evaluate the scenarios using different criteria. If constraints persist, prioritize one scenario using an appropriate prioritization approach.

# Question 2
---
## Q2.a)
- **Limited Stakeholder Availability**: Stakeholders are often busy and may not be able to participate fully in the requirement elicitation process.
- Financial and scheduling limitations can restrict the extent and depth of the elicitation activities.
- Stakeholders might struggle to articulate what they want or may have unrealistic demands or conflicting requirements.
- Domain knowledge comes from various sources, introducing new terminologies for requirement engineers.
- Organizational issues and political factors.
- Constant changes in the economy, business environment and technologies can invalidate parts of the development, slowing progress.
- Stakeholders may change jobs, causing a lack of sources for negotiation or clarification.
- Multiple stakeholders are needed for a comprehensive understanding of the app domain and the problem to be solved.

## Q2.b)
- **Time-consuming**. Participants may need to spend hours in sessions to generate a sufficient number of ideas.
- **Risk of dominance by loud participants**. More vocal participants can overshadow quieter ones, leading to imbalance in idea contribution.
- **Moderator Dependency.** The effectiveness of the session heavily relies on the moderator's ability to manage discussions and prevent frequent criticism.
- **Lack of Detail**. Brainstorming sessions often lack detailed information, requiring supplementary methods like interviews to gather comprehensive requirements.

# Question 3
---
## Q3.a)
1. **Nominalization**. A requirement might lack necessary details and convert multiple processes into a single one, resulting in hidden processes.
2. **Nouns without reference index**. A requirement might contain nouns that aren't specified completely. For example, *The system shall present the data* doesn't specify what *data* refers to.
3. **Universal identifiers**. The use of universal identifiers can cause ambiguity due to multiple interpretations. For example, *The system shall present the all payment details.* can mean: 
	1. The system presents analysis for each individual payment.
	2. The system presents analysis for overall payments.
4. **Incompletely specified condition.** The requirement might not specify normal, alternative or exception flows. For example, *If a student fails a exam, the system shall inform the examination office via email.* doesn't state what happens if the student passes the exam.
5. **Incompletely specified process verb**. A requirement might not provide enough information regarding a process. For example, *The system should transmit.* doesn't specify *what* should be transmitted, from *where* and to *where* it transmit.

## Q3.b)
Nominalization. The requirement converts multiple process into a single event.
The requirement is ambiguous because it can interpreted in various ways:
- Interpretation 1: The admin enters the access code first, then only the access card.
- Interpretation 2: The admin enters an access card that contains the access code.

# Question 4
---
## Q4.a)
Patient, Healthcare staff, SREs, developers, testers, PMs

## Q4.b)
The following examples are not detailed enough. You should be able to craft one yourself. If not, you may refer back to [[SRE-PY2023]].

1. **Interviewing stakeholders**
	1. Interviews healthcare staff to identify problems with the current system and gather suggestions for improvements.
		1. What are the weaknesses of the current record-keeping system? How do they impact your daily work?
		2. What are your suggestions for addressing these issues?
2. **Workshop**
	1. Organize a workshop involving all stakeholders, including doctors, nurses, IT staff, and administrators, to brainstorm solutions. This allows participants with different perspectives and expertise to contribute.
3. **Observation**
	1. Observes how patients interact with the current system and note any difficulties or frustrations they experience. This can provide insights into user challenges and areas needing improvement.

## Q4.c)
- **Interviewing stakeholders**
	- Advantages
		- Allows for in-depth understanding of requirements by probing deeper into responses.
		- Provides detailed information on current system issues and requirements.
	- Disadvantages
		- Time-consuming and potentially costly if many stakeholders needed to be interviewed.
		- Efficiency depends heavily on the interviewer's skills
		- Responses may be biased by the interviewer's influence.
- **Workshop**
	- Advantages
		- Engages stakeholders with diverse knowledge and viewpoints, leading to a more objective discussion.
		- Encourage creative solutions and detailed discussion on specific modules.
	- Disadvantages
		- Limited by the availability of stakeholders
		- Risk of dominance by loud participants. More vocal participants might overshadow the quieter ones, leading to imbalance idea contribution.
- **Observation**
	- Advantages
		- Helps elicit requirements from busy stakeholders or those who struggle to describe their operations. 
		- Identifies basic requirements that stakeholders might not mention otherwise.
	- Disadvantages
		- Not suitable for observing new processes.
		- Limited to existing requirements.
		- Can be time-consuming and depends on the observer's attention to detail.


## Q4.d,e,f)
Please do it on you own ya. Refer to [[SRE-PY2023]] whenever necessary.