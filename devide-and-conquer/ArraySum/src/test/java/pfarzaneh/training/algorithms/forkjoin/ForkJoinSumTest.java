package pfarzaneh.training.algorithms.forkjoin;

import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ForkJoinSumTest {

    @Test
    void computeTest_with_static_array() {
        long[] arr = {
            1, 2, 3, 4, 5,
            5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
            5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
            3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
            10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};

        assertEquals(360, doCompute(arr));
    }

    @Test
    @SuppressWarnings("Duplicates")
    void computeTest_with_large_dynamic_array() {
        long sum = 0;
        int size = 300000000;
        long[] arr = new long[size];

        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
            sum += arr[i];
        }

        assertEquals(sum, doCompute(arr));
    }

    private long doCompute(long[] arr) {
        long start = new Date().getTime();

        ForkJoinSum forkJoinSum = new ForkJoinSum(arr, 0, arr.length-1);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(forkJoinSum);

        long result = forkJoinSum.result;

        System.out.println("compute took: " + (new Date().getTime() - start) + " millis");
        return result;
    }

}

