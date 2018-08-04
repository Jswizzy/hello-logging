import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm") version "1.2.60"
}

group = "com.example.com"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    implementation("org.slf4j", "slf4j-api", "1.7.25")
    implementation("org.apache.logging.log4j", "log4j-slf4j-impl", "2.11.1")
    implementation("org.apache.logging.log4j", "log4j-api", "2.11.1")
    implementation("org.apache.logging.log4j", "log4j-core", "2.11.1")

    testImplementation("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}