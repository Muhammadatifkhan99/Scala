object StringOps extends App {
  val str: String = "Hello, I am learning Scala"

//  println(str.charAt(2))
//  println(str.substring(0,8))
////  println(str.split(" "))
//  println(str.startsWith("Hello"))
//  println(str.replace(" ","-"))
//  println(str.toLowerCase())
//  println(str.length)
//
  val aNumberString = "2"
  val aNumber = aNumberString.toInt
//
  println(aNumber)
//
//  println(str.reverse)
//  println(str.take(2))
//
  println("a" +: aNumberString +: "z")



  //String interpolations

  val name = "David"
  val age = 10
  val greeting = s"Hello, my name is $name and I am $age years old"
  println(greeting)
  //S-Interpolators evaluate complex operationss inside the string

  //F-Interpolators
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minutes"
  println(myth)

//  val x = 1.1f
//  val str1 = f"$x%3d"
//  println(str1)

  //RAW-Interpolators
  println(raw"This is \n new line character")

  val escape = "This is \n new line character"

  println(raw"$escape")

}
