class Solution {
    public int dominantIndex(int[] nums) {
          int [] arr = Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        boolean flag = true;
      int sol =-1;
        int val = nums[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]*2>val){
                flag = false;
                break;
            }
        }
        if(flag==true){
            for(int i=0;i<nums.length;i++){
                if(nums[nums.length-1]==arr[i]){
                    sol = i;
                    break;
                }
            }
            return sol;
        }
        else{
            return -1;
        }
    }
}