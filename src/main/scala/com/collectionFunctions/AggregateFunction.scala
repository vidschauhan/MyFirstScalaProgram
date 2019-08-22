package com.collectionFunctions

object AggregateFunction extends App{


  val donutBasket1: Set[String] = SEQUENCE_OF_STRING

  val donutLengthAccumulator: (Int, String) => Int = (accumulator, donutName) => accumulator + donutName.length
  val totalLength = donutBasket1.aggregate(0)(donutLengthAccumulator,_+_)
  println(totalLength)

}
