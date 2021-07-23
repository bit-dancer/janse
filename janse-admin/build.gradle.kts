plugins {
    id(Plugins.CONVENTIONS_JAVA_APPLICATION)
    id(Plugins.SPRING_BOOT) version Versions.SPRING_BOOT_VERSION
    id(Plugins.DEPENDENCY_MANAGEMENT) version "1.0.11.RELEASE"
}

group = "cn.bitdancer.janse"
version = "0.0.1-SNAPSHOT"

dependencies {
    api(project(":janse-core"))
    // 正式发版时取消注释
//    api(project(":janse-ui"))

    implementation(Dependencies.SPRING_BOOT_STARTER_WEB)
    testImplementation(Dependencies.SPRING_BOOT_STARTER_TEST)
}
