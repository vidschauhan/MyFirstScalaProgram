package com.patternMatching

import scala.util.Random

object Patterns extends App {


  val random = new Random()
  val x = random.nextInt(10)

  val output = x match {
    case 1 => s"Hi,This is $x"
    case 2 => s"Hi,This is $x"
    case 3 => s"Hi,This is $x"
    case 4 => s"Hi,This is $x"
    case _ => s"No match found for $x"


  }
  println(output)


  /**
    * Pattern matching for Classes
    */

  case class Person(name : String,age : Int)

  val p = new Person("vidit",28)

  val matchFound = p match {
    case Person(name, age) => s"Hi, I am $name and i am $age year old."
      case  _ => "oops, No match found!"
  }

  println(matchFound)


}
