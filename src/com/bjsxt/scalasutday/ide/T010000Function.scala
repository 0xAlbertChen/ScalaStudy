package com.bjsxt.scalasutday.ide

/**
  * Created by Albert on 2017/6/8.
  */
object T010000Function {

  //TODO

  def sayHello(name: String = "chenxiaoyu") {
    println("hello " + name)
  }

  def add(a: Int, b: Int) = a + b

  def add2 = add(_: Int, 2)


  val t = () => {
    println("I love zhangmanyu");
    100
  }

  def func(c: () => Int) = {
    c()
  }

  def main(args: Array[String]): Unit = {
    sayHello()

    println(add(1, 2))
    println(add2(3))
    println(func(t))

    println(s"")
    val name = "chenxiaoyu"
    val height = 1.8
    println(
      "%s is %2.2f meters tail".format(name, height)
    )
    val s1: String = "123"
    s1.format()
    s1.sorted


    //    def max(x: Int, y: Int): Int = {
    //      if (x > y) {
    //        return x
    //      }
    //      else {
    //        return y
    //      }
    //    }

    def max(x: Int, y: Int): Int = {
      if (x > y) x else y
    }

    def testPrint(x: Int, y: Int): Unit = {
      println(s"val x is $x\nval y is $y")
      1
    }

    testPrint(1, 2)

  }


}

