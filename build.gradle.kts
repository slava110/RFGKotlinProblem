@file:Suppress("UnstableApiUsage")

plugins {
    kotlin("jvm") version "1.9.22"
    id("com.gtnewhorizons.retrofuturagradle") version "1.3.32"
}

group = "com.example.examplemod"
version = "1.0.0"

minecraft {
    mcVersion.set("1.12.2")
    mcpMappingChannel.set("stable")
    mcpMappingVersion.set("39")

    username.set("Developer")
}

repositories {
    mavenCentral()
    maven {
        url = uri("https://cursemaven.com")
        content {
            includeGroup("curse.maven")
        }
    }
}

dependencies {
    compileOnly(rfg.deobf("curse.maven:creativecore-257814:4722163"))
}

kotlin {
    jvmToolchain(8)
}