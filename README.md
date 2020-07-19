# Prerequisites
- current Spring Boot requirements: Maven 3.2+, Java 1.8+
- MacOSX or some decent Linux
- a running docker for the docker configuration(optional)

# Install
- git clone https://github.com/alf-falkensee/spring-boot-scaffold.git
- mvn install

# Run
- mvn spring-boot:run

# Test
- mvn test

# Run using Docker
For MacOSX:
- mvn clean; mvn install; mvn exec:exec


For Linux:
- mvn clean; mvn install; bash ./run-as-docker.sh

# Still open
- run from Kubernetes
- change the concept according to https://codefresh.io/howtos/using-docker-maven-maven-docker/  
