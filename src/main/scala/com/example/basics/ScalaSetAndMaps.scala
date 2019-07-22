package com.example.basics

import scala.collection.immutable.HashSet
import scala.collection.mutable

object ScalaSetAndMaps extends App {

  val immutableSet = Set("Hi","Hello")
  //setExample += "Vidit" Invalid as set is Immutable

  val mutableSet = mutable.Set("This","is","Mutable")
  mutableSet += "set"

  mutableSet.foreach(println)
  immutableSet.foreach(println)

  val immutavleHashSet = HashSet("Tomatoes", "Chilies")
  println(immutavleHashSet)

  val mutableHashSet = mutable.HashSet("Tomatoes", "Chilies")
  mutableHashSet += "Carrot"
  println(mutableHashSet)


  println("************ Map Example *****************")

  val treasureMap = mutable.Map[Int, String]()
  treasureMap += (1 -> "Hi")
  treasureMap += (1 -> "Go to island.") // This will overwrite as the key is same;
  treasureMap += (2 -> "Find big X on ground.")
  treasureMap += (3 -> "Dig.")
  println(treasureMap)
  println(treasureMap(3))

  val immutableMap = Map(1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V")
  println(immutableMap)
}
