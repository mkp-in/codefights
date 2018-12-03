package in.mkp.basic.level3

/**
  * https://app.codesignal.com/arcade/intro/level-3/D6qmdBL2NYz49XHwM
  *
  * Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange the people by their heights in a non-descending order without moving the trees. People can be very tall!
  *
  * Example
  *
  * For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
  * sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
  *
  *
  * If a[i] = -1, then the ith position is occupied by a tree.
  * Otherwise a[i] is the height of a person standing in the ith position.
  *
  */
object SSortByHeight {

  def main(args: Array[String]): Unit = {
    println(sortByHeight(Array[Int](-1, 150, 190, 170, -1, -1, 160, 180)).mkString(","))
  }

  def sortByHeight(a: Array[Int]): Array[Int] = {
      var trees = Array[Int]()
      var ppl = Array[Int]()

      for (i <- 0 until a.size) {
        if (a(i) == -1) {
          trees = trees :+ i
        }
        else {
          ppl = ppl :+ a(i)
        }
      }
      ppl = ppl.sorted

      var ret = Array[Int]()
      var j:Int = 0
      var k:Int = 0
      for (i <- 0 until a.size) {
        if (j < trees.size && i == trees(j)) {
          ret = ret :+ -1
          j += 1
        }
        else if (k < ppl.size) {
          ret = ret :+ ppl(k)
          k += 1
        }
      }
      ret

  }

}
