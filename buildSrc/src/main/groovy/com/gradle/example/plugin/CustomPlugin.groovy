package com.gradle.example.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class CustomPlugin implements Plugin<Project> {

    @Override
    void apply(Project target) {
        def map = [description: "plugin tasks from buildSrc Module", group: "buildSrc plugin tasks"]

        target.task(map, "customPluginTask") {
            doLast {
                println "run plugin task from buildSrc Module"
            }
        }
    }
}