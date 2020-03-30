import sbt.Keys._
import sbt._

object Dependencies {

  object Versions {
    val PureConfig = "0.12.2"
    val ScalaTest  = "3.1.1"
    val Circe      = "0.12.3"
  }

  object Libraries {
    val PureConfig = "com.github.pureconfig" %% "pureconfig" % Versions.PureConfig
    val ScalaTest  = "org.scalatest"         %% "scalatest"  % Versions.ScalaTest
    object Circe {
      val Core    = "io.circe" %% "circe-core"    % Versions.Circe
      val Generic = "io.circe" %% "circe-generic" % Versions.Circe
      val Parser  = "io.circe" %% "circe-parser"  % Versions.Circe
    }
  }

  lazy val application = libraryDependencies ++= Seq(
    Libraries.PureConfig,
    Libraries.ScalaTest % Test
  )

  lazy val domain = libraryDependencies ++= Seq(
    Libraries.ScalaTest
  )

  lazy val json = libraryDependencies ++= Seq(
    Libraries.Circe.Core,
    Libraries.Circe.Generic,
    Libraries.Circe.Parser
  )
}
