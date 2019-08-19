package com.oop
import scala.language.postfixOps

object MethodNotation extends App {

  class Person(name : String, favoriteMovie : String){
    //Infix notation example
    def likes (movie : String): Boolean = movie == favoriteMovie

    def +(name : String) = s"${this.name} is hanging out with $name"

    //Prefix notation
    def unary_! : String = s"$name, what the hell!"

    //Postfix notation
    def isGreater : Boolean = 2 > 3

  }

  val person = new Person("Vidit","Prometheus")
  println(person.likes("Prometheus"))
  println(person likes "Prometheus") // This is infix style method calling. Only valid for single param methohds.
  /*
  Infix notation
  Method with single param can be called like {person likes "Prometheus"}
  Every operators are methods in scala. hence "likes" behaves like an operator  between object  and param.
  Method can be given any name like +,-,/,%,# ... etc
   */

  println(person + "Merry")

  /*
  Prefix notation.
  only works with UNARY operators - + ~ !
   */
  println(!person)

  /**
   * Postfix operator style
   * Only works with no param functions.
   */

  println(person.isGreater)
  println(person isGreater)
}
