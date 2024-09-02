# STUDENT MANAGEMENT SYSTEM

![GitHub top language](https://img.shields.io/github/languages/top/joshnealcrisostomo/freshman-projects)
![GitHub repo size](https://img.shields.io/github/repo-size/joshnealcrisostomo/freshman-projects)
![GitHub last commit](https://img.shields.io/github/last-commit/joshnealcrisostomo/freshman-projects)
![GitHub License](https://img.shields.io/github/license/joshnealcrisostomo/freshman-projects)

## Table of Contents
1. [Overview](overview)
2. [Features](features)
3. 

----------------------------------------------------------------------

## Overview
This Student Management System is a Java-based application designed to manage basic student and teacher information, including accounts, subjects, and activities. The system uses HashMaps and Lists to manage data. It allows admin, students, and teachers to interact with various functionalities like logging in, viewing and adding subjects, accessing personal information, and adding fellow teachers. It implements simple authorization mechanisms for students, teachers, and administrators.

----------------------------------------------------------------------

## Features
 - 🔐 **User Authentication** 
 	  - **Admin Login:** Secure admin access with predefined credentials.
    - **Teacher Login:** Teachers can log in using their unique usernames and passwords.
    - **Student Login:** Students can log in using their unique ID numbers and passwords.

- 👤**Account Creation**
    - **Teacher Account Creation:** Teachers can create an account by providing basic information, a unique username, and a password.
    - **Student Account Creation:** Students can create an account by providing basic information, a unique ID number, and a password.

- 📓 **Class Management**
 	  - **View Subjects:** Displays a list of available subjects with detailed information such as the class code, class name, weekly schedule, daily schedule, and modality.
    - **Add Classes:** Administrators can add new classes with unique class codes and schedules.
    - **Generate Unique Class Codes:** Ensures that existing and newly added classes have distinct identifiers.
 
 - 🔐 **User Management** 
 	  - **Search Functionality:** Find teachers or students by username, ID number, or full name.
    - **Profile Management:** Users can update their personal information, including name, gender, year level, and professor type.

 - 🕒 **Activity Logging** 
 	  - **Comprehensive Logs:** Track all significant actions within the system for accountability and monitoring.
    - **View Logs:** Administrators can view a detailed activity log to monitor system usage (including the activity's date and time).
  
- 👥 **Friend System for Teachers**
 	  - **Send Friend Requests:** Teachers can connect with each other by sending and accepting friend requests.
    - **View Friends and Requests:** Manage and view current friends and pending friend requests.

- ❌ **Validation and Error Handling**
 	  - **Password Validations:** Ensures strong passwords with digits, uppercase letters, and special symbols.
    - **Input Validation:** Validates dates, non-empty fields, and other user inputs to maintain data integrity.

----------------------------------------------------------------------

## Future Enhancements
1. GUI Integration: Create a graphical user interface using JavaFX to improve user experience.
2. Database Integration: Implement a database (e.g., MySQL) to store student, teacher, and subject information persistently.
3. Advanced Features: Implement features like grading systems, attendance tracking, and more detailed student-teacher interactions.

----------------------------------------------------------------------

## Technologies Used

![Java](https://img.shields.io/badge/Java-007396?style=flat&logo=java&logoColor=white)
![Swing](https://img.shields.io/badge/Swing-007396?style=flat&logo=java&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=flat&logo=git&logoColor=white)


----------------------------------------------------------------------

# Getting Started

To explore the project, clone this repository using the following command:

```bash
git clone https://github.com/joshnealcrisostomo/Student-Management-System.git
