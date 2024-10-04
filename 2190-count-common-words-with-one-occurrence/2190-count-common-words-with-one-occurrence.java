class Solution {
    public int countWords(String[] words1, String[] words2) {
         int count = 0;
        for(int i=0;i<words1.length;i++){
            int count1 = 0;
            int count2 = 0;
            boolean flag1 = false;
            boolean flag2 = false;
            for(int j=0;j<words1.length;j++){
                if(words1[j].equals(words1[i])){
                    ++count1;
                }
                if(count1==2){
                    flag1 = true;
                    break;
                }
            }
            if(flag1==false && count1==1){
            for(int k=0;k<words2.length;k++){
                if(words2[k].equals(words1[i])){
                    ++count2;
                }
                if(count2==2){
                    flag2 = true;
                    break;
                }
            }
            if(flag2==false && count2==1){
                ++count;
            }
        }}
        return count;
    }
}