package part3functionalprogramming

object HOFunctions extends App {
  //a function that takes another functions as argument and returns another function is called a higher order function

  //e.g are map, flatmap etc, these functions takes other functions as arguments/inputs
  //function that applies a function n times over a value x
  //nTimes(f,n,x)
  //nTimes(f,3,x)

  def nTimes(f: Int => Int, n:Int, x:Int): Int =
    if (n <= 0) x
    else nTimes(f,n - 1, f(x))

  val plusOne = (x:Int) =>x + 1

  println(nTimes(plusOne,3,1))

}
