package part2oop

object ScalaObjects extends App {

  object Person {
    val N_EYES = 2

    def canFly: Boolean = false

  //factory methods
    //also called apply methods
//    def from(mother:Person, father:Person): Person = new Person("Bobbie")

    def apply(mother:Person, father:Person): Person = new Person("Bobbie")

  }
  class Person (val name: String) {

  }
  println(Person.N_EYES)
  println(Person.canFly)    //objects donot recieve any perameters

  //Scala Objects are singleton instance

  val mary = Person
  val john = Person

  println(mary == john) //true ------> because marry and john points to the same instance


  val mary1 = new Person("Mary")
  val john1 = new Person("John")

//  val bobbie = Person.from(mary1,john1)
  val bobbie = Person(mary1,john1) //called via the apply method,

  println(mary1 == john1) //false because they refer to different instances
}
