package ru.clevertec.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project

class CustomPlugin implements Plugin<Project> {
    @Override
    void apply(Project target) {
        addGoodBy(target)
    }

    static void addGoodBy(Project target) {
        def map = [description: "goodBy task", group: "ru.clevertec", type: DefaultTask]
        target.task(map, "goodBy") {
            println("Hello! I showed up, what should I do now?")
            println("Good By!")
            println("task: $description, group: $group, path: $path")
        }
    }
}