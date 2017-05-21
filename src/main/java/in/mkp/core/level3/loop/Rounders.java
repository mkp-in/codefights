package in.mkp.core.level3.loop;

/**
 * https://codefights.com/arcade/code-arcade/loop-tunnel/H5PP5MXvYvWXxTytH
 */
public class Rounders {

    public static void main(String[] args) {
        Rounders rounders = new Rounders();
        System.out.println("rounders.rounders(99) = " + rounders.rounders(99));

    }

    int rounders(int value) {
        String ret = "";

        int carry = 0;
        int last = 0;
        while (value != 0) {
            int d = (value % 10) + carry;
            carry = d >= 5 ? 1 : 0;
            ret=0+ret;
            last = d;
            value/=10;
            System.out.println(carry+":"+ret);

        }
        ret = (last+carry) + ret;
        return Integer.parseInt(ret)/10;
    }
}
