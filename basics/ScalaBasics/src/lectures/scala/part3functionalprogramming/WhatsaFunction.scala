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

  //Write a function that takes in two strings and cancatenate them

  val strAdder: ((String,String) => String) = new Function2[String,String,String]{
    override def apply(v1: String, v2: String): String = v1 + " " + v2
  }
  println(strAdder("Hello","World"))

  //write a function that takes an Int and another function
  val takeInt = new Function1[Int, Function1[Int,Int]] {
    override def apply(v1: Int): Function1[Int,Int] = new Function1[Int,Int] {
      override def apply(v2: Int): Int = v1 + v2
    }
  }
  //higher order function
  println(takeInt(1)(1))
  println(takeInt(1)(2))
  println(takeInt(1)(3))
  println(takeInt(1)(4))
  println(takeInt(1)(5))
  println(takeInt(1)(6))
}
trait MyFunction[A,B] {
  def apply(element: A): B
}
