import org.scalatest.FunSuite

class SolvingEqSpec extends FunSuite {
  test("f(x) = x^2 + x + 3 with x = 0 should return -3.0") {
    assert(SolvingEq.f(0.0) == -3.0)
  }
  test("f(x) = x^2 + x + 3 with x = 1 should return -1.0") {
    assert(SolvingEq.f(1.0) == -1.0)
  }
  test("f(x) = x^2 + x + 3 with x = 2 should return 3.0") {
    assert(SolvingEq.f(2.0) == 3.0)
  }
  test("Interval with a root of f(x) = x^2 + x - 3 should return (1.0, 2.0)") {
    assert(SolvingEq.IVT(SolvingEq.f, 0) == (1.0, 2.0))
  }
}
