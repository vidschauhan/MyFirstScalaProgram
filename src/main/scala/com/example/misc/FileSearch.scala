package com.example.misc

object FileSearch extends App {

  private def listOfFiles = (new java.io.File(".")).listFiles

  def filesEnding(lists : String ): Unit = {
    for (file <- listOfFiles; if file.getName.endsWith(lists))
      yield file
  }

  println(filesEnding _)
}
