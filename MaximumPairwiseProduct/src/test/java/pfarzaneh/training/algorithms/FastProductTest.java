package pfarzaneh.training.algorithms;

import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FastProductTest {

    private FastProduct fastProduct = new FastProduct();
    private NaiveProduct naiveProduct = new NaiveProduct();

    @Test
    void maxPairwiseProductTest_with_static_array() {
        long[] arr = {
            9, 2, 5, 3, 4, 8, 6, 1, 10, 7
        };

        assertEquals(90, maxPairwiseProduct(arr));
    }

    @Test
    @SuppressWarnings("Duplicates")
    void maxPairwiseProductTest_with_large_dynamic_array() {
        int size = 600000000;
        long max = size - 1;
        long[] array = new long[size];

        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        assertEquals((max * (max - 1)), maxPairwiseProduct(array));
    }

    private long maxPairwiseProduct(long[] arr) {

        long start = new Date().getTime();
        long result = fastProduct.maxPairwiseProduct(arr);
        System.out.println("maxPairwiseProduct took: " + (new Date().getTime() - start) + " millis");
        return result;
    }

    @Test
    void enhancedMaxPairwiseProductTest_with_static_array() {
        long[] arr = {
            4, 9, 10, 1, 2, 3, 11, 5, 6, 7, 8, 9, 10, 0, 11
        };

        assertEquals(121, enhancedMaxPairwiseProduct(arr));
    }

    @Test
    @SuppressWarnings("Duplicates")
    void enhancedMaxPairwiseProductTest_with_large_dynamic_array() {
        int size = 600000000;
        long max = size - 1;
        long[] array = new long[size];

        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        assertEquals((max * (max - 1)), enhancedMaxPairwiseProduct(array));
    }

    private long enhancedMaxPairwiseProduct(long[] arr) {

        long start = new Date().getTime();
        long result = fastProduct.enhancedMaxPairwiseProduct(arr);
        System.out.println("enhancedMaxPairwiseProduct took: " + (new Date().getTime() - start) + " millis");
        return result;
    }

    @Test
    void swappedMaxPairwiseProductTest_with_static_array() {
        long[] arr = {
            4, 9, 10, 1, 2, 3, 11, 5, 6, 7, 8, 9, 10, 0, 11
        };

        assertEquals(121, swappedMaxPairwiseProduct(arr));
    }

    @Test
    @SuppressWarnings("Duplicates")
    void swappedMaxPairwiseProductTest_with_large_dynamic_array() {
        int size = 600000000;
        long max = size - 1;
        long[] array = new long[size];

        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        assertEquals((max * (max - 1)), swappedMaxPairwiseProduct(array));
    }

    private long swappedMaxPairwiseProduct(long[] arr) {

        long start = new Date().getTime();
        long result = fastProduct.swappedMaxPairwiseProduct(arr);
        System.out.println("swappedMaxPairwiseProduct took: " + (new Date().getTime() - start) + " millis");
        return result;
    }

    @Test
    void assert_enhanced_algorithm() {
        Random random = new Random();
        int size = 600;

        for (int t = 0; t < 10000; t++) {
            long[] array = new long[size];
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(10000);
            }
            long naiveMaxPairwise = naiveProduct.maxPairwiseProduct(array);
            long fastMaxPairwise = fastProduct.enhancedMaxPairwiseProduct(array);
            assertEquals(naiveMaxPairwise, fastMaxPairwise);
        }
    }

    @Test
    void assert_swapped_algorithm() {
        Random random = new Random();
        int size = 600;

        for (int t = 0; t < 10000; t++) {
            long[] array = new long[size];
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(10000);
            }
            long naiveMaxPairwise = naiveProduct.maxPairwiseProduct(array);
            long swappedMaxPairwise = fastProduct.swappedMaxPairwiseProduct(array);
            assertEquals(naiveMaxPairwise, swappedMaxPairwise);
        }
    }

    @Test
    void compare

}

