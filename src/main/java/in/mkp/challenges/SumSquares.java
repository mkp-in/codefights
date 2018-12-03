package in.mkp.challenges;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mkumar on 5/11/17.
 */
public class SumSquares {

    public static void main(String[] args) {
        SumSquares sumSquares = new SumSquares();
        System.out.println("sumSquares.sumSquares(25) = " + sumSquares.sumSquares(25));
    }

    int sumSquares(long n) {
        return f(n).length;
    }

    Integer[] f(long n) {
        List<Integer> l = new ArrayList<>();
        int sqrt = (int) Math.sqrt(n);
        for (int i=2; i < sqrt; ++i ) {
            while (n % i == 0) {
                l.add(i);

            }
            /*if (i != n/i)
                l.add((int)n/i);*/
        }
        return  l.toArray(new Integer[l.size()]);

    }


}
