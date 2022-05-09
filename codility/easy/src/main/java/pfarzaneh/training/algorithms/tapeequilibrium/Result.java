package pfarzaneh.training.algorithms.tapeequilibrium;

import java.util.Arrays;

public class Result {

    public int solution(int[] A) {
        int md = Integer.MAX_VALUE;
        int l = 0;
        int r = Arrays.stream(A).sum();
        int d;

        for (int i = 0; i < A.length - 1; i++) {
            l += A[i];
            r -= A[i];
            d = Math.abs(l - r);
            if (d < md)
                md = d;
        }

        return md;
    }
}
