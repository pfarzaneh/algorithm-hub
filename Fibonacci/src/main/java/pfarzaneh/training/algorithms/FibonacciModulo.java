package pfarzaneh.training.algorithms;

class FibonacciModulo {

    long fibonacciModulo(long n, int m) {

        long pisanoLength = getPisanoLength(m);

        n = n % pisanoLength;

        if (n == 0 || n == 1)
            return n;

        long previous = 0;
        long current = 1;
        long temp;

        for (int i = 2; i <= n; i++) {
            temp = current;
            current = (previous + current) % m;
            previous = temp;
        }

        return current;
    }

    private long getPisanoLength(int m) {
        long previous = 0;
        long current = 1;
        long result = 0;

        for (int i = 0; i < m * m; i++) {
            long temp = current;
            current = (previous + current) % m;
            previous = temp;

            if (previous == 0 && current == 1) {
                result = i + 1;
                break;
            }
        }

        return result;
    }

}