class Solution {
    public int largestPerimeter(int[] nums) {
    Arrays.sort(nums);
    int peri = 0;
        for(int i=nums.length-1;i>=0;i--){
            if(i-2>=0){
            if(nums[i-2] + nums[i-1] > nums[i]){
                peri = nums[i-2] + nums[i-1] + nums[i];
                break;
            }
        }
        }
        return peri;


                }
        }
        
     