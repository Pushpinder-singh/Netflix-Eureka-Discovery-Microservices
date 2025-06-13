# Spring-Boot + Eureka Server + Discovery Client
In this project Spring boot microservices register them with an Eureka server, and demonstrate service communication using Feign client.

**Tech Stack**
- JDK 21
- Maven or Gradle

**Dependencies**
- Spring Web
- Eureka Server
- Eureka Discovery Client
- OpenFeign

![image](https://github.com/user-attachments/assets/da1c3120-1acc-417e-bb47-5750654be5c9)


**Run the Microservices**
1. Start the Eureka Server: Run the EurekaServerApplication class.
2. Start product-service: Run the ProductServiceApplication class.
3. Start order-service: Run the OrderServiceApplication class.
   
**Use a browser or Postman to test the endpoints:**

product-service: http://localhost:8081/products/1
order-service: http://localhost:8082/orders
order-service: http://localhost:8082/order/1

Validate the response from order-service, it should fetched the product details from product-service through feign client.
