class KiwiJuiceEasy {
  def thePouring(capacities: Array[Int], bottles: Array[Int],
      fromId: Array[Int], toId: Array[Int]): Array[Int] = {
    var i = 0
    while(i < fromId.length){
       var sum = bottles(fromId(i)) + bottles(toId(i))
       bottles(toId(i)) = math.min(sum, capacities(toId(i)))
       bottles(fromId(i)) = sum - bottles(toId(i))
       i += 1
    }
    return bottles
  }

}