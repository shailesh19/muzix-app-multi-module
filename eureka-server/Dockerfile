FROM openjdk:11
ADD ./target/eureka-server-0.0.1-SNAPSHOT.jar /usr/src/eureka-server-0.0.1-SNAPSHOT.jar
EXPOSE 8093
WORKDIR usr/src
ENTRYPOINT ["java","-jar","eureka-server-0.0.1-SNAPSHOT.jar"]