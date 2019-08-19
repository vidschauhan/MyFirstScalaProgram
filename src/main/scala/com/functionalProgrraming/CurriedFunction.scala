package com.functionalProgrraming

object CurriedFunction extends App {


  /*This function takes Int as Parameter and returns Function which takes Int as parameter and returns Int*/
  /*The type of fun3 is (Int => (Int => Int))*/
  val fun3: Function1[Int, Function1[Int, Int]] = new Function[Int, Function1[Int, Int]] {
    override def apply(v1: Int): Function[Int, Int] = new Function[Int, Int] {
      override def apply(v2: Int): Int = v1 + v2
    }

    /*Below is the most optimized expression for the above function
    * val fun: Int => Int => Int = (v1: Int) => (v2: Int) => v1 + v2 */
    val fun: Int => Int => Int = v1 => v2 => v1 + v2
    val fun1: Int => Int = fun(5)
    println(fun1(6))
    /*we can also write*/
    println(fun(4)(3))

  }

}
