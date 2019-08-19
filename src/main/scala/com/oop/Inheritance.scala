package com.oop

object Inheritance extends App {

  /**
   * Inheritance in Scala works more or less like Java. Most of the features have been derived from Java.
   * No private member can be inherited.
   * Protected members can be accessible within the subclass only.
   * class variable can also be overridden which is not present in java.
   */

  class Animal{
    def show() = "Animal show method!"
  }

  class Species extends Animal{
    override def show(): String = {
      println(super.show()) // Calls method of Base class i.e Animal
      "Species show method"
    }
  }

  val s = new Species
  println(s show)

  //Polymorphism. As an is type of Animal but instance of Species class. thus calls Species show method!
  val an : Animal = new Species
  println(an show)

  /**
   * Inheriting class having params in constructor.
   */

  class A(name : String, age : Integer){
    def display() = s"My name is $name & i am $age year old!"
    def this(name : String) = this(name,0)
  }

  //while inheriting class A you need to be careful. Watch the syntax.
  class B (name : String,country : String,age : Integer) extends A(name,age ){

  }
  //if a class has axuallary constructor then one can extend class as :
  class C(name : String, address : String) extends A(name){
  }
}
