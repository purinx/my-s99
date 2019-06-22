package S99

import P32.gcd

/**
  * P34 (**) Calculate Euler's totient function phi(m).
  * Euler's so-called totient function phi(m) is defined as the number of positive integers r (1 <= r <= m) that are coprime to m.
  * scala> 10.totient
  * res0: Int = 4
  **/
object P34 extends App {

  implicit class RichInt(self: Int) {
    def totient: Int = 1 to self count (gcd(self, _) == 1)
  }

}
