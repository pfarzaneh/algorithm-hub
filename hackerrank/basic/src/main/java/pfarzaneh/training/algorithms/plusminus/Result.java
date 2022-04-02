package pfarzaneh.training.algorithms.plusminus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Result {

    public static void plusMinus(List<Integer> list) {
        int size = list.size();
        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        for (int item : list) {
            if (item > 0)
                ++positives;
            else if (item == 0)
                ++zeros;
            else
                ++negatives;
        }

        DecimalFormat df = new DecimalFormat("#.######");
        df.setRoundingMode(RoundingMode.FLOOR);
        System.out.println(df.format(positives / (double) size));
        System.out.println(df.format(negatives / (double) size));
        System.out.println(df.format(zeros / (double) size));
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

        Result.plusMinus(arr);

        bufferedReader.close();

    }
}