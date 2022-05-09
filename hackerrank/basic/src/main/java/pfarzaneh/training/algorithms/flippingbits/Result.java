package pfarzaneh.training.algorithms.flippingbits;

public class Result {
    public static long flippingBits(long n) {
        long complement = ~n;
        int result = (int)complement;
        return Integer.toUnsignedLong(result);

    }
}
