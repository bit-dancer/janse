import com.github.gradle.node.yarn.task.YarnTask

plugins {
    id(Plugins.CONVENTIONS_NODE_UI)
    id("com.github.node-gradle.node") version "3.1.0"
}

val lintTask = tasks.register<YarnTask>("lintWebapp") {
    dependsOn(tasks.yarn)
    args.addAll("run", "lint")
}

val buildTask = tasks.register<YarnTask>("buildWebapp") {
    dependsOn(tasks.yarn, lintTask)
    args.addAll("run", "build")
}

var copyResources = tasks.register<Copy>("copyResources") {
    from("dist")
    into("build/resources/main/static")
}

tasks.jar {
    doFirst {
        delete("dist")
    }
    dependsOn(buildTask, copyResources)
}
