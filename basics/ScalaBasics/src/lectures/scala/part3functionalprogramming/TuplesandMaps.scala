package part3functionalprogramming

object TuplesandMaps extends App {
  //tuples = finite ordered lists
  val aTuple = new Tuple2[Int,String](2,"Hello Scala")
  println(aTuple)
  println(aTuple._1)
  println(aTuple._2)
  println(aTuple.copy(_2 = "goodbye Java"))
  println(aTuple.swap)

  ///Maps= Key Value pairs
  //key is used to Index a Value, while Value is the actual data
  val aMap: Map[String, Int] = Map()
  //            Key,    Value
  val phoneBook = Map(("Jim",456), "Atif" -> 789).withDefaultValue(-1)
  // a->b is sugar for (a,b)
  println(phoneBook)

  //Maps Operations
  println(phoneBook.contains("Jim"))
  println(phoneBook("Marry"))


  //functional on maps
  println(phoneBook.map(pair => pair._1.toLowerCase ->pair._2)) //converts the key to lowercase while prints the second value as it is.
  //filter keys
  println(phoneBook.view.filterKeys(x => x.startsWith("J")).toMap) //filters out keys that start with lowercase j.
  //mapValues...this is mapping values only
  println(phoneBook.view.mapValues(numbers => numbers * 100).toMap) //go to all the values and append two zeros at the end of that value.

  //conversions to other collections
  println(phoneBook.toList)
  println(List(("Automotive",555)).toMap)

  val names = List("Ali", "Aslam", "Uqaab","Usama", "Mehmood","Maryam","Sana", "Saif")

//    .groupBy(. ..) is a higher - order function that groups elements based on a condition.
//    It organizes elements into a Map , where:
//                              Keys are the grouping criteria(in this case, the first letter of each name)
//                              Values are lists of names that share the same first letter.

    println(names.groupBy(names => names.charAt(0))) //this will convert this into a hashmap and group them based on the Lambda function.




}
