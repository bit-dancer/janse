plugins {
    base
    java
    jacoco
    `java-library`
    `maven-publish`
}

repositories {
    mavenLocal()
    maven { url = Repositories.ALIYUN_REPO }
    maven { url = Repositories.SPRING_REPO }
    mavenCentral()
}

dependencies {
    constraints {
        implementation("org.apache.commons:commons-text:1.9")
    }

    testImplementation("org.junit.jupiter:junit-jupiter:5.7.1")
}

tasks.withType<JavaCompile> {
    sourceCompatibility = BuildArgs.JAVA_VERSION
    targetCompatibility = BuildArgs.JAVA_VERSION
    options.encoding = BuildArgs.UTF_8
}

tasks.test {
    useJUnitPlatform()
}
