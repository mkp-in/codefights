package in.mkp.challenges;

/**
 * https://codefights.com/challenge/DF6j9AcQSCGtLonyM
 */
public class ConvertString {

    public static void main(String[] args) {
        ConvertString convertString = new ConvertString();
        System.out.println("convertString.convertString(\"ceoydefthf5iyg5h5yts\", \"codefights\") = " + convertString.convertString("ceoydefthf5iyg5h5yts", "codefights"));

    }

    boolean convertString(String s, String t) {
       int i=0,j=0;
       while ( i < s.length() && j < t.length()) {
           if (s.charAt(i) == t.charAt(j)) {
               j++;
           }
           i++;
       }
       return j == t.length();

    }



    /**
     * This solution is correct but does not scale for long strings.
     * @param s
     * @param t
     * @return
     */
    boolean convertString2(String s, String t) {
        String r = "[A-Za-z0-9]*";
        for (int i=0; i < t.length(); ++i)
            r+=t.charAt(i) + "[A-Za-z0-9]*";
        return s.matches(r);

    }

}
