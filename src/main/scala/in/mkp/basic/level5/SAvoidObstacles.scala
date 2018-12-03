package in.mkp.basic.level5

/**
  * https://app.codesignal.com/arcade/intro/level-5/XC9Q2DhRRKQrfLhb5
  *
  * You are given an array of integers representing coordinates of obstacles situated on a straight line.
  *
  * Assume that you are jumping from the point with coordinate 0 to the right. You are allowed only to make jumps of the same length represented by some integer.
  *
  * Find the minimal length of the jump enough to avoid all the obstacles.
  *
  * Example
  *
  * For inputArray = [5, 3, 6, 7, 9], the output should be
  * avoidObstacles(inputArray) = 4.
  *
  * Check out the image below for better understanding:
  *
  * <img src="./codesignal.basic.level5.example.png"/>
  *
  */

object SAvoidObstacles {

  def main(args: Array[String]): Unit = {
    println(avoidObstacles(Array[Int](5, 3, 6, 7, 9)))
  }

  def avoidObstacles(inputArray: Array[Int]): Int = {
    var result:Int = 0
    var found = false
    for (i <- 2 to 1001 if result == 0) {
      found = false
      for (j <- 0 until inputArray.length if !found) {
        if (inputArray(j) % i == 0) {
          found = true
        }
      }
      if (!found) {
        result = i
      }
    }
    result
  }


}
