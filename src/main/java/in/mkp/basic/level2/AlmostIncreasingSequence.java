package in.mkp.basic.level2;

/**
 *
 * https://app.codesignal.com/arcade/intro/level-2/2mxbGwLzvkTCKAJMG
 *
 * Good One
 */

public class AlmostIncreasingSequence {

    public static void main(String[] args) {
        AlmostIncreasingSequence almostIncreasingSequence = new AlmostIncreasingSequence();

        System.out.println("almostIncreasingSequence.almostIncreasingSequence() = " + almostIncreasingSequence.almostIncreasingSequence(new int[]{10, 1, 2, 3, 4, 5}));
    }

    boolean almostIncreasingSequence(int[] sequence) {
        int mismatch = 0;
        for (int i = 0; i < sequence.length-1; ++i) {
            if (sequence[i] >= sequence[i+1]) mismatch++;
        }

        for (int i = 0; i < sequence.length-2; ++i) {
            if (sequence[i] >= sequence[i+2]) mismatch++;
        }

        return mismatch <= 2;

    }

}
