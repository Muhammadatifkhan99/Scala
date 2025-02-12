package part1basics

object Basics extends App {
  //extending the App means to make this file executable/ rannable
  val num: Int = 30
  println(num)
  //in scala we work with values

  val meaningofLife= 32
  println(meaningofLife)

  val isString = "I love Scala"
  println(isString)

  ///String Operations
  val isComposed = "I" + " " + "love" + " " + "Scala"
  ///string interpolation
  val isInterpolated = s"The meaning of life is $num"
  println(isComposed)
  println(isInterpolated)



  ///expressions are structures that can be reduced to a values

  val isExpression = 2 + 3 + 4 + 2
  println(isExpression)

//  val ifExpression = if(num > 30) 45 else 999
  val chainedExpression =
    if (num > 30) 56
    else if (num < 30) 50
    else if (num == 30) 30
    else 0

  println(chainedExpression)

  val aCodeBlock = {
    //define variables here
    val aLocalVal = 3;

    //the last expression to the code block will be returned as the value of the code block

    aLocalVal + 32
  }
  println(aCodeBlock)


  //def funcName(variable: type,variable: type) returnType = {  code block          };

  def myfunction (x: Int,y: String): String = {
  y + " " + x
  }
  println(myfunction(12,"Atif"))

  //in Scala Recursion is more likely to be used then looops or iterations

  def factorial (n: Int): Int = {
    if (n <= 1) 1
    else n * factorial(n - 1);
  }

  println(factorial(5))


  ///unit type = no meaningful value = "void" in other languages

  //type of SIDE EFFECT // operations that had nothing to do with computing it does some operations,,,sending something to a socket, storing data to a file and so on..
  ///side effect return unit
  println("I love Scala") //it does not return anything it simple does something
  //cout

  //Unit return this (),,returned by the println and some other functions

  def myUnitReturningFunction(): Unit= {
    println("I don't love returning unit")
  }

//  val theUnit  = ();

  println(myUnitReturningFunction());





}
