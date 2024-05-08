object MyModule {
  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  def factorial(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, acc: Int): Int = {
      if (n <=0 ) acc
      else go(n-1, acc*n)
    }
    go(n, 1)
  }

  def fibonacci(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, prev: Int, curr: Int): Int = {
      if (n == 0 ) prev
      else go(n - 1, curr, prev + curr)
    }
    go(n, 0, 1)
  }

  def formatResult(name:String, n: Int, f: Int => Int): String = {
    val msg = "%s of %d is %d"
    msg.format(name, n, f(n))
  }

  def main(args: Array[String]): Unit = {
    println(formatResult("Factorial", 6, factorial))
    println(formatResult("Fibonacci", 6, fibonacci))
  }
}
