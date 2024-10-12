class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> sol = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String str = words[i];
            String cmp = "" + x;
            if(str.contains(cmp)){
                sol.add(i);
        }
        }
        return sol;
    }
}