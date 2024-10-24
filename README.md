# Java-OOP Learning-script

# Introduction
This repository aims to document my Java studies over the course of 6 weeks. Here, I will introduce important programming concepts and develop some simple projects. The content of this repository will be divided into three sections, each lasting 2 weeks. You can see more about this mind map below:

![BackEnd Stack Java](https://github.com/user-attachments/assets/cd50384a-9f78-43a1-8397-c986158eda47)

Feel free to follow along and contribute to my learning journey! You may also take a look at my other GitHub repositories.

# Evolution of programming paradigms

<p align="center">
  <img src="https://github.com/user-attachments/assets/f6693f38-2c91-4719-945d-dd0dfa58eb36" alt="606781ec-b825-49d0-a57b-d1fcebe8df00">
</p>

Before discussing OOP and our project, it might be helpful to briefly explore the evolution of programming paradigms. This is a significant part of the history of technology. However, feel free to skip it if you're not interested.

The evolution of programming languages reflects the continuous effort to make software development more efficient, maintainable, and aligned with real-world problems.

## Low-Level Programming:
In the early days, programming was done in machine code or assembly language, which interacted directly with hardware. These languages are fast but complex, requiring detailed knowledge of system architecture.

## Linear Programming:
As computing progressed, simple sequential programming emerged, where instructions were executed one after another. This style lacked structure, making programs difficult to modify and prone to errors as they grew in size.

## Structured Programming:
In the 1960s, structured programming introduced concepts like loops, conditionals, and subroutines, aiming to reduce code complexity. Languages like C adopted this paradigm, promoting readability and maintainability.

## Modular Programming:
To manage large codebases, modular programming divided programs into independent modules. Each module could be developed and tested separately, fostering reusability and collaboration. Languages like Modula-2 and Ada championed this style.

## Object-Oriented Programming (OOP):
In the 1980s and 1990s, OOP emerged with languages such as Smalltalk and Java, reflecting real-world entities as objects. OOP promotes encapsulation, inheritance, and polymorphism, making it easier to model complex systems and encouraging code reuse.

# What about OOP

After this brief introduction to the repository and the history of programming paradigms. We will start the introduction of OOP concepts.

In Object-Oriented Programming (OOP), a class is a blueprint or template for creating objects. It defines the structure and behavior that the objects will have, including their attributes (data) and methods (functions). A class encapsulates data and functions that operate on the data, promoting the principles of abstraction and reusability.

An object, on the other hand, is an instance of a class. It represents a real-world entity or concept, with specific values for the attributes defined in its class. While the class outlines what an object can do, the object is the concrete representation that does those things. For example, if we define a Car class with attributes like color, make, and model, and methods like start() and stop(), a specific Car object could be a blue Toyota Corolla that starts and stops as commanded.

Objects interact with each other through methods, enabling the simulation of real-world behaviors within software systems. This interaction is a cornerstone of OOP, fostering modular and maintainable code.

# UML
The Unified Modeling Language (UML) is a standardized visual modeling language used to represent the design and architecture of software systems, particularly those built using OOP principles. UML diagrams provide a way to visualize classes, objects, and their interactions, making it easier to plan, document, and communicate system designs.

In UML, the class diagram is a key component that graphically represents classes, their attributes, methods, and the relationships between them (such as inheritance, association, or aggregation). This helps developers understand how objects will be instantiated and interact within a system.

By using UML, software architects can ensure that the system’s design adheres to OOP principles. For example:

* Classes in OOP are represented as class diagrams in UML.
* Objects can be illustrated in object diagrams, which show instances of classes and their relationships at a specific point in time.
* Relationships such as inheritance or composition are modeled to show how classes relate to each other.

In a nutshell, OOP provides the foundation for structuring software using classes and objects, while UML offers the tools to model and visualize those structures and their interactions. Together, they help developers build complex, scalable, and maintainable systems.

# Project Architecture 

The first project in this repository is a simple implementation of what we have learned so far. The context of this implementation revolves around Jack, a veterinarian at the zoo. He discusses with his brother, Michael, a computer scientist, the idea of creating a system to map all the animals in the zoo. In the future, Michael plans to develop an infrared system to access a database containing animal information through his smartphone.

Michael returned with this class diagram to represent the attributes to be studied in the application. The diagram can be seen it in the image bellow:

![Diagrama em branco](https://github.com/user-attachments/assets/3b0261ab-f7ef-4bf6-9da0-6a4ed102eac9)

