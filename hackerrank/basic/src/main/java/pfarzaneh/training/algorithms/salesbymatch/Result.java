package pfarzaneh.training.algorithms.salesbymatch;

import java.util.List;

public class Result {

    public static int sockMerchant(int n, List<Integer> ar) {

        int[] o = new int[101];
        int p = 0;

        for (int i : ar) {
            if (++o[i] == 2) {
                ++p;
                o[i] = 0;
            }
        }

        return p;
    }
}
