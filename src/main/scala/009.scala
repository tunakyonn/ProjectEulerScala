package Problem009

object Main {
  def main(args: Array[String]): Unit = {
    multi(1000)
  }
  def multi(num: Int) = {
    val a = (1 to 499).toList.find(a => (num * (500 - a)) % (num - a) == 0).get
    val b = (num * (500 - a)) / (num - a)
    val c = num - a - b
    println(a * b * c)
  }
}
