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



Other info:
