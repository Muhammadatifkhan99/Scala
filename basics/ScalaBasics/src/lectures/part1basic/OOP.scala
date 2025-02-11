object OOP extends App {

  val person = new Person("Ahmad",26);
  println(person.x) //string representation for this object is Person@13969fbe
  //person.age //to achieve this we need to pass val or vars in the constructor
  person.greet("Ali")
  person.greet()


}

class Person (name:String, val age:Int) { //these are arguments to the class
  //this means that every single object must be contructed by passing in a name and an age
val x = 2
  println(1 + 3)

  def greet(name:String):Unit = println(s"${this.name} says: Hi, $name") //Ali Says: He, to Ahmad
  //println(s"$name says: Hi, $name") =========> output for this is::::::::: Ali says: Hi, Ali
  // for accessing the current objects value for the name field we use a key word this
  def greet(): Unit = println(s"Hi: my is name is ${this.name}")

}

