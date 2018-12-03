package in.mkp.challenges;

import java.math.BigInteger;
import java.util.Random;

/**
 * https://codefights.com/challenge/prd5XH6KJtWPRva4w
 */
public class TotalBitSum {

    public static void main(String[] args) {
        TotalBitSum totalBitSum = new TotalBitSum();
        System.out.println("totalBitSum.totalBinSum(\"1001\") = " + totalBitSum.totalBinSum("1001"));
        System.out.println("totalBitSum.totalBinSum(\"1001\") = " + totalBitSum.totalBinSumSlow("1001"));
        System.out.println("totalBitSum.totalBinSum(1001101011101110111110110011010111100011010111011101101011010010) = "
                + totalBitSum.totalBinSum("1001101011101110111110110011010111100011010111011101101011010010"));
        System.out.println("totalBitSum.totalBinSum(1001101011101110111110110011010111100011010111011101101011010010) = "
                + totalBitSum.totalBinSumSlow("1001101011101110111110110011010111100011010111011101101011010010"));

        totalBitSum.test();
    }

    int totalBinSum(String s) {
        long start = System.currentTimeMillis();
        BigInteger t = new BigInteger("0");

        BigInteger b = new BigInteger(s, 2);
        BigInteger m = new BigInteger("1000000007");
        for (int i=0; i < s.length(); ++i) {
            t = t.add(b);
            b = b.shiftRight(1);
        }
        System.out.println("Finished in: "+(System.currentTimeMillis()-start));
        return t.mod(m).intValue();

    }


    int totalBinSumSlow(String s) {
        long start = System.currentTimeMillis();

        BigInteger t = new BigInteger("0");
        BigInteger m = new BigInteger("1000000007");
        for (int i=1; i <= s.length(); ++i) {
            BigInteger b = new BigInteger(s.substring(0, i), 2);
            t = t.add(b);
        }
        System.out.println("Finished in: "+(System.currentTimeMillis()-start));
        return t.mod(m).intValue();
    }

    void test() {
        Random random = new Random();
        String s = "";
        for (int i = 0; i < 5_000; ++i) {
            s+=Math.abs(random.nextInt() % 2);
        }

        System.out.println("totalBinSumSlow(s) = " + totalBinSumSlow(s));
        System.out.println("totalBinSum(s) = " + totalBinSum(s));

    }

}
