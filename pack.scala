object Pack extends App {
  def pack(list: List[Symbol]): List[List[Symbol]] = {
    def repeat(list:List[Symbol],
               subList:List[Symbol],
               index:Int,
               que:List[List[Symbol]]
              ):List[List[Symbol]]={
      if(index>=list.size) {
        return que
      }else if(list(index)==list(index-1)){
        repeat(list, subList:+list(index), index+1, que)
      }else{
        repeat(list, List(list(index)),index+1, que:+subList)
      }
    }
    repeat(list, List(list(1)), 1, Nil)
  }
  println(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
}