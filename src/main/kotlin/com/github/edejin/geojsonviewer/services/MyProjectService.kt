package com.github.edejin.geojsonviewer.services

import com.github.edejin.geojsonviewer.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
