package S99

import scala.annotation.tailrec

class Util {
  def last[T](list: List[T]): T = list match {
    case x :: Nil   => x
    case x :: xs    => last(xs)
  }

  def length[T](list: List[T]): Int = {
    def loop(list:List[T], n:Int):Int = list match {
      case x :: xs => loop(xs, n+1)
      case Nil     => n
    }
    loop(list, 0)
  }

  def nth[T](index: Int, list: List[T]):T = list match {
    case x :: _ if index == 0   => x
    case _ :: xs if index > 0   => nth(index -1, xs)
    case _                      => sys.error("")
  }

  def reverse[T](list: List[T]): List[T] = {
    def loop(rem: List[T], acc: List[T]): List[T] = rem match {
      case Nil      => acc
      case x :: xs  => loop(xs, x :: acc)
    }
    loop(list, Nil)
  }
}
