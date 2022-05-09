package pfarzaneh.training.algorithms.trucktour;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ResultTest {

    @Test
    void truckTourTest() {
        List<List<Integer>> petrolpumps = new ArrayList<>();

        petrolpumps.add(Arrays.asList(1,5));
        petrolpumps.add(Arrays.asList(10,3));
        petrolpumps.add(Arrays.asList(1,7));
        petrolpumps.add(Arrays.asList(2,5));
        petrolpumps.add(Arrays.asList(7,2));
        petrolpumps.add(Arrays.asList(1,3));
        petrolpumps.add(Arrays.asList(5,1));

        Assertions.assertEquals(4, Result.truckTour(petrolpumps));

    }

}

