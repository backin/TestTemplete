package com.github.backin.testtemplete.services

import com.intellij.openapi.project.Project
import com.github.backin.testtemplete.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
