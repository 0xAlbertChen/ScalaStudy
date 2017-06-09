package com.bjsxt.study

/**
  * Created by Albert on 2017/5/26.
  */
object T01Function {

  //TODO

  def sayHello(name:String = "chenxiaoyu") {
    println("hello " + name)
  }

  def  add(a:Int,b:Int ) = a+b
  def add2 = add (_:Int ,2)


  val t = () => {println("I love zhangmanyu"); 100}

  def func(c: ()=>Int) = {
    c()
  }

  def main(args: Array[String]): Unit = {
    sayHello()

    println(add ( 1 , 2))
    println(add2(3))
    println(func(t))

    println(s"")
    val name = "chenxiaoyu"
    val height = 1.8
    "%s is %2.2f meters tail".format(name, height)
    val s1:String = "123"
    s1.format()
    s1.sorted

  }



}

