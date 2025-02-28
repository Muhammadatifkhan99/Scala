package part3functionalprogramming

object Sequences extends App {
  //Sequence is a general interface (trait) for data structures that have a well defined order and can be indexed.
  //a Sequence is implmented as a list behind the scene, so we will see
  val aSequence = Seq(1,2,3,4,5)
  println(aSequence)
  println(aSequence.reverse)
  val newSequence = aSequence ++ Seq(8,7,6)
  println(newSequence)
  println(newSequence.sorted)

  //Ranges
  val aRange: Seq[Int] = 1 to 10 ///ranges can be used to do something 10 times
  aRange.foreach(x => println("Hello"))

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

}
