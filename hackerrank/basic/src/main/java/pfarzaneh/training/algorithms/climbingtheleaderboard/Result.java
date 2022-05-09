package pfarzaneh.training.algorithms.climbingtheleaderboard;

import java.util.ArrayList;
import java.util.List;

public class Result {

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {

        int[] rankedRate = new int[ranked.size()];
        rankedRate[0] = 1;
        for (int i = 1; i < ranked.size(); i++) {
            rankedRate[i] =
                (ranked.get(i) < ranked.get(i - 1))
                    ? rankedRate[i - 1] + 1
                    : rankedRate[i - 1];
        }

        List<Integer> playerTrack = new ArrayList<>();
        int ri = ranked.size() - 1;
        int rs;

        for (int ps : player) {
            rs = ranked.get(ri);

            if (ps < rs) {
                playerTrack.add(rankedRate[ri] + 1);
            } else if (ps == rs) {
                playerTrack.add(rankedRate[ri]);
                while (ranked.get(ri) == ps && ri > 0) {
                    --ri;
                }
            } else {
                while (ps > ranked.get(ri) && ri > 0) {
                    --ri;
                }
                playerTrack.add((ranked.get(ri) > ps ? 1 : 0) + rankedRate[ri]);
            }
        }

        return playerTrack;
    }
}
