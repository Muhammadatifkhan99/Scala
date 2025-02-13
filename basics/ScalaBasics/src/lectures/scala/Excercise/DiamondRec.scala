package Excercise

object DiamondRec extends App {
  println("Hello World")

  def printDiamond(n: Int, current: Int = 1): Unit = {
    if (current > n) return // Base case

    printRow(n, current)
    printDiamond(n, current + 2)
    if (current < n) printRow(n, current)
  }

  def printRow(n: Int, stars: Int): Unit = {
    val spaces = (n - stars) / 2
    println(" " * spaces + "*" * stars)
  }

  printDiamond(5)


}
