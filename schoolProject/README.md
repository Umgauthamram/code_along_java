# Part 5: Establishing Students, Teaching & Non-Teaching Staff hierarchy

This project implements an inheritance hierarchy for a school system.

## Classes
- **Person.java**  
  Base class with `id`, `name`, auto-generated IDs, and `displayDetails()`.

- **Student.java**  
  Inherits from Person, adds `gradeLevel`.

- **Teacher.java**  
  Inherits from Person, adds `subjectTaught`.

- **Staff.java**  
  Inherits from Person, adds `role`.

- **AttendanceRecord.java**  
  Records attendance using `personId`, date, and presence.

- **Main.java**  
  Demonstrates creating and displaying `Student`, `Teacher`, and `Staff` objects, along with attendance.

## Running
```bash
javac *.java
java Main
