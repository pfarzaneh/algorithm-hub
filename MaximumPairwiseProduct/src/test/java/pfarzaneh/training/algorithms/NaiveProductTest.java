package pfarzaneh.training.algorithms;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NaiveProductTest {

    private NaiveProduct naiveProduct = new NaiveProduct();

    @Test
    void maxPairwiseProductTest_with_static_array() {
        long[] arr = {
            1,2,3,4,5,6,7,8,9,10
        };

        assertEquals(90, maxPairwiseProduct(arr));
    }

    @Test
    void maxPairwiseProductTest_with_large_dynamic_array() {
        int size = 60000;
        long max = size -1;
        long[] array = new long[size];

        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        assertEquals((max * (max-1)), maxPairwiseProduct(array));
  }

    @Test
    void enhancedMaxPairwiseProductTest_with_large_dynamic_array() {
        int size = 60000;
        long max = size -1;
        long[] array = new long[size];

        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        assertEquals((max * (max-1)), enhancedMaxPairwiseProduct(array));
  }

    private long maxPairwiseProduct(long[] arr) {

        long start = new Date().getTime();
        long result = naiveProduct.maxPairwiseProduct(arr);
        System.out.println("maxPairwiseProduct took: " + (new Date().getTime() - start) + " millis");
        return result;
    }

    private long enhancedMaxPairwiseProduct(long[] arr) {

        long start = new Date().getTime();
        long result = naiveProduct.enhancedMaxPairwiseProduct(arr);
        System.out.println("enhancedMaxPairwiseProduct took: " + (new Date().getTime() - start) + " millis");
        return result;
    }

}

