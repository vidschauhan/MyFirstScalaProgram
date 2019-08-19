package com.collections

object Lists extends App {

  /**
   * Immutable Default
   * These are Sealed abstract class
   * head,tail,isEmpty() are fast O(1)
   * most operations are O(n)
   *
   */

  val l = List(1,2)
  val prepend = 42 :: l /*or 42 +: l*/
  println(prepend)

  val oranges = List.fill(5)("Oranges") // 5 oranges in list
  println(oranges)

  println(oranges.mkString(("-"))) //concatenates list to string with "-"


}
