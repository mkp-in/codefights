package in.mkp.basic.level12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mkumar on 5/9/17.
 */
public class FileNaming {

    public static void main(String[] args) {
        FileNaming fileNaming = new FileNaming();
        System.out.println("fileNaming.fileNaming(new String[] {\"doc\", \"doc\", \"image\", \"doc(1)\", \"doc\"}) = " 
                + fileNaming.fileNaming(new String[]{"doc", "doc", "image", "doc(1)", "doc"}));

        System.out.println("fileNaming.fileNaming(new String[]{\"a(1)\",\"a(6)\",\"a\",\"a\",\"a\",\"a\",\"a\",\"a\",\"a\",\"a\",\"a\",\"a\"}) = "
                + fileNaming.fileNaming(new String[]{"a(1)", "a(6)", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"}));

        System.out.println("fileNaming.fileNaming(new String[] {\"dd\",\"dd(1)\",\"dd(2)\",\"dd\",\"dd(1)\",\"dd(1)(2)\",\"dd(1)(1)\",\"dd\",\"dd(1)\"}) = "
                + fileNaming.fileNaming(new String[]{"dd", "dd(1)", "dd(2)", "dd", "dd(1)", "dd(1)(2)", "dd(1)(1)", "dd", "dd(1)"}));
    }

    String[] fileNaming(String[] names) {
        Map<String, Integer> map =  new HashMap<>();
        List<String> list = new ArrayList<>();

        for (int i=0; i < names.length; ++i) {
            if (map.containsKey(names[i])){
                int val = map.get(names[i]);
                String s = names[i] + "(" + ++val + ")";
                while (list.contains(s)) {
                    val = getLastVal(s);
                    s = names[i] + "(" + ++val + ")";
                }
                list.add(s);
                map.put(names[i], val);
            }
            else if (list.contains(names[i])) {
                String s = names[i] + "(1)";
                list.add(s);
                map.put(names[i], 0);
            }
            else {
                list.add(names[i]);
                map.put(names[i], 0);
            }
        }

        return list.toArray(new String[]{});
    }

    int getLastVal(String s) {
        int ret=0;
        Pattern pattern = Pattern.compile("\\([0-9]+\\)");
        Matcher matcher = pattern.matcher(s);
        String last = "";
        while(matcher.find()) {
            last = matcher.group();
        }
        last = last.replace("(", "").replace(")", "");
        return  Integer.parseInt(last);

    }
}
