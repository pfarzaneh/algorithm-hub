package pfarzaneh.training.algorithms.matchingstrings;

import java.util.ArrayList;
import java.util.List;

public class Result {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {

        List<Integer> result = new ArrayList<>();

        queries.forEach(query ->
            result.add(
                Long.valueOf(
                    strings
                        .stream()
                        .filter(query::equals)
                        .count()).intValue()));

        return result;

    }
}
