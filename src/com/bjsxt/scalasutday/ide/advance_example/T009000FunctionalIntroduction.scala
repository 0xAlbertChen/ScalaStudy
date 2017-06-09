package com.bjsxt.scalasutday.ide.advance_example

/**
  * Created by Albert on 2017/6/9.
  */
object T009000FunctionalIntroduction {


  def main(args: Array[String]): Unit = {
    val a = "a"
    val b = "b"
    //    val aString = "20"
    val aString = "abc"

    val greater = if (a > b) a else b

    println(greater)

    val result = try {
      aString.toInt
    } catch {
      case _ => 0
    }


    println("result: " + result)
  }
}
