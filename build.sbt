lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.11.8"
    )),
    name := "Numerical Analysis"
  )
libraryDependencies += "org.scalatest" % "scalatest_2.11" % "3.0.1" % "test"
