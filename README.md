# Student Operations

This repository contains a menu-driven Java program to manage student records using classes, an array of objects, instance members, and constructors. The program allows users to add, display, search, update, and delete student records.

## File Structure:

### **Main.java**
The entry point of the program. It provides a menu-driven interface for performing various student-related operations by interacting with the `StudentOperations` class.

### **Student.java**
Defines the `Student` class with attributes like PRN, name, Date of Birth (DoB), and marks. It includes constructors, getters, setters, and a method to display student details.

### **StudentOperations.java**
Manages an ArrayList of `Student` objects. Contains methods for adding, displaying, searching, updating, and deleting student records.

---

## Methods and Functions:

### **Main.java**
- `main(String[] args)`: The entry point of the program. Displays a menu for the user to choose operations such as adding, displaying, searching, updating, and deleting student records.

### **Student.java**
- `Student(String name, long prn, String dob, double marks)`: Constructor to initialize student attributes.
- `getName()`: Returns the student's name.
- `setName(String name)`: Sets the student's name.
- `getPRN()`: Returns the student's PRN.
- `setPRN(long prn)`: Sets the student's PRN.
- `getDoB()`: Returns the student's date of birth.
- `setDoB(String dob)`: Sets the student's date of birth.
- `getMarks()`: Returns the student's marks.
- `setMarks(double marks)`: Sets the student's marks.
- `display()`: Displays the student's details.

### **StudentOperations.java**
- `addStudent(Student student)`: Adds a new student to the list.
- `displayStudents()`: Displays all student records.
- `searchByPRN(long prn)`: Searches for a student by PRN.
- `searchByName(String name)`: Searches for a student by name.
- `searchByPosition(int position)`: Searches for a student by their position in the list.
- `updateStudent(long prn, String name, String dob, double marks)`: Updates student details.
- `deleteStudent(long prn)`: Deletes a student from the list.

---

## **Usage**
1. Run `Main.java`.
2. Choose an option from the displayed menu.
3. Enter the required details as prompted.
4. Perform operations such as adding, searching, updating, or deleting student records.

This repository follows clean code principles, modular design, and proper documentation for maintainability and readability.


