package Problem006

object Main {
  def main(args: Array[String]): Unit = {
    println(sumSquare(100) - defaultSquare(100))
  }
  def defaultSquare(num: Int) = {
    var sum = 0
    for(i <- 1 to num) sum += i * i
    sum
  }
  def sumSquare(num: Int) = {
    var sum = 0
    for(i <- 1 to num) sum += i
    sum * sum
  }
}
