object ObjectOrientation extends App {

  class Animal {
    // Defining members
    val age: Int = 23;

    def eat() = println("I am eating")
  }

  val anAnimal = new Animal

  class Dog(val name: String) extends Animal {
    val aDog = new Dog("Lassie")
    // Constructor arguments are not fields by default.
    // We need to use `val` to make them behave like fields.
    aDog.name

    // Subtype polymorphism allows us to declare a variable as a parent type (Animal),
    // but instantiate it as a child type (Dog). This enables dynamic method dispatch.
    val aDeclaredAnimal: Animal = new Dog("Hachi")
    aDeclaredAnimal.eat() // The most derived class method will be called
  }

  abstract class WalkingAnimal {
    val hasLegs = true // By default public, can be restricted to private and protected.
    def walk(): Unit
  }

  // "Interface" in Scala: Traits are the ultimate abstract type,
  // allowing multiple inheritance and modular code composition.
  trait Carnivor {
    def eat(animal: Animal): Unit
  }

  trait Philospher {
    def ?!(thought: String): Unit = println(s"I was thinking! $thought")
  }

  // A class can extend multiple traits using `with`
  class Crocodile extends Animal with Carnivor with Philospher {
    override def eat(animal: Animal): Unit = println("I am eating you! animal")
  }

  val aCroc = new Crocodile
  // `?!` is an infix method notation that can only be used with methods that take a single argument.
  aCroc ?! "What if we could fly"

  // Anonymous classes: These are instances of an anonymous subclass,
  // allowing quick implementation without defining a named class.
  val dinosaur = new Carnivor {
    override def eat(animal: Animal): Unit = println("I am a dinosaur so I can eat pretty much anything")
  }
  /*
   * What happens internally:
   * class Carnivor_Anonymous_93439 extends Carnivor {
   *    override def eat(animal: Animal): Unit = println("I am a dinosaur so I can eat pretty much anything")
   * }
   * val dinosaur = new Carnivor_Anonymous_93439
  */

  // Singleton Objects: These are objects that have only one instance.
  // They are defined using the `object` keyword and cannot be instantiated using `new`.
  // They are automatically created when accessed for the first time.
  // This is similar to static members in Java or global objects in other languages.

  object singleton {
    val mySpecialValue = 53534
    def mySpecialMethod(): Int = 3434
    def apply(x: Int): Unit = x + 1
  }

  singleton.mySpecialValue // Values can be accessed this way from a singleton object.

  // The presence of an apply method in the class allows instances to be invoked like functions.
  singleton.apply(65)
  singleton(65) // Equivalent to singleton.apply(65)

  // Companion Objects: An object with the same name as a class is called a companion object.
  // It can access the private members of the class, and vice versa.

  object Animal { // Companion object for the `Animal` class
    val canLiveIndefinitly = false
  }

  val animalsCanLiveForever = Animal.canLiveIndefinitly // Acts like a static method/field.

  /*
   * Case Classes: These are lightweight data structures with built-in boilerplate features:
   * - Sensible `equals` and `hashCode`
   * - Serialization support
   * - Companion object with `apply` method for easy instantiation.
   */

  case class Person(name: String, age: Int)

  val p1 = Person("Bob", 122) // No need for `new`, thanks to the companion object's `apply` method.

  // Exception Handling
  try {
    val x: String = null
    x.length
  } catch {
    case e: Exception => println("Some faulty error message")
  } finally {
    // This block executes no matter what (successful or failed execution)
    //usually done to close files, connection to the network etc
  }

  // Generics: Allow us to define a class that can work with different types instead of just one.
  abstract class MyList[T] {
    def head: T
    def tail: MyList[T]
  }

  // Using Generics with concrete types
  val aList: List[Int] = List(1,2,3) // List.apply(1,2,3)
  val first = aList.head // Retrieves the first element
  val rest = aList.tail // Retrieves the rest of the list
}
