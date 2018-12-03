package in.mkp.challenges;

import java.util.HashMap;
import java.util.Map;

/**
 * https://codefights.com/challenge/mLWJWiwBHTzg8MSxc
 */
public class FibonacciWord {

    public static void main(String[] args) {
        FibonacciWord fibonacciWord = new FibonacciWord();
        //System.out.println("fibonacciWord.fibonacciWord(6, 10) = " + fibonacciWord.fibonacciWord(6, "10"));
        //System.out.println("fibonacciWord.fibonacciWord(6, \"01\") = " + fibonacciWord.fibonacciWord(6, "01"));
        System.out.println("fibonacciWord.fibonacciWord(6, \"101\") = " + fibonacciWord.fibonacciWord(6, "101"));
    }

    int fibonacciWord(int n, String p) {
        Map<Integer, String> m = new HashMap<>();

        Map<Integer, Integer> c = new HashMap<>();
        m.put(0, "0");
        m.put(1, "1");
        return f(n, p, m, c);
    }

    int f(int i, String p, Map<Integer, String> m, Map<Integer, Integer> c) {
        if (i == 0) {
            return p.equals(""+i) ? 1 : 0;
        }
        if (i == 1) {
            return p.equals(""+i) ? 1 : 0;
        }

        String s = m.get(i);

        if (s != null) {
            return c.get(i);
        }

        Integer v1 = c.get(i-1);
        if (v1 == null) {
            v1 = f(i-1, p, m, c);
        }
        Integer v2 = c.get(i-2);
        if (v2 == null) {
            v2 = f(i-2, p, m , c);
        }
        int v = v1 + v2;
        String t1 = m.get(i-1);
        String t2 = m.get(i-2);
        if ((t1.length() + t2.length()) >= p.length()) {
            v+=overlap(t1, t2, p);
        }
        c.put(i, v);
        m.put(i, t1+t2);

        return c.get(i);
    }

    int overlap(String t1, String t2, String p) {
        if (p.equals(t1+t2)) {
            return 1;
        }
        for (int i=t1.length()-1, j=0; i >= 0 && j < p.length()-1; --i, ++j) {
            String a = t1.substring(i);
            String b = t2.substring(j, p.length()-1);
            if (p.equals(a+b)) {
                return 1;
            }

        }
        return 0;
    }
}
