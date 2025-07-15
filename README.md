# URL Shortener Service

## 1. Project Overview 

This project is a simple URL shortener service built using Spring Boot. It provides functionality to shorten long URLs and redirect users to the original URL using the shortened version.

## 2. Tech stack

- JDK 17  
- Maven 4.0  
- Spring Boot 3.3.0  
- Swagger/OpenAPI 2.0.2 

## 3. Building and running the application

### 1) Clone the repo

git clone https://github.com/bishtrs/spring-boot-url-shortner.git

### 2) Building the application

mvn clean package 

### 3) Running the application

mvn spring-boot:run<br/><br/> 

## 4. Swagger URL:  

http://localhost:8080/swagger-ui/index.html 

### 5. Testing  

-  POST API to shorten a URL which will return a short URL (http://localhost:8080/api/b)

   http://localhost:8080/api/shorten?longUrl=https://www.gmail.com

-  GET API redirects to the original long URL based on the provided short URL.

   http://localhost:8080/api/b
