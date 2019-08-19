package com.oop

object AnynomousClasses extends App {

  abstract class Animal {
    def print()
    val tp : String
  }

  //Instantiating Anonymous class
    val c = new Animal {
      override def print(): Unit = println("Hi i am cat class")
      override val tp: String = "Mew"
      }

  c.print()
  println(c tp)

  class Bird(name : String){
    def display() : String = s"Its $name"
  }

  val anynom : Bird = new Bird("Parrot"){
    override def display(): String = s"Hi there!"
  }
  println(anynom display)
}
