package in.mkp.challenges;

import java.util.Arrays;

/**
 * https://codefights.com/challenge/TAoHxosd5ZeebJ9mr/solutions
 */
public class Racers {

    public static void main(String[] args) {
        Racers racers = new Racers();
        System.out.println("racers.racers(10, new int{2, 2}, new int{2, 4}) = " + Arrays.toString(racers.racers(10, new int[]{2, 2}, new int[]{2, 4})));
    }

    class R {

    }

    int[] racers(int track, int[] accel, int[] spd) {
        return new int[]{0};
    }

}
