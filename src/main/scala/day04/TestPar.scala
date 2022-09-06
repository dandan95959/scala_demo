package day04

object TestPar {
  def main(args: Array[String]): Unit = {
    val inclusive: Range.Inclusive = 1 to 100
    inclusive.foreach(println)
    inclusive.par.foreach(x=>println(x+"aaa"))
  }
}
