class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        int a = s.length();
        int[] val = new int[a + 1];
        
        Set<String> dictSet = new HashSet<>(Arrays.asList(dictionary));
        
        for (int i = 1; i <= a; i++) {
           
            val[i] = val[i - 1] + 1;
            
            for (int j = 0; j < i; j++) {
                if (dictSet.contains(s.substring(j, i))) {
                    val[i] = Math.min(val[i], val[j]);
                }
            }
        }
        
        return val[a];
    }
}
