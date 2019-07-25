package com.example.basics

object FunctionLiterals extends App {

  val list = List(2,3,-1,-5,22,6,9,15,12)

  val refinedList = list.filter(x => x > 5)
  val anotherList = list.filter(_ > 10) /** "_"  denotes for place holder. which can be anything.*/
  println(refinedList)
  println(anotherList)

  /** You can also modify the values anynomously using Function literals*/

  var increase = (x: Int) => x + 1 /** It is mandatory to use paranthesis in this condition as well as datatypes*/

  println(increase(10)) /** You may call Function values as function call() */

  /** You may also write  multiple lines inside function Values*/
  var code = (x : Int) => {
    println("Hello World!")
    x + 100
  }

  val tup = (q : Int, w : Int) => {
    println("This is example which return two values")
    (q + 2, w - 5)
  }

  val response = tup(100,400)
  println(response._1,response._2)


  val lit = (_ : Int) +( _ : Int)
  println(lit(10,20))
}
