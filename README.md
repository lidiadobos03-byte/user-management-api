# User Management API

A REST API for managing users, built with Java 17, Spring Boot, JPA, and H2.

This project is structured like a real backend application, with validation, layered architecture, integration tests, consistent error handling, and interactive API documentation.

## Features

- CRUD operations for users
- Input validation for request payloads
- Layered design with controller, service, repository, and entity separation
- H2 in-memory database for local development
- Seed data loaded automatically at startup
- Consistent JSON error responses
- Swagger UI for interactive API exploration
- Integration tests covering the main API flows

## Tech Stack

- Java 17
- Spring Boot 3
- Spring Web
- Spring Data JPA
- Spring Validation
- H2 Database
- springdoc OpenAPI / Swagger UI
- Maven
- JUnit 5 + MockMvc

## Project Structure

```text
src/
  main/
    java/com/lidiadobos/usermanagement/
      common/
      config/
      user/
    resources/
  test/
    java/com/lidiadobos/usermanagement/
```

## API Endpoints

| Method | Endpoint      | Description        |
|--------|---------------|--------------------|
| GET    | /users        | Retrieve all users |
| POST   | /users        | Create a new user  |
| PUT    | /users/{id}   | Update an existing user |
| DELETE | /users/{id}   | Delete a user |

## Sample Request

```json
{
  "name": "Jane Doe",
  "email": "jane@example.com",
  "age": 28
}
```

## Sample Error Response

```json
{
  "timestamp": "2026-03-24T16:52:41.168281Z",
  "status": 409,
  "error": "Conflict",
  "message": "A user with the same email already exists.",
  "path": "/users"
}
```

## Run Locally

```bash
mvn spring-boot:run
```

The API starts on `http://localhost:8080`.

## Interactive Documentation

- Swagger UI: `http://localhost:8080/swagger-ui.html`
- OpenAPI JSON: `http://localhost:8080/v3/api-docs`

## Database Console

- H2 Console: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:userdb`
- Username: `sa`
- Password: empty

## Run Tests

```bash
mvn test
```

## Useful cURL Commands

Create a user:

```bash
curl -X POST http://localhost:8080/users \
  -H "Content-Type: application/json" \
  -d '{"name":"Lidia Dobos","email":"lidia@example.com","age":25}'
```

Get all users:

```bash
curl http://localhost:8080/users
```

Update a user:

```bash
curl -X PUT http://localhost:8080/users/1 \
  -H "Content-Type: application/json" \
  -d '{"name":"Lidia D.","email":"lidia.d@example.com","age":26}'
```

Delete a user:

```bash
curl -X DELETE http://localhost:8080/users/1
```

## Notes

- The database is in-memory, so data resets when the application stops.
- A sample user is inserted automatically from `data.sql` on startup.
