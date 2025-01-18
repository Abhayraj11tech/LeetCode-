public class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0, count = 0, max = 0;
        int[] freq = new int[26];
        
        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'A']++;
            count = Math.max(count, freq[s.charAt(right) - 'A']);
            
            if (right - left + 1 - count > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            
            max = Math.max(max, right - left + 1);
        }
        
        return max;
    }
}
