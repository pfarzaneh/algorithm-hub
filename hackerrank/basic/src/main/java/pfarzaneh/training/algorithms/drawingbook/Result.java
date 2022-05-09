package pfarzaneh.training.algorithms.drawingbook;

public class Result {

    public static int pageCount(int n, int p) {
        return p <= (n / 2) ? p / 2 : (n / 2) - (p / 2);
    }
}
