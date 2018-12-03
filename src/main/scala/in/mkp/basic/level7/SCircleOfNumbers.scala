package in.mkp.basic.level7


/**
  * https://app.codesignal.com/arcade/intro/level-7/vExYvcGnFsEYSt8nQ
  *
  * Consider integer numbers from 0 to n - 1 written down along the circle in such a way that the distance
  * between any two neighboring numbers is equal (note that 0 and n - 1 are neighboring, too).
  *
  * Given n and firstNumber, find the number which is written in the radially opposite position to firstNumber.
  *
  * Example
  *
  * For n = 10 and firstNumber = 2, the output should be
  * circleOfNumbers(n, firstNumber) = 7.
  *
  * <img src="./codesignal.basic.level7.example1.png"/>
  *
  */
object SCircleOfNumbers {

  def main(args: Array[String]): Unit = {
    println(circleOfNumbers(10, 2))
    println(circleOfNumbers(10, 7))
    println(circleOfNumbers(6, 3))
  }

  def circleOfNumbers(n: Int, firstNumber: Int): Int = {
    val mid = n / 2
    (firstNumber + mid) % n
  }

}
