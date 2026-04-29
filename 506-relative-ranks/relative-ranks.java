import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];

        // Step 1: map score → index
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(score[i], i);
        }

        // Step 2: sort scores (ascending)
        int[] sorted = score.clone();
        Arrays.sort(sorted);

        // Step 3: assign ranks from highest
        for (int i = n - 1; i >= 0; i--) {
            int rank = n - i;
            int index = map.get(sorted[i]);

            if (rank == 1) {
                result[index] = "Gold Medal";
            } else if (rank == 2) {
                result[index] = "Silver Medal";
            } else if (rank == 3) {
                result[index] = "Bronze Medal";
            } else {
                result[index] = String.valueOf(rank);
            }
        }

        return result;
    }
}