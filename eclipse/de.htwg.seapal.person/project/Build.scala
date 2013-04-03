import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "person"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean,
    //"util" % "util_2.10" % "1.0-SNAPSHOT",
    "com.google.inject" % "guice" % "3.0",
    "com.google.inject.extensions" % "guice-multibindings" % "3.0"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here
    //resolvers += "HTWG Repo" at "http://lenny2.in.htwg-konstanz.de:8081/artifactory/libs-snapshot-local",
    //publishTo := Some("HTWG Repo" at "http://lenny2.in.htwg-konstanz.de:8081/artifactory/libs-snapshot-local;build.timestamp=" + new java.util.Date().getTime)      
  )

}
