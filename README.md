# Educational-Initiatives
##I. DESIGN PATTERNS

This project demonstrates the implementation of various design patterns in Java. Each pattern is represented by a separate example, showing how to use the pattern effectively along with the UML diagrams.

##*Structural Design Patterns*

1 Adapter Pattern:
The Adapter Pattern allows incompatible interfaces to work together. This example demonstrates how to use an adapter to make two different entertainment systems (a Blu-ray player and a gaming console) compatible with a common interface.

2 Proxy Pattern:
The Proxy Pattern provides a surrogate or placeholder for another object to control access to it. This example demonstrates how to use a proxy to control access to a restricted library section based on user membership level.

##*Creational Design Patterns*

1 Singleton Pattern:
The Singleton Pattern ensures a class has only one instance and provides a global point of access to it. This example demonstrates how to implement a singleton pattern for a food service.

2 Factory Method Pattern:
The Factory Method Pattern defines an interface for creating an object, but lets subclasses alter the type of objects that will be created. This example demonstrates how to create different types of space vehicles using factory methods.

##*Behavioural Design Patterns*

1 Strategy Pattern:
The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. This example demonstrates different authentication strategies.

2 Template Method Pattern:
The Template Method Pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses. It allows subclasses to redefine certain steps of an algorithm without changing the algorithm's structure.This example demonstrates a Fan class that provides a template for operating a fan. The template method operate() outlines the sequence of operations, while specific details are implemented by subclasses.


##II. MINI PROJECT

##1. Astronaut Daily Schedule Organizer Programming Exercise

##Project Overview:
This project is designed to manage the daily schedules of astronauts, ensuring they adhere to essential routines such as exercise, meals, breaks, presleep activities, and sound sleep. The organizer enforces rules and priorities for tasks to maintain astronauts' health and productivity during space missions. A Class Diagram is also provided for a better understanding.

##*Classes and Their Roles*:

- Task:
Manages individual task details including description, start time, end time, priority, team members, and completion status.

- TaskValidator:
Validates task inputs to ensure they have a valid description, start and end times, and priority.

- TaskFactory:
Creates new task instances using the provided details.

- ScheduleManager:
Handles the overall scheduling logic, including adding, removing, and viewing tasks, checking for conflicts, and managing task completion and emergency modes.

- SleepSchedule
Determines valid task times by checking against the defined sleep period (9:30 PM to 6:00 AM).

- FoodSchedule:
Validates the daily meal schedule, ensuring astronauts do not skip meals.

- MedicalCheckupScheduler:
Ensures medical checkups are scheduled correctly within the allotted time (10:00 AM to 11:00 AM).

- NotificationManager:
Schedules reminders for tasks using a timer.

- TaskDependencyManager:
Manages dependencies between tasks, ensuring tasks are allowed based on defined dependencies.

- FileManager:
Saves and retrieves tasks to and from a file.

##*Usage*:

- Adding Tasks: Use the addTask method in ScheduleManager. Input validation ensures only valid tasks are added.
- Removing Tasks: Remove tasks by description.
- Viewing Tasks: View the current schedule.
- Completing Tasks: Confirm task completion.
- Generating Reports: Generate a daily report detailing completed tasks, exercise time, breaks, and warnings for missed meals or insufficient exercise.

##*Important Notes*:

- Tasks cannot be scheduled during the sleep period (9:30 PM to 6:00 AM).
- Only medical checkups can be scheduled between 10:00 AM and 11:00 AM.
- Conflicting tasks require rescheduling or resolution based on task priorities and user input.
- The system provides warnings for skipped meals, insufficient exercise, and missed breaks.
- This project ensures that astronauts maintain a healthy and productive routine while accommodating the diverse tasks required for different missions.
  
##*Conclusion*:

The project illustrates various design patterns, each demonstrating unique strategies for solving common design problems. The Astronaut Daily Schedule Organizer project aims to provide a well-structured and optimized daily routine for astronauts, ensuring that essential activities such as exercise, meals, breaks, and sleep are properly scheduled and adhered to. By following best coding practices, design patterns, and SOLID principles, this application aims to enhance the efficiency and well-being of astronauts during their missions.

##*Contact Information*:

Project Maintainer: Bhagampriyal M
Email: bhagampriyal1@gmail.com
