class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;
        int n = word.length();
        
        for (int i = 0; i < n; i++) {
            if (isVowel(word.charAt(i))) {
                boolean[] flag = new boolean[5];
                int vow = 0;

                for (int j = i; j < n; j++) {
                    char ch = word.charAt(j);
                    if (isVowel(ch)) {
                        int index = getVowelIndex(ch);
                        if (!flag[index]) {
                            flag[index] = true;
                            vow++;
                        }
                        
                        if (vow == 5) {
                            count++;
                        }
                    } else {
                        break;
                    }
                }
            }
        }

        return count;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    
    private int getVowelIndex(char ch) {
        switch (ch) {
            case 'a': return 0;
            case 'e': return 1;
            case 'i': return 2;
            case 'o': return 3;
            case 'u': return 4;
            default: return -1; 
        }
    }
}
