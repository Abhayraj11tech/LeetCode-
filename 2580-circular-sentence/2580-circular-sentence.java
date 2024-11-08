class Solution {
    public boolean isCircularSentence(String sentence) {
        int count = 0;
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' '){
                ++count;
                if(sentence.charAt(i-1)!=sentence.charAt(i+1)){
                    return false;
                }
            }
        }
        if(count==0){
            if(sentence.charAt(0)==sentence.charAt(sentence.length()-1)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if(sentence.charAt(sentence.length()-1)!= sentence.charAt(0)){
                return false;
            }
            else{
                return true;
            }
        }
    }
}