package pfarzaneh.training.algorithms.forkjoin;

import java.util.concurrent.RecursiveAction;

class ForkJoinSum extends RecursiveAction {

    private final long arr[];
    private int lowerBound;
    private int upperBound;
    public long result;

    ForkJoinSum(long[] arr, int lowerBound, int upperBound) {
        this.arr = arr;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    protected void compute() {

        if (lowerBound == upperBound)
            result =  arr[lowerBound];
        else if (upperBound < lowerBound)
            result =  0L;
        else {
            int mid = (lowerBound + upperBound) / 2;
            ForkJoinSum left = new ForkJoinSum(arr, lowerBound, mid);
            ForkJoinSum right = new ForkJoinSum(arr, mid + 1, upperBound);
            right.fork()
            invokeAll(left, right);
            result = left.result +  right.result;

        }
    }

}
