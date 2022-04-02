package pfarzaneh.training.algorithms;

class Efficient {

    int compute(int a, int b) {
        if (b == 0)
            return a;
        return compute(b, a % b);
    }

}
