package pfarzaneh.training.algorithms.palindrome;

import java.io.*;
import java.util.stream.IntStream;

public class Result {

    /*
     * Complete the 'palindromeIndex' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int palindromeIndex(String s) {
        char[] chars = s.toCharArray();
        int head = 0;
        int back = chars.length - 1;
        int index = -1;
        boolean indexFound = false;

        while (head <= back) {
            if (chars[head] == chars[back]) {
                ++head;
                --back;
            } else {
                if ((chars[head + 1] == chars[back]) && (chars[head + 2] == chars[back-1])) {
                    index = head;
                    ++head;
                } else if ((chars[head] == chars[back - 1]) && (chars[head+1] == chars[back - 2])) {
                    index = back;
                    --back;
                } else {
                    return -1;
                }

                if (indexFound)
                    return -1;
                else
                    indexFound = true;
            }
        }

        return index;

    }


}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result.palindromeIndex(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
                bufferedWriter.flush();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
