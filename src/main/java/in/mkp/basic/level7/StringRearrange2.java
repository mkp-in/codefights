package in.mkp.basic.level7;

/**
 * Created by mkumar on 3/6/17.
 */
public class StringRearrange2 {

    class Word {
        boolean selected;
        String word;

        Word(final String word) {
            this.word = word;
        }
    }

    public static void main(String args[]) {

        StringRearrange2 stringRearrange = new StringRearrange2();
        //String[] str = {"abc","abd", "cdd"};
        String[] str = {"abc","xbc","xxc","xbc","aby","ayy","aby"};
        //String[] str = {"abc", "abc", "abx", "abx", "axx"};
        System.out.println(stringRearrange.stringsRearrangement(str));
    }



    boolean stringsRearrangement(String[] a) {
        int n = a.length;

        int [] degree = new int[n];

        // check if this graph has Hamiltonian path
        // based on theorem: A simple graph with n vertices (n >= 3) is Hamiltonian if every vertex has degree n / 2 or greater
        // and theorem: A graph is Hamiltonian if and only if its closure is Hamiltonian
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if (differByOne(a[i], a[j]))
                    degree[i] ++;
            }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!differByOne(a[i], a[j]) && degree[i] + degree[j] >= n) {
                    degree[i]++;
                    degree[j]++;
                }
            }
        }



        for (int d : degree)
            if (d<n/2) return false;

        return true;
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
