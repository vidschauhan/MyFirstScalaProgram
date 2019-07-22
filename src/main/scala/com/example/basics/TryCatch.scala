package com.example.basics

object TryCatch  extends  App {
val n = 56
  try{
    if(n%2==0)
      println(n)
    else
      throw new RuntimeException("n must be even")
  }


  println("Explicit Return Example")
  val ex = new TryExample(2,3)
  println(ex.f()) // Returns 3
  println(ex.g()) // Returns 2
}

class TryExample(a : Int, b : Int) {

  def f(): Int = try return a finally return b

  def g(): Int = try a finally b
}
