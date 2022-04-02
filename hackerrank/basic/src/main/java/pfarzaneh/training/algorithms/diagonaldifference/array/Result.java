package pfarzaneh.training.algorithms.diagonaldifference.array;

import java.io.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Result {

    public static int diagonalDifference(Integer[][] arr) {
        int mainDiameter = 0, subDiameter = 0;
        int n = arr.length - 1;
        for (int i = 0; i <= n; i++) {
            mainDiameter += arr[i][i];
            subDiameter += arr[i][n - i];
        }
        return Math.abs(mainDiameter - subDiameter);
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Integer[][] arr = new Integer[n][];

        IntStream.range(0, n).forEach(i -> {
            try {
                arr[i] =
                    Stream
                        .of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}