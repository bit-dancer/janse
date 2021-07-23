plugins {
    id(Plugins.CONVENTIONS_JAVA_APPLICATION)
    id(Plugins.SPRING_BOOT) version Versions.SPRING_BOOT_VERSION
    id(Plugins.DEPENDENCY_MANAGEMENT) version Versions.DEPENDENCY_MANAGEMENT_VERSION
}

group = "cn.bitdancer.janse"
version = "0.0.1-SNAPSHOT"

dependencies {
    api(project(":janse-core"))
    runtimeOnly(project(":janse-ui"))

    implementation(Dependencies.SPRING_BOOT_STARTER_WEB)
}
