package pfarzaneh.training.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NaiveTest {

    private Naive naive = new Naive();

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
        compute(46);
    }

    private long compute(int n) {

        long start = System.nanoTime();
        long result = naive.compute(n);
        long end = System.nanoTime();
        System.out.println("naive compute() took: " + (end - start) + " nanos");
        return result;
    }

}

