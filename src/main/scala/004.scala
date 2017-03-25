package Problem004

object Main {
  def main(args: Array[String]): Unit = {

    val palindrome = (integrationNum: Int) => integrationNum.toString == integrationNum.toString.reverse
    val calcThreeDigits = for(i <- 100 until 999;j <- i until 999) yield i * j
    val answer = calcThreeDigits.filter(palindrome(_)).max
    println(answer)
  }
}
