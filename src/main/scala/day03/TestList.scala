package day03

object TestList {
  def main(args: Array[String]): Unit = {
    val list1: List[Int] = List(1, 2, 3, 4, 5, 6, 7)
    val list2: List[Int] = List(4, 5, 6, 7, 8, 9, 10)
//    （1）获取集合的头
    val head: Int = list1.head
    println(head)
//    （2）获取集合的尾（不是头的就是尾）
    val tail: List[Int] = list1.tail
    println(tail)
//    （3）集合最后一个数据
    val last: Int = list1.last
//    （4）集合初始数据（不包含最后一个）
    val init: List[Int] = list1.init
    println(init +"4" )
//    （5）反转
    val reverse: List[Int] = list1.reverse
//    （6）取前（后）n个元素
    val ints: List[Int] = list1.take(3)
//    （7）去掉前（后）n个元素
    val ints1: List[Int] = list1.drop(3)
//    （8）并集
    val ints2: List[Int] = list1.union(list2)
//    （9）交集
    println(list1.intersect(list2))
//    （10）差集
    println(list1.diff(list2))

//    （11）拉链
    println(list1.zip(list2))
//    （12）滑窗
    var maxval = Int.MinValue
    val iterator: Iterator[List[Int]] = list1.sliding(3)
    iterator.foreach(e=>{
      maxval=if(e.sum>maxval) {
        e.sum
      }else{
        maxval
      }
    })
    println(list1.reduceLeft(_ + _))
    println(list1.fold(2)(_ + _))
    println(list1.foldLeft(2)((x, y) => x - y))
    println(list1.foldRight(2)((x, y) => x - y))
  }
}
