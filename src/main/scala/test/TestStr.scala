package test

object TestStr {
  def main(args: Array[String]): Unit = {
    println("le" * 10)
    printf("aaa:%d,name:%s\n",2,"asd")
    val name:String = "zhangsan"
    println(s"name:${name + "nihao"}")

    println(
      """
        |a
        |b
        |c
        |d
        |e
        |f
        |""".stripMargin)
    println(
      s"""
         |${name}
         |asd
         |asd
         |asdd
         |""".stripMargin)

    val a:Unit = {
      10
    }
print(a)

//    val c:Int = {
//      null
//    }
//print(c)
//    val b:Nothing = {
//      throw new RuntimeException()
//      println("hi")
//    }

  }
}
