package in.mkp.basic.level4

object SPalindromeRearranging {

  def main(args: Array[String]): Unit = {
    println(palindromeRearranging("aabb"))
    println(palindromeRearranging("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc"))
  }

  def palindromeRearranging(inputString: String): Boolean = {
    val total = inputString.groupBy(c => c).mapValues(str => str.size % 2).values.sum
    total  <= 1
  }
}
