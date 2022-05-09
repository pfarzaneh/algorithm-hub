package pfarzaneh.training.algorithms.xor;


public class Solution {

    public static String stringsXOR(String s, String t) {
        String res = "";

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t.charAt(i)) //
                res = res.concat("0");
            else
                res = res.concat("1");
        }

        return res;
    }

}