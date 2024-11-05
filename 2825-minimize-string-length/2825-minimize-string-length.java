class Solution {
    public int minimizedStringLength(String s) {
        Set<Character> sol = new HashSet<>();
        
        for (char c : s.toCharArray()) {
            sol.add(c); 
        }
        
        return sol.size();  
    }
}
