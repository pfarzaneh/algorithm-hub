package pfarzaneh.training.algorithms;

class ArraySum {

    int dummyAdd(int a, int b) {
        return a + b;
    }

    long computeSequentially(long arr[]) {
        long sum = 0;
        for (long val : arr) {
            sum += val;
        }
        return sum;
    }

    long compute(long arr[]) {
        return compute(arr, 0, arr.length - 1);
    }

    private long compute(long[] arr, int lowerBound, int upperBound) {
        if (lowerBound == upperBound)
            return arr[lowerBound];
        else if (upperBound < lowerBound)
            return 0;
        else {
            int mid = (lowerBound + upperBound) / 2;
            return compute(arr, lowerBound, mid) + compute(arr, mid + 1, upperBound);
        }
    }

}
