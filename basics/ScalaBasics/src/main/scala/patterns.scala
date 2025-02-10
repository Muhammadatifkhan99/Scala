object patterns extends App {
//  println("hello World")

//  //printing pattern
//  val n = 100
//  for (i <- 0 until n) {
//    print(" " * (n - i - 1))
//    println("*" * (i + 1))
//  }
//  for (i <- (n - 2) to 0 by -1) {
//    print(" " * (n - i - 1))
//    println("*" * (i + 1))
//  }
  //nested loops


  val n = 5
  for (i <- 0 until (2 * n - 1)) {
    val stars = if (i < n) i + 1 else 2 * n - i - 1
    val spaces = n - stars

    for (_ <- 0 until spaces) print(" ")
    for (_ <- 0 until (2 * stars - 1)) print("*")

    println()

  }

}
