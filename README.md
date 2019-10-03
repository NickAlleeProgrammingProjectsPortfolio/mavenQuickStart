# mavenQuickStart
sample project to use for maven quickstart project

What I have learned:
maven uses a specific filesystem. 
.java files are located in src/main/java/packagename/
Use mvn compile to comple.
use mvn package to package the application into a jar file.
Use the X flag to debug. Use | > log.txt to pipe it to a txt file.
The packaged jar file is in /target
To run the file you must use java then the jar file followed by the package name with all the dots. Example below:
$ java -cp maven-quick-start-1.0.jar clinic.programming.training.Application

Use mvn clean to clean the maven build. This removes the /target folder. 
use mvn clean install to build the jar file in the /target folder but also put the jar file into the local maven repository
the local maven repo is located in users/yourusername/m2
dependancies goe in the local maven repo too. these are for anything that needed to be downloaded during the maven lifecyclse that have been executed.

plugins add more functionality and features
maven calls plugins and are dependancies
examples:
	compiling source code
	run unit tests
	publish to artifact repo
	deploy to remote server
	publish documentation
maven comes with basic core programs and are downloaded automaticly
some must be specificly mentioned in the pom file.
plugin documentation can be found at maven.apache.org

maven supports 6 scopes but 4 are commonly uesed
compile - default scope. required for compilation and execution. included in containers
runtime - needed for runtime but not for compilation. included in containers
tests - for dependancies needed during unit testings.
provided - tells maven that the dependancies will be provided by the web app or target system
system - rarly used. tells maven about dependancies that are local . should be avoided. only for unshared dependancies.
import - rarely used. used in specialized cases to import or replace dependancies in other projects.

mostly working with compile and test scopes
sometimes compile and runtime.

to look for dependancies use maven centeral repository. search.maven.org
if you need to use a dependency its not enough to just put it in the java code as an import.
you must also put the dependency code for the particular dependency into the pom file.

Other info:
