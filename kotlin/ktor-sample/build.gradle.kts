plugins {
    application
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.kotlinSerialization)
}

group = "com.example"
version = "0.0.1"
application {
    mainClass.set("com.example.ApplicationKt")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation libs.bundles.ktor
    implementation libs.bundles.logback
    implementation libs.koin

    implementation libs.prometheus
    
    testImplementation libs.bundles.ktorTest
    testImplementation libs.kotlinTest
}