import util.control.Breaks._
import scala.collection.mutable.ArrayBuffer

class InterestingDigis {
  def digits(base: Int): Array[Int] = {

    var arn = ArrayBuffer[Int]()
    for (n <- 2 to base - 1) {
      var ok = true
      breakable {
        for (k1 <- 0 to base - 1) {
          for (k2 <- 0 to base - 1) {
            for (k3 <- 0 to base - 1) {
              if ((k1 + k2 * base + k3 * base * base) % n == 0 && (k1 + k2 + k3) % n != 0) {
                ok = false
                break
              }
            }
          }
        }
      }
      if(ok){
        arn += n
      }
    }
    return arn.toArray
  }

}