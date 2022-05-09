package pfarzaneh.training.algorithms.binarygap;

public class Result {

    public int solution(int N) {
        // write your code in Java SE 8
        String binary = Integer.toBinaryString(N);
        char[] digits = binary.toCharArray();
        int count = 0, largest = 0;
        boolean oneSeen = false;

        for (char c : digits) {
            if (c == '1') {
                if (!oneSeen)
                    oneSeen = true;
                else if (count > 0) {
                    if (count > largest)
                        largest = count;
                    count = 0;
                }
            } else if (oneSeen)
                ++count;
        }

        return largest;
    }

}
