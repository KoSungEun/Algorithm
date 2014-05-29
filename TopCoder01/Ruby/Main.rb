require "./KiwiJuiceEasy"

class Main
  capacities = [30,20,10]
  bottles = [10,5,5]
  fromId = [0,1,2]
  toId = [1,2,0]
  puts KiwiJuiceEasy.new.thePouring(capacities, bottles, fromId, toId)
end
