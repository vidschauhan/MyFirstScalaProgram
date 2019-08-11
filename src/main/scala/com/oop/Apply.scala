package com.oop


object Apply  extends App {
val p = new University("Vidit")
  println(p()) // When object is called with () then scala compiler searched for apply() in class.
  println(p.apply("Deepa"))
  println(p("Sssshhh"))
}

class University (name : String){
  def apply(): String = s"$name is happy to learn scala!"
  //Overload apply()
  def apply(name: String): String = s"$name was the ex girl friend of ${this.name} "
}
