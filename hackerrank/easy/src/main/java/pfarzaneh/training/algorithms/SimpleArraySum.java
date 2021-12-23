package pfarzaneh.training.algorithms;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class SimpleArraySum {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> ar = Stream
            .of(bufferedReader.readLine().replaceAll("^\\s+|\\s+$", "").split("\\s+"))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int result = Result.simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Result {

    static int simpleArraySum(List<Integer> ar) {
        return ar.stream().reduce(0, Integer::sum);
    }

}
