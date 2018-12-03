package in.mkp.challenges;

/**
 * https://codefights.com/challenge/ea9kjzNzE6dQGw8MY
 */
public class IncrementCipher {

    public static void main(String[] args) {
        IncrementCipher incrementCipher = new IncrementCipher();
        System.out.println("incrementCipher.incrementCipher(\"abc\", new int[]{1, 2, 3}) = " + incrementCipher.incrementCipher("abc", new int[]{1, 2, 3}));
        System.out.println("incrementCipher.incrementCipher(\"zzzzzzzzzz\", new int[]{2, 4, 6}) = " + incrementCipher.incrementCipher("zzzzzzzzzz", new int[]{2, 4, 6}));
    }

    String incrementCipher(String s, int[] nums) {
        String r = s;
        for (int i=0; i < nums.length; ++i) {
            String t= "";
            for(int j=0; j < r.length(); ++j) {
                if ((j+1) % (nums[i]) == 0 ) {
                    int k = r.charAt(j) - 'a' + 1;
                    t+= (k > 25) ? 'a' : (char)(k+'a');
                }
                else {
                    t+=r.charAt(j);
                }
            }
            r = t;
        }
        return r;
    }
}
