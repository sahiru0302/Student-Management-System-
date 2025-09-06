Student Database Mini Project (Java + MySQL)

 Setup
1. Create a MySQL database and table:
   ```sql

   
   CREATE DATABASE studentdb;
   USE studentdb;
   CREATE TABLE students (
     id INT AUTO_INCREMENT PRIMARY KEY,
     name VARCHAR(100) NOT NULL,
     age INT NOT NULL,
     email VARCHAR(100) NOT NULL
   );
2.Add the JDBC driver (mysql-connector-java.jar) to your project.

3.Update USER and PASSWORD in StudentDB.java if necessary.

4.Compile and run:
javac StudentDB.java
java StudentDB
