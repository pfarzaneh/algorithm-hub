package pfarzaneh.training.algorithms.cyclicrotation;

import java.util.Arrays;

public class Result {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println(Arrays.toString(solution(a, 0)));
    }

    public static int[] solution(int[] a, int k) {

        if (a == null || a.length == 0 || k == 0 || k == a.length)
            return a;

        int l = a.length;
        int n = k % l;
        int[] result = new int[l];

        for (int i = 0; i < l; i++) {
            if (i < n)
                result[i] = a[i + (l - n)];
            else
                result[i] = a[i - n];
        }

        return result;
    }
}
