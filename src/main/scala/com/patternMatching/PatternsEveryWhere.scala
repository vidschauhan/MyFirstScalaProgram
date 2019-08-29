package com.patternMatching

/*
"@author : Vidit Singh"
"Date" : 29/8/19
*/
object PatternsEveryWhere extends App {

  val lis = List(2,3,4,6,78,8)

  val op =  for{
    x <- lis if( x % 2 == 0)
  } yield x * 10

  println(op)

  /*val tupless = ((2,3),(4,5))
  val matchess = for{
    (first, second) <- tupless
  } yield first + second
*/


  val tuplse = (1,2,3)
  val (a,b,c) = tuplse /*This works*/

  println(b)

  val head  :: tail = lis

  println(s"Head : $head")
  println(s"Tails : $tail")

  val test = lis.map {
    case n if (n % 2 == 0) => n + "is Even"
    case 1 => " 1 found"
    case _ => "No match found"
  }

  println(test)
}
