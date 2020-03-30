package swh30

import cats.syntax.functor._
import swh30.model._
import io.circe.generic.semiauto._
import io.circe.Decoder

package object json {

  implicit val DeveloperDecoder: Decoder[Developer] = deriveDecoder[Developer]
  implicit val PairDecoder: Decoder[Pair] = deriveDecoder[Pair]
  implicit val HistoryDecoder: Decoder[History] = deriveDecoder[History]
  implicit val DailyPairingDecoder: Decoder[DailyPairing] = deriveDecoder[DailyPairing]

  implicit val ModelDecoder: Decoder[Model] =
    List[Decoder[Model]](
      Decoder[Developer].widen,
      Decoder[Pair].widen,
      Decoder[History].widen,
      Decoder[DailyPairing].widen
    ).reduceLeft(_ or _)
}
