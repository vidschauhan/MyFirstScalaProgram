package com.oop

object Static extends App {

  //This is Static in Scala. and has singleton instance
  /*Scala object = SINGLETON INSTANCE*/
  object Device{
  val MOBILE  ="Nokia"
    def display(model : String) = s"$MOBILE $model"
    /**
     * A Type of Design Pattern.
     */
    def apply(model : String): Device = new Device("Red")
  }

  //This will return a class instance.
  //COMPANION objects. same name as object and class.
  class Device(color : String){
    def show() : Unit =  "Hello world"
  }

  val a = Device
  val b = Device
  println(a == b) // will return true as Device is a singleton object.
  println(Device.MOBILE)
  println(Device.display("s2"))

  print(Device("Samsung"))

}
