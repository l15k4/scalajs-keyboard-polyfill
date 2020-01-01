import org.scalajs.sbtplugin.ScalaJSPlugin

enablePlugins(ScalaJSPlugin)
organization := "com.pragmaxim"
name := "scalajs-keyboard-polyfill"
version := "0.0.5"
scalaVersion := "2.12.10"
scalacOptions ++= Seq(
  "-unchecked", "-deprecation", "-feature", "-Xfatal-warnings",
  "-Xlint", "-Xfuture",
  "-Ywarn-adapted-args", "-Ywarn-inaccessible",
  "-Ywarn-nullary-override", "-Ywarn-nullary-unit", "-Yno-adapted-args"
)
libraryDependencies ++= Seq("org.scala-js" %%% "scalajs-dom" % "0.9.8")
publishMavenStyle := true
publishArtifact in Test := false
pomIncludeRepository := { _ => false }
homepage := Some(url(s"https://github.com/l15k4/scalajs-keyboard-polyfill/blob/master/README.md"))
licenses in ThisBuild += ("MIT", url("http://opensource.org/licenses/MIT"))
developers += Developer("l15k4", "Jakub Liska", "liska.jakub@gmail.com", url("https://github.com/l15k4"))
scmInfo := Some(ScmInfo(url(s"https://github.com/l15k4/scalajs-keyboard-polyfill"), s"git@github.com:l15k4/scalajs-keyboard-polyfill.git"))
bintrayVcsUrl := Some(s"git@github.com:l15k4/scalajs-keyboard-polyfill.git")
bintrayOrganization := Some("pragmaxim")
bintrayRepository := "maven"
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
