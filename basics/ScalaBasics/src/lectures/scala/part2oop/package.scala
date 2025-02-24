import Excercise.Writer

import scala.collection.StringOps

package object part2oop
object PackageandImport extends App {

  //package members are accessible by their simple names
  val writer = new Writer("Atif", "RockTheJVM", 2021)

  //importing a package
  val string = new StringOps("Atif")


  //

}