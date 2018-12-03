package in.mkp.basic.level5

/**
  * https://app.codesignal.com/arcade/intro/level-5/5xPitc3yT3dqS7XkP
  *
  * Last night you partied a little too hard. Now there's a black and white photo of you that's about to go viral!
  * You can't let this ruin your reputation, so you want to apply the box blur algorithm to the photo to hide its content.
  *
  * The pixels in the input image are represented as integers. The algorithm distorts the input image in the following
  * way: Every pixel x in the output image has a value equal to the average value of the pixel values from the 3 × 3
  * square that has its center at x, including x itself. All the pixels on the border of x are then removed.
  *
  * Return the blurred image as an integer, with the fractions rounded down.
  *
  * Example
  *
  * For
  *
  * image = [[1, 1, 1],
  *          [1, 7, 1],
  * [1, 1, 1]]
  *
  * the output should be boxBlur(image) = [[1]].
  *
  * To get the value of the middle pixel in the input 3 × 3 square: (1 + 1 + 1 + 1 + 7 + 1 + 1 + 1 + 1) = 15 / 9 = 1.66666 = 1.
  * The border pixels are cropped from the final result.
  *
  * For
  *
  * image = [[7, 4, 0, 1],
  *          [5, 6, 2, 2],
  * [6, 10, 7, 8],
  * [1, 4, 2, 0]]
  *
  * the output should be
  *
  * boxBlur(image) = [[5, 4],
  *                   [4, 4]]
  *
  * There are four 3 × 3 squares in the input image, so there should be four integers in the blurred output. To get the
  * first value: (7 + 4 + 0 + 5 + 6 + 2 + 6 + 10 + 7) = 47 / 9 = 5.2222 = 5. The other three integers are obtained the
  * same way, then the surrounding integers are cropped from the final result.
  *
  */
object SBoxBlur {

  def main(args: Array[String]): Unit = {
    println(boxBlur(Array(Array[Int](1, 1, 1), Array[Int](1, 7, 1), Array[Int](1, 1, 1))).mkString(","))
    println(boxBlur(Array(Array[Int](36,0,18,9), Array[Int](27,54,9,0), Array[Int](81,63,72,45))).mkString(","))
  }

  def boxBlur(image: Array[Array[Int]]): Array[Array[Int]] = {
    var ret = Array.ofDim[Int](image.length - 2, image(0).length - 2)
    for (i <- 0 until image.length) {
      for (j <- 0 until image(0).length) {
        if ((i + 2 < image.length) && (j + 2 < image(0).length)) {
          val v = getAvg(image, i, j)
          println("i="+i+"j="+j+"v="+v)
          ret(i)(j)=v
        }
      }
    }
    ret
  }

  def getAvg(image: Array[Array[Int]], row: Int, col: Int): Int = {
    var total: Int = 0
    for (i <- row until row + 3) {
      for (j <- col until col + 3) {
        total = total + image(i)(j)
      }
    }
    Math.floor(total/9).intValue()
  }


}
