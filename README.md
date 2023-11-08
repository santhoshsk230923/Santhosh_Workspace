# Spring Boot 3.0 Security with JWT Implementation
This project demonstrates the creation of a Spring Boot application that exposes a RESTful API to interact with Apache NiFi data flows. This application will act as an intermediary for managing and observing ETL (Extract, Transform, Load) processes, conducted within NiFi

## Technologies
* Spring Boot 3.2.0
* Java 17
* Spring Security
* JSON Web Tokens (JWT)
* Apache NiFi
* Maven
* MySQL
* Docker
 
## Getting Started
To get started with this project, you will need to have the following installed on your local machine:

* JDK 17+
* Maven 3+


To build and run the project, follow these steps:

* Clone the repository: `git clone https://github.com/santhoshsk230923/Santhosh_Workspace.git`
* Navigate to the project directory: cd cd Santhosh_Workspace
* Add database "albanero_db" to MySql 
## How to Run 
* Build the project: mvn clean install
* Run the project: mvn spring-boot:run 

-> The application will be available at http://localhost:8081.

### Create a JWT resource

## Display unAuth url
```
GET http://localhost:8081/api/auth/welcome
```

### add new user to Db for JWT
```
POST http://localhost:8080/api/auth/addNewUser
{
    "name":"Santhosh",
    "password":"123",
    "email":"santhoshsk@gmail.com",
    "roles":"ROLE_USER"
}
```

### generate token
```
POST http://localhost:8081/api/auth/generateToken
Content-Type: application/json
{
    "username":"Santhosh",
    "password":"123"
}
```
### Create a ETLJob resource
```
GET http://localhost:8081/api/auth/etl-jobs
Authorization: Bearer {{auth-token}}
```
POST http://localhost:8081/api/auth/etl-jobs
Authorization: Bearer {{auth-token}}
```
GET http://localhost:8081/api/auth/etl-jobs/{id}
Authorization: Bearer {{auth-token}}
```
DELETE http://localhost:8081/api/auth/etl-jobs/{id}
Authorization: Bearer {{auth-token}}
```
PUT http://localhost:8081/api/auth/etl-jobs/{id}
Authorization: Bearer {{auth-token}}
{
  "id": 0,
  "name": "string",
  "startTime": "2023-11-08T08:52:22.980Z",
  "duration": 0,
  "lastSuccessfulRun": "2023-11-08T08:52:22.980Z"
}
```

## To view Open API docs

Run the server and browse to http://localhost:8081/docs/swagger-ui/index.html

# About Spring Boot

Spring Boot is an "opinionated" application bootstrapping framework that makes it easy to create new RESTful services (among other types of applications). It provides many of the usual Spring facilities that can be configured easily usually without any XML. In addition to easy set up of Spring Controllers, Spring Data, etc. Spring Boot comes with the Actuator module that gives the application the following endpoints helpful in monitoring and operating the service:

**/metrics** Shows “metrics” information for the current application.

**/health** Shows application health information.

**/info** Displays arbitrary application info.

**/configprops** Displays a collated list of all @ConfigurationProperties.

**/mappings** Displays a collated list of all @RequestMapping paths.

**/beans** Displays a complete list of all the Spring Beans in your application.

**/env** Exposes properties from Spring’s ConfigurableEnvironment.

**/trace** Displays trace information (by default the last few HTTP requests).

# Running the project with MySQL

This project uses an MySQL database . However, converting it to run with another relational database such as PostgreSQL is very easy. Since the project uses Spring Data and the Repository pattern, it's even fairly easy to back the same service with MongoDB. 

Here is what you would do to back the services with MySQL, for example: 

### In pom.xml add: 

```
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
        </dependency>
```

### Append this to the end of application.properties: 

```
---
server.port=8081

spring.main.allow-circular-references=true
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/albanero_db
spring.datasource.username = <username>
spring.datasource.password = <password>
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=false
spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl

# swagger-ui custom path
springdoc.swagger-ui.path=/docs/swagger-ui.html
# /api-docs endpoint custom path
springdoc.api-docs.path=/docs
```

