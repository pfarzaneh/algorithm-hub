package pfarzaneh.training.algorithms.birthdaychocolate;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class ResultTest {

    @Test
    void truckTourTest() {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        int d;
        int m;

        for (int i = 0; i < 10; i++) {
            d = random.nextInt(31) + 1;
            m = random.nextInt(12) + 1;
            for (int j = 0; j < 100; j++) {
                list.add(random.nextInt(5) + 1);
            }

            long start01 = System.nanoTime();
            int count01 = Result.birthday_01(list, d, m);
            long end01 = System.nanoTime();
            System.out.println("me - time: " + (end01 - start01) + " - value: " + count01);


            long start02 = System.nanoTime();
            int count02 = Result.birthday_02(list, d, m);
            long end02 = System.nanoTime();
            System.out.println("he - time: " + (end02 - start02) + " - value: " + count02);

            System.out.println();

        }
    }

}

