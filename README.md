
---

````markdown
# 🎓 Student Database Mini Project

This is a **Java + MySQL mini project** developed for the **IT 3003 APT module**.  
The application demonstrates database connectivity, CRUD operations, and a simple **UI/UX** built with Swing.



  About the Project
The Student Database Management System allows users to:

  Add new student records  
  View all students in a table  
 ✏ Update student details  
  Delete student records  
  Search students by ID or name  

The backend is written in **Java (JDK 24)** using **JDBC** with **MySQL 8.0** as the database.  
A simple **Swing-based UI** provides an easy way to interact with the system.

---

## Tech Stack
-Language: Java 24  
-Database: MySQL 8.0+  
- Connector: MySQL Connector/J 8.4  
- IDE: IntelliJ IDEA Community Edition  
- UI: Java Swing  

---

 ⚙️ Setup Instructions

 1. Clone or Download the Repository
```bash
git clone https://github.com/yourusername/student-database-mini.git
cd student-database-mini
````

### 2. Create the Database

Open **MySQL Workbench** (or CLI) and run:

```sql
CREATE DATABASE IF NOT EXISTS studentdb;
USE studentdb;

CREATE TABLE IF NOT EXISTS student (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name   VARCHAR(100) NOT NULL,
    email  VARCHAR(100) UNIQUE,
    course VARCHAR(50),
    gpa    DECIMAL(3,2) CHECK (gpa >= 0.00 AND gpa <= 4.00)
);
```

(Optional) Insert some test data:

```sql
INSERT INTO student (name, email, course, gpa) VALUES
('Isuru Chathuranga', 'isuru@example.com', 'APT', 3.55),
('Nadeesha Perera', 'nadeesha@example.com', 'DBMS', 3.90),
('Sahan Kumara', 'sahan@example.com', 'OOP', 3.20);
```

### 3. Configure Database Connection

In `DBConnection.java`, set your credentials:

```java
private static final String USER = "root";       // your MySQL username
private static final String PASS = "your_password"; // your MySQL password
```

### 4. Run the Project

* Open in IntelliJ IDEA.
* Run `StudentApp.java` to launch the UI.

---

## 📂 Project Structure

```
src/
 └── main/
     └── java/
         └── org/
             ├── DBConnection.java   # Handles DB connection
             ├── Student.java        # Model class
             ├── StudentData.java    # DTO/Data layer
             ├── StudentService.java # Service layer (CRUD methods)
             ├── Validation.java     # Input validation logic
             ├── TestDB.java         # Test connection
             └── ui/
                 └── StudentApp.java # Swing UI (Add, View, Search Students)
```

---

## 🏆 Features Implemented

1. Correct implementation of **CRUD** operations
2. Proper use of **JDBC best practices**

   * PreparedStatement
   * Exception handling
   * Closing resources
3. Organized, readable code (OOP design)
4. Simple but functional **UI with Swing**
5. (Bonus) Input validation and search options

---

## 📸 Screenshots (optional)

*Add screenshots of your IntelliJ, DB, and running UI here*

---

## 👨‍💻 Author

* **Sahiru Praveen Ratnayake**
* Colombo University

