package in.mkp.challenges;

/**
 * https://codefights.com/challenge/FGWntJmJm2ErFuv9u/solutions
 */
public class Lucas {

    public static void main(String[] args) {
        Lucas lucas = new Lucas();
        System.out.println("lucas.lucas(1, 2, 3) = " + lucas.lucas(1, 2, 3));
        System.out.println("lucas.lucas(12, 5 , 9) = " + lucas.lucas(12, 5, 9));
    }

    long[] lucas(int p, int q, int n) {
        long[] r = new long[2];
        r[0] = u(p, q, n);
        r[1] = v(p, q, n);
        return r;
    }

    long u(int p, int q, int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return p * u(p, q, n-1) - q * u(p, q, n-2);
    }

    long v(int p, int q, int n) {
        if (n == 0) return 2;
        if (n == 1) return p;
        return p * v(p, q, n-1) - q * v(p, q, n-2);
    }
}
