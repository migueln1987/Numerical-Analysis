object SolvingEq {
  def f(x: BigDecimal): BigDecimal = x.pow(2) + x + 3

  def IVT(f: BigDecimal => BigDecimal, x: BigDecimal): Double = {
    return 0.0
  }

  def main(args: Array[String]): Unit = {
    println("f(x) = x^2 + x + 3")
    println("f(0) = " + f(0))
    println("f(1) = " + f(1))
    println("f(2) = " + f(2))
  }
}
