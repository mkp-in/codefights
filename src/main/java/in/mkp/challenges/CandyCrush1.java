package in.mkp.challenges;

/**
 * https://codefights.com/challenge/W54BMdin3EdbtgiPa
 */
public class CandyCrush1 {

    public static void main(String[] args) {
        CandyCrush1 candyCrush1 = new CandyCrush1();
        System.out.println("candyCrush1.candyCrush1(new char[] {{'R','B','G'}, {'R','Y','B'}, {'R','O','Y'}}) = "
                + candyCrush1.candyCrush1(new char[][]{{'R', 'B', 'G'}, {'R', 'Y', 'B'}, {'R', 'O', 'Y'}}));
    }

    boolean candyCrush1(char[][] g) {

        int s1 = g.length;
        int s2 = g[0].length;

        for (int i=0; i < s1; ++i) {
            String s="";
            for (int j=0; j <s2; ++j)
                s+=g[i][j];
            if (s.matches(".*([RGBYO])\\1\\1.*"))
                return true;
        }

        for (int j=0; j < s2; ++j) {
            String s="";
            for (int i=0; i <s1; ++i)
                s+=g[i][j];
            if (s.matches(".*([RGBYO])\\1\\1.*"))
                return true;
        }

        return false;
    }


}
