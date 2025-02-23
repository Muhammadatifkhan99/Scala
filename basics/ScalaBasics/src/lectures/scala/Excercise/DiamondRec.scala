package Excercise

object DiamondRec extends App {
//  println("Hello World")

  def printDiamond(n: Int, current: Int = 1, step: Int = 2): Unit = { // return void ()
    if (current > n && step > 0) {
      printDiamond(n, current - 4, -2)
      return
    }
    if (current < 1 && step < 0) return // stop condition

    println(" " * ((n - current) / 2) + "*" * current)

    printDiamond(n, current + step, step)
  }

  printDiamond(7)

}
