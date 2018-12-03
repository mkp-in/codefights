package in.mkp.basic.level6

/**
  * https://app.codesignal.com/arcade/intro/level-6/mCkmbxdMsMTjBc3Bm
  *
  * Given an array of integers, replace all the occurrences of elemToReplace with substitutionElem.
  *
  * Example
  *
  * For inputArray = [1, 2, 1], elemToReplace = 1, and substitutionElem = 3, the output should be
  * arrayReplace(inputArray, elemToReplace, substitutionElem) = [3, 2, 3].
  */
object SArrayReplace {

  def main(args: Array[String]): Unit = {
    println(arrayReplace(Array[Int](1, 2, 3, 4, 5), 3, 0).mkString(","))
  }

  def arrayReplace(inputArray: Array[Int], elemToReplace: Int, substitutionElem: Int): Array[Int] = {
    inputArray.map(i => (if (i==elemToReplace) {substitutionElem} else {i}))
  }

}
