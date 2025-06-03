plugins {
    kotlin("jvm") apply false
}

group = "ru.otuskotlin.marketplace"
version = "1.0-SNAPSHOT"

subprojects {
    group = rootProject.group
    version = rootProject.version
}

allprojects {
    repositories {
        mavenCentral()
    }
}
