package com.collections

import scala.collection.mutable

object MapAndConversions extends App {

  //Map takes Tuple type as Input.
  val aMap = Map(("Vidit",222),"Amit" -> 590)
  println(aMap)

  println(aMap.toList)

  val namesList = List("Vidit","Ritik","Amit","Raushan","Abhishek","Vidschauhan","Vaibhav","Ankita")
  println(namesList.groupBy(_.charAt(0)))

}
