package part2oop

object InheritanceAndTraits extends App {


  class Animal {
    def eat = println("hmmmmmm!!!!!!!!I will eat now")
  }
  class Cat extends Animal {

  }
  val cat = new Cat
  cat.eat


  //CONSTRUCTORS
  class Person(name: String, age:Int) {
    def this(name:String) = this(name,0)
  }
  class Adult(name:String, age: Int, idCard: String) extends Person(name)
}
