class Solution {
    public boolean isBalanced(String num) {
        int even = 0;
        int odd = 0;
        for(int i=0;i<num.length();i++){
            int val = Integer.parseInt(""+num.charAt(i));
            if(i%2==0){
                even += val;
            }
            else{
                odd += val;
            }
        }
        return even == odd;
    }
}