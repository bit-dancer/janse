plugins {
    base
    java
    jacoco
    `java-library`
    `maven-publish`
}

repositories {
    mavenLocal()
    aliyun()
    spring()
    mavenCentral()
}

dependencies {
    // Lombok
    compileOnly(Dependencies.LOMBOK)
    annotationProcessor(Dependencies.LOMBOK)
    testCompileOnly(Dependencies.LOMBOK)
    testAnnotationProcessor(Dependencies.LOMBOK)

    // MapStruct
    compileOnly(Dependencies.MAPSTRUCT)
    annotationProcessor(Dependencies.MAPSTRUCT_PROCESSOR)

    // Test
}

tasks.withType<JavaCompile> {
    sourceCompatibility = "1.8"
    targetCompatibility = "1.8"
    options.encoding = "UTF-8"
}

tasks.test {
    useJUnitPlatform()
}
