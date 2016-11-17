# Grade-Tracker
A small application where you can put in grades from assignments (with weighting) to find out how many marks out of 100% you have

## Running Tasks
In this project, gradlew.bat is used to package everything. In order to use gradle you will need to use "./gradlew" to activate the .bat file. Inside build.gradle there are tasks that run individual classes (and more).

### Example - Running Grade Tracker Console ###

#### Task in build.gradle ####
```groovy
task gtConsole(type: JavaExec) {
    classpath sourceSets.main.runtimeClasspath
    main = "console.Main" // This is what the task will run (src/main/console/Main.java)
    standardInput = System.in // Used for console applications when using Gradle
}
```

#### Command in terminal to run gtConsole task ####
`./gradlew gtConsole`

#### Output from console ####
```java
:compileJava UP-TO-DATE                                                  
:processResources UP-TO-DATE
:classes UP-TO-DATE
:gtConsole

** -- Grade Tracker Console -- **
Type 'quit' to exit at any time
Enter in assignment weighting (numeric):
> Building 75% > :gtConsole
```

__NOTE: Use -q suffix to remove the 'Building 75% > :gtConsole__

#### Console task in quiet mode ####
```java
$ ./gradlew gtconsole -q
** -- Grade Tracker Console -- **
Type 'quit' to exit at any time
Enter in assignment weighting (numeric):
```
