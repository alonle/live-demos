package org.gradle.deps

import org.gradle.api.internal.project.DefaultProject
import org.gradle.groovy.scripts.StringScriptSource
import org.gradle.testfixtures.internal.GlobalTestServices
import org.gradle.api.internal.AsmBackedClassGenerator
import org.gradle.testfixtures.internal.ProjectBuilderImpl
import org.gradle.api.Project
import com.sun.org.apache.xml.internal.security.utils.resolver.implementations.ResolverFragment
import org.gradle.api.internal.artifacts.ResolverFactory

/**
 * Created by IntelliJ IDEA.
 * User: hans
 * Date: 11/16/11
 * Time: 11:40 AM
 * To change this template use File | Settings | File Templates.
 */
class Tester {
    public static void main(String[] args) {
        ProjectBuilderImpl builder = new ProjectBuilderImpl()
        Project project = builder.createProject("foo", new File("."))
        ResolverFactory resolverFactory = project.repositories.resolverFactory

        project.griffonHome = { project.repositories.mavenCentral() }

        Closure foo = {
            println status
            griffonHome()
        }
        foo.resolveStrategy = Closure.DELEGATE_FIRST
        foo.delegate = project
        project.repositories foo

//        project.repositories {
//            mavenRepo(url: 'http://repo.gradle.org/gradle/libs')
//        }
        project.configurations {
            classpath
        }
        project.dependencies {
            classpath "junit:junit:4.8.2"
        }
        project.configurations.classpath.each { println it }
    }


}
