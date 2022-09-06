package day04

import scala.collection.immutable.Queue
import scala.collection.mutable

object TestQueue {
  def main(args: Array[String]): Unit = {
    val queue = Queue(1,2,3,4)
    val queue1: Queue[Int] = queue.enqueue(5)
    val dequeue: (Int, Queue[Int]) = queue.dequeue
    val queue2: mutable.Queue[Int] = mutable.Queue(1,2,3,4)
    val unit: Unit = queue2.enqueue(5)
    println(queue2)
    val i: Int = queue2.dequeue()
    println(i+"\t"+queue2)
  }
}
