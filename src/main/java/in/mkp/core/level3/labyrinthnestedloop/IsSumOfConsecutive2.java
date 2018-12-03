package in.mkp.core.level3.labyrinthnestedloop;

/**
 * https://codefights.com/arcade/code-arcade/labyrinth-of-nested-loops/EQSjA5PRfyHueeNkj
 */
public class IsSumOfConsecutive2 {

    public static void main(String[] args) {
        IsSumOfConsecutive2 isSumOfConsecutive = new IsSumOfConsecutive2();
        System.out.println("isSumOfConsecutive.isSumOfConsecutive2(9) = " + isSumOfConsecutive.isSumOfConsecutive2(6));
    }


    /*
     *
     * We are trying to see the following:
     *
     * if (i+ (i+1) == n) count ++;
     * if (i+ (i+1) + (i+2) == n) count ++;
     * if (i+ (i+1) + (i+2) + (i+3) == n) count ++;
     * if (i+ (i+1) + (i+2) + (i+3) + (i+4) == n) count ++;
     *
     * So as you see there are j X i there along with 1+2+3..m
     *
     * So the equation becomes for j = 2..m
     * (j*i) + (Sum of numbers till m)
     * (j*i) + ((k*(k+1))/2)
     *
     *
     */

    int isSumOfConsecutive2(int n) {
        int count=0;

        for (int i=1; i < n; ++i) {
            for (int j=2, k=1; j < n; ++j, ++k) {
                int m = (k*(k+1))/2;
                if ((j*i + m) == n) {
                    count++;
                }
            }
        }
        return count;
    }
}
