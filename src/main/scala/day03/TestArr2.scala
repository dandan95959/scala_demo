package day03

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object TestArr2 {
  def main(args: Array[String]): Unit = {
    val ints = ArrayBuffer[Int](1, 2, 3, 4, 5, 6)
    ints.append(22, 33, 44)
    ints.foreach(println(_))
    ints.update(2, 666)
    ints.foreach(println(_))
    val array = Array[Int](33, 44, 55)
    val buffer: mutable.Buffer[Int] = array.toBuffer
    val array1: Array[Int] = ints.toArray


  }
}
