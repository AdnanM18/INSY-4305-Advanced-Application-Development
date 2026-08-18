# INSY 4305 – Advanced Application Development | Java

Java coursework completed in **INSY 4305 – Advanced Application Development**.

This repository demonstrates progressively more advanced application-development concepts, including object-oriented design, reusable methods, inheritance, polymorphism, interfaces, Swing desktop GUIs, file persistence, validation, and custom exceptions.

## Technical Skills Demonstrated

- Java
- Object-oriented programming
- Classes, constructors, getters, and setters
- Reusable methods
- Arrays and `ArrayList`
- Abstract classes and interfaces
- Inheritance and polymorphism
- Method overriding
- Copy constructors
- Java Swing GUI development
- Event-driven programming
- File input/output
- Authentication flow
- Custom exception classes
- Input validation and error handling

## Repository Structure

```text
INSY-4305-Advanced-Application-Development/
├── README.md
├── lab-01-employee-class/
├── lab-02-java-methods/
├── lab-03-inheritance-polymorphism/
├── lab-04-swing-currency-converter/
└── lab-05-cellphone-inventory/
```

## Lab 1 – Employee Class

Built an `Employee` class with overloaded constructors, private fields, accessors/mutators, salary validation, and an overridden `toString()` method. A driver program creates and displays multiple employee objects, including invalid salary cases.

## Lab 2 – Java Methods & Calculations

Four programs demonstrate method-based design:

1. Fahrenheit-to-Celsius conversion table
2. Test-score average and letter-grade calculation
3. Menu-driven distance conversion
4. Present-value calculation

## Lab 3 – Inheritance, Interfaces & Polymorphism

Created a ship hierarchy using an abstract `Ship` class, a `Displayable` interface, `CruiseShip` and `CargoShip` subclasses, overridden methods, copy constructors, arrays, and `ArrayList` polymorphism.

## Lab 4 – Swing Currency Converter

Built a Java Swing desktop currency converter with radio-button currency selection, image assets, formatted result dialogs, input validation, clear/exit controls, and a menu bar.

## Lab 5 – Cell Phone Inventory System

Built a multi-window Swing application with login/account creation, cell phone inventory management, file persistence, a `CellPhone` model, and three custom exception classes.

## Running the Projects

Java 8+ is recommended.

Example:

```bash
cd lab-03-inheritance-polymorphism
javac -d out src/*.java
java -cp out ShipDemo
```
