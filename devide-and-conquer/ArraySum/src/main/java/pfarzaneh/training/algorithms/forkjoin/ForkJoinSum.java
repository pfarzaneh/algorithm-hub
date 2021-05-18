package pfarzaneh.training.algorithms.forkjoin;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

class ForkJoinSum extends RecursiveTask<Long> {

    private final long arr[];
    private long result;
    private int lowerBound;
    private int upperBound;

    ForkJoinSum(long[] arr, int lowerBound, int upperBound) {
        this.arr = arr;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    /**
     * The main computation performed by this task.
     *
     * @return the result of the computation
     */
    protected Long compute() {
        invoke
        return null;
    }

//    @Override
//    protected void compute() {
//        if (lowerBound == upperBound){
//            result= arr[lowerBound];
//            return;
//        }
//        else if (upperBound < lowerBound){
//            result = 0;
//            return;
//        }
//        else {
//
//            int mid = (lowerBound + upperBound) / 2;
//            return compute(arr, lowerBound, mid) + compute(arr, mid + 1, upperBound);
//        }
//        result = compute(arr, 0, arr.length - 1);
//    }
//
//    public long getResult() {
//        return result;
//    }
}
