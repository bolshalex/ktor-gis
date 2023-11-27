plugins {
    id("org.siouan.frontend-jdk17") version "8.0.0"
    id("java")
}

group = "com.bolshalex"
version = "0.0.1"

java {
    targetCompatibility = JavaVersion.VERSION_17
}

buildscript {
    repositories {
        mavenCentral()
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
    }
}

frontend {
    nodeVersion.set("18.18.0")
    cleanScript.set("run clean")
    installScript.set("install")
    assembleScript.set("run build")
}

tasks.named("jar", Jar::class) {
    dependsOn("assembleFrontend")
    from("$buildDir/dist")
    into("static")
}
