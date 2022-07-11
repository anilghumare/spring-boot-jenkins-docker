FROM openjdk:8-alpine

ADD ./target/SpringBoot-ProductService-1.0.0.jar .

CMD ["java","-jar","SpringBoot-ProductService-1.0.0.jar"]