class Solution {
    public int mostWordsFound(String[] sentences) {
        int sol = -1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++){
            String str = sentences[i];
            int count = 1;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==' '){
                    ++count;
                }
            }
            if(count>max){
                sol = count;
                max = count;
            }
        }
        return sol;
    }
}