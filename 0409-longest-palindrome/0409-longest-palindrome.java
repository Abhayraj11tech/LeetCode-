class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();       
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        int count = 0;
        boolean flag = false;

        for (int freq : frequencyMap.values()) {
            if (freq % 2 == 0) {
                count += freq;
            } else {
                count += freq - 1;
                flag = true;
            }
        }

        if (flag) {
            count++;
        }

        return count;
    }
}
