package pfarzaneh.training.algorithms;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EfficientTest {

    private Efficient efficient = new Efficient();
    private Naive naive = new Naive();

    @Test
    void maxPairwiseProductTest_with_static_array() {
        long[] arr = {
            9, 10, 5, 8, 11, 3, 6, 7, 4, 2, 11
        };

        assertEquals(121, maxPairwiseProduct(arr));
    }

    @Test
    @SuppressWarnings("Duplicates")
    void maxPairwiseProductTest_with_large_dynamic_array() {
        int size = 600;
        long max = size - 1;
        long[] array = new long[size];

        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        assertEquals((max * (max - 1)), maxPairwiseProduct(array));
    }

    private long maxPairwiseProduct(long[] arr) {

        long start = System.nanoTime();
        long result = efficient.maxPairwiseProduct(arr);
        long end = System.nanoTime();
        System.out.println("maxPairwiseProduct took: " + (end - start) + " millis");
        return result;
    }

    @Test
    void enhancedMaxPairwiseProductTest_with_static_array() {
        long[] arr = {
            9, 10, 5, 8, 11, 3, 6, 7, 4, 2, 11
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

        long start = System.nanoTime();
        long result = efficient.enhancedMaxPairwiseProduct(arr);
        long end = System.nanoTime();
        System.out.println("enhancedMaxPairwiseProduct took: " + (end - start) + " millis");
        return result;
    }

    @Test
    void swappedMaxPairwiseProductTest_with_static_array() {
        long[] arr = {
            9, 10, 5, 8, 11, 3, 6, 7, 4, 2, 11
        };

        assertEquals(121, swappedMaxPairwiseProduct(arr));
    }

    @Test
    @SuppressWarnings("Duplicates")
    void swappedMaxPairwiseProductTest_with_large_dynamic_array() {
        int size = 600;
        long max = size - 1;
        long[] array = new long[size];

        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        assertEquals((max * (max - 1)), swappedMaxPairwiseProduct(array));
    }

    private long swappedMaxPairwiseProduct(long[] arr) {

        long start = System.nanoTime();
        long result = efficient.swappedMaxPairwiseProduct(arr);
        long end = System.nanoTime();
        System.out.println("swappedMaxPairwiseProduct took: " + (end - start) + " millis");
        return result;
    }

    @Test
    void recursiveMaxPairwiseProductTest_with_static_array() {
        long[] arr = {
            20, 1990, 12, 1110, 1,
            59, 12, 15, 120, 1110
        };

        assertEquals(2208900, recursiveMaxPairwiseProduct(arr));
    }

    @Test
    @SuppressWarnings("Duplicates")
    void recursiveMaxPairwiseProductTest_with_large_dynamic_array() {
        int size = 600;
        long max = size - 1;
        long[] array = new long[size];

        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        assertEquals((max * (max - 1)), recursiveMaxPairwiseProduct(array));
    }

    private long recursiveMaxPairwiseProduct(long[] arr) {

        long start = System.nanoTime();
        long result = efficient.recursiveMaxPairwiseProduct(arr);
        System.out.println("recursiveMaxPairwiseProduct took: " + (System.nanoTime() - start) + " millis");
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
//            long naiveMaxPairwise = naive.maxPairwiseProduct(array);
//            long fastMaxPairwise = efficient.enhancedMaxPairwiseProduct(array);
//            assertEquals(naiveMaxPairwise, fastMaxPairwise);
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
//            long naiveMaxPairwise = naive.maxPairwiseProduct(array);
//            long swappedMaxPairwise = efficient.swappedMaxPairwiseProduct(array);
//            assertEquals(naiveMaxPairwise, swappedMaxPairwise);
        }
    }

    @Test
    void assert_recursive_algorithm() {
        Random random = new Random();
        int size = 600;

        for (int t = 0; t < 1000; t++) {
            long[] array = new long[size];
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(10000);
            }
//            long naiveMaxPairwise = naive.maxPairwiseProduct(array);
//            long recursiveMaxPairwise = efficient.recursiveMaxPairwiseProduct(array);
//            assertEquals(naiveMaxPairwise, recursiveMaxPairwise);
        }
    }

    @Test
    void compare_simpleFast_vs_enhanced_vs_swapped_vs_recursive_with_increasing_ordered_array() {

        for (int j = 0; j < 5; j++) {

            int size = 600000000;
            long[] array = new long[size];

            for (int i = 0; i < size; i++) {
                array[i] = i;
            }

            maxPairwiseProduct(array);
            enhancedMaxPairwiseProduct(array);
            swappedMaxPairwiseProduct(array);
//            recursiveMaxPairwiseProduct(array);

            System.out.println("----------------------------------------");
        }
    }

    @Test
    void compare_simpleFast_vs_enhanced_vs_swapped_vs_recursive_with_decreasing_ordered_array() {

        for (int j = 0; j < 5; j++) {

            int size = 600000000;
            long[] array = new long[size];

            for (int i = size - 1; i >= 0; i--) {
                array[i] = i;
            }

            maxPairwiseProduct(array);
            enhancedMaxPairwiseProduct(array);
            swappedMaxPairwiseProduct(array);
//            recursiveMaxPairwiseProduct(array);

            System.out.println("----------------------------------------");
        }
    }

    @Test
    void compare_simpleFast_vs_enhanced_vs_swapped_vs_recursive_with_random_array() {
        Random random = new Random();

        for (int j = 0; j < 5; j++) {

            int size = 600000000;
            long[] array = new long[size];
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(10000);
            }

            maxPairwiseProduct(array);
            enhancedMaxPairwiseProduct(array);
            swappedMaxPairwiseProduct(array);
//            recursiveMaxPairwiseProduct(array);

            System.out.println("---------------------------");
        }
    }

}
