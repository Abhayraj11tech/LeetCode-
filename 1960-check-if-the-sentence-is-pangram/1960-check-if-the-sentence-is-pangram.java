class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new TreeSet<>();
        for(int i=0;i<sentence.length();i++){
            set.add(sentence.charAt(i));
        }
        List<Character> sol = new ArrayList<>(set);
        return sol.size()==26 ? true : false;
    }
}