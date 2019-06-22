package S99
/**
  * P31 (**) Determine whether a given integer number is prime.
  * scala> 7.isPrime
  * res0: Boolean = true
  */
import Math._
import scalaz.Memo

object P31 extends App {
  def loop(m: Int)(i: Int): Boolean = (m, i) match {
    case (m, i) if m%i == 0 => false
    case (m, i) if pow(i, 2) > m =>  true
    case (m, i) => loop(m)(i + 2)
  }
  implicit class RichInt(self: Int) {
    def isPrime: Int => Boolean =  Memo.mutableHashMapMemo {
      case 2 => true
      case n if n < 2 => false
      case n if n % 2 == 0 => false
      case n => loop(n)(3)
    }
  }
}
