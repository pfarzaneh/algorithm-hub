package pfarzaneh.training.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Fibonacci_N_Modulo_MTest {

    private Fibonacci_N_Modulo_M fibonacci = new Fibonacci_N_Modulo_M();

    @Test
    void computeTest() {
        long result = fibonacci.fibonacciModulo(13, 11);
        Assertions.assertEquals(2, result);
    }

}
