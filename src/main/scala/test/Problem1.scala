package test

object Problem1 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 9) {
      for (j <- 1 to 9) {
        if (j <= i)
          print(s"$j * $i = ${i * j}\t")
      }
      println()
    }
    println("*************************************************")
    for (i <- 1 to 9) {
      println(" " * (9 - i) + "*" * (2 * i - 1))
    }


  }


}
