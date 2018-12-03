package in.mkp.basic.level3

/**
  * https://app.codesignal.com/arcade/intro/level-3/3AdBC97QNuhF6RwsQ
  *
  * Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.
  *
  * Given a ticket number n, determine if it's lucky or not.
  *
  * For n = 1230, the output should be
  * isLucky(n) = true;
  *
  * For n = 239017, the output should be
  * isLucky(n) = false.
  *
  */
object SIsLucky {

  def main(args: Array[String]): Unit = {
    println(isLucky(1230))
    println(isLucky(239017))
  }

  def isLucky(n: Int): Boolean = {
    var a = Array[Int]()
    var sum:Int = 0
    var num:Int = n

    while (num != 0) {
      a = a :+ num % 10
      num /= 10
    }
    for (i <- 0 until a.size/2) {
      sum += a(i)
    }

    for (i <- a.size/2 until a.size){
      sum -= a(i)
    }

    sum == 0
  }
}
