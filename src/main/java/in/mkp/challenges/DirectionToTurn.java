package in.mkp.challenges;

/**
 * https://codefights.com/challenge/AR7fRcfMaqK3dm6DM
 */
public class DirectionToTurn {

    public static void main(String[] args) {
        DirectionToTurn directionToTurn = new DirectionToTurn();

        System.out.println("directionToTurn.directionToTurn(new int[]{5, 5}, new int[]{5,4}, new int[]{0, 0}) = "
                + directionToTurn.directionToTurn(new int[]{5, 5}, new int[]{5, 4}, new int[]{0, 0}));

        System.out.println("directionToTurn.directionToTurn(new int[]{1,2}, new int[]{2, 3}, new int[]{1, 3}) = "
                + directionToTurn.directionToTurn(new int[]{1, 2}, new int[]{2, 3}, new int[]{1, 3}));

        System.out.println("directionToTurn.directionToTurn(new int[]{-199, -695}, new int[]{-995, -641}, new int[]{2, -227}) = "
                + directionToTurn.directionToTurn(new int[]{-199, -695}, new int[]{-995, -641}, new int[]{2, -227}));

        System.out.println("directionToTurn.directionToTurn(new int[]{1,1}, new int[]{1, 2}, new int[]{2, 2}) = "
                + directionToTurn.directionToTurn(new int[]{1, 1}, new int[]{1, 2}, new int[]{2, 2}));

        System.out.println("directionToTurn.directionToTurn(new int[] {-45, 43}, new int[] {12, 3}, new int[] {1, 23} ) = "
                + directionToTurn.directionToTurn(new int[]{-45, 43}, new int[]{12, 3}, new int[]{1, 23}));

        System.out.println("directionToTurn.directionToTurn(new int[]{-906, 485}, new int[]{203, 933}, new int[]{200, 926}) = "
                + directionToTurn.directionToTurn(new int[]{-906, 485}, new int[]{203, 933}, new int[]{200, 926}));
    }

    String directionToTurn(int[] a, int[] b, int[] c) {
        int x1 = a[0];
        int y1 = a[1];

        int x2 = b[0];
        int y2 = b[1];

        int x3 = c[0];
        int y3 = c[1];


        double d = Math.toDegrees(Math.atan2(y1 - y2, x1 - x2) - Math.atan2(y3 - y2, x3 - x2));
        if (Math.abs(d) > 180.0) {
            return d < 0 ? "left" : "right";
        }
        return d < 0 ? "right" : "left";
    }

    /**
     * The logic here is to find the angle between two points.
     * See: https://stackoverflow.com/questions/26076656/calculating-angle-between-two-points-java
     *
     * Once you have that, converting to degrees from radians was done so that I can visualize what I am seeing.
     *
     */
}

