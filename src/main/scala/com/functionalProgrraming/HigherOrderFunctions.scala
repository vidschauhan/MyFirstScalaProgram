package com.functionalProgrraming

import scala.annotation.tailrec

object HigherOrderFunctions extends App {
/** A function which takes function as Input and returns Function as output are  HOFs
  ex : Map,flatMap,filter */

  /**
   * function that applies a function n times over a value x
   * nTimes(f,n,x)
   * nTimes(f,3,x) = f(f(f(x))) */

  @tailrec
  def nTimes(plusOne : Int => Int, n : Int, x : Int) : Int = {
    if(n <=0) x
    else nTimes(plusOne,n-1,plusOne(x))
  }

  val plusOne = (x : Int) => x + 1

  println(nTimes(plusOne,10,1))

}
