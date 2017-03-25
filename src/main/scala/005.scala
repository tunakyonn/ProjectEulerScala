package Problem005

object Main {
  def main(args: Array[String]): Unit = {
    var num = 2520
    while(division(num))
    {
      num+=2
    }
    println(num)
  }
  def division(num: Long): Boolean = {
    for(i <- 1 until 20) {
      if (num % i != 0) return true
    }
    return false
  }
}
