package in.mkp.core.level3.corner;

/**
 * Created by mkumar on 4/9/17.
 */
public class SecondRightMostZeroBit {

    public static void main(String[] args) {
        SecondRightMostZeroBit secondRightMostZeroBit = new SecondRightMostZeroBit();
        System.out.println(secondRightMostZeroBit.secondRightmostZeroBit(1073741824));
        System.out.println(secondRightMostZeroBit.secondRightmostZeroBit(1454668891));
        System.out.println(secondRightMostZeroBit.secondRightmostZeroBit(37));
    }

    int secondRightmostZeroBit(int n) {
        return  (int)Math.pow(2, new StringBuffer(Integer.toBinaryString(n)).reverse().toString().indexOf("0",new StringBuffer(Integer.toBinaryString(n)).reverse().toString().indexOf("0")+1));
    }

}
