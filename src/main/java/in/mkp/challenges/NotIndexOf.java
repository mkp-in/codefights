package in.mkp.challenges;

/**
 * https://codefights.com/challenge/cvieRLS9ghHamb44t
 */
public class NotIndexOf {

    public static void main(String[] args) {
        NotIndexOf notIndexOf = new NotIndexOf();
        System.out.println("notIndexOf.notIndexOf(\"abc\", \"abc\") = " + notIndexOf.notIndexOf("abc", "abc"));
    }
    
    int notIndexOf(String g, String v) {
        for (int i=0; i < g.length(); ++i)
            if (!check(g.substring(i), v)) return i;
        return -1;
    }

    boolean check(String g, String v) {
        if (g.equals(v) || g.length() < v.length()) return true;
        for (int i=0; i < g.length() && i < v.length(); ++i)
            if (g.charAt(i) == v.charAt(i)) return true;
        return false;
    }
}
