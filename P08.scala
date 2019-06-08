package S99
/**
  * P08 (**) Eliminate consecutive duplicates of list elements.
  * If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
  * Example:
  *
  * scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
  */
object P08 extends App {
  def compress[T](list: List[T]): List[T] = {
    @scala.annotation.tailrec
    def loop(cur: List[T], result: List[T]): List[T] = cur match {
      case Nil => result
      case l if result == Nil => loop(cur.drop(1), result :+ l.head)
      case l if l.head == result.last => loop(cur.drop(1), result)
      case _ => loop(cur.drop(1), result :+ cur.head)
    }
    loop(list, Nil)
  }
}
