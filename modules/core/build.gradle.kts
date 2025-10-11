plugins {
    id("neotamia-build")
}

extra["localJarRepo"] = true

publishing {
    publications {
        remove(named<MavenPublication>("mavenJava").get())
    }
}