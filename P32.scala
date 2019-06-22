package S99

import scala.annotation.tailrec

/**
  * gcd: Greatest common divisor
  *  最大公約数。
  **/
object P32 extends App {
  @tailrec
  def gcd(a: Int, b:Int): Int = (a, b) match {
    case (a, 0) => a
    case (a, b) => gcd(b, a % b)
  }
}
