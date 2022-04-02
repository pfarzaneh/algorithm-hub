package pfarzaneh.training.algorithms.largenumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

class LargeNumberSumTest {

    private LargeNumberSum sum = new LargeNumberSum();

    @Test
    void compute_small_numbers() {

        Assertions.assertEquals("0", sum.compute("0", "0"));
        Assertions.assertEquals("1", sum.compute("0", "1"));
        Assertions.assertEquals("2", sum.compute("1", "1"));
        Assertions.assertEquals("4", sum.compute("2", "2"));
        Assertions.assertEquals("17", sum.compute("8", "9"));
        Assertions.assertEquals("21", sum.compute("8", "13"));
        Assertions.assertEquals("31", sum.compute("18", "13"));
        Assertions.assertEquals("21", sum.compute("20", "1"));
        Assertions.assertEquals("56", sum.compute("34", "22"));
        Assertions.assertEquals("236", sum.compute("15", "221"));
        Assertions.assertEquals("333", sum.compute("111", "222"));
        Assertions.assertEquals("3460", sum.compute("3459", "1"));
        Assertions.assertEquals("6763", sum.compute("6721", "42"));
        Assertions.assertEquals("10246", sum.compute("9959", "287"));
    }

    @Test
    void compute_small_random_numbers() {
        Random random = new Random();
        int first;
        int second;
        int result;

        for (int i = 0; i < 200000; i++) {
            first = random.nextInt(1000000);
            second = random.nextInt(1000000);
            result = first + second;
            String sumResult = sum.compute(first + "", second + "");
            Assertions.assertEquals(String.valueOf(result), sumResult);
        }

    }

    @Test
    void compute_large_numbers() {
        String result = sum.compute(
            "8907325697860125679438126",
            "6993476542899645637");

        Assertions.assertEquals("8907332691336668579083763", result);
    }

}

