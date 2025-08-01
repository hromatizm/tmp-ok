plugins {
    alias(libs.plugins.kotlin.jvm)
}

group = "ru.otuskotlin.marketplace"
version = "0.0.1"


repositories {
    mavenCentral()
}


dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}