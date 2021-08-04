package pfarzaneh.training.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EfficientTest {

    private Efficient efficient = new Efficient();

    @Test
    @SuppressWarnings("Duplicates")
    void computeTest() {

        for (int i = 0; i < 5; i++) {

            assertEquals(27, compute(0, 27));
            assertEquals(4, compute(4, 12));
            assertEquals(3, compute(9, 12));
            assertEquals(9, compute(9, 36));
            assertEquals(18, compute(18, 36));
            assertEquals(12, compute(24, 36));
            assertEquals(4, compute(28, 36));
            assertEquals(4, compute(28, 128));
            assertEquals(64, compute(64, 128));
            assertEquals(2, compute(74, 128));
            assertEquals(2, compute(12560, 6374));
            assertEquals(2, compute(6374, 12560));
            assertEquals(2, compute(6374526, 12560));

            System.out.println("----------------------------------------");
        }
    }

    @SuppressWarnings("Duplicates")
    private int compute(int a, int b) {

        long start = System.nanoTime();
        int result = efficient.compute(a, b);
        long end = System.nanoTime();
        System.out.println("efficient compute() took: " + (end - start) + " nanos");
        return result;
    }

}
