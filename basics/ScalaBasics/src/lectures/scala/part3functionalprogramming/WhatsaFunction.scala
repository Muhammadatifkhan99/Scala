package part3functionalprogramming

object WhatsaFunction extends App {
  //using functions as first class objects is the main goal of functional programming

  val doubler = new MyFunction[Int,Int] {
    override def apply(element: Int): Int = element * 2
  }
  println(doubler(2)) //doubler can be called like a functions....advantage over Java
  //funtions types ==> function1,2,3,4........22
  //Function1...with one parameter and one return type
  //Function2...with two parameters and one return type or the result

  val stringToIntConverter = new Function1[String, Int] {
    override def apply (str: String): Int = str.toInt
  }
  println(stringToIntConverter("45") + stringToIntConverter("1"))

  //a function that adds two Ints and returns an Int
  val adder1 = new Function2[Int,Int,Int] {
    override def apply(a: Int,b:Int):Int = a + b
  }
  //an equivalent of the above function is given below
  val adder2: ((Int,Int) => Int) = new Function2[Int, Int, Int] {
    override def apply(a: Int, b: Int): Int = a + b
  }
  //Function types Function2[A,B,R] === (A,B) => R
  println(adder1(1,3))

}
trait MyFunction[A,B] {
  def apply(element: A): B
}
