package in.mkp.challenges;

/**
 * Created by mkumar on 5/16/17.
 */
public class ReversesreveR {

    public static void main(String[] args) {
        ReversesreveR reversesreveR = new ReversesreveR();
        System.out.println("reversesreveR.ReversesreveR(\"16-41\") = "
                + reversesreveR.reversesreveR("16-41"));

        System.out.println("reversesreveR.reversesreveR(\"23%11\") = "
                + reversesreveR.reversesreveR("23%11"));
    }
    
    int reversesreveR(String inputString) {
        String[] s = inputString.split("[+\\-\\*/\\^%]");
        char opeartor = inputString.charAt(s[0].length());
        int a = Integer.parseInt((new StringBuffer(s[0].replace("^0*", ""))).reverse().toString());
        int b = Integer.parseInt((new StringBuffer(s[1].replace("^0*", ""))).reverse().toString());

        switch (opeartor) {
            case '+': return a+b;
            case '-': return a-b;
            case '*': return a*b;
            case '/': return a/b;
            case '%': return a%b;
            case '^': return (int)Math.pow(a, b);
        }

        return 0;
    }

}
