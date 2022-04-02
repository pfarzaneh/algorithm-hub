package pfarzaneh.training.algorithms;

import org.junit.jupiter.api.Test;

public class PostfixTest {

    private Postfix postfix = new Postfix();

    @Test
    public void test() {
        postfix.convert("a+b*(c+d*e)^(f+g*h)-i");
    }

}

