package in.mkp.challenges;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;

/**
 * https://codefights.com/challenge/uHyZ9Cg96B3JY2DNa
 */
public class Calendar {

    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        System.out.println("calendar.calendar(5, 2017) = " + Arrays.deepToString(calendar.calendar(5, 2017)));
        System.out.println("calendar.calendar(2, 2016) = " + Arrays.deepToString(calendar.calendar(3, 2016)));
    }
    
    int[][] calendar(int month, int year) {
        int[][] c = new int[6][7];
        LocalDate d = LocalDate.of(year, month, 1);
        DayOfWeek s = d.getDayOfWeek();
        int max = d.getMonth().length(d.isLeapYear());
        for (int i = 0, k=1; i < 6 && k <= max; ++i) {
            int j = i==0? (s.ordinal()+1)%7:0;
            for (; j < 7 &&  k <= max; ++j) {
                c[i][j]=k++;
            }
        }
        return c;
    }
    
}
