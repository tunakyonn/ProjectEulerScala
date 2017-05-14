package Problem010

object Main {
  def main(args: Array[String]): Unit = {
    println(primeNum(2000000))
  }
  def from(n: Int): Stream[Int] = Stream.cons(n, from(n+1))
  def sieve(n: Stream[Int]): Stream[Int] = Stream.cons(n.head, sieve(n.tail.filter(_ % n.head != 0)))
  def primeNum(n :Int): Int = {
    var answer = 0
    val primeNumber = sieve(from(2))
    for (i <- 1 to n) {
      answer += primeNumber.take(i).last
      if (primeNumber.take(i).last > n) return answer
    }
  }
}