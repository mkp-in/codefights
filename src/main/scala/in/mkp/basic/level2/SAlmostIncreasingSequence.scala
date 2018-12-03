package in.mkp.basic.level2

/**
  * https://app.codesignal.com/arcade/intro/level-2/2mxbGwLzvkTCKAJMG
  *
  * Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.
  *
  * Example
  *
  * For sequence = [1, 3, 2, 1], the output should be
  * almostIncreasingSequence(sequence) = false.
  *
  * There is no one element in this array that can be removed in order to get a strictly increasing sequence.
  *
  * For sequence = [1, 3, 2], the output should be
  * almostIncreasingSequence(sequence) = true.
  *
  * You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].
  */
object  SAlmostIncreasingSequence {

  def main(args: Array[String]): Unit = {
    println(almostIncreasingSequence(Array[Int](1, 3, 2, 1)))
    println(almostIncreasingSequence(Array[Int](1, 3, 2)))
  }

  def almostIncreasingSequence(sequence: Array[Int]): Boolean = {
    var mismatch:Int = 0
    for (i <- 0 until sequence.length-1) {
      if (sequence(i) >= sequence(i+1)) mismatch += 1
    }

    for (i <- 0 until sequence.length-2) {
      if (sequence(i) >= sequence(i+2)) mismatch += 1
    }

    mismatch<=2
  }


}
