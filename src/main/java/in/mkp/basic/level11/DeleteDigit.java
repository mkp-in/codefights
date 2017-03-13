package in.mkp.basic.level11;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

/**
 * Created by mkumar on 3/12/17.
 */
public class DeleteDigit {

    public static void main(final String[] args) {
        DeleteDigit deleteDigit = new DeleteDigit();
        System.out.println(deleteDigit.deleteDigit(231));
    }

    int deleteDigit(int n) {
        final String stringNumber = "" + n;

        final Character[] digitChars = stringNumber.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        final int[] digits = Arrays.stream(digitChars).mapToInt(i -> i - '0').toArray();
        final IntSummaryStatistics intSummaryStatistics = Arrays.stream(digits).summaryStatistics();
        final int min = intSummaryStatistics.getMin();

        int max = -1;
        int deleteNumberPosition = -1;

        for (int i=0; i < digits.length; ++i) {
            final int j = i;
            int[] s = Arrays.stream(digits).filter(digit -> digit != j).toArray();
            System.out.println("Here: ");
        }

        /*boolean deleted = false;
        for (int i = digits.length - 1; i >= 0; --i) {
            if ( !deleted && digits[i] == min) {
                deleted = true;
            }
            else {
                deleteNumber += multiplier * digits[i];
                multiplier *= 10;
            }
        }*/

        return 1;
    }
}
