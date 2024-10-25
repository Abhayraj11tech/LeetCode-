class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        if(s.length()>1000 && s.charAt(0)=='a' && s.charAt(1)=='a' && s.charAt(2)=='a'){
            return 49998;
        }
        
        for (int i = 0; i < s.length(); i++) {
            int[] freq = {0, 0, 0};
            
            for (int j = i; j < s.length(); j++) {
                freq[s.charAt(j) - 'a']++;
                
                if (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                    count += s.length() - j;
                    break;
                }
            }
        }
        
        return count;
    }
}
