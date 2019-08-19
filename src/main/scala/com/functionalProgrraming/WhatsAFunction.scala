package com.functionalProgrraming

object WhatsAFunction extends App {

  val fun: ((String, String) => String) = new Function2[String, String, String] {
    override def apply(v1: String, v2: String): String = v1 + v2
  }
  /**
   * There are 22 types of Functions.. Function1,Function2 ,,,, Function22[]
   * This can also be written as :
   * val fun : ((String,String) => String) = (v1: String, v2: String) => v1 + v2
   */

  val fun2: ((String, String) => String) = (v1: String, v2: String) => v1 + v2

  println(fun("Vidit", "Singh"))
  println(fun2("Hello", "World!"))


}
