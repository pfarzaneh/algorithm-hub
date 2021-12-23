package pfarzaneh.training.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargeFibonacciLastDigitTest {

    private LargeFibonacciLastDigit largeFibonacci = new LargeFibonacciLastDigit();

    @Test
    @SuppressWarnings("Duplicates")
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
    void computeTest_with_big_number() {
        long n = compute(200000001);
        System.out.println(n);
    }

    private long compute(int n) {

        long start = System.nanoTime();
        long result = largeFibonacci.compute(n);
        long end = System.nanoTime();
        System.out.println("largeFibonacci compute() took: " + (end - start) + " nanos");
        return result;
    }
}
