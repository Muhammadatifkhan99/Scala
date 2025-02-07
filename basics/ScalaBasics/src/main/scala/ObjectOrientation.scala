
object ObjectOrientation extends App {

  class Animal {
    //defining members
    val age: Int = 23;

    def eat() = println("I am eating")
  }

  val anAnimal = new Animal

  class Dog(val name: String) extends Animal {
    val aDog = new Dog("Lassie")
    //constructor arguments are not fields , needs to put a val to make it behave like a field
    aDog.name

    //subtype polymorphism  Subtype polymorphism allows us to declare a variable as a parent type (Animal), but instantiate it as a child type (Dog).
    val aDeclaredAnimal: Animal = new Dog("Hachi")
    aDeclaredAnimal.eat() // the most derived class method will be called
  }

  abstract class WalkingAnimal {
    val hasLegs = true //by default public, can be restricted to private and protect
    def walk(): Unit

  }

    //"interface" = ultimate abstract type
  trait Carnivor {
    def eat(animal: Animal): Unit
  }
  trait Philospher {
    def ?!(thought: String): Unit = println(s"I was thinking! $thought")
  }
  class Crocodile extends Animal with Carnivor with Philospher {
    override def eat(animal: Animal): Unit = println("I am eating you! animal")
  }

  val aCroc = new Crocodile
//  aCroc.eat(aDog)
//  aCroc eat aDog //this infix notation can only be used with methods that have single arguments
  aCroc ?! "What if we could fly"



  //anonymous classes
  val dinosaur = new Carnivor {
    override def eat(animal: Animal): Unit = println("I am a dinosaur so I can eat pretty much anything")
  }
  /*what you tell the compiler
  * class Carnivor_Anonymous_93439 extends Carnivors {
  *      override def eat(animal: Animal): Unit = println("I am a dinosaur so I can eat pretty much anything")
  *  val dinosaur = new Carnivor_Anonymous_93439
*/
  //Singleton Objects


//  1. What is a Singleton Object ?
//  A singleton object in Scala is an  object that  has only one instance.  It is defined using the object keyword It cannot be instantiated using new.
//    It is automatically created when it is accessed
//  for the first time.
//    This is similar to static members in Java or global objects in other languages


  object singleton {
    val mySpecialValue = 53534
    def mySpecialMethod(): Int= 3434
    def apply(x:Int):Unit=x+1
  }
  singleton.mySpecialValue; //the values can be accessed this way from a singleton object......
  //the presence of an apply method in the class allows the instances to invoked like functions

  singleton.apply(65)
  singleton(65) //this is equivalent to the singleton.apply(65)


  //we can define an object with the same name as class, they will be called as companions and perfectly okay to do it

  object Animal { //companions-companions objects......because it has the same name as an existing class
    //companions have the property that they can access each others private properties
    val canLiveIndefinitly = false

  }


  val animalsCanLiveForever = Animal.canLiveIndefinitly //static methods/fields


    /*
    * case classes::light weight data structures with some boilerplates
    * sensible equal and hash code
    * Serialization
    * Companion with apply
    *  */

  case class Person(name: String,age:Int)

  val p1 = Person("Bob",122);

//exceptions
  try {
    val x: String = null
    x.length
  } catch {
    case e: Exception => "some faulty error message"
  } finally {
    //execute some code,,,,this will alway execute what ever the reason is
  }

}
