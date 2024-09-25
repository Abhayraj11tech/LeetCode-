class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int sol = -1;
        for(int i=0;i<letters.length;i++){
            // String sv = letters[i];
            // char c = sv.charAt(0);
            if((int)letters[i] > (int)target){
                sol = i;
                break;
            }
        }
        char res = ' ';

        if(sol==-1){
         
           res = letters[0];
        }
        else{
           
            res = letters[sol];
        }
      
        return res;
    }
}