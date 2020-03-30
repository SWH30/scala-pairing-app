package swh30.model

case class History(pairHistory: List[DailyPairing]) extends Model

case class DailyPairing(pairs: List[Pair]) extends Model
