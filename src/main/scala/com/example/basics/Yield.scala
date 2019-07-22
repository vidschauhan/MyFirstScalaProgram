package com.example.basics

object Yield extends App {

  /**or each iteration of your for loop, yield generates a value which will be remembered.It
  's like the for loop has a buffer you can’t see, and
  for each iteration of your for loop another item is added to that buffer
  .When your for loop finishes running
  , it will return this collection of all the yielded values.The type of the collection that is returned is the same
  type that you were iterating over
  ,so a Map yields a Map ,a List yields a List , and so on.*/
  val arr = Array(1,2,3,4,5,6,7,8,9)

  val storedValues =  for(i <- 1 to arr.length) yield i * 2

  println(storedValues)
}
