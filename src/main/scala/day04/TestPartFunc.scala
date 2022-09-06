package day04

object TestPartFunc {
  def main(args: Array[String]): Unit = {
    val value: PartialFunction[Any, String] = new PartialFunction[Any, String] {
      override def isDefinedAt(x: Any) = {
        x match {
          case a: Int => true
          case b: Double => true
          case c: String => true
          case _ => false
        }
      }

      override def apply(v1: Any) = {
        v1 match {
          case a: Int => "整数"
          case b: Double => "double"
          case c: String => "zifuchuan"
        }
      }
    }

    val list = List(1, 3.3, "nihao")
    val strings: List[String] = list.collect(value)
    println(strings)

    list.collect({
      case a: Int => "整数"
      case b: Double => "double"
      case c: String => "zifuchuan"
    })
    list.map({
      case a: Int => "整数"
      case b: Double => "double"
      case c: String => "zifuchuan"
      case _ => ""
    }).filter(s => s != null)
    val list1: List[Any] = list.map({
      case a: Int => a + 1
      case b: Double => b * 1.1
      case c: String => c + "//"
    })
    println(list1)
  }
}
