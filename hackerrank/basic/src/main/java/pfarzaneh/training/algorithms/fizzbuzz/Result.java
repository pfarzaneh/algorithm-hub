package pfarzaneh.training.algorithms.fizzbuzz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;


public class Result {

    public static void fizzBuzz(int n) {
        IntStream
            .rangeClosed(1, n)
            .forEach(i -> {
                if (i % 15 == 0)
                    System.out.println("FizzBuzz");
                else if (i % 3 == 0)
                    System.out.println("Fizz");
                else if (i % 5 == 0)
                    System.out.println("Buzz");
                else
                    System.out.println(i);
            });
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}