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
}
