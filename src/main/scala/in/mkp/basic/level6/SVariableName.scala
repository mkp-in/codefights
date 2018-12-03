package in.mkp.basic.level6

/**
  * https://app.codesignal.com/arcade/intro/level-6/6Wv4WsrsMJ8Y2Fwno
  *
  * Correct variable names consist only of English letters, digits and underscores and they can't start with a digit.
  *
  * Check if the given string is a correct variable name.
  *
  * Example
  *
  * For name = "var_1__Int", the output should be
  * variableName(name) = true;
  * For name = "qq-q", the output should be
  * variableName(name) = false;
  * For name = "2w2", the output should be
  * variableName(name) = false.
  *
  **/
object SVariableName {

  def main(args: Array[String]): Unit = {
    println(variableName("var_1__Int"))
    println(variableName("qq-q"))
    println(variableName("2w2"))
  }

  def variableName(name: String): Boolean = {
    name.matches("[A-Za-z_][A-Za-z_0-9]+")
  }

}
