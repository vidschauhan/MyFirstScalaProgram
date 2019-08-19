package com.functionalProgrraming

object AnonymousFunctions extends App {

  //Anonymous function (LAMBDA)
  val doubler : Int => Int =  (x :Int) => x * 2  // Or val doubler1 : Int => Int =  _ * 2
  val adder : (Int,Int) => Int = (x:Int,y:Int) => x + y
  val adder1 : (Int,Int) => Int = _ + _   // writing Type of the adder1 is mandatory otherwise compiler error!

  //With No params
  val noParam = () => 5
  //Be CAREFUL
  println(noParam) // This is used to call simple method. here it prints whole lambda in object form
  println(noParam()) // This is called in case of anonymous Methods. which will print value

  //Curly braces with lambda
  val stringConverter = { () =>
    "5".toInt + 2
  }
  println(stringConverter())


}
