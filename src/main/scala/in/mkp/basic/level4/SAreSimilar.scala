package in.mkp.basic.level4

/**
  * https://app.codesignal.com/arcade/intro/level-4/xYXfzQmnhBvEKJwXP
  *
  * Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.
  *
  * Given two arrays a and b, check whether they are similar.
  *
  * Example
  *
  * For a = [1, 2, 3] and b = [1, 2, 3], the output should be
  * areSimilar(a, b) = true.
  *
  * The arrays are equal, no need to swap any elements.
  *
  * For a = [1, 2, 3] and b = [2, 1, 3], the output should be
  * areSimilar(a, b) = true.
  *
  * We can obtain b from a by swapping 2 and 1 in b.
  *
  * For a = [1, 2, 2] and b = [2, 1, 1], the output should be
  * areSimilar(a, b) = false.
  *
  * Any swap of any two elements either in a or in b won't make a and b equal.
  */
object SAreSimilar {

  def main(args: Array[String]): Unit = {
    println(areSimilar(Array[Int](1, 2, 3), Array[Int](1, 2, 3)))
    println(areSimilar(Array[Int](2, 1, 3), Array[Int](1, 2, 3)))
    println(areSimilar(Array[Int](1, 2, 2), Array[Int](2, 1, 1)))
  }

  def areSimilar(a: Array[Int], b: Array[Int]): Boolean = {
    var mismatches = Array[Int]()
    var similar:Boolean = false

    for (i <- 0 until a.length) {
      if (a(i) != b(i)) {
        mismatches = mismatches :+ i
      }
    }
    similar = mismatches.length match {
      case 0 => true
      case 1 => false
      case 2 => a(mismatches(0)) == b(mismatches(1)) && a(mismatches(1)) == b(mismatches(0))
      case _ => false
    }
    similar
  }
}
