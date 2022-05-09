package pfarzaneh.training.algorithms.permutingtwoarrays;

import java.util.Comparator;
import java.util.List;

public class Result {

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        A.sort(Integer::compareTo);
        A.sort(Comparator.reverseOrder());
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) + B.get(i) < k)
                return "NO";
        }
        return "YES";
    }
}
