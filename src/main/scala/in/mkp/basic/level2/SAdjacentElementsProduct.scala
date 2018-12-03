package in.mkp.basic.level2

/**
  * https://app.codesignal.com/arcade/intro/level-2/xzKiBHjhoinnpdh6m
  *
  * Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.
  *
  *
  * For inputArray = [3, 6, -2, -5, 7, 3], the output should be
  * adjacentElementsProduct(inputArray) = 21.
  *
  * 7 and 3 produce the largest product.
  *
  */
object SAdjacentElementsProduct {

  def main(args: Array[String]): Unit = {
      println(adjacentElementsProduct(Array[Int](3, 6, -2, -5, 7, 3)))
  }

  def adjacentElementsProduct(inputArray: Array[Int]): Int = {
    inputArray.sliding(2).map(_.product).max
  }

}
