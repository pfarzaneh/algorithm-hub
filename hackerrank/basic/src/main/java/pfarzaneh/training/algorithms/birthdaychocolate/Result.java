package pfarzaneh.training.algorithms.birthdaychocolate;

import java.util.List;

public class Result {

    public static int birthday_01(List<Integer> s, int d, int m) {
        int count = 0;
        Integer sum;
        for (int i = 0; i <= s.size() - m; i++) {
            sum = s.subList(i, i + m).stream().reduce(Integer::sum).get();
            count += (sum.equals(d)) ? 1 : 0;
        }

        return count;
    }

    public static int birthday_02(List<Integer> s, int d, int m) {
        int start = 0;
        int count = 0;
        int sum = 0;

        for (int i = 0; i < s.size(); i++) {
            sum += s.get(i);
            if (i - start + 1 == m) {
                if (sum == d) {
                    count++;
                }

                sum -= s.get(start);
                start++;
            }
        }
        return count;
    }

}