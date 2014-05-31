object Main {

  def main(args: Array[String]): Unit = {
    
    val base = 10
    val id = new InterestingDigis;
    for(result<-id.digits(base)){
      println(result)
    }
    
  }

}