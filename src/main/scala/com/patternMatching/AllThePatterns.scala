package com.patternMatching

import sun.invoke.empty.Empty


/*
"@author : Vidit Singh"
"Date": 29 / 8 / 19
*/

object AllThePatterns extends App {

  /*
  A string literals, Boolean, Integer, or any Singleton object can be pattern matched.
  Pattern Matching can be nested.
   */
  /*Match Anything*/

  val x : Any = "Scala"

  val op = x match {
    case 1 => "match 1"
    case "Scala" => "Its scala"
    case true => "The truth"
    case AllThePatterns => "A singleton object"
  }

  println(op)

  val matchAnything = x match {
    case _ => "Anything is matched"
  }
  println(matchAnything)

  val matchAVar = x match {
    case something => s"I have found $something"
  }

  println(s"matching a variable  $matchAVar")
  //Matching Tuples

  val atuple = (1,2)
  val matchATuple = atuple match {
    case (1, 1) => ""
    case (1, something) => s"Found $something"

  }

  println(matchATuple)

  val nestedTuple = (1,(2,4))
  val matchNestedTuple = nestedTuple match {
        case (_,( 2 , placeHolder )) => s"Hello world, $placeHolder "
      }

  println(matchNestedTuple)


  /**
    * List Pattern
    */

  val myList = List(1,2,3,4,5)
  val myListMatches = myList match {
    case List(1,_,_,_,_) => s"Print $myList" // Once the match is  found it does not check for further statements.
    case 1 :: List(_) => ""
    case List(1,2,3,4) :+5 => "Borosil"

  }


  println(myListMatches)

  /**
  Multiple patterns in single go
   */

  val multiplePattern  = myList match {
    case List(1,_,_,_,_) | List(1,2,3,4) :+5 => "Found"
  }

  println(multiplePattern)

}
