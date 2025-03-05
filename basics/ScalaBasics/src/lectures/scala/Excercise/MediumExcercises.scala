package Excercise

object MediumExcercises extends App {

  //REVERSING A STRING
  def reverseString(str: String): String = {
    // Complete this function
    str.reverse
  }

  println(reverseString("Scala")) // Expected Output: "alaSc"
  println(reverseString("Hello"))
  println(reverseString("Welcome"))

  //VOWELS IN THE STRING
  def countVowels(str: String): Int = {
    val vowels = "aeiou"
    str.count(a => vowels.contains(a.toLower))
    //    str.count(c => vowels.contains(c.toLower))
  }

  println(countVowels("hello world")) // Expected Output: 3

  //PRINT EVEN NUMBERS TO N
  def printEven(n:Int):Unit= {
    var value = 0
    if(n > 0)
      value = value + 2;
      println(value)
    else printEven(n -1)
  }
  println(printEven(3))


}
