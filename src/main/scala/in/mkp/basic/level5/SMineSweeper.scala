package in.mkp.basic.level5


/**
  * https://app.codesignal.com/arcade/intro/level-5/ZMR5n7vJbexnLrgaM
  *
  * In the popular Minesweeper game you have a board with some mines and those cells that don't contain a mine
  * have a number in it that indicates the total number of mines in the neighboring cells. Starting off with some
  * arrangement of mines we want to create a Minesweeper game setup.
  *
  * Example
  *
  * For
  *
  * matrix = [[true, false, false],
  * [false, true, false],
  * [false, false, false]]
  *
  * the output should be
  *
  * minesweeper(matrix) = [[1, 2, 1],
  *                        [2, 1, 1],
  * [1, 1, 1]]
  *
  * Check out the image below for better understanding:
  *
  * <img src="./codesignal.basic.level5.example2.png"/>
  *
  */
object SMineSweeper {

  def main(args: Array[String]): Unit = {
    println(minesweeper(Array(Array[Boolean](true, false, false), Array[Boolean](false, true, false), Array[Boolean](false, false, false))).map(_.mkString).mkString("\n"))
    println(minesweeper(Array(Array[Boolean](true,false,false,true), Array[Boolean](false,false,true,false), Array[Boolean](true,true,false,true))).map(_.mkString).mkString("\n"))
  }

  def minesweeper(matrix: Array[Array[Boolean]]): Array[Array[Int]] = {
    var ret = Array.ofDim[Int](matrix.length, matrix(0).length)

    for (i <- 0 until matrix.length) {
      for (j <- 0 until matrix(0).length) {
        if (matrix(i)(j)) {
          setVal(matrix, ret, i, j)
        }
      }
    }
    ret
  }

  def setVal(matrix: Array[Array[Boolean]], ret: Array[Array[Int]], row:Int, col:Int ): Unit = {
    for (i <- row - 1 to row + 1) {
      for (j <- col - 1 to col + 1) {
        if (i >= 0 && j >= 0 && i < ret.length && j < ret(0).length && !(i == row && j == col)) {
          ret(i)(j) = ret(i)(j) + 1
        }
      }
    }
  }
}
