package com.exceptions

object CustomException extends App {

  def greater(x : Int, y : Int) : Boolean =
    if(x > y) throw new MyException("Runtime") // calling apply() of case class.
    else true

 val op =  try
    {
      greater(7,4)
    } catch{
    case e: MyException => "Runtime exception caught"
  }
  println(op)
}

case class MyException(message : String) extends Exception // or extend simple class
{
  def apply(): MyException = new MyException(message)
}
