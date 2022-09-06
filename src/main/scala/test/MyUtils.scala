package test



class MyUtils {
  def test2(): Unit = {
    println("这里调用的是类外的class类的方法..........")
  }
}


object Method01 {
  def main(args: Array[String]): Unit = {


    val ob = new MyUtils()
    ob.test2() // 这里调用的是类外的 class类中的方法...........

    new MyUtils().test2() // 这里调用的是类外的 class类中的方法..........
    new TestMethod().m1()

  }
}

