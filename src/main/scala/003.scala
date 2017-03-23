package Problem003

object Main {
  def main(args: Array[String]): Unit = {
    println(PrimeFactors(600851475143L))
  }

  def PrimeFactors(n: Long): Int = {
    var lst = List[Int]()
    var prime = n
    var i = 2

    var add = (x: Int) => x + 1
    var calc = (x: Int) => {
      lst :+= x
      prime /= x
    }
    while ( i*i <= prime ) {
      if (prime % i == 0)
        calc(i)
      else
        add(i)
    }

    return lst.sorted.last
  }
}
