object SolvingEq {
  def f(x: Double): Double = scala.math.pow(x, 2) + x - 3
  def g(x: Double): Double = ???
  def h(x: Double): Double = ???

  def IVT(f: Double => Double, x: Double): (Double, Double) = {
    if (f(x) * f (x + 1) < 0) return (x, x + 1)
    else IVT(f, x + 1)
  }

  def main(args: Array[String]): Unit = {
    println("f(x) = x^2 + x - 3")
    println("f(0) = " + f(0))
    println("f(1) = " + f(1))
    println("f(2) = " + f(2))
    println(IVT(f, 0))
  }
}
