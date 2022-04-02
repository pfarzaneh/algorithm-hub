package pfarzaneh.training.algorithms;

import java.util.Arrays;

class Efficient {

    long computeLCM(long[] numbers) {
        if (numbers.length == 2)
            return (numbers[0] * numbers[1]) / computeGCD(numbers[0], numbers[1]);
        else {
            long lcm = computeLCM(Arrays.copyOfRange(numbers, 1, numbers.length));
            return (numbers[0] * lcm) / computeGCD(numbers[0], lcm);
        }
    }

    long computeGCD(long a, long b) {
        if (b == 0)
            return a;
        return computeGCD(b, a % b);
    }

}
