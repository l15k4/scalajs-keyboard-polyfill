import sbt._
import sbt.Keys._
import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._

object Build extends sbt.Build {

  lazy val `scalajs-keyboard-polyfill` =
    project.in(file("."))
      .enablePlugins(ScalaJSPlugin)
      .settings(
        organization := "com.viagraphs",
        name := "scalajs-keyboard-polyfill",
        version := "0.0.3-SNAPSHOT",
        scalaVersion := "2.11.4",
        scalacOptions ++= Seq("-unchecked", "-feature"),
        libraryDependencies ++= Seq(
          "org.scala-js" %%% "scalajs-dom" % "0.7.1-SNAPSHOT"
        )
      )
}