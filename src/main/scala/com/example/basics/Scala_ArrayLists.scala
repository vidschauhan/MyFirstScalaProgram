package com.example.basics

object Scala_ArrayLists extends  App {

  /** Scala Lists are always immutable (whereas Java Lists can be mutable).*/
  val newList = List(1,2,3,4,5)

  for(list <- 0 until newList.length )
    println(newList(list))

  println("**********************************")
  val list2 = List("List1","List2")

  /** This will merge both lists*/
  val mergedList = newList ::: list2
  mergedList.foreach(arg => println(arg))

  println("**********************************")
  val conList = 1:: 2:: 3 :: Nil
  conList.foreach(print)

  /** empty list */

  val emptyList = Nil
  val empty = List()
  println("Empty List")

  val lis = "H00I"::"Hello":: empty
  emptyList.foreach(print)
  empty.foreach(lis)

  val intAndStringList = List(1,2,3,4,"Hi","Vidit")
  intAndStringList.foreach(print)

  println("List comparison")
  val list1 = List(1,2,3)
  val list3 = List(1,2,3)

  println(list1 == list3)

}

