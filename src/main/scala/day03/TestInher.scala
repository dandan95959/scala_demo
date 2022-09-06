package day03

object TestInher {
  private val student = new Student
  private val name: String = student.name
  println(name)
  student.sayHI("zhangsan")
}
class Person{
  val name = "zjamhs"
  def sayHI(str:String)={
    println(s"hi,$str")
  }
}
class Student extends Person{

}