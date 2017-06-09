package com.bjsxt.scalasutday.ide.advance_example

/**
  * Created by Albert on 2017/6/8.
  */
object T001000String {
  def main(args: Array[String]): Unit = {
    println("Hello, world".getClass.getName)


    val s = "Hello, world"

    println(s.length) // 12

    val s1 = "Hello" + " world"

    s.foreach(println)

//  StringOps
    "hello".foreach(println)

    for (c <- "hello") println(c)


    s.getBytes.foreach(println)

    val result = "hello world".filter(_ != 'l')

    println(result)

    println("scala".drop(2))

    println("scala".drop(2).take(2))

    println("scala".drop(2).take(2).capitalize)


  }
}
