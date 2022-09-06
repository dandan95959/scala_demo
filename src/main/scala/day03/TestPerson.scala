package day03

import scala.beans.BeanProperty

object TestPerson {
 private val person = new Person1(11)
  person.age=33
  person.name = "zhangsan"
  person.setAge(33)


}

class Person1(id:Int) {
  var name: String = "lisi"
  @BeanProperty
  var age: Int = _
}
