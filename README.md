# Spring Boot JPA Relationships Project

## Overview

This project was developed as part of Java Full Stack Development Placement Training to understand and implement JPA Entity Relationships using Spring Boot and PostgreSQL.

The application demonstrates:

* One-to-One Mapping
* One-to-Many Mapping
* Many-to-One Mapping
* Entity Relationships
* Spring Data JPA
* REST API Development
* PostgreSQL Integration
* Lombok Annotations

The project manages students, their profiles, and enrolled courses through REST APIs.

---

## Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* PostgreSQL
* Lombok
* REST APIs
* Maven
* Postman

---

## Project Architecture

```text
Client
   ↓
Controller Layer
   ↓
Service Layer
   ↓
Repository Layer
   ↓
PostgreSQL Database
```

---

## Entity Relationship Design

### Student Entity

The Student entity acts as the central entity in the application.

Attributes:

* Student ID
* Student Name
* Department
* Profile Information
* Course Information

### Profile Entity

Each student has one profile.

Relationship:

```text
Student  ↔  Profile
   1      :      1
```

Implemented using:

```java
@OneToOne
@JoinColumn
```

Examples of Profile Data:

* Email
* Phone Number

---

### Course Entity

A student can enroll in multiple courses.

Relationship:

```text
Student  →  Course
   1      :      Many
```

Implemented using:

```java
@OneToMany
@ManyToOne
```

Examples of Course Data:

* Course ID
* Course Name

---

## JPA Relationships Implemented

### One-to-One Mapping

Student ↔ Profile

Features:

* Each student has one profile.
* Profile details are stored in a separate table.
* Cascade operations are enabled.

Concepts Learned:

* @OneToOne
* @JoinColumn
* CascadeType.ALL

---

### One-to-Many Mapping

Student → Courses

Features:

* One student can have multiple courses.
* Courses are linked to their respective student.

Concepts Learned:

* @OneToMany
* mappedBy
* Entity Relationships

---

### Many-to-One Mapping

Course → Student

Features:

* Multiple courses can belong to a single student.
* Foreign key mapping is maintained automatically.

Concepts Learned:

* @ManyToOne
* Referential Integrity

---

## REST API Endpoints

### Create Student Record

```http
POST /students
```

Sample Request:

```json
{
  "name": "Shrinidhi",
  "department": "CSE",
  "profile": {
    "email": "shri@gmail.com",
    "phone": "9876543210"
  },
  "courses": [
    {
      "name": "Java"
    },
    {
      "name": "Spring Boot"
    }
  ]
}
```

---

### Retrieve All Students

```http
GET /students
```

Returns all students along with:

* Profile Details
* Course Details

---

## Folder Structure

```text
src/main/java/com/example/FullStackProject

├── FullStackProjectApplication.java
├── Student.java
├── Profile.java
├── Course.java
├── StudentController.java
├── StudentService.java
└── StudentRepository.java
```

---

## Concepts Practiced

* Spring Boot Project Structure
* JPA Entity Mapping
* One-to-One Relationship
* One-to-Many Relationship
* Many-to-One Relationship
* Hibernate ORM
* REST API Development
* Dependency Injection
* Repository Pattern
* Service Layer Architecture
* PostgreSQL Connectivity
* Lombok Annotations

---

## Learning Outcomes

After completing this project, I learned:

* How entities are connected in relational databases.
* Implementation of One-to-One relationships using JPA.
* Implementation of One-to-Many and Many-to-One relationships.
* Managing related data using Hibernate.
* Creating REST APIs for entity management.
* Using Lombok to reduce boilerplate code.
* Integrating Spring Boot applications with PostgreSQL.
* Understanding real-world database relationship design.

---

## Training Details

**Placement Training:** Java Full Stack Development

**Day:** 12

**Date:** 15 June 2026

**Topic:** Spring Boot JPA Relationships

---

## Key Concepts Covered

* Entity Mapping
* JPA Relationships
* One-to-One Mapping
* One-to-Many Mapping
* Many-to-One Mapping
* Hibernate
* Spring Data JPA
* REST APIs
* PostgreSQL Integration
* Lombok

---

## Author

**Shrinidhi Dhamodharan**

Aspiring Java Full Stack Developer

Currently learning Spring Boot, Hibernate, JPA Relationships, REST APIs, and Full Stack Development through hands-on projects and placement training.
