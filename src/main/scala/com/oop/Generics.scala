package com.oop

object Generics extends App {
//Generic class
  class MyList[A]{
}
  class MyMap[key,value]

  val listOfIntegers = new MyList[Int]
  val listOfString = new MyList[String]

  object MyList{
    def empty[A] : MyList[A] = ???
  }

  val emptyList = MyList.empty[Int]
}
