package day03

import scala.annotation.tailrec

object TestRecursion {
  //  def sum(int:Int):Int={
  //
  //  }
  def jiecheng(int: Int): Int = {
    if (int > 1) {
      return int * jiecheng(int - 1)
    } else {
      return 1
    }
  }
  @tailrec
  def jiecheng1(n: Int, res: Int = 1): Int = {
    if (n == 1) {
      res
    } else {
      jiecheng1(n - 1, res * n)
    }
  }

  def main(args: Array[String]): Unit = {
    val i = jiecheng(5)
    jiecheng1(5,1)
    println(i)
  }

}
