
// TaskProvider<Task>
val produceTask = tasks.register("produceAar") {
    outputs.file("produced/hello-world-release.aar")
    doLast {
        copy {
            from("../hello-world/build/outputs/aar/hello-world-release.aar")
            into("produced")
        }
    }
}

// Provider<File>
val produceFile = produceTask.map { it.outputs.files.singleFile }

configurations.create("producerConfiguration")

artifacts {
    add("producerConfiguration", produceFile) {
        builtBy(produceTask) // Probably not needed, but shouldn't hurt
    }
}