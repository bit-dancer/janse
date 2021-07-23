import com.github.gradle.node.yarn.task.YarnTask

plugins {
    id(Plugins.CONVENTIONS_NODE_UI)
    id(Plugins.NODE) version Versions.PLUGIN_NODE_VERSION
}

val lintTask = tasks.register<YarnTask>("lintWebapp") {
    dependsOn(tasks.yarn)
    args.addAll(Settings.COMMAND_UI_LINT)
}

val buildTask = tasks.register<YarnTask>("buildWebapp") {
    dependsOn(tasks.yarn, lintTask)
    args.addAll(Settings.COMMAND_UI_BUILD)
}

var copyTask = tasks.register<Copy>("copyResources") {
    from(Settings.UI_DEFAULT_OUTPUT_DIR)
    into(Settings.UI_BUILD_OUTPUT_DIR)
}

tasks.jar {
    doFirst {
        delete(Settings.UI_DEFAULT_OUTPUT_DIR)
    }
    dependsOn(buildTask, copyTask)
}
