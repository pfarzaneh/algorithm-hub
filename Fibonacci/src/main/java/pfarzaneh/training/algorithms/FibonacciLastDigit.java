package pfarzaneh.training.algorithms;

class FibonacciLastDigit {

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

    int enhancedCompute(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current = 1;
        int temp;

        for (int i = 2; i <= n; i++) {
            temp = current;
            current = (previous + current) % 10;
            previous = temp;
        }

        return current;

    }

    long doublyEnhancedCompute(int n) {

        if (n <= 1)
            return n;

        int pisanoLength = getPisanoLength();

        n = n % pisanoLength;

        if (n <= 0)
            return n;

        int previous = 0;
        int current = 1;
        int temp;

        for (int i = 2; i <= n; i++) {
            temp = current;
            current = (previous + current) % 10;
            previous = temp;
        }

        return current;
    }

    private int getPisanoLength() {
        int previous = 0;
        int current = 1;
        int temp;

        for (int i = 0; i < 100; i++) {
            temp = current;
            current = (previous + current) % 10;
            previous = temp;

            if (previous == 0 && current == 1) {
                return (i + 1);
            }
        }

        return 0;
    }
}
