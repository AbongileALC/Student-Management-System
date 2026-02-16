
# Student Management System

A Java application demonstrating the Builder Design Pattern, 
Inheritance, Polymorphism, and SOLID principles.

## How to Run
1. Clone the repository
2. Open in NetBeans
3. Run `MainRun.java`

## Project Structure
- `Student.java` - Abstract base class
- `Undergraduate.java` - Undergraduate student with Builder
- `Graduate.java` - Graduate student with Builder
- `MainRun.java` - Main class, creates and displays students

## SOLID Principles Applied

### 1. Single Responsibility Principle (SRP)
Each class has one job and one reason to change.
- `Student.java` is only responsible for holding shared 
  student data.
- `Undergraduate.Builder` is only responsible for 
  constructing an `UndergraduateStudent` object.
- `Graduate.Builder` is only responsible for 
  constructing a `GraduateStudent` object.
This means if tuition calculation changes, only 
`calculateTuition()` is affected. If construction logic 
changes, only the Builder is affected.

### 2. Open/Closed Principle (OCP)
Classes should be open for extension but closed for modification.
- `Student.java` is closed for modification — we never 
  change it when adding new student types.
- When we added `Graduate`, we simply extended 
  `Student` without touching any existing code.
- If a `PartTimeStudent` needs to be added in future, 
  we create a new class extending `Student` — again 
  without modifying any existing classes.