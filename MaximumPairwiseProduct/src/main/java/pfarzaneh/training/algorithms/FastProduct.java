package pfarzaneh.training.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class FastProduct {

    private Map<Long, List<Long>> map = new HashMap<Long, List<Long>>();

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

    long recursiveMaxPairwiseProduct(long[] array) {
        long[] indexMaxPair = recursiveMaxPairwiseProduct(array, 0, array.length - 1);

        long max = indexMaxPair[1];

        List<Long> comparedIndices = map.get(indexMaxPair[0]);

        long secondMax = array[comparedIndices.get(0).intValue()];

        for (int i = 1; i < comparedIndices.size(); i++) {
            if (secondMax < array[comparedIndices.get(i).intValue()])
                secondMax = array[comparedIndices.get(i).intValue()];
        }

        return max * secondMax;

    }

    long[] recursiveMaxPairwiseProduct(long[] array, int start, int end) {
        if (start >= end) {
            return new long[]{end, array[end]};
        } else if (end - start == 1) {
            if (array[start] > array[end]) {
                fillMap(start, end);
                return new long[]{start, array[start]};
            } else {
                fillMap(end, start);
                return new long[]{end, array[end]};
            }
        } else {
            int mid = (start + end) / 2;
            long[] first = recursiveMaxPairwiseProduct(array, start, mid);
            long[] second = recursiveMaxPairwiseProduct(array, mid + 1, end);

            if (first[1] > second[1]) {
                fillMap(first[0], second[0]);
                return new long[]{first[0], first[1]};
            } else {
                fillMap(second[0], first[0]);
                return new long[]{second[0], second[1]};
            }

        }
    }

    void fillMap(long key, long value) {
        if (map.containsKey(key)) {
            List<Long> list = map.get(key);
            list.add(value);
        } else {
            List<Long> list = new ArrayList<Long>();
            list.add(value);
            map.put(key, list);
        }
    }

}
