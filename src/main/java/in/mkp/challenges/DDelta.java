package in.mkp.challenges;

/**
 * https://codefights.com/challenge/E5pfJa5D7jsWFgBai
 */
public class DDelta {

    public static void main(String[] args) {
        DDelta dDelta = new DDelta();
        System.out.println("dDelta.dDelta(65535, 16) = "
                + dDelta.dDelta(65535, 16));

        System.out.println("dDelta.dDelta(2047, 32) = "
                + dDelta.dDelta(2047, 32));
    }

    int dDelta(int n, int r) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        while (n > 0) {
            int i = n % r;
            a = Math.min(i, a);
            b = Math.max(i, b);
            n /= r;
        }

        return b-a;
    }

}
