object Main {

  def main(args: Array[String]): Unit = {
    val first = Array("fishing", "gardening", "swimming", "fishing")
    val second = Array("hunting", "fishing", "fishing", "biting")
    val ip = new InterestingParty
    println(ip.bestInvitation(first, second))
    
  }

}