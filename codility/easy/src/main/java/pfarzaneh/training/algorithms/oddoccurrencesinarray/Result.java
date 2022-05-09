package pfarzaneh.training.algorithms.oddoccurrencesinarray;

import java.util.Arrays;

public class Result {

    public int solution(int[] a) {

        Arrays.sort(a);
        for (int i = 0; i < a.length - 1; i += 2)
            if (a[i] != a[i + 1]) return a[i];

        return a[a.length - 1];
    }
}
