package com.collections

object TuplesAndMaps extends App {

  val tup = (2,"Hello World")
  println(tup._1)
  println(tup.copy(_2 = "Hi There"))
  println(tup.swap)

  //Maps

  val map = Map((1,"Vidit"),2 -> "Singh").withDefaultValue("No key found")
  println(map)
  println(map.contains(2))
  // If the key doesn't exist Scala will throw runtime error such as NoSuchElementException
  /*To gaurd agains exception set default value*/

  println(map(5))
}
