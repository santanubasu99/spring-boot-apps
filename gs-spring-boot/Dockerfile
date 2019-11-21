FROM openjdk:8-jdk-alpine

RUN mkdir /usr/local/gs-spring-boot

COPY ./target/gs-spring-boot-0.1.0.jar /usr/local/gs-spring-boot/

WORKDIR /usr/local/gs-spring-boot

CMD ["java", "-jar", "gs-spring-boot-0.1.0.jar"]