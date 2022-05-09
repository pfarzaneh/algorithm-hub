package pfarzaneh.training.algorithms.superdigit.large;

import java.io.*;
import java.util.Arrays;

public class Result {

    public static int superDigit(String s, int k) {

        long num = breakAndSum(s) * k;
        while (num > 9) {
            num = sum(num);
        }

        return Long.valueOf(num).intValue();

    }

    private static long breakAndSum(String s) {
        long sum = 0;

        char[] numbers = s.toCharArray();

        for (int i = 0; i < numbers.length; i++) {
            sum += Long.valueOf(String.valueOf(numbers[i]));
        }
        return sum;

    }

    private static long sum(long num) {
        long sum = 0;
        while (num > 9) {
            sum += num % 10;
            num = num / 10;
        }
        return sum + num;
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        String n = firstMultipleInput[0];

        int k = Integer.parseInt(firstMultipleInput[1]);

        long result = Result.superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}