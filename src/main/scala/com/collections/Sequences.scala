package com.collections

object Sequences extends App {

  //Have well defined order and can be indexed.

  val aSequence = Seq(1,2,3,4)
  println(aSequence)

  println(aSequence.reverse)
  println(aSequence(2))
  val newSeq = aSequence ++ Seq(8,6,5,9)
  println(newSeq)
  println()
  print(newSeq.sorted)

  //Ranges
  val aRange : Seq[Int] = 1 to 6 /*or 1 until 6*/
  aRange.foreach(x => println("Hi")) // prints 6 times Hi,



}
