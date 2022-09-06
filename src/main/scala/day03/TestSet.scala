package day03

import scala.collection.mutable

object TestSet {
  def main(args: Array[String]): Unit = {
    val set: Set[Int] = Set(1,2,3,4,5)
    //当set长度小于等于4，set类型会发生变化
    val set1: Set[Int] = set+123
    val bool: Boolean = set1.contains(22)



    val set2: mutable.Set[Int] = mutable.Set(1,2,3,4,5)
    val bool1: Boolean = set2.add(222)
    set2.remove(3)
    set2.foreach(println)
    val str: String = set2.mkString(",")
    println(str)
  }
}
