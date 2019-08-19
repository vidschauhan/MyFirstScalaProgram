package com.functionalProgrraming

object MapFlatMapFilter extends App {

  val list = List(1, 2, 3, 4, 5)
  println(list.head)
  println(list.tail)

  println(list.map(_ + 1)) // Internally iterating and adding 1 to each elwments.
  println(list.map(_ + "is a number!"))

  println(list.filter(_ % 2 == 0))

  //flatMap
  val toPair = (x: Int) => List(x, x + 1) // This will produce  List(1,1+2).. List(5,5+1)
  val fMap = list.flatMap(toPair) // Iterating internally and passing list values to toPair which return above  value as List.
  println(fMap)

  //Print all possible combination between two list

  val num = List(1, 2, 3, 4, 5, 6)
  val chars = List('a', 'b', 'c', 'd', 'f', 'g')
  val combinations = num.filter(_ % 2 == 0).flatMap(n => chars.map(c => "" + c + n)) // So if you have 2 loops use 1 flatMap with 1map . If you have 3 loops use 2 flatmaps with a Map to extract results.
  println(combinations)
  //Above expressions can also be written as :

  val comb = for {
    n <- num if n % 2 == 0 //applying filter
    c <- chars
  } yield "" + c + n

  // Or

  val comb1 = for (n <- num; c <- chars) yield "" + c + n

  println(comb) // filtered combinations.
  println(comb1)

}
