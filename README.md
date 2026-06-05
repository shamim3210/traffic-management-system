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
* AdminClass
* Main Class

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

### Jipel

* Vehicle registration integration
* Vehicle search functionality
* Error logging panel
* GUI event handling

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

The Traffic Management System demonstrates practical implementation of Java OOP principles and GUI development. It provides an efficient platform for managing vehicle registration and traffic-related information while maintaining data validation and user-friendly interaction.
