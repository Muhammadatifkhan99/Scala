package part3functionalprogramming

object mapsFlatmapFilterFor extends App {
  val list = List(1,2,3,4,5)
  println(list)

  //map is a higher order function, that applies a given function to each element is a collection (list here).Returns a new collection
  val doubled = list.map(x => x * 2)
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
}
