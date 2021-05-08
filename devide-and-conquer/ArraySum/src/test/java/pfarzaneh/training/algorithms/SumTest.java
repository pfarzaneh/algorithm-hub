package pfarzaneh.training.algorithms;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SumTest {

    private Sum sum;

    @BeforeAll
    void beforeAll() {
        sum = new Sum();
    }

    @Test
    void computeTest() {
        long[] arr = {1, 2, 3, 4, 5, 6};
        assertEquals(21, sum.compute(arr));
    }

    @Test
    void addTest() {
        int result = sum.add(8, 2);
        assertEquals(10, result);
    }

    @ParameterizedTest
    @CsvSource({
        "0,    1,   1",
        "1,    2,   3",
        "49,  51, 100",
        "1,  100, 101"
    })
    void addTest(int first, int second, int expectedResult) {
        int result = sum.add(first, second);
        assertEquals(expectedResult, result);
    }
}
