package com.example.basics

object SpecialFunctions extends App {
  /** Scala allows you to indicate that the last parameter to a function may be repeated. This allows clients to
    pass variable length argument lists to the function. To denote a repeated parameter, place an asterisk
  after the type of the parameter.*/

  def display(str : String*) =  str.foreach(println)

  display("HI")
  display("HI","Hello","World")


  val arr = Array("What's", "up", "doc?")
/**  display(arr)  // This will result to type mismatch error as we try to pass an Array of specific type*/
  display(arr :_*)

}
