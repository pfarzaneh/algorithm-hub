package pfarzaneh.training.algorithms.basefibo;

import org.junit.jupiter.api.Test;
import pfarzaneh.training.algorithms.basefibo.Efficient;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EfficientTest {

    private Efficient efficient = new Efficient();

    @Test
    @SuppressWarnings("Duplicates")
    void computeTest_just_for_asserting() {

        assertEquals(0, compute(0));
        assertEquals(1, compute(1));
        assertEquals(1, compute(2));
        assertEquals(5, compute(5));
        assertEquals(8, compute(6));
        assertEquals(55, compute(10));
    }

    @Test
    void computeTest_with_big_number() {
        long n = compute(50000);
        System.out.println(n);
    }

    private long compute(int n) {

        long start = System.nanoTime();
        long result = efficient.compute(n);
        long end = System.nanoTime();
        System.out.println("efficient compute() took: " + (end - start) + " nanos");
        return result;
    }
}
