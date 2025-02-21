package part2oop

import com.sun.tools.javac.util.ByteBuffer.UnderflowException

import scala.util.control

object Exceptions extends App {
  //Exceptions are regarded as the JVM specific concepts
  val x: String = null
  //  println(x.length) //this will crash the program with the exception of NullPointerException
  //throwing an exception is an expression scala

  //  val aWeirdValue = throw new NullPointerException  //this returns nothing, this does not holds a value but can be assigned
  def getInt(withException: Boolean): Int = {
    if (withException) throw new RuntimeException("No Int for you")
    else 42
  }

  //  try {
  //    //the code that might fails in execution or that will cause an error
  //    getInt(false)
  //  } catch {
  //    case e: Exception => println("Caught an Exception")
  //  } finally {
  //    //no matter what this code will execute
  //    println("finally I am here")
  //  }

  ///checking the value of the try/catch/finally expression
  val potientialFail = try {
    //the code that might fails in execution or that will cause an error
    //the return type depends on the try and catch block which means the finally block is optional
    getInt(false)
  } catch {
    //catching the expression here
    case e: Exception => 45
  } finally {
    //no matter what this code will execute
    println("finally I am here")
  }
  println(potientialFail)

  //defining exceptions
  //  class MyExceptions extends Exception
  //  val newException = new MyExceptions
  //
  //  throw newException


  ///Excercise

  //a program that will crash the jvm also called the OOM error
  //  val array = Array.ofDim[Int](Int.MaxValue)

  //causing a stackoverflow error
//  def limitless: Int = 1 + limitless
//
//  val infinity = limitless




  //pocket calculator
  class OverflowException extends Exception
  class UnderflowException extends Exception
  class DividbyZeroException extends Exception


  object pocketCalculator {
    def add(x:Int,y:Int) = {
      val result = x + y
      if(x > 0 && y > 0 && result < 0) throw new OverflowException
      else if (x < 0 && y < 0 && result > 0) throw new UnderflowException
      else result
    }

    def subtract (x:Int, y:Int) = {
      val result = x - y
      if(x > 0 && y < 0 && result < 0) throw new OverflowException
      else if (x < 0 && y > 0 && result > 0) throw new UnderflowException
      result
    }
    def multiply(x:Int, y:Int) = {
      val result = x * y
      if(x > 0 && y > 0 && result < 0) throw new OverflowException
      else if (x < 0 && y < 0 && result < 0) throw new OverflowException
      else if (x > 0 && y < 0 && result > 0) throw new UnderflowException
      else if (x < 0 && y > 0 && result < 0) throw new OverflowException
      result
    }
    def divid(x:Int, y:Int) = {
      if (y == 0 ) throw new DividbyZeroException
      else
        x / y
    }
  }
  println(pocketCalculator.add(12,12))
  println(pocketCalculator.subtract(12,12))
  println(pocketCalculator.divid(10,2))
  println(pocketCalculator.multiply(12,2))
}