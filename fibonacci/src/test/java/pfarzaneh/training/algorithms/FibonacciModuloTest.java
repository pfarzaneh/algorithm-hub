package pfarzaneh.training.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FibonacciModuloTest {

    private FibonacciModulo fibonacci = new FibonacciModulo();

    @Test
    void computeTest() {
        long result = fibonacci.fibonacciModulo(13, 11);
        Assertions.assertEquals(2, result);
    }

}
