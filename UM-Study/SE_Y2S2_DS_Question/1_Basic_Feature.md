# Interactive fiction

> Text adventures (sometimes synonymously referred to as interactive fiction) are text-based games wherein worlds are described in the narrative and the player submits typically simple commands to interact with the worlds.

This is an extract taken from the Wikipedia. As of your Data Structure Assignment, you're required to design a interactive fiction on your own and distribute it in .JAR file for others to try, play and rate.

## Introduction

In this Data Structure assignment, your task is to create an interactive fiction game where players can use the Command Line Interface (CLI) to interact with the system and navigate through the story. Your goal is to develop an intriguing narrative where players can acquire and control heroes, similar to the game Genshin Impact, and progress by overcoming challenges. Along the journey, players will receive hints to guide them towards discovering the final truth of the story

Ensure that your game incorporates data structures effectively to manage player movement, item collection, hero acquisition, and game progression. Design an engaging story that captivates players and provides an immersive experience. The CLI interface should enable seamless interaction between players and the game world, allowing them to make choices and navigate through the storyline.

By implementing data structures appropriately and weaving a compelling narrative, you can create an enjoyable and challenging game for players to explore.

## Basic Function Requirement

### Creating heroes (2 marks)

You are required to create a minimum of 5 unique heroes, each with their own base attributes and growth rates. While the base attributes can be tailored to your game design, they should include the following properties and behaviors:

```java
int level; // Represents the hero's level
int experience; // Tracks the hero's experience points
int manaPoints; // Indicates the hero's mana points
int healthPoints; // Represents the hero's health points
List<String> statusEffects; // Stores any status effects applied to the hero

public void levelUp() {
    // Implement the logic for leveling up the hero
}

public void showAttribute() {
    // Implement the logic for showing the attribute of the hero
}
```

You are not restricted to the specific data types or variable names mentioned in the example code. For instance, you can utilize alternatives such as `double` for mana points (`double manaPoints`) or a list of integers for status effects (`List<Integer> statusEffectsList`). The choice of data types and variable names should be reasonable and align with your game's requirements.

Here are some additional attributes that you can consider incorporating into your hero class:

```java
int criticalChance; // Represents the hero's chance of dealing a critical hit
int manaRegeneration; // Indicates the amount of mana regenerated per interval (e.g., per 5 seconds)
int healthRegeneration; // Represents the amount of health regenerated per interval (e.g., per 5 seconds)
int physicalDefense; // Indicates the hero's physical defense capability
int magicalDefense; // Represents the hero's magical defense capability
```

In addition to the base attributes mentioned earlier, these attributes can enhance the depth and complexity of your hero class. You can adjust the attribute names and data types according to your game design.

### Design hero skills (5 marks)

- The hero has their special skill combination

### Design item system (3 marks)

- The hero is able to buy and equip items. They can purchase to upgrade them as well.

### Map Design (3 marks)

### Location Design (3 marks)

### Round-based game design (5 marks)

### Design Monster (3 marks)

### Shortest Path

- The hero are required to get enough materials for upgrade their items as well as their skill. Hence they have to clear the challenge as soon as possible by finding the shortest path and bypassing the maximum number of monster in order to avoid unnecessary battle.

Shopping system
Database
Save function

Github
-upload map and character

### Database Implementation (2 marks)

## Basic Practices Requirement

### Object-Oriented Programming (OOP) (3 marks)

You need to apply the principles of Object-Oriented Programming (OOP) in your code to eliminate redundant code. It is important to grasp the concept of abstraction and effectively utilize classes, abstract classes, interfaces, and enums. Let's consider the following code as an example:

```java
class Monster {
    int healthPoints;
    int mana;
    List<String> status;    
}

class Hero {
    int healthPoints;
    int mana;
    List<String> status;
}
```

Instead of duplicating the variables `healthPoints`, `mana`, and `status`, we can create a suitable parent class to achieve abstraction. For instance:

```java
class Organism {
    int healthPoints;
    int mana;
    List<String> status;
}

class Monster extends Organism {

}

class Hero extends Organism {

}
```

