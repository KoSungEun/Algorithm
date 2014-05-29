object Main {

  def main(args: Array[String]): Unit = {
    val capacities = Array(30,20,10)
    val bottles = Array(10,5,5)
    val fromId = Array(0,1,2)
    val toId = Array(1,2,0)
    
    val kiwi = new KiwiJuiceEasy
    for(result <- kiwi.thePouring(capacities, bottles, fromId, toId)){
      println(result)
    }
  }

}