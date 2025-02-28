package part3functionalprogramming

object mapsFlatmapFilterFor extends App {
  val list = List(1,2,3,4,5)
  println(list)

  //map is a higher order function, that applies a given function to each element is a collection (list here).Returns a new collection
  val doubled = list.map(x => x * 2) // map takes
  println(s"Doubled List $doubled")
  val half = doubled.map(x => x / 2)
  println(s"Half List $half")
  val minus = half.map(c => c - 1)
  println(s"Subtracted 1 $minus")
  val add = half.map(c => c + 1)
  println(s"Added One $add")

  //map on String values
  //strings are sequences of characters, map can be applied
  val str = "Hello"
  val str2= "World"
  val upperCase = str.map(str => str.toUpper)
  val upperCase2= str2.map(_.toUpper) // shorter syntax
  println(s"$upperCase $upperCase2")


  //Filter method in Scala
  //The filter method is used to select elements from a collection(list) that satisfy a given condition.

  val numbers = List(2,4,6,8,10)

  val evenNum = numbers.filter(x => x % 2 == 0)
  println(evenNum) //returns all the numbers which satisfy the condition for the filter method

  val v = "eeelo"
  val vowel = v.filter(c => "aeiou".contains(c))
  println(vowel)

  //flatMap
  //usefull when working with nested structures
  //flatMap applies function to each elements( like map does)
  ///Flatten: removes extra layar of nesting
  //it applies a functions and flatten the result into a single collection(list)

  //using map
  val nums = List(1,2,3)
  val mapped = nums.map(x => List(x,x * 2))
  println(mapped) //output:::List(List(1, 2), List(2, 4), List(3, 6)) returned a nested list
  ///using flatMap
  val flatMapped = nums.flatMap(x => List(x,x*2))
  println(flatMapped) //output:::List(1, 2, 2, 4, 3, 6) returned a single list

  //print all the combination between two lists
  val numbus = List(1,2,3,4)
  val char = List('a','b','c','d')
  val color = List("black","white")
  //List("a1","a2",...."d4")


  //handling iterations in functional programming
  val combinations = numbus.flatMap(n => char.flatMap(c => color.map(color => "" + c + n + "-" + color)))
  println(combinations)

  //foreach
  val list1 = List(1,2,3,4,5,6,7,8,9)
  list1.foreach(println)  //print output on a separate line

  //for comprehensions
  val forCombination = for {
    //filters can also be applied inside the for comprehensions
    //apply an if guard to this
    n <- numbus if n % 2 == 0
    c <- char
    col <- color
  } yield "" + c + n + "-" + col

  println(forCombination)
  for {
    n <- numbus
  } println(n) ///equivalent of the forEach



}
