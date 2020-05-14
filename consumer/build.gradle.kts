plugins {
    id("com.android.application")
    id("kotlin-android")
}


android {
    setCompileSdkVersion(29)
    defaultConfig {
        setMinSdkVersion(18)
        setTargetSdkVersion(29)
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.71")
    implementation(project(":producer", configuration = "producerConfiguration"))
}

// Running this task will fail because the aar file is not produced by producer.
// It will only work if you manually run the producing task (./gradlew producer:produceAar).
tasks.register("consumeAar") {
    dependsOn("build")
}
