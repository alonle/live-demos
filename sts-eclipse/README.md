Preparation

1. clone git://github.com/SpringSource/spring-integration.git
1. download eclipse for java developers
1. install gradle plugin (http://static.springsource.org/sts/docs/2.7.0.M1/reference/html/gradle/installation.html) 
1. install groovy plugin (http://groovy.codehaus.org/Eclipse+Plugin).

Demo

1. Import 2 projects: root and core spring-integration-core
2. Show that they build in eclipse and it's possible to run tests from eclipse
3. Import another project: spring-integration-twitter - demonstrate subsequent import
4. Demonstrate basic code completion: context menu on project -> Gradle -> enable DSL support, then ctrl+space inside repositories {} section.
5. Change dependency version (junit 4.8.2->4.10), refresh dependencies: project's context menu -> Gradle -> refresh dependencies. Show changed dependencies in referenced libraries.
6. Run compile task from Eclipse (show view-> Gradle tasks)