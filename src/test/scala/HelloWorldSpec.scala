import org.scalatest.FunSuite

class HelloWorldSuite extends FunSuite {

  test("Add 3 and 4 should return 7") {
    assert(HelloWorld.addTwo(3, 4) == 7)
  }
  test("Add 5 and 3 should return 8") {
    assert(HelloWorld.addTwo(5, 3) == 8)
  }
}