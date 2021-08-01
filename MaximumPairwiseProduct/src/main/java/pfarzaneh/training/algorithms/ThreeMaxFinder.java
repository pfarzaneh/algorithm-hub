package pfarzaneh.training.algorithms;

public class ThreeMaxFinder {

    long[] find(long[] array) {

        long max = 0, secondMax = 0, thirdMax = 0;

        for (long arrayItem : array) {
            if (arrayItem > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = arrayItem;
            } else if (arrayItem > secondMax) {
                thirdMax = secondMax;
                secondMax = arrayItem;
            } else if (arrayItem > thirdMax) {
                thirdMax = arrayItem;
            }
        }

        return new long[]{max, secondMax, thirdMax};
    }
}
