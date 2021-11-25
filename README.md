# springStudent

## Overview
A simple student management system which allows a user to view all records stored in a database while also allowing a user to quickly add, edit and delete records in an easy to use interface. Built using Spring Boot, Thymeleaf, CSS and MySQL.

## Installation
#### Note: Do not close any of the command prompt windows
1. Install MySQL Server
2. Open admin Command Prompt and start MySQL Server using: 

```
cd "mysql-8.0.27-winx64\bin"
mysqld --console
```

3. Open new admin Command Prompt and start MySQL Console using:

```
cd "mysql-8.0.27-winx64\bin"\
mysql -u username -p
```

4. Create database student_records 

```
CREATE DATABASE IF NOT EXISTS student_records;
```

5. Find the below lines in application.properties in the project file (src/main/resources) and add your MySQL Server username and password after the equals 

```
spring.datasource.username= 
spring.datasource.password= 
```

6. Open new admin command prompt and navigate to the project repository target folder and enter the following command 

```
java -jar springStudent-0.0.1-SNAPSHOT.jar
```

7. Open desired browser (Firefox and Opera were used during development) and enter localhost:8080 into the web address bar

## Dependencies

```
Platform: Windows
Java version: 17
MySQL Server: (use whichever is the most recent)
```


