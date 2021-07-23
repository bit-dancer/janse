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
    // Lombok
    compileOnly(Dependencies.LOMBOK)
    annotationProcessor(Dependencies.LOMBOK)
    testCompileOnly(Dependencies.LOMBOK)
    testAnnotationProcessor(Dependencies.LOMBOK)

    // MapStruct
    compileOnly(Dependencies.MAPSTRUCT)
    annotationProcessor(Dependencies.MAPSTRUCT_PROCESSOR)

    // Test
    testImplementation(Dependencies.SPRING_BOOT_STARTER_TEST)
}

tasks.withType<JavaCompile> {
    sourceCompatibility = Settings.JAVA_VERSION
    targetCompatibility = Settings.JAVA_VERSION
    options.encoding = Settings.UTF_8
}

tasks.test {
    useJUnitPlatform()
}
