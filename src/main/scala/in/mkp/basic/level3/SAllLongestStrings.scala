package in.mkp.basic.level3

/**
  * https://app.codesignal.com/arcade/intro/level-3/fzsCQGYbxaEcTr2bL
  *
  * Given an array of strings, return another array containing all of its longest strings.
  *
  * For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
  * allLongestStrings(inputArray) = ["aba", "vcd", "aba"].
  *
  */
object SAllLongestStrings {

  def main(args: Array[String]): Unit = {
    println(allLongestStrings(Array[String]("aba", "aa", "ad", "vcd", "aba")).mkString(","))
  }

  def allLongestStrings(inputArray: Array[String]): Array[String] = {
    inputArray.groupBy(s =>s.length).maxBy(s =>s._1)._2
  }
}
