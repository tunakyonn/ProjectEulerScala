package Problem002

object Main {
  def main(args: Array[String]): Unit = {
    var sum = 0
    var num = 0
    var f1 = 1
    var f2 = 1

    while (num < 4000000)
    {
      num = f1 + f2
      f1 = f2
      f2 = num
      if (num%2 == 0) sum += num
    }
    println(sum)
  }
}
