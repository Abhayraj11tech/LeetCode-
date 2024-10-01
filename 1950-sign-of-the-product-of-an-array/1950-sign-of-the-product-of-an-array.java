class Solution {
    public int arraySign(int[] nums) {
          Arrays.sort(nums);
        int res = Arrays.binarySearch(nums, 0);
        boolean test = res >= 0 ? true : false;
        if(test==true){
            return 0;
        }
        else{
            int count = 0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<0){
                    ++count;
                }
            }
            if(count%2==0){
                return 1;
            }
            else{
                return -1;
            }
        }
       
    }
}