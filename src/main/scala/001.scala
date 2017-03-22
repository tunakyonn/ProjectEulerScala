package Problem001

object Main {
  def main(args: Array[String]): Unit = {
    var sum = 0
    val isMultiple = (x: Int) => x % 3 == 0 || x % 5 == 0
    for (i <- 1 until 1000; if isMultiple(i)) sum+=i
    println(sum)
  }
}
