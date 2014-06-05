class KiwiJuiceEasy {
  def thePouring(capacities: Array[Int], bottles: Array[Int],
      fromId: Array[Int], toId: Array[Int]): Array[Int] = {
    for(i <- 0 until fromId.length){
       var sum = bottles(fromId(i)) + bottles(toId(i))
       bottles(toId(i)) = math.min(sum, capacities(toId(i)))
       bottles(fromId(i)) = sum - bottles(toId(i))
    }
    return bottles
  }

}