package pfarzaneh.training.algorithms.findmedian;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;


public class Result {

    public static int findMedian(Integer[] arr) {
        Arrays.sort(arr);
        int size = arr.length;
        return arr[size / 2];
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer[] arr =
            Stream
                .of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        int result = Result.findMedian(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}