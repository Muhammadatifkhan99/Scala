package part2oop

object enums {
  //enums behave just like classes but the only difference is that we already have its instances specified, that are some sort of constants
  enum Permissions {
    //enums are used as a data type where we can already defined/enum all the possible cases/ instances of that type
    //these are the only instances of this class, we cannot create an other instances of this class
    //this is a  sealed data type that cannot be extended
    case READ, WRITE, EXECUTE, NONE
    //the only possible instance of this class are READ,WRITE,EXECUTE and NONE


    //ADDING FIELDS AND METHODS
    def openDocument(): Unit = {
      if (this == READ) println("opening document")
      else println("reading not allowed")
    }
  }
  //Constructor Arguments for Enums
  enum PermissionWithBits(bits:Int) {
    case READ extends PermissionWithBits(4) //100
    case WRITE extends PermissionWithBits(2) //010
    case EXECUTE extends PermissionWithBits(1) //001
    case NONE extends PermissionWithBits(0) //000
    //this is how constants are defined in an enum by specifying the right constructor arguments
  }

  //we can have companion objects as well for the enum
  object PermissionsWithBits {
    def fromBits(bits:Int) :PermissionWithBits =
      PermissionWithBits.NONE
  }

  //Standard API of Enum



  val somepermissions: Permissions = Permissions.READ // this is how we can use the instance of this permission

  def main(args: Array[String]): Unit = {
    //calling methods on permission instances
    somepermissions.openDocument()
  }
}
