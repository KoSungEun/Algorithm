import java.util.Arrays
import scala.util.Sorting

class Cryptography {
  def encrypt(numbers: Array[Int]): Long = {

    var ret = 1L
    Sorting.quickSort(numbers)
    numbers(0) += 1
    for (number <- numbers) {
      ret *= number
    }
    return ret
  }
}