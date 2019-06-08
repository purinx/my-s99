/**
 * P21 (*) Insert an element at a given position into a list.
 *   Example:
 *     scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
 *     res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
 **/
package S99

object P21 extends App {
  def insertAt(symbol: Symbol, index: Int, list: List[Symbol]): List[Symbol] = list match {
    case x if index == 0      => symbol :: x
    case x :: xs if index > 0 => x :: insertAt(symbol, index - 1, xs)
    case _                    => sys.error("")
  }
}
