class Solution {
    public int secondHighest(String s) {
        Set<Character> sol = new TreeSet<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                sol.add(s.charAt(i));
            }
        }
        List<Character> list = new ArrayList<>(sol);
        if(list.size()<=1){
            return -1;
        }
        else{
            return Integer.parseInt("" + list.get(list.size()-2));
        }
    }
}