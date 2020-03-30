import scala.sys.process._

name := "pair-rotation"
scalaVersion in ThisBuild := "2.13.1"

def PairProject(name: String): Project =
  Project(name, file(name))
    .settings(ScalaOptions.inCompile)

val model = PairProject("model")

val application = PairProject("application")
    .settings(mainClass := Some("swh30.application.Main"))
    .settings(Dependencies.application)
    .settings(fork in run := true)
    .dependsOn(model)

lazy val projects: Seq[ProjectReference] = Seq(
  model, 
  application
)

val root = project.in(file(".")) aggregate (projects: _*)