package com.collections

import scala.util.Random

object OptionsExercise$ extends App {

  val config: Map[String, String] = Map(
  "host" -> "192.168.0.1",
  "port" -> "80"
  )

  class Connection{
    def connected = "Connected!"
  }

  object Connection{
    val random = new Random(System.nanoTime())
    def apply(host:String,port:String): Option[Connection] = {
      println("random boolean : " +random.nextBoolean())
      if(random.nextBoolean()) Some(new Connection) else None
    }
  }

  val host = config.get("host")
  val port = config.get("port")

  /*code equivalent to  :
  * if(f!=null)
  * if(p!=null)
  * return Connection.apply(h,p)
  * */
  val connection = host.flatMap(h => port.flatMap(p => Connection(h,p)))
  println(connection)
  /*
  if(connection !=null)
  return c.connected
  return null*/
  val connectionStatus = connection.map(c => c.connected)
  println(connectionStatus)


  val forConnectionStatus = for {
    h <- host
    p <- port
    connection <- Connection(h, p)
  } yield connection.connected

  forConnectionStatus.foreach(println)
  
}
