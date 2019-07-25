package com.example.basics

object Closure extends App {

  val someNumbers = List(-11, -10, -5, 0, 5, 10)

  var sum = 0
  someNumbers.foreach(sum += _)
  println(sum)

  val variable = 1000
  val a = (x : Int) => x + variable  /** A closure is dependent upon outside variable and can be changed at runtime "Variable"*/
  println(a(10))
}
