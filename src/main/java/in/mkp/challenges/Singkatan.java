package in.mkp.challenges;

/**
 * https://codefights.com/challenge/fLsRtAmnjFgq8u5zG
 */
public class Singkatan {

    public static void main(String[] args) {
        Singkatan singkatan = new Singkatan();
        System.out.println("singkatan.singkatan(\"pakoper\", \"erxxxpa\") = "
                + singkatan.singkatan("pakoper", "erxxxpa"));

        System.out.println("singkatan.singkatan(\"pakoper\", \"perxxpa\") = "
                + singkatan.singkatan("pakoper", "perxxpa"));
    }
    
    String singkatan(String s1, String s2) {
        int a = s1.length();
        int i;
        for (i = 0; i < a ; ++i) {
           String s = s1.substring(i, a);
           if (s2.startsWith(s)) break;
        }
        return s1 + s2.substring(a-i);
    }
}
