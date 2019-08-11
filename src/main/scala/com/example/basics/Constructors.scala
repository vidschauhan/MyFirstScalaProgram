package com.example.basics

object Constructors extends App {

  val ex = new Example("Hello","World","HI")
  println(ex)

  val cons = new Example("single")
  println(cons)
  println(cons.show("Vidit"))

}


class Example (arg1 : String , arg2 : String,arg3 : String){

  override def toString: String = arg1 + "," + arg2 + "," + arg3

  //Auxiliary constructor
  def this(args3 : String) = this("","",args3)

  def show(arg4 : String) : String  ={
    val arg = arg4
    arg
  }
}