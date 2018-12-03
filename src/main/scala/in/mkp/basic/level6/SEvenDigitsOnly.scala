package in.mkp.basic.level6

/**
  * https://app.codesignal.com/arcade/intro/level-6/6cmcmszJQr6GQzRwW
  *
  * Check if all digits of the given integer are even.
  *
  * Example
  *
  * For n = 248622, the output should be
  * evenDigitsOnly(n) = true;
  * For n = 642386, the output should be
  * evenDigitsOnly(n) = false.
  */
object SEvenDigitsOnly {

  def main(args: Array[String]): Unit = {
    println(evenDigitsOnly(248622))
    println(evenDigitsOnly2(248622))
  }

  def evenDigitsOnly(n: Int): Boolean = {
    var num = n
    var ret:Boolean = true
    while(num != 0 && ret) {
      if ((num % 10) %2 != 0)
        ret = false
      num = num / 10
    }
    ret
  }


  def evenDigitsOnly2(n: Int): Boolean = {
    n.toString.forall(_.asDigit %2 == 0)
  }

}
