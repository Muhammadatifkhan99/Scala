package part2oop

object Generics extends App {
  class List[A] {
    //use the type A here
  }
  val listofintegers = new List[Int]
  val listofString = new List[String]

  //generic methods
  object MyList {
    def empty[A] = MyList
  }
  val myemptylist = MyList.empty[Int]

  class Animal
  class Cat extends Animal
  class Dog extends Animal
  //bounded types
  class Cage [A <: Animal] (animal: A) //[A <: Animal] this puts a restrictions on the acceptable parameters to this class should be of only type animal(or its subtypes)
  val cage = new Cage(new Dog) // dog is a subtype of animal,,, Dog extends Animals

  //this will throw an error
//  class Car
//  val newCage = new Cage(new Car)



}
