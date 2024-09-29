# SchoolNotes - Student Grade Management System
SchoolNotes is a student and teacher 
grade management application. The main objective 
of this system is to allow teachers to assign grades 
to students, while students can access their grades 
through a role-based interface. The project follows
Clean Architecture principles and uses the MVC 
(Model-View-Controller) pattern for an organized and 
scalable structure.

## Features
### User Management:
Teachers and students can log in and access different views based on their user roles.

### Subject Assignment:
Each student can be enrolled in multiple subjects, and teachers can be assigned to one or more subjects, each with multiple students.
### Grade Management:
Teachers can assign grades to students in the respective subjects.
### Message Queue: 
Utilizes RabbitMQ for handling asynchronous communication between different system services.
### Data Persistence:
Uses PostgreSQL as the relational database to store information about users, subjects, and grades.

## Technologies and Tools
### Java:
The main language used for developing the backend of the system.
### Spring Boot: 
A Java framework used to facilitate rapid development, with modules like Spring Data JPA for database interaction.
### JPA (Java Persistence API):
For data persistence using object-relational mapping (ORM).
### PostgreSQL: 
The relational database used to store user, subject, and grade data.
### RabbitMQ: 
A message broker for asynchronous communication between services.
### Docker & Docker Compose:
Used to manage and deploy the environment, including PostgreSQL, RabbitMQ, and pgAdmin services.

# STILL BUILDING...