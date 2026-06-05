##  Project Topic :  Traffic Management System 🚦

(Java Swing Based Project)
Course Code: CSE 282
Section: 04
Semester: Spring 2026


##  Team Members :  👥 

Shajedul Islam Fahim – 2024100000434
T.M. Shahriyar Kabir – 2024100000026
##  Md Shamim Ashraf – 2024100000259 (c)
Md. Jipel Ahamed Arman – 2024100000233
Fayez – 2024100000289

Overall view :  🔍

# Traffic Management System  🚥🚨

## Project Overview  🔍

The **Traffic Management System** is a Java-based application developed to manage vehicle registration, traffic officers, and vehicle information efficiently. The project demonstrates the use of **Object-Oriented Programming (OOP)** concepts such as inheritance, abstraction, encapsulation, polymorphism, exception handling, collections, and Java Swing GUI development.

The system allows:

* Vehicle registration
* Vehicle information storage
* Vehicle searching
* Traffic officer management
* Input validation
* Exception handling
* Graphical User Interface (GUI) support

---

## Features 🚦

### Driver Management  🚌🚑🚚

* Register vehicles with owner information.
* Store vehicle number and vehicle type.
* Display driver and vehicle information.

### Traffic Officer Management  🚔🚨🚥

* Create traffic officer records.
* Display officer information.
* Manage traffic operations.

### Vehicle Management  🚨🚌🚑🚦

* Add new vehicles.
* Search vehicles using vehicle numbers.
* Display all registered vehicles.

### Validation & Exception Handling    ❌❗

* Prevent empty inputs.
* Validate vehicle numbers.
* Detect duplicate vehicle registrations.
* Custom exception handling using `InvalidDataException`.

### Graphical User Interface (GUI)  ⏹️⏯️

* User-friendly vehicle registration form.
* Vehicle search functionality.
* Error logging and display panel.
* Success and error notifications using dialogs.

---

## Technologies Used

* Java
* Java Swing
* Object-Oriented Programming (OOP)
* Collections Framework (`ArrayList`)
* Exception Handling

---

## Project Structure  🧩

### Core Classes

#### Person (Abstract Class)

Base class for all persons in the system.

Attributes:

* name
* id

Methods:

* getName()
* getId()
* displayInfo() (abstract)

---

#### Driver Class

Extends `Person`.

Attributes:

* vehicleNumber
* vehicleType

Methods:

* registerVehicle()
* displayInfo()

---

#### TrafficOfficer Class

Extends `Person`.

Methods:

* manageTraffic()
* displayInfo()

---

#### Vehicle Class

Attributes:

* ownerName
* vehicleId
* vehicleNumber
* vehicleType

Methods:

* Getter methods
* displayInfo()

---

#### TrafficService Class 

Responsibilities:

* Add vehicles
* Search vehicles
* Validate data
* Display all vehicles

Methods:

* addVehicle()
* findVehicle()
* validateInput()
* showAllVehicle()

---

#### InvalidDataException Class

Custom exception class used for handling invalid data and validation errors.

---

## GUI Components

### MainFrame

Main application window.

Features:

* Vehicle registration section
* Vehicle search section
* Error log display area

---

### VehicleInputPanel

Input form containing:

* Owner Name field
* Vehicle ID field
* Vehicle Number field
* Vehicle Type dropdown
* Register Vehicle button

---

## OOP Concepts Implemented

### Abstraction

Implemented using the abstract `Person` class.

### Inheritance

* Driver extends Person
* TrafficOfficer extends Person

### Encapsulation

Private attributes with public getter methods.

### Polymorphism

Method overriding through `displayInfo()`.

### Exception Handling

Custom exception class:

* InvalidDataException

### Collection Framework

* ArrayList used to store vehicles and drivers.

---

## Sample Workflow

### Vehicle Registration    🚗💳

1. User enters:

   * Owner Name
   * Vehicle ID
   * Vehicle Number
   * Vehicle Type

2. System validates:

   * Empty fields
   * Numeric vehicle ID
   * Duplicate vehicle number

3. Vehicle gets registered successfully.

---

### Vehicle Search

1. User enters vehicle number.
2. System searches registered vehicles.
3. Vehicle information is displayed.
4. If not found, an error message is shown.

---
Architected and Refactored File Structure
Integrated Vehicle Registration Flow
Engineered Robust Data Validation
Optimized Search Operations & Interface UX
Implemented Centralized Error Logging Panel
Configured Repository Operations.


## Team Contributions  👥 

### Shamim

* Person Abstract Class
* Owner  Class
* Admin Class
* Main Class
* Read Me Design
* Cover Page  & Design Git Hub  


### Hemel

* Vehicle Class
* TrafficService Class
* InvalidDataException Class
* Vehicle management functionality
* Driver Class
* Report Id 

### Fahim

* MainFrame GUI structure


### Fayaz

* VehicleInputPanel GUI form
* Engineered System Workflow Diagrams

### Jipel

* Vehicle registration integration
* Vehicle search functionality
* Error logging panel
* GUI event handling
* Traffic App Class
* Architected and Refactored File Structure

---

## How to Run  🏃‍♂️

### Using IDE (IntelliJ IDEA / Eclipse / NetBeans)

1. Open the project.
2. Compile all Java files.
3. Run:

```java
MainFrame.java
```

or

```java
Driver.java
```

depending on whether you want the GUI version or console version.

---

## Future Improvements

* Database integration (MySQL)
* Login and authentication system
* Traffic violation management
* Fine payment system
* Vehicle ownership transfer
* Advanced reporting system

---

## Conclusion  🎯

This project shows off a Traffic Management System built with Java and the 
Swing GUI framework. It uses key OOP ideas like inheritance, abstraction, 
encapsulation, and exception handling. Because of this, the system is 
organized well and is both scalable and efficient. The desktop app made 
gives users a simple interface to manage basic traffic and vehicle tasks, 
connecting theory with real-world use. Though this version hits its goals, 
there are still some tweaks we could make. Right now, it stores stuff in 
memory using ArrayLists, but changing that to a permanent relational 
database would help keep data safe and intact. Also, we could improve the 
UI to make it more user-friendly and add advanced features like solid create, 
read, update, and delete functions, plus strong search abilities. 
