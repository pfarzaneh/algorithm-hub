package pfarzaneh.training.algorithms.dynamicarray;

import java.util.ArrayList;
import java.util.List;

public class Result {

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        int q, x, y, idx;
        int lastAnswer = 0;
        List<Integer> result = new ArrayList<>();
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) arr.add(new ArrayList<>());

        for (List<Integer> query : queries) {
            q = query.get(0);
            x = query.get(1);
            y = query.get(2);
            if (q == 1) {
                idx = (x ^ lastAnswer) % n;
                arr.get(idx).add(y);
            } else {
                idx = (x ^ lastAnswer) % n;
                lastAnswer = arr.get(idx).get(y % (arr.get(idx).size()));
                result.add(lastAnswer);
            }
        }

        return result;
    }



}
