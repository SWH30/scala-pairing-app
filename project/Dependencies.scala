import sbt.Keys._
import sbt._

object Dependencies {

  object Versions {
    val PureConfig     = "0.12.2"
    val ScalaTest      = "3.1.1"
  }

  object Libraries {
    val PureConfig       = "com.github.pureconfig" %% "pureconfig"              % Versions.PureConfig
    val ScalaTest        = "org.scalatest"         %% "scalatest"               % Versions.ScalaTest
  }

  lazy val application = libraryDependencies ++= Seq(
    Libraries.PureConfig,
    Libraries.ScalaTest % Test
  )

  lazy val domain = libraryDependencies ++= Seq(
    Libraries.ScalaTest
  )
}