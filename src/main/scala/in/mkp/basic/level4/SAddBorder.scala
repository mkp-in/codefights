package in.mkp.basic.level4

/**
  * https://app.codesignal.com/arcade/intro/level-4/ZCD7NQnED724bJtjN
  *
  * Given a rectangular matrix of characters, add a border of asterisks(*) to it.
  *
  * Example
  *
  * For
  *
  * picture = ["abc",
  * "ded"]
  *
  * the output should be
  *
  * addBorder(picture) = ["*****",
  * "*abc*",
  * "*ded*",
  * "*****"]
  *
  */
object SAddBorder {

  def main(args: Array[String]): Unit = {
    println(addBorder(Array[String]("abc", "ded")).mkString("\n"))
  }

  def addBorder(picture: Array[String]): Array[String] = {
    val len = picture(0).length
    val s:String = "*" * (len+2)
    var ret = Array[String]()
    ret = ret :+ s
    for (i <- 0 until picture.length) {
      ret = ret :+ ("*" + picture(i) + "*")
    }
    ret = ret :+ s
    ret
  }

  def addBorder2(picture: Array[String]): Array[String] = {
    val tb = "*" * (picture(0).length + 2)
    tb +: picture.map("*" + _ + "*") :+ tb
  }


}
