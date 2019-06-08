package S99
/**
  * P31 (**) Determine whether a given integer number is prime.
  * scala> 7.isPrime
  * res0: Boolean = true
  */
import Math._

object P31 extends App {
  implicit class RichInt(self: Int) {
    def isPrime(): Boolean = {
      // nums: 2以上 √self 以下の奇数 & 2
      val nums: List[Int] = List
        .range(2, ceil(sqrt(self)).toInt + 1)
        .filter(_ % 2 != 0) :+ 2
      return nums.forall(self % _ != 0)
    }
  }
}
