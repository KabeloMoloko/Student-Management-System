# Student Management System

My project demonstrates object-oriented design with inheritance, abstraction, and the Builder pattern. It includes an abstract `Student` class and two subclasses: `UndergraduateStudent` and `GraduateStudent`.

## SOLID Principles Explanation

This design applies at least two SOLID principles:

1. ** Single Responsibility Principle (SRP): Each class has one job. The 'Student' class defines basic student structure and behavior. 'UndergraduateStudent' manages its own data and display (e.g., 'displayStudentDetails()' prints undergraduate details only). Builder classes (like 'UndergraduateStudent.Builder') handle object construction separately.
2. ** Open-Closed Principle (OCP): The system is open for extension but closed for modification. Extend 'Student' to add new types (e.g., a 'PhDStudent' subclass) without changing existing code. Builders allow adding fields to subclasses (e.g., new fields in 'GraduateStudent') without altering the base class.
