import sbt.Keys._
import sbt._

object Dependencies {

  object Versions {
    val Logback        = "1.2.3"
    val PureConfig     = "0.12.2"
    val ScalaTest      = "3.2.0-M2"
  }

  object Libraries {
    val Logback          = "ch.qos.logback"        % "logback-classic"          % Versions.Logback
    val PureConfig       = "com.github.pureconfig" %% "pureconfig"              % Versions.PureConfig
    val ScalaTest        = "org.scalatest"         %% "scalatest"               % Versions.ScalaTest
  }

  lazy val application = libraryDependencies ++= Seq(
    Libraries.PureConfig,
    Libraries.Logback,
    Libraries.ScalaTest % Test
  )
}