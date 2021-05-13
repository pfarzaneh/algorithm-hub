package pfarzaneh.training.algorithms;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Date;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumTest {

    private Sum sum = new Sum();

    @Test
    void computeTest_with_static_array() {
        long[] arr = {
            1, 2, 3, 4, 5,
            5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
            5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
            3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
            10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};

        assertEquals(360, doCompute(arr));
    }

    @Test
    void computeTest_with_large_dynamic_array() {
        long sum = 0;
        int size = 100000;
        long[] arr = new long[size];

        for (int i = 0; i < size; i++) {
            Random random = new Random();
            int num = random.nextInt(100);
            sum += num;
            arr[i] = num;
        }

        assertEquals(sum, doCompute(arr));
    }

    private long doCompute(long[] arr) {
        long start = new Date().getTime();
        long result = sum.compute(arr);
        System.out.println("compute took: " + (new Date().getTime() - start) + " millis");
        return result;
    }

    @Test
    void dummyAddTest() {
        int result = sum.dummyAdd(8, 2);
        assertEquals(10, result);
    }

    @ParameterizedTest
    @CsvSource({
        "0,    1,   1",
        "1,    2,   3",
        "49,  51, 100",
        "1,  100, 101"
    })
    void dummyAddTest(int first, int second, int expectedResult) {
        int result = sum.dummyAdd(first, second);
        assertEquals(expectedResult, result);
    }


    @Test
    void bitwiseTest(){
        /**
         * 1000.1101 0000.0000 0000.0000 0000.0000
         *
         */
    }

}
