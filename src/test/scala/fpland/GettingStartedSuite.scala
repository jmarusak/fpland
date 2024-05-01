import munit._

class GettingStartedSuite extends FunSuite {
  test("MyModule.abs") {
    assertEquals(MyModule.abs(-5), 5)
    assertEquals(MyModule.abs(5), 5)
  }
}
