class InterestingParty {
	def bestInvitation(first:Array[String], second:Array[String]):Int = {
	  var dic = Map.empty[String,Int]
	  for(i <- 0 until first.length){
	    dic += first(i) -> 0
	    dic += second(i) -> 0
	  }
	  for(i <- 0 until first.length){
	    dic += first(i) -> (dic(first(i))+1)
	    dic += second(i) -> (dic(second(i))+1)
	  }
	  var ans = 0
	  for(value <- dic.values){
	    ans = math.max(ans, value)
	  }
	  return ans
	}
}