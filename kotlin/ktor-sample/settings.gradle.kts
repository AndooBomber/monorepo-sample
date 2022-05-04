rootProject.name = "ktor-sample"

dependencyResolutionManagement {
    versionCatalogs {
        libs {
            from(files("../gradle/libs.versions.toml"))
        }
    }
    repositories {
        mavenCentral()
    }
}