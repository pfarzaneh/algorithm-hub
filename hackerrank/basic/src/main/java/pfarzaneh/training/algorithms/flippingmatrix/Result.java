package pfarzaneh.training.algorithms.flippingmatrix;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Result {

    public static int flippingMatrix(List<List<Integer>> matrix) {

        int mainN = matrix.size() - 1;
        int subN = (matrix.size() / 2) - 1;

        int sum = 0;

        for (int i = 0; i <= subN; i++) {
            for (int j = 0; j <= subN; j++) {
                sum +=
                    Math.max(
                        matrix.get(i).get(j),
                        Math.max(
                            matrix.get(i).get(mainN - j),
                            Math.max(
                                matrix.get(mainN - i).get(j),
                                matrix.get(mainN - i).get(mainN - j))));
            }
        }

        return sum;

    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<List<Integer>> matrix = new ArrayList<>();

                IntStream.range(0, 2 * n).forEach(i -> {
                    try {
                        matrix.add(
                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                        );
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

                int result = Result.flippingMatrix(matrix);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();

    }
}