package in.mkp.basic.level3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;

/**
 *
 * URL: https://app.codesignal.com/arcade/intro/level-3/fzsCQGYbxaEcTr2bL
 */
public class AllLongestStrings {


    public static void main(String[] args) {
        AllLongestStrings allLongestStrings = new AllLongestStrings();
        //System.out.println("allLongestStrings.allLongestStrings(new String[]{\"aba\", \"aa\", \"ad\", \"vcd\", \"aba\"}) = " + allLongestStrings.allLongestStrings(new String[]{"aba", "aa", "ad", "vcd", "aba"}));
    }
    
    /*String[] allLongestStrings(String[] inputArray) {
        Map<Integer, List<String>> collect = Arrays.stream(inputArray)
                .collect(groupingBy(s -> s.length()));

    }*/
}
