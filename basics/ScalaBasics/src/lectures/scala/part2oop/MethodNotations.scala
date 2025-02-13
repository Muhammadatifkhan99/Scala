package part2oop

object MethodNotations extends App {

  class Person(val name: String, favMovie: String) {
    def likes(movie:String): Boolean = movie == favMovie

  }

  val mary = new Person("Mary","Inception")
  println(mary.likes("Inception"))
}
