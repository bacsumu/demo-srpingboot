/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    `java-library`
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    api("org.projectlombok:lombok:1.18.28")
    annotationProcessor("org.projectlombok:lombok:1.18.28")
    api("org.springframework.boot:spring-boot-starter-actuator:3.1.2")
    api("org.springframework.boot:spring-boot-starter-web:3.1.2")
    api("org.springframework.boot:spring-boot-configuration-processor:3.1.2")
    runtimeOnly("org.springframework.boot:spring-boot-devtools:3.1.2")
    runtimeOnly("org.springframework.boot:spring-boot-docker-compose:3.1.2")
    testImplementation("org.springframework.boot:spring-boot-starter-test:3.1.2")
}

group = "org.bacsumu"
version = "0.0.1-SNAPSHOT"
description = "demo-springboot"
java.sourceCompatibility = JavaVersion.VERSION_1_8

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc>() {
    options.encoding = "UTF-8"
}