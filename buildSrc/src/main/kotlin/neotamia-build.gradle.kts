import org.gradle.api.tasks.testing.logging.TestLogEvent

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
