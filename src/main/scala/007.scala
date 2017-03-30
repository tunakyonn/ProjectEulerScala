package Problem007

object Main {
  def main(args: Array[String]): Unit = {
    val primeNumber = sieve(from(2))
    val answer = primeNumber.take(10001).last
    println(answer)
  }
  def from(n: Int): Stream[Int] = Stream.cons(n, from(n+1))
  def sieve(n: Stream[Int]): Stream[Int] = Stream.cons(n.head, sieve(n.tail.filter(_ % n.head != 0)))
}
