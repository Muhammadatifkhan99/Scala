package part2oop

object InheritanceAndTraits extends App {


  class Animal {

    val creatureType = "wild"
    ///inherit only the nan-private members of the super class
    final def eat = println("hmmmmmm!!!!!!!!I will eat you now") //use final to prevent overriding of this method in derived classes
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
  class Adult(name:String, age: Int, idCard: String) extends Person() //This is the correct way of extending a class with parameters
 class Dog(override val creatureType:String) extends Animal {
//    //if this is not available the object will call the val from the parent class
//   override def eat = println("crunch crunch in dog class")
 }
 val dog = new Dog("K9") //this is overriding the vals directly in the class constructor...
 dog.eat
 println(dog.creatureType)

 //Type Substitution (call it polymorphism in broad sense)
 val unknownAnimal: Animal  = new Dog("K9")
 unknownAnimal.eat    //dynamic polymorphism......rantime polymorphism
  //

 //
 // PREVENT OVERRIDING
 // 1-use final keyword on the member function:
 // 2-use final keyword on the class
 // 3-use seal keyword to prevent the class from extending in other files but can be extended in the same file.

}