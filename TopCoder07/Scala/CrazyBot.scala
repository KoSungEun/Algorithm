class CrazyBot {

  var grid = Array.ofDim[Boolean](100, 100)
  val vx = Array(1, -1, 0, 0)
  val vy = Array(0, 0, 1, -1)
  var prob = new Array[Double](4)

  def getProbability(n: Int, east: Int, west: Int, south: Int, north: Int): Double = {
    prob(0) = east / 100.0
    prob(1) = west / 100.0
    prob(2) = south / 100.0
    prob(3) = north / 100.0

    return dfs(50, 50, n)
  }
  def dfs(x: Int, y: Int, n: Int): Double = {
    if (grid(x)(y)) return 0
    if (n == 0) return 1
    grid(x)(y) = true
    var ret = 0.0
    for (i <- 0 until 4) {
      ret += dfs(x - vx(i), y - vy(i), n - 1) * prob(i)
    }
    grid(x)(y) = false
    return ret
  }

}