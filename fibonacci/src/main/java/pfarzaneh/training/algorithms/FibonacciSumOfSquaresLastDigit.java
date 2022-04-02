package pfarzaneh.training.algorithms;

class FibonacciSumOfSquaresLastDigit {

    int compute(int n) {
        if (n <= 1) return n;

        int sum = 0;

        if (n > 120) {
            int pisanoLength = 60;
            int multiplier = n / pisanoLength;
            sum = (computeSum(pisanoLength) * multiplier) % 10;
            n %= pisanoLength;
            if (n <= 1)
                return (sum + n) % 10;
        }

        return (sum + computeSum(n)) % 10;
    }

    int enhancedCompute(int n) {
        if (n <= 2) return n;

        if (n > 120) {
            int pisanoLength = 60;
            n %= pisanoLength;
            if (n <= 2)
                return n;
        }

        int previous = 1;
        int current = 1;
        int temp;

        for (int i = 3; i <= n + 1; i++) {
            temp = current;
            current = (previous + current) % 10;
            previous = temp;
        }

        return (previous * current) % 10;

    }

    private int computeSum(int n) {

        int previous = 0;
        int current = 1;
        int sum = 1;
        int temp;

        for (int i = 2; i <= n; i++) {
            temp = current;
            current = (previous + current) % 10;
            previous = temp;

            sum = (int) (sum + Math.pow(current, 2)) % 10;
        }

        return sum;
    }

}
