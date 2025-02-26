package part3functionalprogramming

object AnonymousFunctions extends App {
  //The Object-Oriented way of defining a function and instantiating it on the spot
  val doublar = new Function1[Int,Int] {
    override def apply(v1: Int): Int = v1 * 2
  }
  //Anonymous Function or (LAMBDA)
  val doublar2 = (x:Int) => x * 2
  //shorter syntax
  val doublar00: Int => Int = x => x * 2
//  println(doublar2(2))

  //functions with multiple parameters (LAMBDA ftns----> derived from lambda calculus)
  val adder: (Int,Int) => Int = (a:Int,b:Int) => a + b

  //ftn taking no parameters
  val justDoSomething = () => 4
  val justDoSomething1: () => Int = () => 4

  println(justDoSomething) //the function
  println(justDoSomething()) //the actual function call

  //another way of writing LAMBDA
  val stringtoInt = { (str: String) =>
    str.toInt
  }
  println(stringtoInt("12") + 12)

  val takeInt = new Function1[Int, Function1[Int, Int]] {
    override def apply(v1: Int): Function1[Int, Int] = new Function1[Int, Int] {
      override def apply(v2: Int): Int = v1 + v2
    }
  }
  val takeIn = (x:Int) => (y:Int) => x + y
  println(takeInt(12)(11))

}
