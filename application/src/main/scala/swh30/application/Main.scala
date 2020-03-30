package swh30.application

import pureconfig._
import pureconfig.generic.auto._

object Main extends Logging {

  def main(args: Array[String]): Unit = {

    val config = ConfigSource.default.loadOrThrow[ApplicationConfig]

    println(config.developers.map(_.name))

  }

}
