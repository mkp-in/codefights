package in.mkp.challenges;

/**
 * https://codefights.com/challenge/EYpoYCY6FNTKeimZx
 */
public class SwapPairBits {

    public static void main(String[] args) {
        SwapPairBits swapPairbits = new SwapPairBits();
        System.out.println("swapPairbits.swapPairBits(565L, 9, 3) = "
                + swapPairbits.swapPairBits(565L, 9, 3));

        System.out.println("swapPairbits.swapPairBits(512, 33, 10) = "
                + swapPairbits.swapPairBits(512, 33, 10));

        System.out.println("swapPairbits.swapPairBits(1, 1, 1) = "
                + swapPairbits.swapPairBits(1, 1, 1));

        System.out.println("swapPairbits.swapPairBits(0, 1, 1) = " +
                swapPairbits.swapPairBits(0, 1, 1));

        System.out.println("swapPairbits.swapPairBits(1_125_899_906_842_624, 51, 51) = "
                + swapPairbits.swapPairBits(1_125_899_906_842_624L, 51, 51));

        System.out.println("swapPairbits.swapPairBits(1_125_899_906_842_624L, 51, 50) = "
                + swapPairbits.swapPairBits(1_125_899_906_842_624L, 51, 50));
    }
    
    
    long swapPairBits(long k, int p1, int p2) {
        long a = 1L << p1-1;
        long b = 1L << p2-1;

        /**
         * I could NOT solve the puzzle as I had 3 failed hidden cases. I forgot to add the following line to check if
         * both the bits are same, if they are same return back the same number. Very stupid of me !!!!!!!
         */
        if ((k & a) == (k & b)) return k;

        k = (k & a) == 0 ? k | a : k & ~a;
        k = (k & b) == 0 ? k | b : k & ~b;

        return k;
    }
}
