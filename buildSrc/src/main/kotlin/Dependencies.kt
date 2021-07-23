/**
 * 依赖管理
 *
 * @author D.Yang
 * @date 2021/1/5
 */
object Dependencies {
    /**
     * BOM
     */
    const val SPRING_BOOT_DEPENDENCIES = "org.springframework.boot:spring-boot-dependencies:${Versions.SPRING_BOOT_VERSION}"

    /**
     * Jar
     */
    const val MAPSTRUCT = "org.mapstruct:mapstruct:${Versions.MAPSTRUCT_VERSION}"
    const val MAPSTRUCT_PROCESSOR = "org.mapstruct:mapstruct-processor:${Versions.MAPSTRUCT_VERSION}"
    const val LOMBOK = "org.projectlombok:lombok"

    /**
     * SPRING
     */
    const val SPRING_BOOT_CONFIGURATION_PROCESSOR = "org.springframework.boot:spring-boot-configuration-processor"
    const val SPRING_BOOT_STARTER_WEB = "org.springframework.boot:spring-boot-starter-web"
    const val SPRING_BOOT_STARTER_TEST = "org.springframework.boot:spring-boot-starter-test"
    const val SPRING_BOOT_STARTER_ACTUATOR = "org.springframework.boot:spring-boot-starter-actuator"
    const val MICROMETER_REGISTRY_PROMETHEUS = "io.micrometer:micrometer-registry-prometheus"

    /**
     * Other
     */

}
