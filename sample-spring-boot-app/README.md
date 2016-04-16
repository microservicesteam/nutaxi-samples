# Sample Spring Boot Application
Demo applications to introduce Spring Boot features

##Run
execute one of the commands to start the applications:

`java -jar [artifactId].jar`

`mvn spring-boot:run`

`gradle bootRun`


## 1. Hello World Web
Introduction of the basics. [Link](http://projects.spring.io/spring-boot/#quick-start) to reference.
It is a simple REST service greeting the World. The application is packaged as a fat JAR and it can be executed with an embedded Tomcat in itself.
[http://localhost:8080](http://localhost:8080)

## 2. Hello World Actuator
Demonstrates the production ready actuator starter project. The actuator adds production ready endpoints to hello world web service.

[http://localhost:8080](http://localhost:8080)

[http://localhost:8080/health](http://localhost:8080/health)

[http://localhost:8080/mappings](http://localhost:8080/mappings)

## 3. Hello World Actuator Admin/Client
[Spring-boot-admin](https://github.com/codecentric/spring-boot-admin) is a out of the box administrative UI interface for Spring Boot applications developed by [Codecentric AG](https://github.com/codecentric).

Each service depending on spring-boot-admin-starter-client is registered to admin app for monitoring purposes.

