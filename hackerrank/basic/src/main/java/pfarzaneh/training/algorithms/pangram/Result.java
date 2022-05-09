package pfarzaneh.training.algorithms.pangram;

import java.util.HashSet;
import java.util.Set;

public class Result {

    public static String pangrams(String s) {

        Set<Integer> set = new HashSet<>();
        int temp;

        for (int i = 0; i < s.length(); i++) {
            temp = (int) s.charAt(i);

            if (temp >= 65 && temp <= 90)
                set.add(temp + 32);
            else if (temp >= 97 && temp <= 122)
                set.add(temp);

            if (set.size() == 26)
                return "pangram";

        }

        return "not pangram";
    }
}
