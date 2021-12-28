package pfarzaneh.training.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciSumLastDigitTest {

    private FibonacciSumLastDigit fibonacciSum = new FibonacciSumLastDigit();

    @Test
    void computeTest_with_big_number() {
        for (int i = 0; i < 10; i++) {
            long n = compute(1190000);
            System.out.println(n);
        }
    }

    @Test
    void enhancedComputeTest_with_big_number() {
        for (int i = 0; i < 10; i++) {
            long n = enhancedCompute(1190000);
            System.out.println(n);
        }
    }

    private long compute(int n) {
        long start = System.nanoTime();
        long result = fibonacciSum.compute(n);
        long end = System.nanoTime();
        System.out.println("Fibonacci sum compute() took: " + (end - start) + " nanos");
        return result;
    }

    private long enhancedCompute(int n) {
        long start = System.nanoTime();
        long result = fibonacciSum.enhancedCompute(n);
        long end = System.nanoTime();
        System.out.println("Fibonacci sum with enhanced compute() took: " + (end - start) + " nanos");
        return result;
    }
}
