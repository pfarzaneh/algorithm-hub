package pfarzaneh.training.algorithms.superdigit.small;

import java.io.*;

public class Result {


    public static int superDigit(String s, int k) {

        int num = Integer.valueOf(s);
        num = sum(num) * k;
        while (num > 9) {
            num = sum(num);
        }

        return num;

    }

    private static int sum(int num) {
        int sum = 0;
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

        for (int i = 0; i < 10; i++) {

            int result = Result.superDigit(n, k);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}