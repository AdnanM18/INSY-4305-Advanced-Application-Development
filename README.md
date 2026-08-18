# INSY 4305 – Advanced Application Development | Java

Java application-development projects focused on object-oriented programming, inheritance, polymorphism, Swing desktop interfaces, file persistence, validation, and custom exception handling.

## Core Technologies

`Java` · `OOP` · `Inheritance` · `Polymorphism` · `Interfaces` · `Java Swing` · `File I/O` · `Custom Exceptions`

## Projects

### Employee Management Model

An object-oriented Java application built around an `Employee` class.

**Key concepts:**
- encapsulation with private fields
- overloaded constructors
- getters and setters
- salary validation
- object creation and state management
- overridden `toString()` methods

### Java Methods & Calculations

A collection of smaller Java applications built around reusable methods and structured program logic.

**Programs include:**
- Fahrenheit-to-Celsius conversion table
- test-score average and letter-grade calculator
- menu-driven distance converter
- present-value calculator

**Key concepts:** methods, parameters, return values, loops, conditionals, formatted output, and `Math` utilities.

### Ship Hierarchy – Inheritance & Polymorphism

An object-oriented ship hierarchy demonstrating advanced Java class design.

**Architecture:**
- abstract `Ship` base class
- `Displayable` interface
- `CruiseShip` subclass
- `CargoShip` subclass
- overridden methods
- copy constructors
- polymorphic arrays
- `ArrayList<Ship>` collections

**Key concepts:** abstraction, interfaces, inheritance, polymorphism, method overriding, and dynamic dispatch.

### Swing Currency Converter

A Java Swing desktop application for converting between multiple currencies.

**Key features:**
- radio-button currency selection
- image-based interface elements
- formatted conversion results
- popup dialogs
- numeric-input validation
- Clear and Exit controls
- menu bar with About and Exit actions

**Key concepts:** Swing, event-driven programming, GUI controls, validation, dialogs, and application state.

### Cell Phone Inventory System

A multi-window Java Swing application combining authentication, inventory management, persistence, and custom exception handling.

**Application components:**
- login window
- account-creation window
- cell phone inventory interface
- `CellPhone` model class
- file-based account and inventory storage
- custom validation exceptions

**Custom exceptions:**
- `InvalidModelException`
- `InvalidManufacturerException`
- `InvalidRetailPriceException`

**Validation includes:**
- required manufacturer and model values
- numeric retail-price input
- retail-price range checks
- authentication before inventory access

## Skills Demonstrated

- Java application development
- object-oriented design
- encapsulation and class modeling
- inheritance and polymorphism
- abstract classes and interfaces
- method overriding
- arrays and `ArrayList`
- Java Swing GUI development
- event-driven programming
- multi-window desktop applications
- file input/output
- application state persistence
- custom exception classes
- input validation and error handling

## Repository Structure

```text
INSY-4305-Advanced-Application-Development/
├── lab-01-employee-class/
├── lab-02-java-methods/
├── lab-03-inheritance-polymorphism/
├── lab-04-swing-currency-converter/
└── lab-05-cellphone-inventory/
```

## Running the Projects

Java 8+ is recommended.

Example:

```bash
cd lab-03-inheritance-polymorphism
javac -d out src/*.java
java -cp out ShipDemo
```

Each lab contains its own source code and supporting documentation.
