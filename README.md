# sightspectrum_springboot

# Description:
This is a Spring Boot application that provides RESTful APIs for managing user accounts. It uses Spring Data JPA for database access, H2 in-memory database for storing data, and BCrypt for password hashing.

## Prerequisites:
```
Java Development Kit (JDK) 17 or later
Maven 3.6+
IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code)
Postman (optional, for API testing)
```
## Setup Instructions:
###Clone the Repository:
```
git clone https://github.com/shivanikumar444/sightspectrum_springboot.git
cd sightspectrum_springboot
```

### Build the Project:
```
Open the project in your preferred IDE.
If using the command line, run:
mvn clean install
Run the Application:

In your IDE, find DemoApplication.java and run it.
Or use the command line:
mvn spring-boot:run

```
### Access H2 Database Console:
```
URL: http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password: (leave it empty)
```

### API Endpoints:
```
Create an Account:

POST http://localhost:8080/api/accounts
Body (JSON):
json
Copy code
{
  "name": "John Doe",
  "email": "john@example.com",
  "password": "password123"
}
```
### Get All Accounts:
```
GET http://localhost:8080/api/accounts
```
### Get an Account by ID:
```
GET http://localhost:8080/api/accounts/{id}
```

### Testing the Application:
Use Postman or any other API client to test the endpoints.
Create a new account using the POST endpoint and then verify it with the GET endpoints.
The responses should include the account details, except for the password, which is stored securely using BCrypt.
