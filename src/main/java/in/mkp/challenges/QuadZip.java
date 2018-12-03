package in.mkp.challenges;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

/**
 * https://codefights.com/challenge/z4rytKFWoT7xrJACN
 */
public class QuadZip {

    public static void main(String[] args) {
        QuadZip quadZip = new QuadZip();
        System.out.println("quadZip.quadZip(\"one\", \"two\", \"three\", \"four\") = "
                + quadZip.quadZip("one", "two", "three", "four"));

        System.out.println("quadZip.quadZip(\"\\\"\", \"two\", \"three\", \"four\") = " + quadZip.quadZip("\"", "two", "three", "four"));
        
        
    }

    String quadZip(String a, String b, String c, String d) {
        String[] s = new String[]{escape(a), escape(b), escape(c), escape(d) };
        int[] l = new int[4];

        IntSummaryStatistics m = Arrays.stream(s).mapToInt(t -> t.length()).summaryStatistics();
        int n = m.getMax();

        String r="";
        for (int j = 0; j < n; ++j) {
            for (int i = 0; i < 4; ++i) {
                if (l[i] < s[i].length()) {
                    r+=s[i].charAt(l[i]++);
                }
            }
        }

        return r;
    }
    
    String escape(String s) {
        return s.replace("\\\"", "\"");
    }


}
