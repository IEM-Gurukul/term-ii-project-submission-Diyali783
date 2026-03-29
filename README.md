Library Management System with Borrow/Return Tracking
1. Problem Statement
Libraries often handle a large number of books and users. Manual tracking of issued and returned books can lead to errors such as lost records, duplicate entries, and incorrect availability status.
This system automates book management by allowing users to add, borrow, return, and track books efficiently.
2. Target Users
Students
Librarians in educational institutions
3. Core Features
Add new books
Display all available books
Borrow a book
Return a book
Track issued books
Prevent borrowing of unavailable books
Handle invalid input using exception handling4. OOP Concepts Used
Abstraction: Abstract class LibraryItem defines common properties
Inheritance: Book class extends LibraryItem
Encapsulation: Private variables with controlled access (getters/setters)
Polymorphism: Overriding display() method
Exception Handling: Handles invalid inputs and operations
Collections: ArrayList used to store book
5. Proposed Architecture

LibraryItem (Abstract Class)
        ↓
      Book Class
        ↓
  Library Manager
        ↓
    Main Program
    6. Description
The Library Management System is a menu-driven Java application. It allows users to:
Add books to the system
View all books
Borrow books if available
Return issued books
The system ensures that:
A book cannot be borrowed if already issued
Book availability updates automatically
Errors are handled using exception handling
7. How to Run
Install Java (JDK)
Save the file as LibrarySystem.java
Open terminal/command prompt
Compile the program 
javac LibrarySystem.java
Run the program:

java LibrarySystem
Follow the menu options. Git Discipline Notes
Initialize repository:

git init
Add files:

git add .
Commit changes:

git commit -m "Initial commit"
Connect to GitHub:

git remote add origin <repository-link>
git push -u origin main
