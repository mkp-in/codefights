package in.mkp.challenges;

import java.util.ArrayList;
import java.util.List;

/**
 * https://codefights.com/challenge/8wnEp7GjPotzJ7uZq
 */
public class Derivative {

    public static void main(String[] args) {
        Derivative derivative = new Derivative();
        System.out.println("derivative.derivative(\"3*x^2 - x^4 + 8\", -2) = " + derivative.derivative("3*x^2 - x^4 + 8", -2));
        System.out.println("derivative.derivative(\"x\") = " + derivative.derivative("x", 1));

    }

    class P {
        boolean neg;
        int val=1;
        int exp=1;

        P(boolean n, int v, int e) {
            neg = n;
            val = v;
            exp = e;
        }

        int v(int i) {
            int r = (int) Math.pow(i,exp) * val;
            return neg ? (-1)*r : r;
        }
    }

    int derivative(String polynomial, int x) {
        P[] t = parse(polynomial);
        Character[] c = parseOps(polynomial);
        int sum=t[0].v(x);
        for (int i=1; i < t.length; ++i) {
            if (c[i-1].charValue() == '+') {
                sum+=t[i].v(x);
            }
            else {
                if (t[i].v(x) < 0) {
                    sum+=(-1)*(t[i].v(x));
                }
                else {
                    sum-=t[i].v(x);
                }
            }
        }


        return sum;
    }

    P[] parse(String s) {
        List<P> list = new ArrayList<>();
        String[] t = s.split(" [\\-+] ");
        for (String r:t) {
            list.add(normalize(r));
        }

        return list.toArray(new P[list.size()]);
    }

    Character[] parseOps(String s) {
        List<Character> list = new ArrayList<>();
        for (int i=0; i < s.length()-1; ++i) {
            if (s.charAt(i) == ' ') {
                if ((s.charAt(i+1) == '+' || s.charAt(i+1) == '-') && s.charAt(i+2) == ' ')
                    list.add(s.charAt(i+1));
            }
        }
        return list.toArray(new Character[list.size()]);
    }

    P normalize(String s) {
          String[] t = s.split("x");
          boolean neg=false;
          int val = 1;
          int exp = 1;
          if (t.length > 1) {
              exp = Integer.parseInt(t[1].substring(1));
          }
          if (t.length > 0 && t[0].startsWith("-")) {
              neg=true;
              t[0] = t[0].substring(1);
          }
          if (t.length > 0 && t[0].length() > 0) {
              String[] t2 = t[0].split("\\*");
              val = Integer.parseInt(t2[0]);
              if (t[0].equals(t2[0])) {
                  val = 0;
              }
          }
          P p = new P(neg, val*exp, exp-1);
      return p;
    }

    String derivate(String s) {
        return  "";
    }
}
