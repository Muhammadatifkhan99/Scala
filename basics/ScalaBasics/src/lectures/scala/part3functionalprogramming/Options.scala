package part3functionalprogramming

import scala.util.Random

object Options extends App {
  //options are wrapper for a value that might be present or not
  //options means the possible absence of a value.
  val myFirstOption: Option[Int] = Some(4)
  val noOption: Option[Int] = None
  //OPTIONS ON MAPS
  val map = Map("key" -> 123)
  println(map.get("key"))
  println(map.get("other"))
  //Map uses Option on its basic get operations

  println(myFirstOption)
  println(noOption)
  //Options were invented to deal with unsafe APIs

  //unsafe APIs
  def unsafemethod(): String = null
  //val result = Some(null) ///wrong way of doing this
  val result = Option(unsafemethod())

  def backupmethod(): String = "A valid string"
  val chainedResult = Option(unsafemethod()).orElse(Option(backupmethod())) //the first method will be called, if it returned a null value then the second option will be used
  println(chainedResult)

  //Designing of unsafe API with Options
  def betterUnsafeMethod(): Option[String] = None
  def betterBackupMethod(): Option[String] = Some("A valid result")
  val betterChainedResult = betterUnsafeMethod() orElse betterBackupMethod()
  println(betterChainedResult)

  ///map, flatmap, filter
  println(myFirstOption.map(x => x * 2))
  println(myFirstOption.filter(_ > 10))
  //this recieve a function that turns an element into an option
  println(myFirstOption.flatMap(x => Option(x * 10)))


  /*
  * EXCERCISE
  * */

  val config: Map[String,String] = Map(
    //suppose these values are fetched from somewhere else
    "host" -> "176.45.36.1",
    "port" -> "80" //for http
  )
  class Connection {
    def connect = "Connected"
  }
  object Connection {
    val random = Random(System.nanoTime())
    def apply(host:String,port:String):Option[Connection] = {
      if(random.nextBoolean()) Some(new Connection)
      else None
    }
  }
  val host = config.get("host")
  val port = config.get("port")
/*
* if (h!=  null)
    if(p!=null)
      return Connection.apply(h,p)
  return null
*
* */
  val connection = host.flatMap(h => port.flatMap(p=>Connection.apply(h,p)))
  val connectionStatus = connection.map(c => c.connect)
  println(connectionStatus)
  connectionStatus.foreach(println)


}
