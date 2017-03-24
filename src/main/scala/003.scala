package Problem003

object Main {
  def main(args: Array[String]): Unit = {
    println(factor(600851475143L))
  }
  
  def factor(n: Long): Long = factor(n, 2).last
  def factor(n: Long, i: Long): List[Long] = {
    if (n < i * i)
      List(n)
    else if (n % i == 0)
      i::factor(n / i, i)
    else
      factor(n, i + 1)
  }
}
