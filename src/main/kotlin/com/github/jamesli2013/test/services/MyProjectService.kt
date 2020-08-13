package com.github.jamesli2013.test.services

import com.intellij.openapi.project.Project
import com.github.jamesli2013.test.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
