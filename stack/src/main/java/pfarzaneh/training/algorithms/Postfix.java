package pfarzaneh.training.algorithms;

public class Postfix {

    public void convert(String expression) {
        char[] chars = expression.toCharArray();
        char[] result = new char[chars.length];
        ArrayStack stack = new ArrayStack(chars.length);
        int index = 0;

        for (char c : chars) {
            if (isOperator(c))
                result[index++] = c;
            else {
                // c is operand
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    while ((char) stack.peek() != '(')
                        result[index++] = (char) stack.pop();
                    stack.pop();
                } else if (stack.isEmpty() || (weigh((char) stack.peek()) < weigh(c))) {
                    stack.push(c);
                } else {
                    while (!stack.isEmpty()) {
                        if ((char) stack.peek() == '(')
                            break;
                        result[index++] = (char) stack.pop();
                    }
                    stack.push(c);
                }
            }
        }

        while (!stack.isEmpty()) {
            result[index++] = (char) stack.pop();
        }

        System.out.println(String.valueOf(result).trim());

    }

    private boolean isOperator(char c) {
        return c != '+' &&
            c != '-' &&
            c != '*' &&
            c != '^' &&
            c != '/' &&
            c != '(' &&
            c != ')';
    }

    private int weigh(char c) {
        switch (c) {
            case '(':
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        throw new RuntimeException("Incorrect operand !!!");
    }
}
