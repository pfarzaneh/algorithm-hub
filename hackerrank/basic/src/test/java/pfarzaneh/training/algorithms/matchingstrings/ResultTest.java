package pfarzaneh.training.algorithms.matchingstrings;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ResultTest {

    @Test
    void truckTourTest() {
        List<String> strings = Arrays.asList("aba", "baba", "aba", "xzxb");
        List<String> queries = Arrays.asList("aba", "xzxb", "ab");

        List<Integer> result  = Result.matchingStrings(strings, queries);

        System.out.println(Arrays.deepToString(result.toArray()));
    }

}

