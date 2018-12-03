package in.mkp.basic.level3

/**
  * https://app.codesignal.com/arcade/intro/level-3/JKKuHJknZNj4YGL32
  *
  * Given two strings, find the number of common characters between them.
  *
  * Example
  *
  * For s1 = "aabcc" and s2 = "adcaa", the output should be
  * commonCharacterCount(s1, s2) = 3.
  *
  * Strings have 3 common characters - 2 "a"s and 1 "c".
  *
  */
object SCommonCharacterCount {

  def main(args: Array[String]): Unit = {
    println(commonCharacterCount("aabcc", "adcaa"))
    println(commonCharacterCount2("aabcc", "adcaa"))
  }

  def commonCharacterCount(s1: String, s2: String): Int = {
    val functionToMap1:Map[Char, Int] = s1.groupBy(_.toChar).map(t => (t._1, t._2.length))
    val functionToMap2:Map[Char, Int] = s2.groupBy(_.toChar).map(t => (t._1, t._2.length))

    var sum = 0

    for ((k, v) <- functionToMap1) {
      if (functionToMap2.contains(k)) {
        sum += Math.min(v.intValue(), functionToMap2.get(k).get).intValue()
      }
    }
    sum
  }

  def commonCharacterCount2(s1: String, s2: String): Int = {
    s1.intersect(s2).length
  }

}
