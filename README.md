# User Management API

A small but production-style REST API built with Java 17 and Spring Boot.

## Features

- CRUD endpoints for users
- Request validation
- Layered structure
- H2 in-memory database
- Seed data for local development
- Consistent error responses

## Tech Stack

- Java 17
- Spring Boot 3
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

## Project Structure

```text
src/
  main/
    java/com/lidiadobos/usermanagement/
    resources/
```

## Endpoints

| Method | Endpoint      | Description        |
|--------|---------------|--------------------|
| GET    | /users        | Get all users      |
| POST   | /users        | Create a new user  |
| PUT    | /users/{id}   | Update a user      |
| DELETE | /users/{id}   | Delete a user      |

## Example Request

```json
{
  "name": "Jane Doe",
  "email": "jane@example.com",
  "age": 28
}
```

## Run Locally

```bash
mvn spring-boot:run
```

The API will start on `http://localhost:8080`.

## Run Tests

```bash
mvn test
```

## H2 Console

- URL: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:userdb`
- Username: `sa`
- Password: empty
