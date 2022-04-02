package pfarzaneh.training.algorithms;

class FibonacciSumLastDigit {

    int compute(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current = 1;
        int temp;
        int sum = 1;

        for (int i = 2; i <= n; i++) {
            temp = current;
            current = (previous + current) % 10;
            previous = temp;
            sum = (sum + current) % 10;
        }

        return sum;
    }

    int enhancedCompute(int n) {
        if (n <= 1)
            return n;

        int sum = 0;

        //for large enough n, we calculate pisano period for modulo 10
        if (n > 120) {
            int pisanoLength = getPisanoLength();

            sum = computeSum(pisanoLength);
            int multiplier = n / pisanoLength;
            sum = (sum * multiplier) % 10;

            n = n % pisanoLength;
            if (n <= 1)
                return (sum + n) % 10;
        }

        return (sum + computeSum(n)) % 10;
    }

    int enhancedPartialCompute(int m, int n){
        int whole = enhancedCompute(n);
        int part = enhancedCompute(m -1);

        return ((whole + 10) - part) % 10;
    }

    private int computeSum(int n) {
        int previous = 0;
        int current = 1;
        int temp;
        int sum = 1;

        for (int i = 2; i <= n; i++) {
            temp = current;
            current = (previous + current) % 10;
            previous = temp;

            sum = (sum + current) % 10;
        }

        return sum;
    }

    private int getPisanoLength() {
        int previous = 0;
        int current = 1;
        int temp;

        for (int i = 0; i < 100; i++) {
            temp = current;
            current = (previous + current) % 10;
            previous = temp;

            if (previous == 0 && current == 1)
                return (i + 1);
        }

        return 0;
    }
}
