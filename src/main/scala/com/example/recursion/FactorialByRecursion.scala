package com.example.recursion

object FactorialByRecursion extends App {

  def factorial(n : Int): BigInt ={
    if(n<= 1) 1
    else n * factorial(n-1)  //Recursion is written which eventually reaches to base point to exit.
  }

  println(factorial(32335))
}
