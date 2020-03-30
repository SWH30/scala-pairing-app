package swh30.application

import org.slf4j.{Logger, LoggerFactory}

trait Logging {

  lazy val logger: Logger = LoggerFactory.getLogger(this.getClass.getName)

}