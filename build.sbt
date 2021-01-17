name := "akka-essentials"

version := "0.1"

scalaVersion := "2.13.4"

val akkaVersion = "2.6.10"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.2"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.2" % "test"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.3" % Runtime

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
)