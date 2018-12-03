package in.mkp.basic.level6

/**
  * https://app.codesignal.com/arcade/intro/level-6/t97bpjfrMDZH8GJhi
  *
  * Given two cells on the standard chess board, determine whether they have the same color or not.
  *
  * For cell1 = "A1" and cell2 = "C3", the output should be
  * chessBoardCellColor(cell1, cell2) = true.
  *
  */
object SChessBoardCellColor {

  def main(args: Array[String]): Unit = {
    println(chessBoardCellColor2("A1", "C3"))
    println(chessBoardCellColor2("A1", "H3"))
    println(chessBoardCellColor2("C8", "H1"))
    println(chessBoardCellColor2("C8", "F3"))

    println(chessBoardCellColor3("A1", "C3"))
    println(chessBoardCellColor3("A1", "H3"))
    println(chessBoardCellColor3("C8", "H1"))
    println(chessBoardCellColor3("C8", "F3"))
  }

  def chessBoardCellColor(cell1: String, cell2: String): Boolean = {
    val a1 = cell1.charAt(0) - 'A'
    val a2 = cell1.charAt(1).toInt - '0'

    val b1 = cell2.charAt(0) - 'A'
    val b2 = cell2.charAt(1).toInt - '0'

    //println(s"a1=$a1\tb1=$b1\ta2=$a2\tb2=$b2")

    (Math.abs(a1-b1) == Math.abs(a2-b2)) || (((a1 % 2 ==  b1 % 2) && (a2 % 2  == b2 % 2)) || ((a1 % 2 == a2 % 2) && (b1  % 2 == b2 % 2)))
  }

  def chessBoardCellColor2(cell1: String, cell2: String): Boolean = {
    Math.abs(cell1.charAt(0) - cell2.charAt(0)) % 2 == Math.abs(cell1.charAt(1) - cell2.charAt(1)) % 2
  }

  def chessBoardCellColor3(cell1: String, cell2: String): Boolean = {
    ((cell1(0).toInt % 2) == (cell1(1).toInt % 2)) == ((cell2(0).toInt % 2) == (cell2(1).toInt % 2))
  }
}
