package pfarzaneh.training.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class RotateTest {

    private Rotate rotate = new Rotate();

    @Test
    public void directTest_large_array() {
        for (int i = 0; i < 30; i++) {

            int l = 100000;
            int[] array = new int[l];

            int n = 10000;

            fillWithRandomNumbers(array);

            int[] tempArray = new int[n];
            System.arraycopy(array, 0, tempArray, 0, n);

            long start = System.nanoTime();
            rotate.leftward(array, n);
            System.out.println("elapsed time: " + (System.nanoTime() - start));

            Assertions.assertEquals(tempArray[0], array[l - n]);
            Assertions.assertEquals(tempArray[n - 1], array[l - 1]);

        }

    }


    private void fillWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100000);
        }
    }
}
