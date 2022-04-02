package pfarzaneh.training.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciLastDigitTest {

    private FibonacciLastDigit largeFibonacci = new FibonacciLastDigit();

    @Test
    void computeTest_just_for_asserting() {

        assertEquals(0, compute(0));
        assertEquals(1, compute(1));
        assertEquals(1, compute(2));
        assertEquals(5, compute(5));
        assertEquals(8, compute(6));
        assertEquals(5, compute(10));
        assertEquals(7, compute(16));
    }

    @Test
    void enhancedComputeTest_just_for_asserting() {

        assertEquals(0, enhancedCompute(0));
        assertEquals(1, enhancedCompute(1));
        assertEquals(1, enhancedCompute(2));
        assertEquals(5, enhancedCompute(5));
        assertEquals(8, enhancedCompute(6));
        assertEquals(5, enhancedCompute(10));
        assertEquals(7, enhancedCompute(16));
    }

    @Test
    void doublyEnhancedComputeTest_just_for_asserting() {

        assertEquals(0, doublyEnhancedCompute(0));
        assertEquals(1, doublyEnhancedCompute(1));
        assertEquals(1, doublyEnhancedCompute(2));
        assertEquals(5, doublyEnhancedCompute(5));
        assertEquals(8, doublyEnhancedCompute(6));
        assertEquals(5, doublyEnhancedCompute(10));
        assertEquals(7, doublyEnhancedCompute(16));
    }

    @Test
    void computeTest_with_big_number() {
        for (int i = 0; i < 10; i++) {
            long n = compute(200000001);
            System.out.println(n);
        }
    }

    @Test
    void enhancedComputeTest_with_big_number() {
        for (int i = 0; i < 10; i++) {
            long n = enhancedCompute(200000003);
            System.out.println(n);
        }
    }

    @Test
    void doublyEnhancedComputeTest_with_big_number() {
        for (int i = 0; i < 10; i++) {
            long n = doublyEnhancedCompute(200000001);
            System.out.println(n);
        }
    }

    private long compute(int n) {
        long start = System.nanoTime();
        long result = largeFibonacci.compute(n);
        long end = System.nanoTime();
        System.out.println("largeFibonacci compute() took: " + (end - start) + " nanos");
        return result;
    }

    private long enhancedCompute(int n) {
        long start = System.nanoTime();
        long result = largeFibonacci.enhancedCompute(n);
        long end = System.nanoTime();
        System.out.println("largeFibonacci enhancedCompute() took: " + (end - start) + " nanos");
        return result;
    }

    private long doublyEnhancedCompute(int n) {
        long start = System.nanoTime();
        long result = largeFibonacci.doublyEnhancedCompute(n);
        long end = System.nanoTime();
        System.out.println("largeFibonacci doublyEnhancedCompute() took: " + (end - start) + " nanos");
        return result;
    }
}
