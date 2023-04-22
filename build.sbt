name := "scala3.validator"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.3.0-RC4"
libraryDependencies ++= {
  Seq(
    "com.lihaoyi" %% "ujson" % "3.1.0" % Test,
    "org.scalatest" %% "scalatest" % "3.2.15" % Test
  )
}
