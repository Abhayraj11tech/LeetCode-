import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] sol = new String[n];
        String[] res = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (a, b) -> score[b] - score[a]);
        
        for (int i = 0; i < n; i++) {
            if (i < 3) {
                sol[indices[i]] = res[i];
            } else {
                sol[indices[i]] = String.valueOf(i + 1);
            }
        }
        
        return sol;
    }
}
