package com.oop

object Oops extends App{

  val s = new Student("Vidit",27,"MCA")
  print(s)
  print(s.x)
  /*print(s.name)  will throw error*/
  println(s.course)// works fine as val is added before course and it has now become class variable. or instance variable.
  val stu = new Student("Netgear")
  println(stu)

  s.showDiff("Data")
}

/**
 * primary constructor.
 * @param name
 * @param age
 * @param course
 *  name ,age are here class Parameters. it is not accessible until we put val before these variable.
 *  val name is accessible through class object.
 *  passing default values to age.. works fine with constructor as well, when constructor overloading
 */
class Student(name : String, age : Int = 10,val course : String){

  val x = 10
  //Overriding to string to print values.
  override def toString: String = s"$name,$age,$course"

  //Auxiliary constructor
  def this(name : String) = this(name,0,"")

  /**
   *$name will always infer to the local variable inside the method as both class variable and method variable have same name.
   * To call class variable use this to infer.
   */


  def showDiff(name : String) : Unit =
    println(s"Hi ${this.name}, $name said to ${this.name}")


}
