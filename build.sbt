lazy val `sbt-web` = project in file(".")

description := "sbt web support"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.16",
  "org.webjars" % "webjars-locator-core" % "0.32",
  "org.specs2" %% "specs2-core" % "3.8.9" % "test",
  "junit" % "junit" % "4.12" % "test"
)
