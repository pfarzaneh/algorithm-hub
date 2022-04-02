package pfarzaneh.training.algorithms;

class Naive {


    int compute(int a, int b) {

        int gcd = 0;

        for (int i = 1; i <= a + b; i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }

        return gcd;
    }

    int enhancedCompute(int a, int b) {

        int smaller = a > b ? b : a;
        int gcd = a > b ? a : b;

        for (int i = 1; i <= smaller; i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        return gcd;
    }
}
