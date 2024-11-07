class Solution {
    public int rearrangeCharacters(String s, String target) {
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < target.length(); i++){
            char ch = target.charAt(i);
            int val = 0;

            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == ch){
                    val++;
                }
            }

            if (val == 0) {
                return 0;  
            }

            int count = 0;
            for (int k = 0; k < target.length(); k++) {
                if (target.charAt(k) == ch) {
                    count++;
                }
            }

            min = Math.min(min, val / count);
        }

        return min;
    }
}
