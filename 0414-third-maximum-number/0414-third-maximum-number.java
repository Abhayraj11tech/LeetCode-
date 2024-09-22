class Solution {
    public int thirdMax(int[] nums) {
         Arrays.sort(nums);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
            for(int i=0;i<nums.length;i++){
                if(!(arr.contains(nums[nums.length-1-i]))){ 
                arr.add(nums[nums.length-1-i]);
                }
                
            }
            int size = arr.size();
            if(size<3){
                return nums[nums.length-1];
            }
            else{ 
                
                return arr.get(2);
        
    
}

    }
}