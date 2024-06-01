## 🛍️ Online Shopping Application Using Microservices with Spring Boot and Spring Cloud

## Table of Contents

- [Overview]
- [Project Structure]
- [Key Components and Tools]
- [Services Interaction]
- [Tech Stack]
- [Architecture and component diagrams]

## 📜 Overview
This project demonstrates building a simple online shopping application using microservices architecture with Spring Boot and Spring Cloud. The application encompasses various critical aspects of microservices, including service discovery, centralized configuration, distributed tracing, event-driven architecture, centralized logging, circuit breakers, and secure microservice communication using Keycloak.

## 🏗️ Project Structure
The project consists of the following microservices:

- 🛒 Product Service: Create and view products, acts as the product catalog  
- 📦 Order Service: Handles product orders  
- 📊 Inventory Service: Checks if a product is in stock  
- 🔔 Notification Service: Sends notifications after an order is placed.


## 🛠️ Key Components and Tools
- 🔍 Service Discovery: Eureka Server is used for service registration and discovery  
- 🗂️ Centralized Configuration: Spring Cloud Config Server is used to manage external configurations  
- 🕵️‍♂️ Distributed Tracing: Zipkin is used to trace requests across microservices  
- 📨 Event-Driven Architecture: Apache Kafka is used for asynchronous messaging  
- 📈 Monitoring: Prometheus and Grafana are used for monitoring  
- 🔌 Circuit Breaker: Resilience4J is used to implement circuit breakers  
- 🔐 Security: Keycloak is used for securing microservices  
- 🐳 Dockerization: Jib library is used to dockerize the application  
- 📦 Container Orchestration: Docker Compose is used for managing multi-container Docker applications.

## 🔄 Services Interaction
Order Service, Inventory Service, and Notification Service interact with each other to process orders, manage inventory, and send notifications.
API Gateway handles incoming requests and routes them to the appropriate microservices.
Auth Server (Keycloak) manages authentication and authorization.

## 💻 Tech Stack
- Spring Boot: For building individual microservices  
- Spring Cloud: For integrating and managing distributed systems  
- MongoDB: For Product Service database  
- MySQL: For Order Service and Inventory Service databases  
- Kafka: For asynchronous communication  
- Eureka Server: For service discovery  
- Config Server: For centralized configuration  
- Zipkin: For distributed tracing  
- ELK Stack: For logging and monitoring  
- Resilience4J: For circuit breaker implementation  
- Keycloak: For securing microservices  
- Jib: For containerizing the application  
- Docker Compose: For orchestrating multi-container Docker applications  

## 💻 Architecture and component diagrams 

![image](https://github.com/ahujasherry/Ecommerce-Springboot/assets/72737856/b97ad474-8013-4937-85c2-96d8a2125716)

![image](https://github.com/ahujasherry/Ecommerce-Springboot/assets/72737856/2de4f978-a4a7-4ce1-8a11-6ba9a97494a0)

![image](https://github.com/ahujasherry/Ecommerce-Springboot/assets/72737856/a8caf5ef-7379-495a-be38-5c4dc9604269)

![image](https://github.com/ahujasherry/Ecommerce-Springboot/assets/72737856/0a2a3739-1fd3-4653-b150-e5b867f8311a)

![image](https://github.com/ahujasherry/Ecommerce-Springboot/assets/72737856/9f73cf77-a5b0-4e9a-aaab-59f977023097)

![image](https://github.com/ahujasherry/Ecommerce-Springboot/assets/72737856/211108e3-850a-4cc8-8d3e-bba6478a56ea)

![image](https://github.com/ahujasherry/Ecommerce-Springboot/assets/72737856/cb0024dd-bfdd-434e-b333-ad1ac49b1502)

![image](https://github.com/ahujasherry/Ecommerce-Springboot/assets/72737856/c6e0b448-9905-4ea8-9c55-01bba3ad435f)

![image](https://github.com/ahujasherry/Ecommerce-Springboot/assets/72737856/06017782-2e97-4742-bd0e-4ae7be6bc9b8)



## How to run the application using Docker

1. Run `mvn clean package -DskipTests` to build the applications and create the docker image locally.
2. Run `docker-compose up -d` to start the applications.

## How to run the application without Docker

1. Run `mvn clean verify -DskipTests` by going inside each folder to build the applications.
2. After that run `mvn spring-boot:run` by going inside each folder to start the applications.

## Contact

Created by [@ahujasherry](https://github.com/ahujasherry) - feel free to contact me!

