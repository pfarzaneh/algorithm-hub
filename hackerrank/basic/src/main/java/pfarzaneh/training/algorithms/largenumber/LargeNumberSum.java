package pfarzaneh.training.algorithms.largenumber;

public class LargeNumberSum {

    public String compute(String firstNumber, String secondNumber) {

        char[] largerNumberDigits;
        char[] smallerNumberDigits;

        if (firstNumber.length() > secondNumber.length()) {
            largerNumberDigits = firstNumber.toCharArray();
            smallerNumberDigits = secondNumber.toCharArray();
        } else {
            largerNumberDigits = secondNumber.toCharArray();
            smallerNumberDigits = firstNumber.toCharArray();
        }

        int largerNumberLength = largerNumberDigits.length;
        int smallerNumberLength = smallerNumberDigits.length;

        StringBuilder result = new StringBuilder();
        int carry = 0;
        int digitSum;

        for (int i = 0; i < largerNumberLength; i++) {
            if (i < smallerNumberLength)
                digitSum = Integer.valueOf(largerNumberDigits[largerNumberLength - 1 - i] + "")
                    + Integer.valueOf(smallerNumberDigits[smallerNumberLength - 1 - i] + "")
                    + carry;
            else
                digitSum = Integer.valueOf(largerNumberDigits[largerNumberLength - 1 - i] + "")
                    + carry;

            result.insert(0, digitSum % 10);

            carry = (digitSum > 9) ? 1 : 0;

        }

        if (carry == 1)
            result.insert(0, 1);

        return result.toString();

    }
}
