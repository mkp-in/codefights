package in.mkp.challenges;

/**
 * https://codefights.com/challenge/QKHjjtxSpyyyuEGXN
 */
public class OnesPosition {

    public static void main(String[] args) {
        OnesPosition onesPosition = new OnesPosition();
        System.out.println("onesPosition.onesPosition(33535) = " + onesPosition.onesPosition(33535));

    }

    int onesPosition(int num) {
        if (num == 1) return 1;
        int max = 10000;
        int o = Integer.bitCount(num);
        int sqrt = (int) Math.sqrt(max);

        boolean[] b = new boolean[max+1];
        for (int i = 0; i <= max; ++i) {
            b[i]=true;
        }
        for (int i=2; i <= sqrt; ++i) {
            if (b[i]) {
                int k=0;
                int p = (int)Math.pow(i, 2);
                for (int j = p; j < max; ++k, j=p + (k*i)) {
                    b[j]=false;
                }
            }
        }
        int c=0;
        for (int i=0; i < max && c <= o; ++i) {
            if (b[i]) {
                c++;
                if (c == (o + 1)) return i;
            }
        }

        return 0;
    }
}
