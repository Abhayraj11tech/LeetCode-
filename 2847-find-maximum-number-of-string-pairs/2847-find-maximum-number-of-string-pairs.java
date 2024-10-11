class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        Set<String> sol = new HashSet<>();

        for (String word : words) {
            String rev = new StringBuilder(word).reverse().toString();
            if (sol.contains(rev)) {
                count++;
            }
            sol.add(word);
        }
        
        return count;
    }
}
