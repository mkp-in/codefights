package in.mkp.basic.level6

/**
  * https://app.codesignal.com/arcade/intro/level-6/PWLT8GBrv9xXy4Dui
  *
  * Given a string, replace each its character by the next one in the English alphabet (z would be replaced by a).
  *
  * Example
  *
  * For inputString = "crazy", the output should be
  * alphabeticShift(inputString) = "dsbaz".
  *
  */
object SAlphabeticShift {

  def main(args: Array[String]): Unit = {
    println(alphabeticShift("crazy"))
  }

  def alphabeticShift(inputString: String): String = {
    inputString.map(c => if (c == 'z') 'a' else (c + 1).toChar)
  }
}
