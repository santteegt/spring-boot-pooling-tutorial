# Spring Boot Pooling Connections Tutorial

Getting started project showing how to setup one of the recommended Connection Pool libraries by the Spring Boot reference doc.

## Installation requirements

In order to build and execute this project, you need the following requirements:

* Java SDK 8
* Maven 3.x
* Docker Compose (Optional)

## Database configuration

The project setup a connection prool to consume data from a PostgreSQL database. In order to perform a fast execution of this sample project, you can setup a docker image by running the following commands:

```$bash
~ $ cd spring-boot-pooling-tutorial
~ $ docker-componse up postgresql
```

## Connection pool setup

The project includes required libraries to setup the following Connection Pool implementations;
 
 * HikariCP (Default setup) (See conf parameters [here](https://github.com/brettwooldridge/HikariCP#configuration-knobs-baby))
 * Tomcat JDBC (See conf parameters [here](https://tomcat.apache.org/tomcat-7.0-doc/jdbc-pool.html#Attributes)) 
 * DBCP2 (See conf parameters [here](https://commons.apache.org/proper/commons-dbcp/configuration.html))

If you want to configure a Connection pool different from the default, please uncomment the related dependencies in the [pom.xml](pom.xml)

## Parameter configuration

If you wish to experiment more with the parameter configuration of a connection pool implementation, you can modify the [application.properties](src/main/resources/application.properties) file.

## Build and execution

```$sh
$ mvn package
$ java -jar target/spring-boot-pooling-tutorial-1.0-SNAPSHOT.jar
```

