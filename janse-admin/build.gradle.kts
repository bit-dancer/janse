plugins {
    `application-conventions`
    `spring-boot`
    `dependency-management`
}

group = "cn.bitdancer.janse"
version = "0.0.1-SNAPSHOT"

dependencies {
    api(project(":janse-core"))
    runtimeOnly(project(":janse-ui"))

    implementation(Dependencies.SPRING_BOOT_STARTER_WEB)
    implementation(Dependencies.SPRING_BOOT_STARTER_DATA_JPA)
    implementation(Dependencies.SPRING_OPENAPI)
    testImplementation(Dependencies.SPRING_BOOT_STARTER_TEST)
}
