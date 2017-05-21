package in.mkp.core.level3.loop;

import java.util.HashSet;
import java.util.Set;

/**
 * https://codefights.com/arcade/code-arcade/loop-tunnel/RcK4vupi8sFhakjnh
 *
 * REF: file:///Users/mkumar/Documents/Ebooks/Bresenhams-Algorithm.pdf
 */
public class CountBlackCells {

    public static void main(String[] args) {
        CountBlackCells countBlackCells = new CountBlackCells();
        System.out.println("countBlackCells.countBlackCells(5, 3) = " +
                countBlackCells.countBlackCells(5, 3));

        System.out.println("countBlackCells.countBlackCells(3, 3) = " +
                countBlackCells.countBlackCells(3, 3));
    }

    int countBlackCells(int x, int y) {
        int max = Math.max(x, y);
        int min = Math.min(x, y);
        int dx = max;
        int dy = min;
        double m = (double)dy/dx;
        int j = 0;
        double e = m - 1.0;
        Set<String> points = new HashSet<>();

        for (int i=0; i < max; ++i) {
            points.add(i+":"+j);
            if (e >= 0) {
                if (i == j && j >= 0 ) points.add(i+":"+j);
                j++;
                if (j < min) points.add(i+":"+j);
                e-=1.0;
            }
            e+=m;
        }

        return points.size();
    }
}
