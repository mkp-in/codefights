package in.mkp.challenges;

import java.util.HashSet;
import java.util.Set;

/**
 * https://codefights.com/challenge/oDm5up3SPpMZqpEmy
 *
 *  ****** Awesome one ******
 */
public class CheckSumSub {

    public static void main(String[] args) {
        CheckSumSub checkSumSub = new CheckSumSub();
        System.out.println("checkSumSub.checkSumSub(new int[]{0, 1, 2, 3, 4, 5}, 7) = "
                + checkSumSub.checkSumSub(new int[]{0, 1, 2, 3, 4, 5}, 7));

        System.out.println("checkSumSub.checkSumSub(new int[]{1, -2, 3, -4, 5, -6, 7, -8, 9}, -7) = "
                + checkSumSub.checkSumSub(new int[]{1, -2, 3, -4, 5, -6, 7, -8, 9}, -7));

        System.out.println("checkSumSub.checkSumSub(new int[]{-1, -2, 3}, 1) = "
                + checkSumSub.checkSumSub(new int[]{-1, -2, 3}, 1));

        System.out.println("checkSumSub.checkSumSub(new int[]{-1, -2, -3}, -6) = "
                + checkSumSub.checkSumSub(new int[]{-1, -2, -3}, -6));

        System.out.println("checkSumSub.checkSumSub(new int[]{-1, -2, -3}, 0) = "
                + checkSumSub.checkSumSub(new int[]{-1, -2, -3}, 0));
    }

    /**
     * REF: http://stackoverflow.com/questions/14948258/given-an-input-array-find-all-subarrays-with-given-sum-k
     *
     * Brute approach to this problem will be O(n^2). We can do one better and go with O(n) but with additional space
     * for storing a set.
     *
     * The definition of subarray is: A contiguous subarray of array A is a subset of array A consecutive elements.
     *
     * The trick here is that we keep on adding the sum of numbers and while iterating over & store the sum in the set.
     * At each stage we check if sum - k is present in the set. The reason we use sum - k is because if sum - k is
     * present in the set that means we have encountered k.
     *
     * Imagine  pre + k = sum , then :
     * pre = sum - k
     *
     * So, if we had pre in the set, it means that the a subarray sums upto k
     *
     * @param arr
     * @param k
     * @return
     */
    boolean checkSumSub(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        int sum=0;
        for (int i=0; i < arr.length; ++i) {
            sum+=arr[i];
            if (set.contains(sum-k)) {
                return true;
            }
            set.add(sum);
        }
        //Edge case where checkSumSub(new int[]{-1, -2, -3}, -6)
        return set.contains(k);
    }

}
