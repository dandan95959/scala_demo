package day03

import scala.collection.mutable.{ArrayBuffer, ListBuffer}

object TestMap {
  def main(args: Array[String]): Unit = {
    val map: Map[String, Int] = Map(("java", 1), ("hive", 2), ("spark", 3))
    val map1: Map[String, Int] = Map(("java", 4), ("mysql", 2), ("linux", 3))
    //    def mergeMap(map1: Map[String, Int],map2: Map[String, Int])={
    //      map2.foreach(_._1)
    //    }
    var map2 = map;
    //    for (e <- map1) {
    //      map2 = map2 + (e._1 -> (e._2 + map.getOrElse(e._1, 0)))
    //    }
    map1.foreach(e => map2 = map2 + (e._1 -> (e._2 + map.getOrElse(e._1, 0))))

    println(map2)
    val list = List(1, 3, 4, 5, 6)
    val map11: Map[String, Int] = Map(("a", 1), ("b", 2), ("c", 3))
    val map12: Map[String, Int] = Map("a" -> 1, "b" -> 2)
    val map22: Map[String, Int] = map11.updated("d", 4)
    println(map22)
    map12.get("c")
  }

  private val arrayBuffer = new ArrayBuffer[Int](20)
  //  arrayBuffer.foreach(_ => println(_))


  //  private val array = new Array[Array[Int]](3)
  //  for (e <- array) {
  //    for (el <- e) {
  //      println(el + "/t")
  //    }
  //    println("")
  //  }
  //  array.foreach(e => {
  //    e.foreach(e => print(e + ""))
  //    println()
  //  })
  private val list = List(1, 23, 4, 56, 7)
  list.foreach(print)
  println()
  private val list1: List[Int] = 1 :: list
  list1.foreach(print)
  private val list2: List[Int] = list.updated(1, 22)
  private val list3: List[Int] = list ::: list2
  //nil是空list

  private val list4: List[Int] = 1 :: 2 :: 3 :: 4 :: Nil


  private val listBuffer: ListBuffer[Int] = ListBuffer(2, 3, 4, 5, 6)
  listBuffer.append(555)
  listBuffer.prepend(1)
  println("_______________________________________________________________________________")
  private val map: Map[String, Int] = Map(("a", 1), ("b", 2), ("c", 3))
  private val map1: Map[String, Int] = Map("a" -> 1, "b" -> 2)
  private val map2: Map[String, Int] = map.updated("d", 4)
  println(map2)


}
