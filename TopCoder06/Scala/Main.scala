object Main {

  def main(args: Array[String]): Unit = {
    val friends = Array("NYNNN","YNYNN","NYNYN","NNYNY","NNNYN")
    val fs = new FriendScore;
    println(fs.highestScore(friends))
  }

}