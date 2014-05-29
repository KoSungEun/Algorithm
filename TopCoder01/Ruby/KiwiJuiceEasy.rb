class KiwiJuiceEasy
  def thePouring(capacities, bottles, fromId, toId)
    i = 0
    while i < fromId.length
      sum = bottles[fromId[i]] + bottles[toId[i]]
      bottles[toId[i]] = [sum, capacities[toId[i]]].min
      bottles[fromId[i]] = sum - bottles[toId[i]]
      i += 1
    end
    return bottles
  end
 
end


