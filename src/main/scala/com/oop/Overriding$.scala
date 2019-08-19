package com.oop

object Overridings extends App {

  class X{
    val pop = "Hello world!"
  }
  class Y extends X{
    override val pop: String = "its over!"
  }
  //well you may also write
 class Z(override val pop: String) extends X

  val zee = new Y
  println(zee pop)

  val zs = new Z("Its overridden now!")
  println(zs pop)

  //Sealed restricts  overriding a class in another file or package. but in the same file it is allowed
  sealed class DontOverride

  class P extends DontOverride


}
