package pfarzaneh.training.algorithms.minmaxsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Result {

    public static void miniMaxSum(List<Integer> list) {

        list.sort(Integer::compareTo);

        long min = 0, max = 0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i < size - 1)
                min += list.get(i);
            if (i > 0)
                max += list.get(i);
        }
        System.out.print(min + " " + max);
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr =
            Stream
                .of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();

    }
}