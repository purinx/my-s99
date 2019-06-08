import scala.collection._
import scala.annotation.tailrec

object P08 extends App {
  def compress(list: List[Symbol]): List[Symbol] = {
    @tailrec
    def set(list: List[Symbol], index: Int, que: List[Symbol]): List[Symbol] = {
      if(index == list.size) {
        que
      }else if (list(index) == list(index - 1)) {
        set(list,index+1, que)
      }else{
        set(list, index+1, que:+list(index))
      }
    }
    set(list, 1, List(list.head))
  }
}
