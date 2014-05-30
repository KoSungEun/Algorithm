object Main {

  def main(args: Array[String]): Unit = {
    val numbers = Array(1000, 999, 998, 997, 996, 995)
    val c = new Cryptography
    println(c.encrypt(numbers))

  }

}