plugins {
    id("neotamia-build")
}

extra["localJarRepo"] = true

publishing {
    publications {
        named<MavenPublication>("mavenJava") {
            description = "Kotlin Template, core module."
        }
    }
}