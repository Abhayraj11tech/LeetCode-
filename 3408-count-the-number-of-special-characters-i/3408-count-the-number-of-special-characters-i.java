class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set = new HashSet<>();
        String chk = word;
        for(int i=0;i<word.length();i++){
            char c1 = Character.toLowerCase(word.charAt(i));
            char c2 =  Character.toUpperCase(word.charAt(i));
            if(chk.contains(""+c1) && chk.contains(""+c2)){
                char c = c1;
                set.add(c);
            }
        }
        List<Character> sol = new ArrayList<>(set);
        return sol.size();
    }
}