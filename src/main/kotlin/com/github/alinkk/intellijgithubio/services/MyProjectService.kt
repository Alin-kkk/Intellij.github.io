package com.github.alinkk.intellijgithubio.services

import com.github.alinkk.intellijgithubio.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
