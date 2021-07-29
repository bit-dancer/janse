object Versions {
    const val node = "3.1.0"
    const val lombok = "1.18.20"
    const val mapstruct = "1.3.1.Final"
    const val springBoot = "2.5.3"
    const val springOpenapi = "1.5.9"
    const val dependencyManagement = "1.0.11.RELEASE"

}

object Dependencies {
    /**
     * BOM
     */
    const val SPRING_BOOT_DEPENDENCIES = "org.springframework.boot:spring-boot-dependencies:${Versions.springBoot}"

    /**
     * Jar
     */
    const val MAPSTRUCT = "org.mapstruct:mapstruct:${Versions.mapstruct}"
    const val MAPSTRUCT_PROCESSOR = "org.mapstruct:mapstruct-processor:${Versions.mapstruct}"
    const val LOMBOK = "org.projectlombok:lombok:${Versions.lombok}"

    /**
     * SPRING
     */
    const val SPRING_OPENAPI = "org.springdoc:springdoc-openapi-ui:${Versions.springOpenapi}"
    const val SPRING_BOOT_STARTER_WEB = "org.springframework.boot:spring-boot-starter-web"
    const val SPRING_BOOT_STARTER_TEST = "org.springframework.boot:spring-boot-starter-test"
    const val SPRING_BOOT_STARTER_DATA_JPA = "org.springframework.boot:spring-boot-starter-data-jpa"

    /**
     * Other
     */

}
