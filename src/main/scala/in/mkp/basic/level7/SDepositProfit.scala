package in.mkp.basic.level7


/**
  * https://app.codesignal.com/arcade/intro/level-7/8PxjMSncp9ApA4DAb
  *
  * You have deposited a specific amount of money into your bank account.
  * Each year your balance increases at the same growth rate. With the assumption that you don't make any additional
  * deposits, find out how long it would take for your balance to pass a specific threshold. Of course you don't want
  * to wait too long, so you know that the answer is not greater than 6.
  *
  * Example
  *
  * For deposit = 100, rate = 20, and threshold = 170, the output should be
  * depositProfit(deposit, rate, threshold) = 3.
  *
  * Each year the amount of money in your account increases by 20%. So throughout the years, your balance would be:
  *
  * year 0: 100;
  * year 1: 120;
  * year 2: 144;
  * year 3: 172.8.
  *
  * Thus, it will take 3 years for your balance to pass the threshold, so the answer is 3.
  *
  */
object SDepositProfit {

  def main(args: Array[String]): Unit = {
    //println(depositProfit(100, 1, 101))
    println(depositProfit(100, 20, 170))
  }

  def depositProfit(deposit: Int, rate: Int, threshold: Int): Int = {
    var reached = false
    var i = 1
    while (!reached) {
      val t = deposit * Math.pow(1 + (rate / 100.0), i.toDouble)
      if (t >= threshold) {
        reached = true
      }
      else {
        i = i + 1
      }
    }
    i
  }

}
