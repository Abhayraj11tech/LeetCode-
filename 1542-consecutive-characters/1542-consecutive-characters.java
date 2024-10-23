class Solution {
    public int maxPower(String s) {
        int count = 1;
        int max = 0;
        for(int i=0;i<s.length();i++){
            if((i+1)<s.length() && s.charAt(i+1)==s.charAt(i)){
                ++count;
            }
            else{
                if(count>max){
                    max = count;
                }
                
                count = 1;

            }

        }
        return max;
    }
}