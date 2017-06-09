package com.bjsxt.scalasutday.ide.advance_example

/**
  * Created by Albert on 2017/6/8.
  */
object T009010Anonymous_function {

  def main(args: Array[String]): Unit = {

    //匿名函数（Anonymous functions）又被称为"函数字面量"（Function Literals）
//    匿名函数可以作为变量传入以函数作为参数的方法中
//    也可以赋值给一个变量

//  Given this List:
    val x = List.range(1, 10)
//    you can pass an anonymous function to the List’s filter method to create a new List
//    that contains only even numbers:
    val evens0 = x.filter((i: Int) => i % 2 == 0)

    val evens1 = x.filter(i => i % 2 == 0)

    val evens2 = x.filter(_ % 2 == 0)

    x.foreach((i:Int) => println(i))

    x.foreach((i) => println(i))

    x.foreach(i => println(i))

    x.foreach(println(_))

    x.foreach(println)

  }



}
