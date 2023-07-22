FROM openjdk:17-jdk-alpine AS builder
WORKDIR /workspace
COPY . /workspace/
RUN cd /workspace
RUN pwd
RUN ls -l
RUN chmod +x mvnw
RUN ./mvnw clean package


FROM openjdk:17-jdk-alpine
WORKDIR /demo-springboot
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
COPY --from=builder /wdorkspace/target/demo-springboot-0.0.1-SNAPSHOT.jar workspace.jar
EXPOSE 8080
ENTRYPOINT exec java $JAVA_OPTS -jar workspace.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar workspace.jar
