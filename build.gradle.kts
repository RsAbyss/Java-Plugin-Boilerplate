import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    java
}

group = "com.abyss.plugin"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://jitpack.io")
    mavenCentral()
}

dependencies {
    implementation("com.github.RsAbyss:AbyssAPI:master-SNAPSHOT")
    testImplementation(kotlin("test"))
}

tasks.create("copyJar", Copy::class) {
    from(tasks.withType<Jar>())
    into("${System.getProperty("user.home")}\\OneDrive\\Documents\\Abyss")
}

tasks.withType<Jar> {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    from(configurations.runtimeClasspath.get().map { if(it.isDirectory) it else zipTree(it) })
    finalizedBy(tasks.named("copyJar"))
}


tasks.test {
    useJUnitPlatform()
}