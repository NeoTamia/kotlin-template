import org.gradle.api.tasks.testing.logging.TestLogEvent
import org.gradle.internal.extensions.stdlib.capitalized
import org.gradle.kotlin.dsl.artifacts

plugins {
    kotlin("jvm")
    `maven-publish`
    `java-library`
}

group = "re.neotamia.kotlintemplate"
// x-release-please-start-version
version = "0.0.1"
// x-release-please-end

repositories {
    mavenCentral()
    mavenLocal()
    maven {
        name = "jitpack"
        url = uri("https://jitpack.io")
    }
    maven {
        name = "neotamiaReleases"
        url = uri("https://repo.neotamia.re/releases")
    }
    maven {
        name = "neotamiaSnapshots"
        url = uri("https://repo.neotamia.re/snapshots")
    }
    maven {
        name = "neotamiaPrivate"
        url = uri("https://repo.neotamia.re/private")
    }
}

dependencies {
    testImplementation(kotlin("test"))
}

java {
    withSourcesJar()
    withJavadocJar()
}

kotlin {
    jvmToolchain(21)
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()

    testLogging {
        events(
            TestLogEvent.FAILED,
            TestLogEvent.PASSED,
            TestLogEvent.SKIPPED
        )
    }
}

publishing {
    repositories {
        mavenLocal()
        maven {
            var repository = System.getProperty("repository.name", "snapshots")
            name = "neotamia${repository.capitalized()}"
            url = uri("https://repo.neotamia.re/${repository}")
            credentials(PasswordCredentials::class) {
                username = (findProperty("${name}Username") ?: System.getenv("MAVEN_USERNAME")) as String?
                password = (findProperty("${name}Password") ?: System.getenv("MAVEN_PASSWORD")) as String?
            }
        }
    }

    publications {
        create<MavenPublication>("mavenJava") {
            pom {
                name = "KotlinTemplate ${project.name}"
                description = "Kotlin Template, ${project.name} module."
                url = "https://github.com/NeoTamia/kotlin-template"
                developers {
                    developer {
                        id = "NeoTamia"
                        url = "https://github.com/NeoTamia"
                    }
                }
                scm {
                    connection = "scm:git:https://github.com/NeoTamia/kotlin-template.git"
                    developerConnection = "scm:git:ssh://git@github.com:NeoTamia/kotlin-template.git"
                    url = "https://github.com/NeoTamia/kotlin-template"
                }
            }
            from(components["java"])
            artifact(tasks.javadoc)
            artifact(tasks.kotlinSourcesJar)
        }
    }
}