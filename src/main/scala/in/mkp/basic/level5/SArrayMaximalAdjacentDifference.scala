package in.mkp.basic.level5

/**
  * https://app.codesignal.com/arcade/intro/level-5/EEJxjQ7oo7C5wAGjE
  *
  * Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.
  *
  * Example
  *
  * For inputArray = [2, 4, 1, 0], the output should be
  * arrayMaximalAdjacentDifference(inputArray) = 3.
  *
  */
object SArrayMaximalAdjacentDifference {

  def main(args: Array[String]): Unit = {
    print(arrayMaximalAdjacentDifference(Array[Int](2, 4, 1, 0)))
  }

  def arrayMaximalAdjacentDifference(inputArray: Array[Int]): Int = {
    inputArray.sliding(2).map(a => Math.abs(a(0) - a(1))).max
  }

}
