class FriendScore {
  def highestScore(friends: Array[String]): Int = {
    var ans = 0
    val n = friends(0).length()
    for (i <- 0 until n) {
      var cnt = 0
      for (j <- 0 until n if i != j) {
        if (friends(i)(j) == 'Y') {
          cnt += 1
        } else {
          for (k <- 0 until n if friends(j)(k) == 'Y' && friends(k)(i) == 'Y') {
            cnt += 1
          }
        }
      }
      ans = math.max(cnt, ans)
    }
    ans
  }
}