import sbt._
import sbt.Keys._
import scala.scalajs.sbtplugin.ScalaJSPlugin._

object Build extends sbt.Build {

  lazy val `scalajs-keyboard-polyfill` =
    project.in(file("."))
      .settings(scalaJSSettings:_*)
      .settings(
        organization := "com.viagraphs",
        name := "scalajs-keyboard-polyfill",
        version := "0.0.1",
        scalaVersion := "2.11.2",
        scalacOptions ++= Seq("-unchecked", "-feature"),
        libraryDependencies ++= Seq(
          "org.scala-lang.modules.scalajs" %%% "scalajs-dom" % "0.7-SNAPSHOT"
        )
      )
}