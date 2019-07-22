package com.example.basics

object Arrays extends App {

  println("Array Example")

  val newArr = new Array[String](3)  /**Initializing Array in Sacla*/

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
  newArr(0) = "Vidit"
  println(newArr(0))

  /**Printing array*/
  for(i <- 0.to(2))
    println(newArr(i))


  println("########################################################")
  val numNames = Array("zero", "one", "two")

  for(arr <- 1 until 3)
    println(numNames(arr))




}
