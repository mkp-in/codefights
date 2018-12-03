package in.mkp.basic.level7;

/**
 *
 * https://app.codesignal.com/arcade/intro/level-7/PTWhv2oWqd6p4AHB9
 *
 * Given an array of equal-length strings, check if it is possible to rearrange the strings in such a way that after the rearrangement the strings at consecutive positions would differ by exactly one character.
 *
 * Example
 *
 * For inputArray = ["aba", "bbb", "bab"], the output should be
 * stringsRearrangement(inputArray) = false.
 *
 * All rearrangements don't satisfy the description condition.
 *
 * For inputArray = ["ab", "bb", "aa"], the output should be
 * stringsRearrangement(inputArray) = true.
 *
 * Strings can be rearranged in the following way: "aa", "ab", "bb".
 * Input/Output
 *
 * [execution time limit] 3 seconds (java)
 *
 * [input] array.string inputArray
 *
 * A non-empty array of strings of lowercase letters.
 *
 * Guaranteed constraints:
 * 2 ≤ inputArray.length ≤ 10,
 * 1 ≤ inputArray[i].length ≤ 15.
 * Created by mkumar on 3/6/17.
 */
public class StringRearrange {
    class Word {
        boolean selected;
        String word;

        Word(final String word) {
            this.word = word;
        }
    }

    public static void main(String args[]) {

        StringRearrange stringRearrange = new StringRearrange();
        //String[] str = {"abc","abd", "cdd"};
        String[] str = {"abc","xbc","xxc","xbc","aby","ayy","aby"};
        //String[] str = {"abc", "abc", "abx", "abx", "axx"};
        System.out.println(stringRearrange.stringsRearrangement(str));
    }

    boolean stringsRearrangement(String[] inputArray) {
        Word[] words = new Word[inputArray.length];
        int i=0;
        for (String s : inputArray) {
            words[i]=new Word(s);
            ++i;
        }
        arrange(-1, words, 0);
        return ret;
    }

    boolean ret = false;

    void arrange(int prev, Word[] words, int i) {
        if (i == words.length) {
            if (allSelected(words)) {
                ret = true;
            }
            return;
        }
        //words[i].selected = true;

        for (int j=0; j < words.length; ++j) {
            if (!words[j].selected && (prev == -1 || differByOne(words[prev].word, words[j].word))) {
                words[j].selected = true;
                arrange(j, words, j+1);
                words[j].selected = false;
            }
        }
        //words[i].selected = false;
    }



    boolean differByOne(String s1, String s2) {
        int len = s1.length();
        int diff = 0;
        for (int i = 0; i < len; ++i) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diff++;
            }
        }

        return diff == 1 ? true : false;
    }

    boolean allSelected(Word[] words) {
        for (Word w : words) {
            if (!w.selected) {
                return false;
            }
        }
        return true;
    }


}
