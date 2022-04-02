package pfarzaneh.training.algorithms.militarytime;

import java.io.*;

class Result {

    public static String timeConversion(String s) {

        boolean isPM = s.contains("PM");
        s = s.replace(isPM ? "PM" : "AM", "");

        String[] parts = s.split(":");
        int hour = Integer.parseInt(parts[0]);
        if (isPM) {
            if (hour != 12)
                hour += 12;
        } else {
            if (hour == 12)
                hour = 0;
        }

        return String.format("%02d", hour)
            + ":"
            + parts[1]
            + ":"
            + parts[2];
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}