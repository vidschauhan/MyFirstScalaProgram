package com.example.basics

object Tuples extends App {

  val tup = ("Vidit","Singh",1,2.0)
  print(tup._2)
  val a = new A
  val data = a.show(1,"Hello World")
  print(data)


}

class A {
    var x : String = ""
  def show(id : Int ,name : String) : Any =
    {
      val tuple = (id,name)
      (tuple._1,tuple._2) // no need to write return explicitly
    }
}
