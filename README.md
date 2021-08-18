# springboot-wildfly-demo

## Requirements
The project requires the next tools for startup:

- Postgres server
- Wilfly with postgres datasource integrated

## Configuration
The project needs configuration changes for local run

- Postgres : configure host, port, dbName, username and password for your db in application.properties file.
- Wildfly : configure host, port, username and password in pom.xml.

## Building and Running

War deployment
- mvn clean package
- deploy the target war using wildfly management console or cli

Maven deployment
- mvn wildfly:deploy