package pfarzaneh.training.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FibonacciSumOfSquaresLastDigitTest {

    private FibonacciSumOfSquaresLastDigit fibonacciSum = new FibonacciSumOfSquaresLastDigit();

    @Test
    void computeTest_with_big_number() {
        for (int i = 0; i < 10; i++) {
            Assertions.assertEquals(3, compute(7));
            Assertions.assertEquals(1, compute(73));
            Assertions.assertEquals(0, compute(1234567890));
            System.out.println();
        }
    }

    @Test
    void enhancedComputeTest_with_big_number() {
        for (int i = 0; i < 10; i++) {
            Assertions.assertEquals(3, enhancedCompute(7));
            Assertions.assertEquals(1, enhancedCompute(73));
            Assertions.assertEquals(0, enhancedCompute(1234567890));
            System.out.println();
        }
    }

    private long compute(int n) {
        long start = System.nanoTime();
        long result = fibonacciSum.compute(n);
        long end = System.nanoTime();
        System.out.println("Fibonacci sum of squares compute() took: " + (end - start) + " nanos");
        return result;
    }

    private long enhancedCompute(int n) {
        long start = System.nanoTime();
        long result = fibonacciSum.enhancedCompute(n);
        long end = System.nanoTime();
        System.out.println("Fibonacci sum of squares enhanced compute() took: " + (end - start) + " nanos");
        return result;
    }

}
