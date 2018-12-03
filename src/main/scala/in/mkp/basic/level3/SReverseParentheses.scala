package in.mkp.basic.level3

import scala.collection.mutable.Stack

/**
  * https://app.codesignal.com/arcade/intro/level-3/3o6QFqgYSontKsyk4
  *
  * You have a string s that consists of English letters, punctuation marks, whitespace characters, and brackets. It is guaranteed that the parentheses in s form a regular bracket sequence.
  *
  * Your task is to reverse the strings contained in each pair of matching parentheses, starting from the innermost pair. The results string should not contain any parentheses.
  *
  * Example
  *
  * For string s = "a(bc)de", the output should be
  * reverseParentheses(s) = "acbde".
  *
  * Input: s: "co(de(fight)s)"
  *
  * Expected Output: "cosfighted"
  *
  */
object SReverseParentheses {

  def main(args: Array[String]): Unit = {
    println(reverseParentheses2("a(bc)de"))
    println(reverseParentheses2("ab(d(ef)g)h"))
    println(reverseParentheses2("co(de(fight)s)"))
    println(reverseParentheses2("(abc)"))
  }

  def reverseParentheses2(str: String):String = {
    val st = Stack[String]()
    for (i <- 0 until str.length) {
      if (str.charAt(i) == '(') {
        var s:String = ""
        st.push(s)
      }
      else if (str.charAt(i) == ')') {
        var s: String = st.pop
        if (!st.isEmpty) {
          var s2 = st.pop
          s2 = s2 + s.reverse
          st.push(s2)
        }
        else {
          st.push(s.reverse)
        }
      }
      else {
        if (!st.isEmpty) {
          var s = st.pop
          s = s + str.charAt(i)
          st.push(s)
        }
        else {
          var s = "" + str.charAt(i)
          st.push(s)
        }

      }
    }
    st.pop
  }

  def reverseParentheses(s: String): String = {
    ""+s.charAt(0) + reverse(s, "",  1)
  }

  def reverse(s: String, s1:String, i:Int): String = {
    var s3:String = ""
    if (i == s.length) {
      s3 = s1
    }
    else if (s.charAt(i) == '(') {
      s3 = s1 + reverse(s,"", i+1)
    }
    else if (s.charAt(i) == ')') {
      s3 = s1.reverse
      s3 = s3  + reverse(s, "", i+1)
    }
    else {
      s3 = s1 + s.charAt(i)
      s3 = reverse(s, s3, i+1)
    }
    s3
  }
}
