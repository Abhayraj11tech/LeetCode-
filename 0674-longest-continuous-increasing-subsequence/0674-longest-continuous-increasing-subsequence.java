class Solution {
    public int findLengthOfLCIS(int[] nums) {
               ArrayList<Integer> sol = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int count = 1;
            boolean flag = false;
            for(int j=i;j<nums.length;j++){
                if(j+1<nums.length){
                if(nums[j+1]>nums[j]){
                    ++count;
                    flag = true;
                }
                else{
                    break;
                }
                }
            }
            if(flag == true){
                sol.add(count);
            }
           
             
        }
        Collections.sort(sol);
        Collections.reverse(sol);
        if(sol.size()==0){
            return 1;
        }
        else{
            return sol.get(0);
        }
        
    }
}