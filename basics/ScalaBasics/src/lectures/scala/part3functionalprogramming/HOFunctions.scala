package part3functionalprogramming

object HOFunctions extends App {
  //a function that takes another functions as argument and returns another function is called a higher order function
  val superFunction: (Int, (String, (Int => Boolean)) => Int) => (Int,Int) = null
  // the function superFunction takes an Int, and another function with inputs of type (String, (Int => Boolean)) => Int
  // (String, (Int => Boolean)) => Int ----> this function takes a string, and another function that has an input of type of Int and that returns an Int
  // The overall return type of the superFunction is set of two Ints

  //e.g are map, flatmap etc, these functions takes other functions as arguments/inputs
  //function that applies a function n times over a value x
  //nTimes(f,n,x)
  //nTimes(f,3,x)

  def nTimes(f: Int => Int, n:Int, x:Int): Int =
    if (n <= 0) x
    else nTimes(f,n - 1, f(x))

  val plusOne = (x:Int) =>x + 1

//  println(nTimes(plusOne,3,1))

  //functions with multiple parameter lists
  def curriedFunction (c:String)(x:Double): String = c.format(x)

  //these two functions are also called partial functions because they take in partial argument ( one argument already supplied to it.)
  //The two formatting functions allow different levels of precision for floating-point numbers.
  val standardFormat: (Double => String) = curriedFunction("%4.2f")
  val preciseFormat: (Double => String) = curriedFunction("%10.8f")

  println(standardFormat(Math.PI))
  println(preciseFormat(Math.PI))
}
