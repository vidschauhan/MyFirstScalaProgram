package com.practice

object FlatMapsExamples extends App {

  val num = List(1, 2, 3, 4, 5)
  val transform = (x: Int, y: Int) => List(x, x + y)

  val output = num.flatMap(x => transform(x, 5))
  println(output)

  val map = Map(1 -> "one", 2 -> "two", 3 -> "three")


  map.values.map(x => x).foreach(println)
  /*val op = if (map.values.filter(_.eq("one"))) "found" else None*/
  /*println(op)*/

  val  p = 1 to map.size flatMap(map.get)
  println(p)

  /*Remove consecutive repeating numbers*/
  def compressFunctional[A](ls: List[A]): List[A] =
    ls.foldRight(List[A]()) { (h, r) =>
      if (r.isEmpty || r.head != h) h :: r
      else r
    }

  val output1 = compressFunctional(List(1,2,2,3,4,4,5,5,21,22,22,22,12,21,21))
  println(output1)

  //Check if a list is palindrome
  def isPalindrome[A](ls: List[A]): Boolean = ls == ls.reverse

  val op: Boolean = isPalindrome(List(1,2,3,2,1))
  println(op)
}
