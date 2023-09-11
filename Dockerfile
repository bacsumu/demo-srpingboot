# for package mvn
# $ docker build --target builder -t demo-springboot-builder .
#FROM openjdk:17-jdk-alpine AS builder
#WORKDIR /workspace
#COPY . /workspace/
#RUN cd /workspace
#RUN chmod +x mvnw
#RUN ./mvnw clean package

# for build docker image
FROM openjdk:17-jdk-alpine
WORKDIR /demo-springboot
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
#COPY --from=builder /wdorkspace/target/demo-springboot-*.jar workspace.jar
RUN pwd;ls -l
COPY ./target/demo-springboot-*.jar /demo-springboot/workspace.jar
EXPOSE 8080
ENTRYPOINT exec java $JAVA_OPTS -jar /demo-springboot/workspace.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar workspace.jar
