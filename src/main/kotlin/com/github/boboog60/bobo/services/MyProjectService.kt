package com.github.boboog60.bobo.services

import com.intellij.openapi.project.Project
import com.github.boboog60.bobo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
