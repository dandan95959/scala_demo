package day03

object TestWordCount {
  def main(args: Array[String]): Unit = {
    val stringList = List("Hello Scala Hbase kafka", "Hello Scala Hbase", "Hello Scala", "Hello")
    val list: List[String] = stringList.flatMap(_.split(" "))
    val wordToWordsMap: Map[String, List[String]] = list.groupBy(word => word)
    val map: Map[String, Int] = wordToWordsMap.map(e => {
      e._1 -> e._2.size
    })
    val tuples: List[(String, Int)] = map.toList.sortBy(_._2)(Ordering[Int].reverse).take(3)
    println(tuples)
    println("--------------------------------------------------")
//    val tuples1: List[(String, Int)] = stringList.flatMap(_.split(" ")).
//      groupBy(e => e).map(e => e._1 -> e._2.size).toList.sortBy(_._2)(Ordering[Int].reverse).take(3)
//    println(tuples1)
    val tuples1: List[(String, Int)] = stringList.flatMap(_.split(" "))
      .groupBy(e => e)
      .map(e => e._1 -> e._2.length)
      .toList
      .sortBy(_._2)(Ordering[Int].reverse)
      .take(3)
    println(tuples1)
    val tuples2: List[(String, Int)] = stringList.flatMap(_.split(" "))
      .groupBy(e => e)
      .map(e => e._1 -> e._2.size)
      .toList
      .sortBy(e => e._2)(Ordering[Int].reverse)
      .take(3)
    println(tuples2)

  }
}
