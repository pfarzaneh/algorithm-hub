package pfarzaneh.training.algorithms;

class FastProduct {

    long maxPairwiseProduct(long[] array) {
        int index1 = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[index1] < array[i])
                index1 = i;
        }

        int index2 = (index1 == 0) ? 1 : 0;
        for (int i = 0; i < array.length; i++) {
            if (array[index2] < array[i])
                if (index1 != i)
                    index2 = i;
        }

        return array[index1] * array[index2];
    }

    long enhancedMaxPairwiseProduct(long[] array) {
        long first = 0;
        long second = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] > second) || (array[i] > first)) {
                if (second >= first) {
                    first = second;
                }
                second = array[i];

            }
        }

        return first * second;
    }

    long swappedMaxPairwiseProduct(long[] array) {
        int largestIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[largestIndex])
                largestIndex = i;
        }

        long temp = array[array.length - 1];
        array[array.length - 1] = array[largestIndex];
        array[largestIndex] = temp;

        largestIndex = 0;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[largestIndex])
                largestIndex = i;
        }

        array[array.length - 2] = array[largestIndex];


        return array[array.length - 1] * array[array.length - 2];
    }


}
