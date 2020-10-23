plugins {
    id("application")
    id("java")
    id("com.diffplug.spotless") version "5.2.0"
}

repositories {
    jcenter()
}

tasks {
    withType<JavaCompile> {
        sourceCompatibility = "1.8"
        targetCompatibility = "1.8"
    }
}

configure<com.diffplug.gradle.spotless.SpotlessExtension> {
    kotlin {
        ktlint()
    }
    kotlinGradle {
        target("*.gradle.kts")
        ktlint("0.39.0")
    }
}
