package com.example.basics

object MatchExpression extends App {

  val m = new Expression("salt")
  m.matchExp()

  val exp = m.matchExpReturnsValue()
  println(exp)
}

class Expression(args1 : String){

  /** The default case is specified with an underscore (_), a
  wildcard symbol frequently used in Scala as a placeholder for a completely unknown value.*/

  def matchExp(): Unit = {
    args1 match {
      case "salt" => println("pepper")
      case "chips" => println("salsa")
      case "eggs" => println("bacon")
      case _ => println("huh?")
    }
  }

  // Case is returning to some value.
  def matchExpReturnsValue(): String = {
    args1 match {
      case "salt" => "Hi"
      case "chips" => "Hello"
      case "eggs" => "There?"
      case _ => "huh?"
    }
  }
}
