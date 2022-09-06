package test1

import scala.util.control.Breaks

object TestBreak {
  def main(args: Array[String]): Unit = {

    Breaks.breakable(
      for (i <- 1 to 100) {
        if (i == 50) {
             Breaks.break()
        }
        println(i)
      }
    )
  }

}
