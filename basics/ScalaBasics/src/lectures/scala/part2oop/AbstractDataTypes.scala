package part2oop

object AbstractDataTypes extends App {
  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }
  //cannot create objects of the abstract class Animal
  //val animal = new Animal();  //Class 'Animal' is abstract; cannot be instantiated Animal is abstract; it cannot be instantiated
  class Dog extends Animal {
    override val creatureType: String = "Canine"
    //no need to write the override key word in the classes implementing these methods
    def eat: Unit = {
      println("I am eating you now")
    }
  }


  //trait
  trait Carnivor {
    //traits have abstrach fields and methods
    def eat(animal: Animal): Unit
  }
  class Crocodile extends Animal with Carnivor {
    //this class is extending Animal class, which is an abstract class and the methods needs to be implemented here to be valid
    override val creatureType: String = "croc"

    override def eat: Unit = println("nomnom")

    override def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureType}")
  }
  val dog = new Dog
  val croc = new Crocodile

  croc.eat(dog) //the method that takes in Animal object as argument will be called
  croc.eat // this will calls the method with no object takein as a parameter
}
