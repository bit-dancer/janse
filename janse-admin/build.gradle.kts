plugins {
    id("janse.java-application-conventions")
}

dependencies {
    api(project (":janse-core"))
}

application {
    mainClass.set("janse.app.App")
}
