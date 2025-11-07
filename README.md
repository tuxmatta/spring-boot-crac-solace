# spring-boot-crac-solace
Spring Boot with CRaC and Solace Demo

## Important
- Use a JDK with CRaC support like _Azul System 21.x.x.crac-zulu_.

## Build and running

build: `mvn clean package` or `mvn clean package -DskipTests`

run: `java -XX:CRaCCheckpointTo=checkpoint -jar target/spring-boot-crac-solace-0.0.1-SNAPSHOT.jar`

call api: `http://localhost:8080/api`

make a CRaC checkpoint: `jcmd target/spring-boot-crac-solace-0.0.1-SNAPSHOT.jar JDK.checkpoint`
