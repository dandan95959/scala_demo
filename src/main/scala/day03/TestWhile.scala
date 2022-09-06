package day03

object TestWhile {
  def myWhile(b: => Boolean)(op: => Unit):Unit = {
    if(b){
      op
      myWhile(b)(op)
    }
  }

  def main(args: Array[String]): Unit = {
    var i = 10;
    while (i > 0) {
      println(i)
      i -= 1
    }
  }

}
