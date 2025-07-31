plugins {
    alias(libs.plugins.kotlin.jvm)
    id("build-jvm")
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