package com.exceptions

object ScalaExceptions extends App {

  def throwException(isTrue: Boolean) =
    if(isTrue) throw new RuntimeException("This is a runtime exception")
  else 45

  //The type of output is AnyVal because it returns both string and int at runtime.
  val output: AnyVal = try{
    throwException(false)
  } catch {
    case e : RuntimeException => println("Runtime Exception caught")
  }
  finally {
    println("It will print no matter what happens!! ;)")
  }

  println(output)
}
