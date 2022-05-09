package pfarzaneh.training.algorithms.permmissingelem;

public class Result {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 3, 1 , 5}));
    }

    public static int solution(int[] a) {
        int l = a.length;
        int[] c = new int[l + 1];

        for (int i : a) {
            c[i - 1] = 1;
        }

        for (int i = 0; i < l + 1; i++) {
            if (c[i] == 0)
                return i + 1;
        }

        return 0;
    }
}
