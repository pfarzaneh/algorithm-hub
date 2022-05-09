package pfarzaneh.training.algorithms.trucktour;

import java.util.List;

public class Result {

    public static int truckTour(List<List<Integer>> petrolpumps) {
        int initIndex = -1;
        long amount;
        long distance;
        long sumOfAmounts = 0;
        long sumOfDistances = 0;

        for (int i = 0; i < petrolpumps.size(); i++) {
            amount = petrolpumps.get(i).get(0);
            distance = petrolpumps.get(i).get(1);

            if (amount < distance) {
                if (amount + sumOfAmounts > distance + sumOfDistances) {
                    sumOfAmounts += amount;
                    sumOfDistances += distance;
                } else {
                    sumOfAmounts = 0;
                    sumOfDistances = 0;
                    initIndex = -1;
                }
            } else {
                if (initIndex == -1)
                    initIndex = i;
                sumOfAmounts += amount;
                sumOfDistances += distance;
            }
        }

        return initIndex;
    }

}