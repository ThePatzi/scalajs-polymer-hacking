import sbt.Keys._
import sbt._

lazy val buildJSAndCopy = taskKey[Unit]("Build JS and copy task")

buildJSAndCopy := {
  val inputValue = (fastOptJS in Compile).value
  val source = inputValue.data

  val destination = file(".") / "webapp" / "src" / "scala-js-output.js"

  IO.copyFile(source, destination)
}

lazy val root: Project = (project in file("."))
  .settings(
    name := "ScalaJS-PolymerTest",
    version := "1.0",
    scalaVersion := "2.12.0",
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "0.9.1",
      "be.doeraene" %%% "scalajs-jquery" % "0.9.1"
    ),
    skip in packageJSDependencies := false,
    jsDependencies += "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js"
  )
  .enablePlugins(ScalaJSPlugin)

fork in run := true