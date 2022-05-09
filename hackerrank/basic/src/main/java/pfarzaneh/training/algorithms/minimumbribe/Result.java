package pfarzaneh.training.algorithms.minimumbribe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Result {

    public static void minimumBribes(List<Integer> list) {
        int min1 = list.size();
        int min2 = list.size();
        int bribes = 0;
        int sticker;
        for (int position = list.size(); position > 0; position--) {
            sticker = list.get(position - 1);
            if (sticker - position > 2) {
                System.out.println("Too chaotic");
                return;
            }
            if (sticker > min1) ++bribes;
            if (sticker > min2) ++bribes;

            if (sticker < min1 || sticker < min2) {
                if (min1 > min2)
                    min1 = sticker;
                else
                    min2 = sticker;
            }
        }
        System.out.println(bribes);
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        IntStream.range(0, 1).forEach(tItr -> {
            try {
                List<Integer> q =
                    Stream
                        .of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                Result.minimumBribes(q);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}