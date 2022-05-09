package pfarzaneh.training.algorithms.frogjump;

public class Result {

    public static void main(String[] args) {
        System.out.println(solution(2, 50, 10));
    }

    public static int solution(int x, int y, int d) {

        return ((y - x) / d) + ((y - x) % d > 0 ? 1 : 0);
    }
}
