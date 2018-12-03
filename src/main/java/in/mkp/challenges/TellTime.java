package in.mkp.challenges;

/**
 * https://codefights.com/challenge/ud7b7W8QiEQQsyTvx
 */
public class TellTime {

    public static void main(String[] args) {
        TellTime tellTime = new TellTime();
        System.out.println("tellTime.tellTime(\"12:16\") = " + tellTime.tellTime("12:16"));
        System.out.println("tellTime.tellTime(\"08:43\") = " + tellTime.tellTime("08:43"));
        System.out.println("tellTime.tellTime(\"10:58\") = " + tellTime.tellTime("10:58"));
    }

    String tellTime(String t) {
        String s = "It's ";
        String[] u = { "", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve" };

        int h = Integer.parseInt(t.substring(0,2));
        int m = Integer.parseInt(t.substring(3));
        int r = m % 5;
        m = r > 2 ? m + (5-r): m - r;
        h = m > 30 ? (h == 12 ? 1 : h+1) : h;
        switch(m) {
            case 0: case 60: return s + u[h]+ " o'clock";
            case 5: return s + "five past " + u[h];
            case 10: return s + "ten past " + u[h];
            case 15: return s + "quarter past " + u[h];
            case 20: return s + "twenty past " + u[h];
            case 25: return s + "twenty five past " + u[h];
            case 30: return s + "half past " + u[h];
            case 35: return s + "twenty five to " + u[h];
            case 40: return s + "twenty to " + u[h];
            case 45: return s + "quarter to " + u[h];
            case 55: return s + "five to " + u[h];
        }
        return s;
    }
}
