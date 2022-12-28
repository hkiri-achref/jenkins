FROM amazoncorretto:17-alpine-jdk
EXPOSE 8080
MAINTAINER achrefhk
COPY target/docker-jenkins-spring.jar docker-jenkins-spring.jar
ENTRYPOINT ["java","-jar","/docker-jenkins-spring.jar"]