package swh30.domain

import swh30.model._
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import swh30.domain.PairService.RandomPair

class PairServiceSpec extends AnyWordSpec with Matchers {
  "PairService" should {

    val developers = List(
      Developer("Steve"),
      Developer("Piotr"),
      Developer("Brian"),
      Developer("Binita")
    )

    val expectedPairs = List(
      Pair(Developer("Steve"), Developer("Piotr")),
      Pair(Developer("Brian"), Developer("Binita"))
    )

    "split a list of developers into pairs" in {

      val actualPairs = RandomPair.getPairsFromDevelopers(developers)

      actualPairs shouldEqual expectedPairs
    }

    "decide pairs by randomising developer input" in {
      val randomPairs = RandomPair.decidePairs(developers)

      randomPairs should contain theSameElementsAs developers
    }

  }
}
