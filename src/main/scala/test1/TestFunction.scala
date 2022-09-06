package test1

object TestFunction {
  def say(name: String) = {
    println(s"hi$name")
  }

  def hi(name: String)(age: Int): String = {
    s"$name" + age

  }

  def testReturn(num: Int): Any = {
    if (num < 0) {
      return "nagtive"
    }
    println(s"num")
  }

  def main(args: Array[String]) {
    val lilei = hi("lilei") _

    println("aaaaaaaaaa")
    val str = lilei(2)
    println(str)
    testReturn(4)
    val function: (Int, Int) => Int = (x: Int, y: Int) => {
      x + y
    }
    val function1: (Int, Int) => Int = (x: Int, y: Int) => x + y
    println(function1(3, 5))
    val function2: Int => Int = (x: Int) => x + 22
    val f5: (Int, Int) => Int = (x, y) => {
      x + y
    }
    x: Int =>
      x + 20
      val stringToString: String => String = name => s"$name"
      val function3: String => String = _ + "nihao"
      val func1: (Int, Int) => Int = _ + _

      def myMath(a: Int, b: Int, opera: (Int, Int) => Int) = {
        opera(a, b)
      }

      myMath(10, 20,  _ - _)




      def MR(data:String,MapFunc:String=>Int,ReduceFunc:Int=>Int): Int ={
        val i = MapFunc(data)
        val i1 = ReduceFunc(i)
        i1
      }
      val i = MR("nihao",_.length,_ +1)
      println(i)
      def Mr1(data:String)(MapFunc:String=>Int)(ReduceFunc:Int=>Int)={
        val i = MapFunc(data)
        val i1 = ReduceFunc(i)
        i1
      }
  }
}
