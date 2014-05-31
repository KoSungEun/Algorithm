import scala.collection.mutable.ArrayBuffer

class InterestingDigis {
  def digits(base: Int): Array[Int] = {
    var anr = ArrayBuffer[Int]()
    for (i <- 2 to base - 1) {
    	if((base-1) % i == 0){
    	  anr += i
    	}
    }
    return anr.toArray
  }

}