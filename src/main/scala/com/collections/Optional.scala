package com.collections

object Optional extends App {
  /*Some is a case class which wraps a concrete value.
  * None is a Singleton for absent values.
  * */
  val myFirstOption: Option[Int] = Some(4)
  val noOption: Option[Int] = None

  println(myFirstOption)

  //Where to use Option. To check null from methods. Chained Method.

  def betterUnsafeMethod() : Option[String] = None
  def betterBackupMethod() : Option[String] = Some("Better backup method!")

  val methods = betterUnsafeMethod().orElse(betterBackupMethod())
  println(methods)

  //function on Options
  println(myFirstOption.isEmpty)
  println(myFirstOption.get) // UNSAFE DON'T DO THIS

  //map.flatMap,filter.

  println(myFirstOption.map(_*5))
  println(myFirstOption.filter(_%3 ==0).map(_*2))
  println(myFirstOption.flatMap(x => Option(x * 10)))



}
