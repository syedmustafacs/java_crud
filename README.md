
# Java Spring Boot CRUD API

This project is a basic CRUD application built using **Java Spring Boot**. The API provides endpoints to manage users, where sensitive data such as passwords are hashed using BCrypt for security.

## Features
- User CRUD operations (Create, Read, Update, Delete)
- Password hashing without using Spring Security
- RESTful API structure
- JSON request/response handling

## Technologies
- Java 17+
- Spring Boot
- Maven
- BCrypt for password hashing
- H2 Database (for development/testing)

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven
- Postman (optional, for API testing)

### Installation

1. **Clone the repository**:

   ```bash
   git clone https://github.com/syedmustafacs/java_crud
   ```

2. **Navigate to the project directory**:

   ```bash
   cd java_crud
   ```

3. **Build the project using Maven**:

   ```bash
   mvn clean install
   ```

4. **Run the application**:

   ```bash
   mvn spring-boot:run
   ```

5. The application will start running on `http://localhost:8080`.

### API Endpoints

| Method | Endpoint        | Description          |
|--------|-----------------|----------------------|
| POST   | `/users`         | Create a new user    |
| GET    | `/users/{id}`    | Get user by ID       |
| PUT    | `/users/{id}`    | Update user by ID    |
| DELETE | `/users/{id}`    | Delete user by ID    |
| GET    | `/users`         | Get all users        |

### Request and Response Examples

#### 1. **Create User**: `POST /users`

Request:
```json
{
    "username": "johndoe",
    "password": "mypassword",
    "active": true
}
```

Response:
```json
{
    "id": 1,
    "username": "johndoe",
    "active": true
}
```

#### 2. **Get User by ID**: `GET /users/{id}`

Response:
```json
{
    "id": 1,
    "username": "johndoe",
    "active": true
}
```

#### 3. **Update User**: `PUT /users/{id}`

Request:
```json
{
    "username": "john_doe_updated",
    "password": "newpassword",
    "active": false
}
```

#### 4. **Delete User**: `DELETE /users/{id}`

Response: `HTTP 204 No Content`



### Database

This project uses an **H2 in-memory database** for simplicity. You can access the H2 console at `http://localhost:8080/h2-console` for inspecting the database.
