package com.example.recursion

import scala.annotation.tailrec

object ConcatenateRecursion extends App {

  /**
   * Accumulator is used to store intermediate results.
   * Initially Accumulator must hold a value which must not effect the desired result. Such as 1 or "" in this case.
   * @param
   * @param times
   * @param accumulator
   * @return
   */
    @tailrec
    def process(word : String, times : Int, accumulator : String) : String = {
      if(times <= 0) accumulator
    else process(word, times - 1,word + accumulator)
    }

  println(process("Vidit",5,""))


}
