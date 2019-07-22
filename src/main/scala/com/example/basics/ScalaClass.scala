package com.example.basics

import scala.collection.mutable

object ScalaClass extends App {
/*
  def add(toByte: Byte) = ???
*/

  /*def main(args: Array[String]) : Unit = {
    println("Hello, world!")

*/
  val x = new Rational(6,9)
  val y = new Rational(12,4)

    print(x add y) /**   x.add(y) */



}

class Rational(n: Int, d: Int) { // This won't compile

  /** This will not run. Although class parameters n and d are in scope in the code of your add method, you can only access
    their value on the object on which add was invoked.*/
  /*def add(that: Rational): Rational =
    new Rational(n * that.d + that.n * d, d * that.d)*/

    require(d != 0)


    private val g = gcd(n.abs,d.abs)

  val numer: Int = n/g
  val denom: Int = d/g

  override def toString = numer + "/" + denom
    def add(rational: Rational): Rational =
      new Rational(
        numer * rational.denom + rational.numer * denom,
        denom * rational.denom
      )

  private def gcd(n : Int , d : Int) : Int =
    if(d == 0) n else gcd(d,n%d)

}
