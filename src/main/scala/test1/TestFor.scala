package test1

object TestFor {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 10){
      for(j <- 0 to 9-i reverse){
        print(" ")
      }
      for(k <- 1 to (2*i-1)){
        print("*")
      }
      println()
    }
  }
}
