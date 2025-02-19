package part2oop

object InheritanceAndTraits extends App {


  class Animal {

    val creatureType = "wild"
    ///inherit only the nan-private members of the super class
    protected def eat = println("hmmmmmm!!!!!!!!I will eat you now")
  }
  //scala has single class inheritance
  class Cat extends Animal {
    def crunch = {
      eat //protect methods can be called in the child/derived classes
      println("crunch crunch")
    }
  }
  val cat = new Cat
  cat.crunch /// I will eat you


  //CONSTRUCTORS
  class Person(name: String, age:Int) {
    def this() = this("Atif",0)
  }
  class Adult(name:String, age: Int, idCard: String) extends Person() //This is the correct way of extending a class with perameters
 class Dog(override val creatureType:String) extends Animal {
//    //if this is not available the object will call the val from the parent class
   override def eat = println("crunch crunch")
 }
 val dog = new Dog("K9") //this is overriding the vals directly in the class constructor...
 dog.eat
 println(dog.creatureType)

 //


}