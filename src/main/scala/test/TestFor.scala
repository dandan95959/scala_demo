package test

object TestFor {
  def main(args: Array[String]): Unit = {
    var s: Int = 0
    for (i <- 1 to 5) {
      s += i
    }
    println(s)
  }
}
