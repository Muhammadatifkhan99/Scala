package part2oop

object MethodNotations extends App {

  class Person(val name: String, favMovie: String) {
    def likes(movie:String): Boolean = movie == favMovie

    def hangOutWith (person: Person): String = {
      s"${this.name} is hanging with ${person.name}"
      //this.name contains the value of the first object while person.name contains the value of the object passed to this method
    }
    //Prefix Notations in Scala
//    def unary_! (): String = s"$name what the heck"

    //POSTFIXE NOTATIONS
    def isAlive() : String = {
      s"Hey!!!!${this.name} I am Alive yarrrrrrrrr!"
    }

    //APPLY METHOD
    def apply(): String = {
      s"Hey, I am ${this.name} and my favourite movie is $favMovie"
    }

  }

  val mary = new Person("Mary","Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") //infix notation in scala...object method parameter
  //call a method like an operator in scala
  val tom = new Person("Tom", "Money Heist")
  println(mary hangOutWith tom) //call the hangOutWith method like an operator
//  println(mary + tom) //the name of the method is +
  //PREFIX NOTATIONS
//  println(! mary)


  // POST FIX NOTATIONS
  //functions that do not recieve any parameters have the property to be used in postfix notations
  println(mary.isAlive())



  //APPLY METHOD
  println(mary.apply())
  println(mary())       //both are equivalent
}
