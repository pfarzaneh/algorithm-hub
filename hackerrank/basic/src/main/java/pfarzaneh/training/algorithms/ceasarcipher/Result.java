package pfarzaneh.training.algorithms.ceasarcipher;

import java.io.*;

public class Result {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {

        k = k % 26;

        char[] charArray = s.toCharArray();
        int i;
        StringBuilder sb = new StringBuilder();

        for (char c : charArray) {
            i = (int) c;
            if (i >= 65 && i <= 90) {
                sb.append(encrypt(65, 90, i, k));
            } else if (i >= 97 && i <= 122) {
                sb.append(encrypt(97, 122, i, k));
            } else
                sb.append(c);
        }

        return sb.toString();
    }

    private static char encrypt(int lower, int upper, int c, int k) {
        int val = c + k;
        if (val > upper)
            val = (lower - 1) + (val - upper);
        return (char) val;
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

    }
}
