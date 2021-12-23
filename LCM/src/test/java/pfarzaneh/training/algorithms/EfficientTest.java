package pfarzaneh.training.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EfficientTest {

    private Efficient efficient = new Efficient();

    @Test
    void computeTest() {
        assertEquals(24, compute(new long[]{6, 24}));
        assertEquals(84, compute(new long[]{6, 28}));
        assertEquals(54, compute(new long[]{6, 27}));
        assertEquals(467970912861L, compute(new long[]{761457, 614573}));
        assertEquals(420, compute(new long[]{2, 3, 4, 5, 7}));
        assertEquals(210, compute(new long[]{2, 3, 5, 7}));
    }

    private long compute(long[] numbers) {

        long start = System.nanoTime();
        long result = efficient.computeLCM(numbers);
        long end = System.nanoTime();
        System.out.println("efficient compute() took: " + (end - start) + " nanos");
        return result;
    }

}
