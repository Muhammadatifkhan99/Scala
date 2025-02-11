package part1basics

object CBVandCBN extends App {



  /// call by value
  //arguments are evaluated before calling a functions and they will be used throughtout the function, not re-evaluated on each call or usage
  def callbyValue(x: Long): Unit = {
    //Unit is same just like returning void in C++, etc
    //The value of Unit in Scala is empty parens ()
    println("call by value: " + x)
    println("call by value: " + x)
  }

  //call by name
  //this will evaluate the arguments each time a function is called, if the parameters are passed multiple times they will re-evaluate them multiple times
  def callbyName(x: => Long): Unit = {
    println("call by name: " + x)
    println("call by name: " + x)
  }

  callbyValue(System.nanoTime())
  callbyName(System.nanoTime())

  def infinite (): Int = 1 + infinite()
  def printFirst(x:Int, y: => Int) = println(x)

//  printFirst(infinite(),34) this will crush the programm because the first value is used and cannot be figuredout and the system runs out of stack

  printFirst(34,infinite()) //the second value is not used and hence no execution or evaluation is performed on that...

}
