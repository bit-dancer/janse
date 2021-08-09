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
    implementation("com.baomidou:mybatis-plus-boot-starter:3.3.1.tmp")
    implementation("org.postgresql:postgresql:9.4.1212")
    implementation("org.springframework.boot:spring-boot-starter-log4j2")
    implementation("mysql:mysql-connector-java:6.0.6")
    implementation("cn.dev33:sa-token-spring-boot-starter:1.24.0")
    implementation("com.alibaba:fastjson:1.2.76")
}
