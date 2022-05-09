package pfarzaneh.training.algorithms.maxmin;

import java.util.Comparator;
import java.util.List;

public class Result {

    public static int maxMin(int k, List<Integer> arr) {
        arr.sort(Comparator.naturalOrder());

        int diff, min = Integer.MAX_VALUE;

        for (int i = 0; i <= arr.size() - k; i++) {
            diff = arr.get(i + k - 1) - arr.get(i);
            if (diff < min) min = diff;
        }

        return min;
    }
}
