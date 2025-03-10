package part3functionalprogramming

object Sequences extends App {
  //Sequence is a general interface (trait) for data structures that have a well defined order and can be indexed.
  //a Sequence is implmented as a list behind the scene, so we will see a swquence printed as a List
  val aSequence = Seq(1,2,3,4,5)
  println(aSequence)
  println(aSequence.reverse)
  val newSequence = aSequence ++ Seq(8,7,6) //cancatenating two sequences
  println(newSequence)
  println(newSequence.sorted) //sorting two sequences

  //Ranges
  val aRange: Seq[Int] = 1 to 10 ///This ranges can be used to do something 10 times or for repeatition of a task
  aRange.foreach( x => println("Hello")) //hello will be printed 10 times to the cansole

  //Lists
  val aList = List(1,2,3,4,5)
  println(aList)
//  val prepended = 42 +: aList //this will add the value(42) to the start of the list
  val prepended = 42 +: aList :+ 89 //append 89 to the end of the list in this case
  println(prepended)

  val apples5 = List.fill(5)("HELLO")
  println(apples5)

  println(aList.mkString("-"))

  //Arrays
  val numbers = Array(1,2,3,4,5,6,7,8,9)
  println(numbers)
  numbers.foreach(println)

  val threeElements = Array.ofDim[Int](3)
  println(threeElements)
  threeElements.foreach(println)


  //converting an array into a sequence can be done using an implicit coversion
  val numbersSeq: Seq[Int] = numbers // implicit conversion
  println(numbersSeq)

  //vectors
  val vector: Vector[Int] = Vector(1,2,3)
  println(vector)
  vector.foreach(println)

}
