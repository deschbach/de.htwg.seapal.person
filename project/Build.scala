import sbt._
import Keys._
import play.Project._
import de.johoop.jacoco4sbt._
import JacocoPlugin._

object ApplicationBuild extends Build {

	val appName         = "person"
  	val appVersion      = "1.0-SNAPSHOT"

	// JaCoco settings  
  	lazy val jacocoSettings = Defaults.defaultSettings ++ Seq(jacoco.settings:_*)

  	val generalDependencies = Seq(
    	javaCore,
    	javaJdbc,
    	javaEbean,
    	"com.google.inject" % "guice" % "3.0",
    	"com.google.inject.extensions" % "guice-multibindings" % "3.0",
    	"util" % "util_2.10" % "1.0-SNAPSHOT"
 	)
 	
 	 // team component dependencies
  	val teamDependencies = Seq(
  		
  		// your project dependencies here...
  		//"boat" % "boat_2.10" % "1.0-SNAPSHOT"
  	)

	// all project dependencies
  	val appDependencies = generalDependencies ++ teamDependencies 
  	
	val main = play.Project(appName, appVersion, appDependencies, settings = jacocoSettings).settings(
  	
  		// disable parallel execution
   		parallelExecution in jacoco.Config := false,
  	
		// known as group id  	 
  		organization := "de.htwg.seapal", // group id...
  		
  		// disable using the Scala version in output paths and artifacts
		crossPaths := false,
		
		// add additional resovers
		resolvers += "HTWG Resolver" at "http://lenny2.in.htwg-konstanz.de:8081/artifactory/libs-snapshot-local",
		
		// add publishing target
		publishTo := Some("HTWG Publisher" at "http://lenny2.in.htwg-konstanz.de:8081/artifactory/libs-snapshot-local;build.timestamp=" + new java.util.Date().getTime),
		
		// setup entry points for sonar code analyzer
  		pomExtra :=
	  	<build>
	    	<sourceDirectory>app</sourceDirectory>
	    	<testSourceDirectory>test</testSourceDirectory>
	    	<resources>
	      		<resource>
	        		<directory>app</directory>
	      		</resource>
	    	</resources>
	  	</build>
	)
}
