# 📒 AddressBook Spring Boot Application

## 📖 Project Overview

The **AddressBook Spring Boot Application** is a backend RESTful application developed using **Spring Boot** to manage contact information efficiently.  
This project demonstrates enterprise-level backend development concepts including REST APIs, layered architecture, validation, logging, exception handling, database configuration, and environment-based profiles.

The application is implemented incrementally from **UC1 → UC12**, showcasing step-by-step enhancement of features and backend architecture.

---

# 🚀 Key Features

✅ CRUD Operations for Contacts  
✅ RESTful API Development  
✅ Layered Architecture (Controller → Service → Model)  
✅ DTO-Based Request Handling  
✅ Validation & Exception Handling  
✅ Logging Support using Lombok  
✅ Spring Profiles Configuration  
✅ MySQL Database Connectivity  
✅ Global Exception Handling  
✅ Clean & Maintainable Codebase  

---

# 🛠️ Technologies Used

- ☕ Java 11 / 17
- 🌱 Spring Boot
- 🔗 Spring Web
- 🗄️ Spring Data JPA
- 🐬 MySQL
- 🔹 Lombok
- ✅ Validation API
- 📦 Maven

---

# 📂 Project Structure

```text
src
 └── main
     └── java
         └── com.bridgelabz.addressbookapp
             ├── controller
             ├── service
             ├── model
             ├── dto
             ├── exception
     └── resources
         ├── application.properties
         ├── application-dev.properties
         └── application-prod.properties
```

---

# 📌 Use Cases Implemented

| Use Case | Description |
|----------|-------------|
| **UC1** | Create AddressBook REST Controller |
| **UC2** | Introduce Service Layer |
| **UC3** | Store AddressBook Data |
| **UC4** | Test REST APIs |
| **UC5** | Integrate Lombok |
| **UC6** | Add Application Logging |
| **UC7** | Configure Logging Profiles |
| **UC8** | Configure Database & Profiles |
| **UC9** | Add Validation |
| **UC10** | Implement Validation Error Handling |
| **UC11** | Add Custom Exception Handling |
| **UC12** | Handle AddressBook ID Not Found |

---

# 🌐 REST API Endpoints

## Contact APIs

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/addressbook` | Fetch all contacts |
| GET | `/addressbook/{id}` | Fetch contact by ID |
| POST | `/addressbook` | Add new contact |
| PUT | `/addressbook/{id}` | Update contact |
| DELETE | `/addressbook/{id}` | Delete contact |


# 🎯 Final Features After UC12

After completing all use cases, the application supports:

- REST APIs
- Layered Service Architecture
- DTO Handling
- Lombok Integration
- Logging
- Spring Profiles
- Validation
- Global Exception Handling
- Custom Exception Handling
- Database Connectivity



# 👨‍💻 Developer

**Developed by Kavish**

Backend project created for learning and implementing Spring Boot, REST APIs, validation, exception handling, and enterprise backend architecture concepts.

---

# 📜 License

This project is intended for educational and learning purposes only.

```
