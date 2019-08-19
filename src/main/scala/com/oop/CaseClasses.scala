package com.oop

object CaseClasses extends App {

  case class Person(name : String, age : Int)
  //Case class convert class parameters to class fields.
  val vid = new Person("Vidit",27)
  println(vid.name) // Valid

  println(vid) /**or println(vid.toString) */
  // equals and hashCode are implemented out of the box
  val vid1 = new Person("Vidit",27)

  println(vid == vid1) // if case is omitted then it will return false

  // val vid2 = new Person(_,age = 25) // com.oop.CaseClasses$$$Lambda$4/2094777811@3aa9e816
  val vid3 = vid1.copy(age = 45) // This creates a new instance of person
  println(vid3)

  object Person{
    def apply(name: String, age: Int): Person = new Person(name, age)
  }
  //Case class have Companion objects.
  val vid4 = Person
  val vid5 = Person("Ritik",19)
  println(vid4)
  println(vid5)

  /*case object can't have Companion object because they are their own companion object*/
  case object India {
    def show(): Unit = println("Hello world!")
  }


}
