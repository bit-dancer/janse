import com.github.gradle.node.yarn.task.YarnTask

plugins {
    `ui-conventions`
    node
}

val lintTask = tasks.register<YarnTask>("lintWebapp") {
    dependsOn(tasks.yarn)
    args.addAll("run", "lint")
}

val buildTask = tasks.register<YarnTask>("buildWebapp") {
    dependsOn(tasks.yarn, lintTask)
    args.addAll("run", "build")
}

var copyTask = tasks.register<Copy>("copyResources") {
    from("dist")
    into("build/resources/main/static")
}

tasks.jar {
    doFirst {
        delete("dist")
    }
    dependsOn(buildTask, copyTask)
}
