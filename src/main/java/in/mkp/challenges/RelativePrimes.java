package in.mkp.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://codefights.com/challenge/EH6J85jT7i7CbGti6
 */
public class RelativePrimes {

    public static void main(String[] args) {
        RelativePrimes relativePrimes = new RelativePrimes();
        System.out.println("relativePrimes.relativePrimes(new int[]{143, 21, 2, 5, 14}) = "
                + relativePrimes.relativePrimes(new int[]{143, 21, 2, 5, 14}));
    }

    int[] relativePrimes(int[] v) {
        int[] values = Arrays.stream(v).filter(i -> i <= 1000).toArray();
        boolean b[] = new boolean[values.length];
        for (int i=0; i < b.length; ++i) {
            b[i] = true;
        }

        for (int i=0; i < values.length-1; ++i) {
            for (int j=i+1; j < values.length; ++j)
            if (b[i]  && gcd(values[i], values[j]) != 1) {
                b[i] = false;
                b[j] = false;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i=0; i < b.length; ++i) {
            if (b[i]) {
                list.add(values[i]);
            }
        }
        return  list.stream().mapToInt(i -> i).toArray();


    }

    public int gcd(int a, int b) {
        if (a == 0)
            return b;

        while (b != 0) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        return a;
    }
}
