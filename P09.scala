package S99

/**
  * P09 (**) Pack consecutive duplicates of list elements into sublists.
  * If a list contains repeated elements they should be placed in separate sublists.
  * Example:
  *
  * scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  */
object P09 {
  def pack[T](list: List[T]): List[List[T]] = list.foldLeft(Nil: List[List[T]]) { (acc, cur) =>
    cur match {
      case _ if acc == Nil => List(List(cur))
      case i if i == acc.last.last => acc.dropRight(1):+(acc.last:+cur)
      case _ => acc :+ List(cur)
    }
  }
}
