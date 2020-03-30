package swh30.domain

import swh30.model._

sealed trait PairService {
  def getPairsFromDevelopers(developers: List[Developer]): List[Pair]
  def decidePairs(developers: List[Developer]): List[Developer]
}

object PairService {
  case object RandomPair extends PairService {
    override def getPairsFromDevelopers(developers: List[Developer]): List[Pair] = {
      val pairs = developers.sliding(2, 2).toList
      pairs.map(pair =>
        if (pair.length == 2) Pair(pair.head, pair(1))
        else Pair(pair.head, Developer(""))
      )
    }

    override def decidePairs(developers: List[Developer]): List[Developer] = scala.util.Random.shuffle(developers)
  }
}
