import org.apache.tools.ant.filters.ReplaceTokens

plugins {
    base
    java
}

description = "Just a demo"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
}



tasks.named<Jar>("jar") {
    manifest {
        attributes["Main-Class"] = "com.gradlehero.themepark.RideStatusService"
    }
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

/*
val generateDescriptions = tasks.register<Copy>("generateDescriptions") {
    from("descriptions")
    into(layout.buildDirectory.dir("descriptions"))
    filter<ReplaceTokens>("tokens" to mapOf("THEME_PARK_NAME" to "Grelephant's Wonder Worlds Arjun"))
}

tasks.register<Zip>("zipDescriptions") {
    from(generateDescriptions)
    destinationDirectory.set(layout.buildDirectory)
    archiveFileName.set("descriptions.zip")
}

*/