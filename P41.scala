package S99
/**
  * P41 (**) A list of Goldbach compositions.
  * Given a range of integers by its lower and upper limit, print a list of all even numbers and their Goldbach composition.
  * scala> printGoldbachList(10 to 20)
  * 10 = 3 + 7
  * 12 = 5 + 7
  * 14 = 3 + 11
  * 16 = 3 + 13
  * 18 = 5 + 13
  * 20 = 3 + 17
  */
import Math._
import S99.P31._

object P41 extends App {
  def printGoldbachList(start: Int, end: Int): Unit = {
    def loop(a: Int, border: Int) :Unit = border match {
      case b if b.isPrime && (a-b).isPrime => print(s"${a} = ${b} + ${a-b}\n")
      case b if a > b => loop(a, b+1)
      case _ => print(s"${a} can't find prime pair\n")
    }
    List.range(start, end).filter(_ % 2 == 0).foreach{i => loop(i, 2) }
  }
}
