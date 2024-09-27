class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> sol = new ArrayList<>();
        
        for (String str : queries) {
            int pIndex = 0;
            boolean matches = true;
            
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                
                if (pIndex < pattern.length() && ch == pattern.charAt(pIndex)) {
                    pIndex++;
                } else if (ch >= 'A' && ch <= 'Z') {
                    matches = false;
                    break;
                }
            }
            
            if (matches && pIndex == pattern.length()) {
                sol.add(true);
            } else {
                sol.add(false);
            }
        }
        
        return sol;
    }
}
