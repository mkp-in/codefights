package in.mkp.basic.level12;

import java.util.Arrays;

/**
 * https://codefights.com/arcade/intro/level-12/uRWu6K8E7uLi3Qtvx
 */
public class SpiralNumbers {

    public static void main(String[] args) {
        SpiralNumbers spiralNumbers = new SpiralNumbers();
        System.out.println("spiralNumbers.spiralNumbers(3) = " + Arrays.deepToString(spiralNumbers.spiralNumbers(3)));

    }

    int[][] spiralNumbers(int n) {
        int[][] ret = new int[3][3];
        fill(ret, 0, 0, 1, n);

        return  ret;
    }

    void fill(int[][] a, int m, int n, int current, int max) {
        if (max % 2 == 0) {

        }
        else {
            if (current == max) {
                a[m][n] = current;
            }
            else {
                for (int j = n; m < max; ++j) {
                    a[m][j]=current++;
                }
                //for (int i = )
            }
        }
    }
}

