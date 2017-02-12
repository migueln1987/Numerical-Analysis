import org.scalatest.FunSuite

class SolvingEqSpec extends FunSuite {
  test("f(x) = x^2 + x + 3 with x = 0 should return 3.0") {
    assert(SolvingEq.f(0.0) == 3.0)
  }
  test("f(x) = x^2 + x + 3 with x = 1 should return 5.0") {
    assert(SolvingEq.f(1.0) == 5.0)
  }
  test("f(x) = x^2 + x + 3 with x = 2 should return 9.0") {
    assert(SolvingEq.f(2.0) == 9.0)
  }
}
