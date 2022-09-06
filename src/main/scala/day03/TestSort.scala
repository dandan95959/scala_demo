package day03

import scala.collection.mutable.ListBuffer

object TestSort {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 5, -3, 4, 2, -7, 6)
    val list1: ListBuffer[Int] = ListBuffer(1, 5, -3, 4, 2, -7, 6)
    list.sorted(Ordering.Int.reverse)
    list1.sorted(Ordering[Int].reverse)
    val tuples = List(("hello", 10), ("world", 2), ("scala", 9), ("haha", 4),("hello", 1))
    tuples.sortBy(_._2)(Ordering[Int].reverse)
    tuples.sortWith((left,right)=>left._2<right._2)
    tuples.sortWith(_._2>_._2)
//    println(list)
    val list11: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

    val nestedList: List[List[Int]] = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))

    val wordList: List[String] = List("hello world", "hello atguigu", "hello scala")
    println(list11.filter(x => x % 2 == 0))
    println(list.map(x => x + 1))
    println(nestedList.flatten)
    println(list11.groupBy(x => x % 2))



  }
}
