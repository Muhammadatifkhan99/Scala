package part2oop

object CaseClasses extends App  {

  case class Person (name:String, age: Int)
  //1. parameters are by default converted into fields
  val khan = new Person("Khan",34)
  println(khan.name)

  //2. sensible toString is working
  println(khan.toString) // same as println(khan)

  //3. equal and hashcode implemented OOTB
  val ali = new Person("ali", 21)
  println(ali == khan) // this is not possible in normal classes

  //case classes have default copy methods
  val ali2 = ali.copy(age = 45)
  println(ali2)

  //5. case classes have companion objects
  //we do not use the keyword new when instantiating the objects of a class
  val theperson = Person
  val mary = Person("Mary", 23)

  //6. CCs are serializable
  //used for sending messages/case classes accross the distributed network

  //7. CCs are used in patten matching

  //8. CCs have case objects...They have the same properties as the case classes

  case object UnitedKingdom {
    def name: String = "The UK of GB and NI"
  }

  println(UnitedKingdom.name)

}
