package pfarzaneh.training.algorithms;

public class Rotate {

    public void leftward(int[] array, int moves) {

        if (moves <= (array.length / 2) || moves == array.length) {
            oneStepLeftward(array, moves);
        } else {
            multiStepLeftward(array, moves);
        }
    }

    private void oneStepLeftward(int[] array, int moves) {
        int length = array.length;
        int diff = length - moves;
        int[] temp = new int[moves];
        for (int i = 0; i < diff; i++) {
            if (i < moves)
                temp[i] = array[i];
            array[i] = array[i + moves];
            if (i == diff - 1) {
                for (int j = 0; j < moves; j++) {
                    array[length - 1 - j] = temp[moves - 1 - j];
                }
            }
        }
    }

    private void multiStepLeftward(int[] array, int moves) {
        int length = array.length;
        int diff = length - moves;
        int iterates = length / diff;
        int lastRound = length % diff;
        int[] temp = new int[diff];
        int currentIndex = 0;

        for (int i = 0; i < diff; i++) {

            temp[i] = array[currentIndex];
            array[currentIndex] = array[i + moves];
            currentIndex++;

            if (i == diff - 1) {
                if (--iterates > 0) {
                    for (int j = diff; j > 0; j--)
                        array[length - j] = temp[diff - j];
                } else {
                    for (int j = lastRound; j > 0; j--)
                        array[length - j] = temp[lastRound - j];

                    return;
                }
                i = -1;
            }

        }
    }

}

