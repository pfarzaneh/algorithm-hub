package pfarzaneh.training.algorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeMaxFinderTest {

    private ThreeMaxFinder threeMaxFinder = new ThreeMaxFinder();

    @Test
    void findTest() {
        long[] array = {51, 9, 33, 7, 6, 5, 4, 21, 2, 51, 34};

        long[] result = find(array);

        assertEquals(51, result[0]);
        assertEquals(51, result[1]);
        assertEquals(34, result[2]);
    }

    @Test
    void findTest_with_large_ordered_increasing_array() {
        int size = 600000000;
        long max = size - 1;
        long[] array = new long[size];

        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        long[] result = find(array);

        assertEquals(max, result[0]);
        assertEquals(max - 1, result[1]);
        assertEquals(max - 2, result[2]);
    }

    @Test
    void findTest_with_large_ordered_decreasing_array() {
        int size = 600000000;
        long max = size - 1;
        long[] array = new long[size];

        for (int i = size - 1; i >= 0; i--) {
            array[i] = i;
        }

        long[] result = find(array);

        assertEquals(max, result[0]);
        assertEquals(max - 1, result[1]);
        assertEquals(max - 2, result[2]);
    }

    @Test
    void findTest_with_large_random_array() {
        Random random = new Random();

        int size = 600000000;
        long[] array = new long[size];

        for (int i = size - 1; i >= 0; i--) {
            array[i] = random.nextInt(10000);
        }

        long[] result = find(array);

        Arrays.sort(array);

        assertEquals(array[size - 1], result[0]);
        assertEquals(array[size - 2], result[1]);
        assertEquals(array[size - 3], result[2]);
    }

    private long[] find(long[] arr) {

        long start = System.nanoTime();
        long[] result = threeMaxFinder.find(arr);
        long end = System.nanoTime();
        System.out.println("find() took: " + (end - start) + " nanos");
        return result;
    }

}

