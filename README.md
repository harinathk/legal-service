# Legal Service - Microservices
This backend version of the Legal API application only provides a REST API. There is no UI.

## Microservices
1. Consumer
2. Lawyer
3. API Gateway
4. Discovery Service

## Running the services locally

### With maven command line

````
    git clone https://github.com/harinathk/legal-service.git
    cd legal-service
    
    cd legal-discovery-service
     ./mvnw spring-boot:run
     
    cd legal-api-gateway-service
    ./mvnw spring-boot:run
    
    cd consumer-service
    ./mvnw spring-boot:run
    
    cd lawyer-service
    ./mvnw spring-boot:run
````
### REST APIs to Test

http://192.168.1.139:8762/consumers/consumer

http://192.168.1.139:8762/lawyers/lawyer

http://192.168.1.139:8762/consumers/consumer/favlawyer/5