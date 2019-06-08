package S99
/**
  * P04 (*) Find the number of elements of a list.
  * Example:
  * scala> length(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 6
  */
object P04 extends App {
  def length[T](list: List[T]): Int = {
    @scala.annotation.tailrec
    def loop(cur: List[T], length: Int): Int = cur match {
      case Nil => length
      case _ => loop(cur.drop(1), length + 1)
    }
    loop(list, 0)
  }
}
