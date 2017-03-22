package in.mkp.basic.level12;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by mkumar on 3/21/17.
 */
public class DifferentSquares {

    public static void main(String[] args) {
        DifferentSquares differentSquares = new DifferentSquares();
        int[][] matrix = new int[][] {{1, 2, 1},
                                      {2, 2, 2},
                                      {2, 2, 2},
                                      {1, 2, 3},
                                      {2, 2, 1}};
        System.out.println("differentSquares = " + differentSquares.differentSquares(matrix));
    }

    int differentSquares(int[][] matrix) {
        Set<String> set = new HashSet<>();

        final int m = matrix.length;
        final int n = matrix[0].length;

        if (m == 1 || n == 1) {
            return 0;
        }

        for (int i=0; i < m-1; ++i) {
            for (int j=0; j < n-1; ++j) {
                StringBuilder sb = new StringBuilder();
                sb.append(matrix[i][j]).append("\t").append(matrix[i][j+1]).append("\t");
                sb.append(matrix[i+1][j]).append("\t").append(matrix[i+1][j+1]);
                set.add(sb.toString());
            }
        }

        return set.size();
    }



}
