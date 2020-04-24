FROM java:8
VOLUME /tmp
ADD configservice-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["sh", "-c", "java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

#https://spring.io/guides/gs/spring-boot-docker/