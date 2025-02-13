package Excercise

object MethodNotations extends App {
  println("Hello World")

  //EXCERCISE # 1 OVERLOAD THE hangOutWith() and that should return a new person with a nick name
  class Person(val name: String, favMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favMovie

    def +(person: Person): String = {
      s"${this.name} is hanging with ${person.name}"
      //this.name contains the value of the first object while person.name contains the value of the object passed to this method
    }
    //OVERLOADING THE hangOutWith() and rename it to +
    def +(nickName:String): Person = {
      new Person(s"$name $nickName",favMovie);
      //this.name contains the value of the first object while person.name contains the value of the object passed to this method
    }
    //Unary + operator
    def unary_+ : Person = {
      new Person(name,favMovie,age + 1)
    }
    //LEARNS METHOD
    def learns(lern: String) = s"$name is learning $lern"

    //Prefix Notations in Scala
        def unary_! (): String = s"$name what the heck"

    //POSTFIXE NOTATIONS
    def isAlive(): String = {
      s"Hey!!!!${this.name} I am Alive yarrrrrrrrr!"
    }

    //APPLY METHOD
    def apply(): String = {
      s"Hey, I am ${this.name} and my favourite movie is $favMovie"
    }
    //Overloading the apply method
    def apply(times:Int = 0): String = {
      s"${this.name} watched $favMovie $times times"
    }

  }

  val mary = new Person("Mary", "Inception")
//  println(mary.likes("Inception"))
//  println(mary likes "Inception") //infix notation in scala...object method parameter
//  //call a method like an operator in scala
//  val tom = new Person("Tom", "Money Heist")
//  println(mary hangOutWith tom) //call the hangOutWith method like an operator
//  //  println(mary + tom) //the name of the method is +
//
//  //PREFIX NOTATIONS
//  //  println(! mary)
//
//  // POST FIX NOTATIONS
//  //functions that do not recieve any parameters have the property to be used in postfix notations
//  println(mary.isAlive())
//
//  //APPLY METHOD
//  println(mary.apply())
//  println(mary()) //both are equivalent

  println((mary + "(the rockstar)")()) //apply the apply() method on the result expression that will be resolved in to this

  println((+mary))

//  println(mary.learns("Scala"))
//  println(mary.apply(2))
  ///the apply method is a special method that is used to call the objects just like functions
}
