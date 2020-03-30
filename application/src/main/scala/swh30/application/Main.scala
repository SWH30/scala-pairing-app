package swh30.application

import pureconfig._
import pureconfig.generic.auto._
import swh30.domain.PairService.RandomPair

object Main {

  def main(args: Array[String]): Unit = {

    val config = ConfigSource.default.loadOrThrow[ApplicationConfig]

    val sortedDevelopers = RandomPair.decidePairs(config.developers)

    val pairings = RandomPair.getPairsFromDevelopers(sortedDevelopers)

    println(pairings)

  }

}
