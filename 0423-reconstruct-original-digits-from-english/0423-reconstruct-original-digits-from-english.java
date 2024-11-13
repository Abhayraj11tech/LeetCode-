class Solution {
    public String originalDigits(String s) {
        String sol = "";
        String alpha[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        int[] count = new int[10]; 
        int[] letterCount = new int[26]; 
        for (char c : s.toCharArray()) {
            letterCount[c - 'a']++;
        }
     
        count[0] = letterCount['z' - 'a']; 
        count[2] = letterCount['w' - 'a']; 
        count[4] = letterCount['u' - 'a'];
        count[6] = letterCount['x' - 'a']; 
        count[8] = letterCount['g' - 'a'];
        
        count[3] = letterCount['h' - 'a'] - count[8];
        count[5] = letterCount['f' - 'a'] - count[4];
        count[7] = letterCount['s' - 'a'] - count[6];
        count[1] = letterCount['o' - 'a'] - count[0] - count[2] - count[4]; 
        count[9] = letterCount['i' - 'a'] - count[5] - count[6] - count[8];
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < count[i]; j++) {
                result.append(i);
            }
        }
        
        return result.toString();
    }
}
