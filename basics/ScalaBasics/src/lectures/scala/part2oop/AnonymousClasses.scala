package part2oop

object AnonymousClasses extends App {
  abstract class Animal {
    def eat: Unit
    def makeSound(): Unit
  }

  val dog = new Animal {
    override def eat: Unit = println("aaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhh")
    override def makeSound() = println("mmmmaaaaaaaaaaaaaaahhhhhhhh")
  }
  println(dog.makeSound())


//  val funnyAnimal: Animal = new Animal {
//    override def eat: Unit = println("ahhhhhhhhhhhhhhhhhhhhhhh")
//  }

  //println(funnyAnimal.getClass) // class part2oop.AnonymousClasses$$anon$1
}
