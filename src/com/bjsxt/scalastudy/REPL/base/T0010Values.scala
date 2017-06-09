object T0010Values {


  /*
   Scala has a rich set of value types, and a rich literal syntax to
   support them.
   */
  //请在REPL上以此运行下列代码

  // Integers:
  val anInt = 3 + 3


  //Byte
  val aByte = anInt.toByte


  // Floating point:
  val aDouble = 4.0


  // Charaters:
  val aCharacter = 'c'


  // Strings:
  val aString = "Google"


  // Symbols:
  val aSymbol = 'foo


  // XML:
  val anXMLElement = <a href="http://www.google.com/">
    {aString}
  </a>


  // Tuples:
  val aPair = (aString, aDouble)


  // Lists:
  val aList = List(1, 2, 3, 4)


  // Ranges:
  val aRange = 1 to 5


  // Maps:
  val aMap = Map(3 -> "foo", 4 -> "bar")


  // Sets:
  val aSet = Set(8, 9, 10)


  // Arrays:
  val anArray = Array(1, 2, 3, 5)


  // Vector
  val aVector = Vector(1, 2, 3, 4, 5)


  // Unit:
  val unit = ()


  // Null:
  val nullValue = null


  // Functions:
  def incImplicit(x: Int) = x + 1

  // Anonymous Function
  val incAnonymous = ((x: Int) => x + 1)


}