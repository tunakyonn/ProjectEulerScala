package Problem003

object Main {
  def main(args: Array[String]): Unit = {
    println(primeFactor(600851475143L))
  }

  def primeFactor(n: Long): Long = primeFactor(n, 2).last
  def primeFactor(n: Long, i: Long): List[Long] = {
    if (n < i * i)
      List(n)
    else if (n % i == 0)
      i::primeFactor(n / i, i)
    else
      primeFactor(n, i + 1)
  }
}
