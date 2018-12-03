package in.mkp.basic.level4

/**
  * https://app.codesignal.com/arcade/intro/level-4/xvkRbxYkdHdHNCKjg/
  *
  * You are given an array of integers. On each move you are allowed to increase exactly one of its element by one. Find
  * the minimal number of moves required to obtain a strictly increasing sequence from the input.
  *
  * Example
  *
  * For inputArray = [1, 1, 1], the output should be
  * arrayChange(inputArray) = 3.
  *
  * Input:
  *
  * inputArray: [2, 1, 10, 1]
  *
  * Expected Output: 12
  *
  *
  * Input:
  *
  * inputArray: [-1000, 0, -2, 0]
  *
  * Expected Output: 5
  *
  */
object SArrayChange {

  def main(args: Array[String]): Unit = {
    println(arrayChange(Array[Int](2, 1, 10, 1)))
  }

  def arrayChange(inputArray: Array[Int]): Int = {
    var sum:Int = 0
    for (i <- 0 until inputArray.length-1) {
      if (inputArray(i+1) <= inputArray(i)) {
        val diff = (inputArray(i) - inputArray(i+1) +1)
        inputArray(i+1) = inputArray(i+1) + diff
        sum += diff
      }
    }
    sum
  }

}
