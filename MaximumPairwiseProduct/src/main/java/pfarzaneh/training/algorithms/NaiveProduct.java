package pfarzaneh.training.algorithms;

class NaiveProduct {

    long maxPairwiseProduct(long[] array) {
        long product = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++)
                if (i != j)
                    if (product < (array[i] * array[j]))
                        product = array[i] * array[j];
        }

        return product;
    }

    long enhancedMaxPairwiseProduct(long[] array) {
        long product = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++)
                if (product < (array[i] * array[j]))
                    product = array[i] * array[j];
        }

        return product;
    }
}
