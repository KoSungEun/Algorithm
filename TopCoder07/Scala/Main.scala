object Main {

  def main(args: Array[String]): Unit = {
    val n = 2
    val east = 25
    val west = 25
    val south = 25
    val north = 25
    val cb = new CrazyBot
    println(cb.getProbability(n, east, west, south, north))
  }

}