class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int i=0;i<nums.length;i++){
            boolean flag1 = false;
            boolean flag2 = false;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    flag1 = true;
                    break;
                }
            }
            for(int k=i+1;k<nums.length;k++){
                if(nums[k]>nums[i]){
                    flag2 = true;
                    break;
                }

            }
            if(flag1==true && flag2==true){
                ++count;
            }
        }
        return count;
    }
}