package in.mkp.challenges;

import java.util.Arrays;

/**
 * https://codefights.com/challenge/admES7uudjBkBNSB3
 */
public class FermFactor {

    public static void main(String[] args) {
        FermFactor fermFactor = new FermFactor();
        System.out.println("fermFactor.fermactor(15) = " + Arrays.toString(fermFactor.fermactor(15)));
        System.out.println("fermFactor.fermactor(21) = " + Arrays.toString(fermFactor.fermactor(21)));
        System.out.println("fermFactor.fermactor(5959) = " + Arrays.toString(fermFactor.fermactor(5959)));

    }

    int[] fermactor(int n) {
        int[] r = new int[2];
        int a = (int)Math.sqrt(n);
        int b = Math.abs(a*a-n);
        while (!i(b)) {
            a++;
            b = Math.abs(a*a-n);
        }
        r[0] = a ;
        r[1] = Math.abs(n - a*a);

        return r;
    }

    boolean i(int b) {
        int a = (int)(Math.sqrt(b) + 0.5);
        return a*a == b;
    }


}
