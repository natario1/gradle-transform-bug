plugins {
    id("com.android.library")
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
}

val buildAar by tasks.registering {
    dependsOn("assembleRelease")
}