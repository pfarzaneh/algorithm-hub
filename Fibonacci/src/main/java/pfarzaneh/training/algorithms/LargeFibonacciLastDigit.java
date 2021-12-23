package pfarzaneh.training.algorithms;

class LargeFibonacciLastDigit {

    int compute(int n) {

        if (n <= 1)
            return n;

        int[] values = new int[n + 1];
        values[0] = 0;
        values[1] = 1;
        for (int i = 2; i <= n; i++) {
            values[i] = (values[i - 1] + values[i - 2]) % 10;
        }

        return values[n];
    }

}
