package in.mkp.challenges;

/**
 * https://codefights.com/challenge/HRfkmH66XAMDBfcAd
 */
public class IsSuperPalindrome {

    public static void main(String[] args) {
        IsSuperPalindrome isSuperPalindrome = new IsSuperPalindrome();
        System.out.println("isSuperPalindrome.isSuperPalindrome(\"25iwwi52\", 4) = " 
                + isSuperPalindrome.isSuperPalindrome("25iwwi52", 4));

        System.out.println("isSuperPalindrome.isSuperPalindrome(\"www\", 1) = "
                + isSuperPalindrome.isSuperPalindrome("www", 1));
    }

        boolean isSuperPalindrome(String s, int k) {
            for (int i=1; s.length() >= (k * Math.pow(2, i)); ++i) {
                if (!isPalindrome(s.substring(0, (int)(k * Math.pow(2, i)))))
                    return false;
            }
            return true;
        }

        boolean isPalindrome(String s) {
            return (new StringBuffer(s)).reverse().toString().equals(s);
        }

}
