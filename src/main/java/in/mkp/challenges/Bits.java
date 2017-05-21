package in.mkp.challenges;

import java.util.Arrays;

/**
 * https://codefights.com/challenge/BiEcfpJAevtSMXAaQ
 */
public class Bits {

    public static void main(String[] args) {
        Bits bits = new Bits();
        System.out.println("bits.bits(new int[]{10, 7, 6, 2, 5}) = "
                + bits.bits(new long[]{10, 7, 6, 2, 5}));
    }

    long[] bits(long[] numbers) {
        long[] ret = Arrays.stream(numbers).map(this::swapBits).toArray();
        return ret;
    }

    long swapBits(long n) {
        String s = Long.toBinaryString(n);
        long loc0 = s.indexOf("0") < 0 ? 0 : 1 << (s.length() - s.indexOf("0") -1);
        long loc1 = Long.lowestOneBit(n);
        if (loc0 > 0 && loc0 > loc1) {
            n |= loc0;
            n ^= loc1;
        }
        return n;
    }

}
