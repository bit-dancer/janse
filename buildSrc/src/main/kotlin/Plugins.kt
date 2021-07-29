@file:Suppress("ObjectPropertyName")

import org.gradle.kotlin.dsl.version

/**
 * Application Conventions Plugin
 */
inline val org.gradle.plugin.use.PluginDependenciesSpec.`application-conventions`: org.gradle.plugin.use.PluginDependencySpec
    get() = id("janse.application-conventions")

/**
 * Library Conventions Plugin
 */
inline val org.gradle.plugin.use.PluginDependenciesSpec.`library-conventions`: org.gradle.plugin.use.PluginDependencySpec
    get() = id("janse.library-conventions")

/**
 * UI Conventions Plugin
 */
inline val org.gradle.plugin.use.PluginDependenciesSpec.`ui-conventions`: org.gradle.plugin.use.PluginDependencySpec
    get() = id("janse.ui-conventions")

/**
 * Node Plugin
 * @see <a href="https://github.com/node-gradle/gradle-node-plugin">https://github.com/node-gradle/gradle-node-plugin</a>
 */
inline val org.gradle.plugin.use.PluginDependenciesSpec.node: org.gradle.plugin.use.PluginDependencySpec
    get() = id("com.github.node-gradle.node") version Versions.node

/**
 * Spring Boot Plugin
 */
inline val org.gradle.plugin.use.PluginDependenciesSpec.`spring-boot`: org.gradle.plugin.use.PluginDependencySpec
    get() = id("org.springframework.boot") version Versions.springBoot

/**
 * Dependency Management Plugin
 */
inline val org.gradle.plugin.use.PluginDependenciesSpec.`dependency-management`: org.gradle.plugin.use.PluginDependencySpec
    get() = id("io.spring.dependency-management") version Versions.dependencyManagement
