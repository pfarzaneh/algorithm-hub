package pfarzaneh.training.algorithms.countingsort;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Result {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
        int[] result = new int[100];
        for (int i = 0; i < arr.size(); i++) {
            ++result[arr.get(i)];
        }

        return
            Arrays
                .stream(result)
                .boxed()
                .collect(toList());
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> arr =
            Stream
                .of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.countingSort(arr);

        bufferedWriter.write(
            result
                .stream()
                .map(Object::toString)
                .collect(joining(" ")));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}