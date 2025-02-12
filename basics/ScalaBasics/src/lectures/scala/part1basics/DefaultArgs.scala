package part1basics

object DefaultArgs extends App {

  def reFact(n: Int, acc: Int=1): Int = {
    if( n <= 1) acc
    else reFact(n - 1, acc * n)
  }
  val fact10 = reFact(10)
  val facto = reFact(10,2)

  def savePicture(format: String = "jpg", width: Int =1920, height: Int =1980): Unit = {
    println("saving picture in to you computer")
  }

  savePicture("bmp")

}
