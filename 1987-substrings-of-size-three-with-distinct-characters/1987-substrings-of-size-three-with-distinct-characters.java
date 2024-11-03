class Solution {
    public int countGoodSubstrings(String s) {
        ArrayList<Character> set = new ArrayList<>();
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(i+2 < s.length()){
                if(!set.contains(s.charAt(i))){ 
                set.add(s.charAt(i));
                }
                if(!set.contains(s.charAt(i+1))){ 
                set.add(s.charAt(i+1));
                }
                if(!set.contains(s.charAt(i+2))){ 
                set.add(s.charAt(i+2));
                }
                if(set.size()==3){
                    ++count;
                }
                set.clear();
            }
            else{
                break;
            }
        }
        return count;
    }
}