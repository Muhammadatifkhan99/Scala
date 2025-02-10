object CBVandCBN extends App {



  /// call by value
  //arguments are evaluated before calling a functions and they will be used throughtout the function, not re-evaluated on each call or usage
  def callbyValue(x: Long): Unit = {
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
}
