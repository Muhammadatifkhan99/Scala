package Excercise

abstract class List {


  def head: Int
  def tail: List
  def isEmpty: Boolean
  def add(element: Int): List
}

//the empty list will be an object

object Empty extends List {
  //objects can actually extend classes
  def head: Int = throw new NoSuchElementException
  def tail: List= throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add(element: Int): List = new Cons(element, Empty)
}

class Cons(h: Int, t: List) extends List  {
  def head: Int = h
  def tail: List = t
  def isEmpty: Boolean = false
  def add(element: Int): List = new Cons(element, this)
}


object MyList extends App {
  val mylist = new Cons(1, new Cons(2,new Cons(3, Empty)))
  println(mylist.tail.head)
}