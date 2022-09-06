package day03

object TestArr1 {
  def main(args: Array[String]): Unit = {
    val array = new Array[String](20)
    val ints = Array(1,2,3,4)


    ints.foreach(println(_))
    val ints1 = ints :+ 22
    ints1.foreach((i)=>println(2*i))
  }

}
