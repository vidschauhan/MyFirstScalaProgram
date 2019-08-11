package com.example.basics

object DefaultAndNamedParameters extends  App {

  def show(name : String , age : Int) =
    println(s"Hi, My name is $name and i am $age year old")

  show("Vidit",27)

  /**
   * To pass default value in method param
   * You can emit the params from method calls, but can't emit 1st param if you provide rest of the params.
   * as scala compiler confuses the sequence of the parameters.
   * display(30) will not work as it looks for the first param.
   * display("Vidit",27) works fine!
   * display(27,"Vidit") will not work! Type Mismatch
   * display(age = 27,name = "Vidit") works like charm!
   */

  def display(name : String , age : Int = 25) =
    println(s"Hi, My name is $name and i am $age year old")

  display("Amit")
  display(age = 29,name = "Vidit")

  def prints(name : String = "Anynomous" , age : Int = 25) =
    println(s"Hi, My name is $name and i am $age year old")

  prints()
  /*prints(40) wont work!*/
}
