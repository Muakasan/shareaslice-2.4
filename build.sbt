name := """shareaslice"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  //jdbc, should this be here?
  cache,
  ws,
  specs2 % Test,
  "com.typesafe.play" %% "play-slick" % "1.1.1",	
  "com.typesafe.play" %% "play-slick-evolutions" % "1.1.1",
  "org.postgresql" % "postgresql" % "9.3-1100-jdbc4"
  )

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
