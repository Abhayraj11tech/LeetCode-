class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){ 
            String str = Integer.toBinaryString(nums[i]|nums[j]);
            if(str.charAt(str.length()-1) == '0'){
                ++count;
            }
        }
        }
        if(count>=1){
            return true;
        }
        else{
            return false;
        }
    }
}