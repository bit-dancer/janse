import org.gradle.api.artifacts.dsl.RepositoryHandler
import org.gradle.kotlin.dsl.maven

fun RepositoryHandler.aliyun() {
    maven("https://maven.aliyun.com/repository/public")
}

fun RepositoryHandler.spring() {
    maven("https://repo.spring.io/milestone/")
}
