package com.example.recursion

import scala.annotation.tailrec
import scala.jdk.Accumulator

object TrailingRecursion extends App {

  def showFactotial(n: Int): BigInt = {
    @tailrec // Optional
    def fact(x: Int, accumulator: Int): BigInt =
      if (x <= 1) accumulator
      else fact(x - 1 , x * accumulator) //TAIL RECURSION use recursive calls at last EXPRESSION.
    fact(n,1)
  }

  /**
   * How Trailing recursion Works ?
   * showFactorial(10) = fact(10,1)
   *  = fact(9,10*1) goes to else part.. and calls itself.
   *  = fact(8,10*9*1)
   *  = fact(7,10*9*8*1) .... Until  fact(1,10*9*8*7*6*5*4*3*2*1)
   */

println(showFactotial(3335))
}