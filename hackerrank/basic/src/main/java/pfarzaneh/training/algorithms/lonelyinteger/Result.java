package pfarzaneh.training.algorithms.lonelyinteger;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Result {

    public static int lonelyinteger(List<Integer> list) {
        list.sort(Integer::compareTo);
        for (int i = 0; i < list.size(); ) {
            if (i == list.size() - 1)
                return list.get(i);
            else if (!list.get(i).equals(list.get(i + 1)))
                return list.get(i);
            i += 2;
        }
        return 0;
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}