By refactoring the code in this manner, we indeed improve scalability and maintainability. However, it is also crucial to consider the **`Single Responsibility Principle (SRP)`**.

The Single Responsibility Principle is a fundamental programming principle that states that *A class should have only one reason to change.* It emphasizes that each class should be responsible for a single behavior or functionality.

In the given example, while applying OOP, it is important to ensure that each class is responsible for its own specific behavior. For instance, a `Hero` class may be responsible for attacking monsters or healing teammates, but it should not handle tasks unrelated to its core purpose, such as interacting with the operating system or managing database connections. Applying the SRP helps in maintaining cohesive and focused classes.

### Using Git and Github for Cooperation (2 marks)

Among the various version control systems (VCS) available, Git stands out as one of the best options. Although some people may mistakenly believe that Git and GitHub are synonymous, they are, in fact, distinct entities.

Git is a distributed version control system designed to track changes in computer files. It excels at facilitating collaborative software development among programmers. Its key objectives include speed, data integrity, and support for distributed and non-linear workflows.

On the other hand, GitHub serves as an online hosting service specifically tailored for software development and version control using Git. It enhances Git's capabilities by providing features such as access control, bug tracking, software feature requests, task management, continuous integration, and project wikis.

In your assignment, it is crucial for you and your teammates to leverage Git and GitHub for effective team cooperation. Merely relying on copying and pasting or sharing ZIP files might suffice for small projects. However, as the codebase grows significantly, such approaches can lead to disastrous consequences. Utilizing Git and GitHub ensures streamlined collaboration and mitigates the challenges associated with managing large-scale projects.

