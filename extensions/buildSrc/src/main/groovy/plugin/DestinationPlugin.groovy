package plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

import org.gradle.api.tasks.bundling.Zip

import org.gradle.api.internal.Instantiator

class DestinationPlugin implements Plugin<Project> {
    void apply(Project project) {
        
        project.extensions.destination = new Destination()
        
        project.tasks.withType(Zip).all {
            it.conventionMapping.destinationDir = { project.file(project.destination.path) }
        }

        project.task("pluginZip", type: Zip) {
          from "some2.txt"
          baseName name
        }
    }
}