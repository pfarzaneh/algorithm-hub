package pfarzaneh.training.algorithms.sherlockvalidstring;

public class Result {

    public static String isValid(String s) {
        if (s.length() <= 3)
            return "YES";

        int[] c = new int[26];

        for (int i = 0; i < s.length(); i++) {
            ++c[s.charAt(i) - 97];
        }

        int[] v = new int[2];
        int[] w = new int[2];

        for (int i = 0; i < 26; i++) {
            if (c[i] != 0) {
                if (v[0] == 0 || v[0] == c[i]) {
                    v[0] = c[i];
                    ++w[0];
                } else if (v[1] == 0 || v[1] == c[i]) {
                    v[1] = c[i];
                    ++w[1];
                } else return "NO";
            }
        }

        if (v[0] == 0 || v[1] == 0) return "YES";
        if (w[0] > 1 && w[1] > 1) return "NO";

        if (w[0] == 1) {
            --v[0];
            return v[0] == 0 || v[0] == v[1] ? "YES" : "NO";
        } else {
            --v[1];
            return v[1] == 0 || v[1] == v[0] ? "YES" : "NO";
        }
    }
}
