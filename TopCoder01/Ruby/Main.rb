class KiwiJuiceEasy
  def thePouring(capacities, bottles, fromId, toId)
    for i in 0 ... fromId.length
      sum = bottles[fromId[i]] + bottles[toId[i]]
      bottles[toId[i]] = [sum, capacities[toId[i]]].min
      bottles[fromId[i]] = sum - bottles[toId[i]]
    end
    return bottles
  end
end

capacities = [30,20,10]
bottles = [10,5,5]
fromId = [0,1,2]
toId = [1,2,0]
puts KiwiJuiceEasy.new.thePouring(capacities, bottles, fromId, toId)