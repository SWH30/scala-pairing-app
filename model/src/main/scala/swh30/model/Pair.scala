package swh30.model

final case class Pair(primary: Developer, secondary: Developer) extends Model {
  override def toString: String = s"Primary: $primary - Secondary: $secondary"
}
