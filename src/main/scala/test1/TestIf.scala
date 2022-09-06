package test1

import scala.io.StdIn

object TestIf {
  def main(args: Array[String]): Unit = {
    val i = StdIn.readInt()
    if (i > 18) println("aaa") else println("bbb")
  }
}
