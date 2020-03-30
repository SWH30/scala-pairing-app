name := "pair-rotation"
scalaVersion in ThisBuild := "2.13.1"

val root = project.in(file("."))

def PairProject(name: String): Project =
  Project(name, file(name))
    .settings(ScalaOptions.inCompile)

val model = PairProject("model")
