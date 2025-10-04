// The settings file is the entry point of every Gradle build.
// Its primary purpose is to define the subprojects.
// It is also used for some aspects of project-wide configuration, like managing plugins, dependencies, etc.
// https://docs.gradle.org/current/userguide/settings_file_basics.html

dependencyResolutionManagement {
    // Use Maven Central as the default repository (where Gradle will download dependencies) in all subprojects.
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
    }
}

plugins {
    // Use the Foojay Toolchains plugin to automatically download JDKs required by subprojects.
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.10.0"
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
rootProject.name = "kotlin-template"

file("modules").listFiles()?.forEach { file ->
    if (file.isDirectory and !file.name.equals("build")) {
        println("Include modules:${file.name}")
        include(":modules:${file.name}")
        project(":modules:${file.name}").name = "${rootProject.name}-${file.name}"
    }
}