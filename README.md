Registration Login Demo - Spring Boot 🚀

![Java](https://img.shields.io/badge/Java-17+-blue.svg) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg) ![Maven](https://img.shields.io/badge/Maven-Build%20Tool-orange.svg) ![MySQL](https://img.shields.io/badge/Database-MySQL-blue.svg) ![License](https://img.shields.io/badge/License-MIT-yellow.svg)

Registration Login Demo est une application Web développée avec **Spring Boot 3.x**, **MySQL**, **Spring Security** et **Thymeleaf**. Elle permet l'inscription, la connexion, et la gestion sécurisée des utilisateurs.  
Technologies : Java 17+, Spring Boot, Spring Security, Maven, MySQL, Thymeleaf, Bootstrap.



    Configuration MySQL :
Dans `src/main/resources/application.properties` :
```properties
spring.application.name=registration-login-demo

server.port=8008

#mysql database
spring.datasource.url=jdbc:mysql://localhost:3306/login_system  
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

```
Créer la base de données :
```sql
CREATE DATABASE login_system;
```

Lancer l'application :
Dans le terminal :
```bash
./mvnw spring-boot:run
```
ou si `mvnw` ne fonctionne pas :
```bash
mvn spring-boot:run
```
Accès via navigateur :
```
http://localhost:8080
```

    Principales pages Web :
- `/login` : Connexion utilisateur
- `/register` : Inscription utilisateur
- `/users` : Liste des utilisateurs (accès après authentification)
- `/index` : Page d'accueil

