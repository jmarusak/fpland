import munit._

class GettingStartedSuite extends FunSuite {
  test("MyModule.abs") {
    assertEquals(MyModule.abs(-5), 5)
    assertEquals(MyModule.abs(5), 5)
  }
  
  test("MyModule.factorial") {
    assertEquals(MyModule.factorial(4), 24)
  }

  test("MyModule.fibonacci") {
    assertEquals(MyModule.fibonacci(4), 3)
  }
}
