package S99

/**
  * P07 (**) Flatten a nested list structure.
  * Example:
  * scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
  * res0: List[Any] = List(1, 1, 2, 3, 5, 8)
  */
object P07 extends App {
  def flatten(list: List[Any]): List[Any] = list match {
    case (x: List[_]) :: xs => flatten(x) ::: flatten(xs)
    case x :: xs => x :: flatten(xs)
    case Nil => Nil
  }
}
