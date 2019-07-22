package com.example.basics

object HelloWorlsExtendsApp  extends App {
  println("Array Example")

  val newArr = new Array[String](3)  /**Initializing Array in Sacla*/
  val numNames = Array("zero", "one", "two") /**Initializing Array in Sacla*/

  newArr(0) = "This"
  newArr(1) = "Is"
  newArr(2) = "an Array."

  for(args <- newArr)
    println(args)

  println("*******************************")
  for(i <- 0 until 2)   /**  for(i <- 0 to 2)    both works fine */
    if(i == 1)
      println(newArr(i))

  println("*******************************")
  /** This will update the array index*/
  newArr(0) = "Vidit" /** or newArr.update(1,"Hi")*/
  println(newArr(0))

  /**Printing array*/
  for(i <- 0.to(2))
    println(newArr(i))

  /** Printing array from for each*/
  println("Printing array from for each")
  newArr.foreach(println)

  /** Printing array from for each*/
  println("Printing array from for each")
  numNames.foreach(args => println(args))
}
