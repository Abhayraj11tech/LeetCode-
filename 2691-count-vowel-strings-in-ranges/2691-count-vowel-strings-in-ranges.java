class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] val = new int[n + 1];
        
     
        for (int i = 0; i < n; i++) {
            String str = words[i];
            if ("aeiou".indexOf(str.charAt(0)) != -1 && "aeiou".indexOf(str.charAt(str.length() - 1)) != -1) {
                val[i + 1] = val[i] + 1;
            } else {
                val[i + 1] = val[i];
            }
        }
        
        // Process queries
        int[] sol = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            sol[i] = val[right + 1] - val[left];
        }
        
        return sol;
    }
}
