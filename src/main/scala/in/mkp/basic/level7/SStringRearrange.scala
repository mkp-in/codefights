package in.mkp.basic.level7

object SStringRearrange {

  def main(args: Array[String]): Unit = {
    println(stringsRearrangement(Array[String]("abc","abd", "cdd")) + "\n-------------\n")
    println(stringsRearrangement(Array[String]("abc", "bef", "bcc", "bec", "bbc", "bdc")) + "\n-------------\n")
  }

  def stringsRearrangement(inputArray: Array[String]): Boolean = {
    val degree = Array.fill(inputArray.length){0}

    for (i <- 0 until inputArray.length) {
      for (j <- 0 until inputArray.length) {
        if (i != j && isDifferByOne(inputArray(i), inputArray(j))) {
          degree(i) = degree(i) + 1
        }
      }
    }

    println("\n-")
    for (i <- 0 until degree.length) {
      println("i="+inputArray(i)+"\tdegree(i)="+degree(i))
    }

    for (i <- 0 until inputArray.length) {
      for (j <- 0 until inputArray.length) {
        if ((!isDifferByOne(inputArray(i), inputArray(j))) && (degree(i) + degree(j) >= inputArray.length)) {
          degree(i) = degree(i) + 1
          degree(j) = degree(j) + 1
        }
      }
    }

    println("\n-")
    for (i <- 0 until degree.length) {
      println("i="+inputArray(i)+"\tdegree(i)="+degree(i))
    }

    val sum = degree.map(i => if (i < inputArray.length/2) 1 else 0).sum

    sum == 0
  }


  def isDifferByOne(s1: String, s2: String): Boolean = {
    var count:Int = 0
    for (i <- 0 until s1.length) {
      if (s1(i) != s2(i)) {
        count = count + 1
      }
    }
    count == 1
  }
}
