import org.scalajs.sbtplugin.ScalaJSPlugin

enablePlugins(ScalaJSPlugin)
organization := "com.pragmaxim"
name := "scalajs-keyboard-polyfill"
version := "0.0.5-SNAPSHOT"
scalaVersion := "2.12.10"
scalacOptions ++= Seq(
  "-unchecked", "-deprecation", "-feature", "-Xfatal-warnings",
  "-Xlint", "-Xfuture",
  "-Ywarn-adapted-args", "-Ywarn-inaccessible",
  "-Ywarn-nullary-override", "-Ywarn-nullary-unit", "-Yno-adapted-args"
)
libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.8"
)

publishMavenStyle := true
publishArtifact in Test := false
pomIncludeRepository := { _ => false }
publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}
pomExtra :=
  <url>https://github.com/l15k4/scalajs-keyboard-polyfill</url>
    <licenses>
      <license>
        <name>The MIT License (MIT)</name>
        <url>http://opensource.org/licenses/MIT</url>
        <distribution>repo</distribution>
      </license>
    </licenses>
    <scm>
      <url>git@github.com:l15k4/scalajs-keyboard-polyfill.git</url>
      <connection>scm:git:git@github.com:l15k4/scalajs-keyboard-polyfill.git</connection>
    </scm>
    <developers>
      <developer>
        <id>l15k4</id>
        <name>Jakub Liska</name>
        <email>liska.jakub@gmail.com</email>
      </developer>
    </developers>
