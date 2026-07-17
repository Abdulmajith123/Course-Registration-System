# Course Registration System

A simple Course Registration System built using Spring Boot that demonstrates the implementation of RESTful APIs with GET and POST mappings.

## Features
- Register a new course using POST API
- View registered courses using GET API
- RESTful API development
- Spring Boot MVC architecture
- JSON request and response handling

## Technologies Used
- Java
- Spring Boot
- Spring Web
- Maven
- REST API
- Git & GitHub

## API Endpoints

### Register a Course
POST /course/register

Example Request:
{
  "coursename": "Java Programming",
  "name":"abdul",
  "emaiid":"abdulmajith123@gamil.com"
}

### Get All Courses
GET /course

## Project Structure
- Controller
- Service
- Model
- Repository (if used)

## Learning Outcomes
- Developed REST APIs using Spring Boot.
- Implemented GET and POST mappings.
- Handled HTTP requests and JSON responses.
- Learned project structure following Spring Boot best practices.
- Used Git and GitHub for version control.

## Future Improvements
- Add PUT and DELETE APIs.
- Integrate MySQL database.
- Add validation using Bean Validation.
- Implement exception handling.
- Add Swagger/OpenAPI documentation.
