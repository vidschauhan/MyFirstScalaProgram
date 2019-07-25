package com.example.basics

object PartiallyAppliedFunctions extends  App {

    val op = List(2,3,423,4,355,4,646,65,66,77,88,23)

    op.foreach(print _)
    println()
    op.foreach(print)
    println()

  def sum(a: Int, b: Int, c: Int) = a + b + c
  val s = sum _
  println(s(1,2,3))  /**  a.apply(1, 2, 3) behaves like this */

  val b = sum(1, _: Int, 3)

  println(b(10))


    }
