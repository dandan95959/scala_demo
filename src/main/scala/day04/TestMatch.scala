package day04

object TestMatch {
  def main(args: Array[String]): Unit = {
    val a = 1;
    val b = 2;
    val c = '$'
    c match {
      case '+' => println(a + b)
      case '-' => println(a - b)
      case '*' => println(a * b)
      case '/' => println(a / b)
      case _ => println("shayemeiy")
    }

    //模式守卫
    def func(int: Int): Int = {
      int match {
        case n if (n > 0) => n
        case n if (n <= 0) => -n
      }
    }

    //模式匹配  匹配类型
    def func1(n: Any): String = {
      n match {
        case n: Int => "zhengshu"
        case n: Double => "xiaoshu"
        case _ => "wufajiexi"
      }
    }
    //匹配对象


    println(func1(2.2))

    val lisi = new Person("lisi",22)
    lisi match {
      case Person("lisi",22)=>println("zhaodaol")
    }
  }
}
//class Person(val name:String,var age:Int){
//
//}
//object Person{
//  def apply(name: String, age: Int): Person = new Person(name, age)
//
//  def unapply(arg: Person): Option[(String, Int)] = {
//    if (arg==null) {
//      None
//    }else{
//      Some((arg.name,arg.age))
//    }
//  }
//
//}
case class Person(name: String, age: Int)