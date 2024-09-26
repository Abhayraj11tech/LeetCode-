class Solution {
    public int[] shortestToChar(String s, char c) {
             ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                arr.add(i);
            }
        }
        int len  = 1000;
        int sol = 0;
        int [] answer = new int[s.length()];
        for(int j=0;j<s.length();j++){
            for(int k=0;k<arr.size();k++){
         
                    if( Math.abs(j - arr.get(k)) < len ){
                            sol = Math.abs(j - arr.get(k));
                            len = sol;
                    }
            }
            answer[j] = sol;
            sol = 0;
            len = 1000;
        }
        return answer;
       
    }
}