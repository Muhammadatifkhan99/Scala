
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//@main
//def main(): Unit =
//  //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//  // to see how IntelliJ IDEA suggests fixing it.
//  (1 to 5).map(println)
//
//  for (i <- 1 to 5) do
//    //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//    // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//    println(s"i = $i")


object main extends App {


  val aCondition = true

  val aConditionValue = if(aCondition) 5 else 3
  println(aConditionValue);


  //loops in scala
  var i = 0
  while(i<=10){
    println(i)
    i += 1
  }
  // a while returns a unit which is a side effect

  def aFunction(x:String, y:Int): String = {
    x + " " + y
  }
  //equivalent of this function is the followed one with out the return type of the function
  def anotherFunc(x: String, y: Int) = {
    x + " " + y
  }


  println(aFunction("hello",3))

  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())

  //RECURSION

  def aRepeatedFunction(aString:String,n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString,n-1)
  }

  println(aRepeatedFunction("Atif",3))


  //Functions TASKs

//  def greeting(name:String, age:Int): String = {
//    s"Hi my name is $name and I am $age years old"
//  }
//
//  println(greeting("Ali",12))

  //factorial function
//  def factorial(n:Int): Int ={
//  if(n <= 1) 1
//  else n * factorial(n-1)
//  }
//  println(factorial(4))

//  def fibonacciNum(n:Int): Int = {
//    if (n == 1) 1
//    else if (n == 2) 1
//    else fibonacciNum(n-1) +fibonacciNum(n - 2)
//  }
//
//  println(fibonacciNum(3))

  //testing if a number is prime or not

//  def isPrime(n:Int): String = {
//    if(n / 1 == 0 && n / n == 0) s"$n is Prime"
//    else s"$n is not Prime"
//  }
//
//  println(isPrime(10))


//  for(i <- 1 to 5){
//    println(i)
//  }

//  val n: Int = 5
//
//
//  for(i <- 0 until n){
//    for (j <- 0 until (i+1)){
//      print("*")
//    }
//    println()
//  }


  //printing pattern
  val n = 3
  for(i <- 0 until n){
    print(" " * (n-i-1))
    println("*"*(i + 1))
  }
  for (i <- (n - 2) to 0 by -1) {
    print(" " * (n - i - 1))
    println("*" * (i + 1))
  }



}