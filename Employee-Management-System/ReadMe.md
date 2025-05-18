🧑‍💼 Employee Management System
This is a simple Employee Management System built with Spring Boot. It demonstrates the implementation of CRUD operations (Create, Read, Update, Delete) using REST APIs.

🚀 Features
Add a new employee
Get all employees
Get a specific employee by ID
Update employee details
Delete an employee
🛠️ Tech Stack
Java 17+
Spring Boot
Spring Data JPA
MySQL
Lombok
Maven
Swagger
📦 Project Structure
Employee-Management-System/
├── src/
│   └── main/
│       ├── java/
│       │   └── com.app.ems/
│       │       ├── controller/
│       │       ├── model/
│       │       ├── repository/
│       │       └── service/
│       │       │   └── implementation/
│       │       └── mapper/
│       │       └── exception/
│       │       └── dto/
│       └── resources/
│           ├── application.properties
├── pom.xml
🔧 Setup Instructions
Clone the repo

git clone https://github.com/AudumbarGavhane/Java-Web-Applications.git cd Java-Web-Applications/Employee-Management-System

Update DB config in application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/employees
spring.datasource.username=<username>
spring.datasource.password=<your_password>
spring.jpa.hibernate.ddl-auto=update
Run the app

./mvnw spring-boot:run

API Endpoints (Default base: http://localhost:8080/api/employees)

GET / — Get all employees
GET /{id} — Get employee by ID
POST / — Add new employee
PUT /{id} — Update employee
DELETE /{id} — Delete employee