You might refer to the [Missing Semester | Lecture 6 | Version Control (Git) (2020)](https://www.youtube.com/watch?v=2sjqTHE0zok) and [GitHub Basics Tutorial - How to Use GitHub](https://www.youtube.com/watch?v=x0EYpi38Yp4) for more details.

However, it is worth noting that the commit message is also crucial in the assessment process. Writing informative commit messages and committing changes frequently not only helps others understand the modifications you've made but also enables easier access to specific older versions. A well-crafted commit message can serve as a helpful update log. Let's compare the following examples:

```bash
git commit -m "Add new files"
git commit -m "New updates"
git commit -m "Some changes"
```

and these messages:

```bash
git commit -m "Implement login authentication"
git commit -m "Fix bug in loading the file"
git commit -m "Implement embedded database for storage"
```

Which set of messages is more descriptive? Undoubtedly, the second set is more informative.

It is important to understand that commit messages should accurately reflect the changes made in the commit. The messages should be concise yet descriptive, providing a clear understanding of the modifications introduced. By following good commit message practices, developers can enhance collaboration and make it easier for others to navigate and utilize previous versions of the codebase.

### Java Coding Conventions


### Using 

## Advanced Feature Requirement

### News

### Save game functionality (2 marks)

### Player account and leaderboard (2 marks)

### Password encryption (1 marks)

### Database encryption (1 marks)

### Item upgrade

### Skill upgrade

### Chain reaction

### Special game mode

### Story rating

### Hero's background story 

## Advanced Practices Requirement

There are also some practices that you might adopted in your coding to make your project be more organized and more professional.

### Apply suitable design pattern (2 marks)

Design patterns are typical solutions to common problems
in software design. Each pattern is like a blueprint
that you can customize to solve a particular
design problem in your code. Patterns are a toolkit of solutions to common problems in software design. They define
a common language that helps your team
communicate more efficiently.

Some of the suitable design pattern that you might consider are Singleton, Factory Method, Builder, Prototype and Command.

Singleton is on of the easiest pattern that you can almost apply it in your project. The implementation of singleton is as follows:

```java
public class Singleton {
    private static final Singleton singleton; // Singleton

    private Singleton() {

    }

    public static Singleton getInstance() {
        if(singleton == null) {
            this.singleton = new Singleton();
        }
        return singleton;
    }
}

```

Check it out more details and explanation at [Refactoring Guru](https://refactoring.guru/design-patterns).

### Stick to the key principles

There are a lot of software designing principles that you might consider

## Evaluation of the assignment

### Assignment evaluation

| Part                    | Portion |
| ----------------------- | ------- |
| Code evaluation         | 60 %    |
| Report evaluation       | 15 %    |
| Presentation evaluation | 25 %    |
|                         |         |

### Code evaluation

| Part              | Portion |
| ----------------- | ------- |
| Basic feature     | 50 %    |
| Basic practice    | 20 %    |
| Advanced feature  | 20 %    |
| Advanced practice | 10%     |
| Total             | 100%    |
|                   |         |

### Report Evaluation

Please note the following guidelines for crafting your report:

1. Use either `Markdown` or `LaTeX` to compose your report. However, to facilitate collaboration, you can utilize Google Docs for working with others and later convert it to `.md` or `.tex` format.

2. Your report should cover the following aspects:
   - Explanation of algorithm implementation: This includes the pseudocode, the underlying idea of the algorithm, and the calculation of time complexity and space complexity.
   - UML (Unified Modeling Language) with appropriate diagrams: Provide diagrams that effectively explain the relationships between classes.
   - Game construction: Describe how the game is built, including details on the implementation of each function and the involvement of different classes.
   - How to play the game: Provide a comprehensive guide that explains the gameplay, including information on items, heroes, and game modes.
   - Include a link to your GitHub repository.
   - Include a link to a promotional game demonstration that showcases the gameplay.
   - Present sample outputs of the game for each function.

3. Avoid including method explanations in your report, such as details about parameters and return types. Instead, utilize `JavaDoc` to generate comprehensive explanations for these methods.

### Presentation evaluation

1. This time, presentation weight more in your final assessment. Presentation evaluates how you're gonna to deliver an effective message to your reader for them to know what exactly you have done. In a real world situation, for example, during the product exhibition of Apple product, they will focus on explaining what they have do in their 

### Extra Marks (5%)

Extra marks are provided as a second chance for those who were unable to achieve full marks in their feature requirements and practice requirements. These additional marks offer an opportunity to showcase impressive features that may capture the attention of the demonstrator and the professor. Scoring extra marks will not impact your overall score if not achieved, but if obtained, it can significantly increase your total score. The ways to obtain extra marks include, but are not limited to, the following:

#### Group Achievement

If your group meets any of the following criteria, you will be eligible for extra marks:

- Create an interactive website using HTML5/CSS3/JavaScript instead of a report to explain your code. The website should include a gameplay demo that allows others to play the game.

- Develop a COMPLETE GUI (Graphical User Interface) for the gameplay. You are not limited to using JavaFX or Java Swing and are encouraged to consider web technologies for its development.

#### Batch Achievement

If every group within your batch can achieve the following, then each group will score extra marks:

- Create a `GameEngine` API that all groups can use. This API will enable groups to create their games based on the engine. Consequently, every group can transfer their game data across different projects, continue to level up, and obtain items.

Note: The extra marks serve as an opportunity to showcase exceptional achievements and are not mandatory for all groups.


$$\(\left(\frac{{\text{{Score of basic feature requirement}}}}{{\text{{Total score of basic feature requirement}}}} \times 50\% + \frac{{\text{{Score of basic practice requirement}}}}{{\text{{Total score of basic practice requirement}}}} \times 20\% + \text{{Score of advanced feature requirement}} \times 20\% + \text{{Score of advanced practice requirement}} \times 10\%\right) \times 70\% + \text{{Report Evaluation}} \times 15\% + \text{{Presentation Evaluation}} \times 15\%\)$$

$$
\text{Code portion} =
\frac{{\text{{Score of basic feature requirement}}}}{{\text{{Total score of basic feature requirement}}}} \times 50\% + \frac{{\text{{Score of basic practice requirement}}}}{{\text{{Total score of basic practice requirement}}}} \times 20\% + \frac{{\text{{Score of advanced feature requirement}}}}{{\text{{Total score of advanced feature requirement}}}} \times 20\% + \frac{{\text{{Score of advanced practice requirement}}}}{{\text{{Total score of advanced practice requirement}}}} \times 10\%
$$