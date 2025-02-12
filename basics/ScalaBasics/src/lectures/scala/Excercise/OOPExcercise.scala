package Excercise

object OOPExcercise extends App {
  val write = new Writer("Ali","Khan",100)
//  println(write.fullName("Ali","khan"))

  val author = new Writer("Charles","Dicken",1812)
  val novel  = new Novel("Great Expectations",1861,author)

  val author1 = new Writer("Charles","Ali", 1912)
  val novel1 = new Novel("1983",1961,author1)

  println(novel.isWrittenBy(author))
  println(novel.authorAge)

}

class Writer(fname: String,sname:String,val year: Int = 0) {

  def fullName(): String = fname +" " + sname
}

class Novel(name:String, year:Int, author: Writer) {
  def authorAge = year - author.year
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel (name,newYear,author)

}
