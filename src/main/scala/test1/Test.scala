package test1

object Test {
  def main(args: Array[String]): Unit = {
    val i: Int = {
      println("b")
      1 + 1
    }
    def sumAB(a: =>Int,b: => Int) :Int = {
      println(a)
      println(b)
      a + b
    }

    println(sumAB(i, {
      println("c")
      10
    }))
  }
}
