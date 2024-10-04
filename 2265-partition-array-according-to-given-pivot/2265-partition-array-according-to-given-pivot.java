class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
          ArrayList<Integer> before = new ArrayList<>();
        ArrayList<Integer> after = new ArrayList<>();
        int count = 0;
        int [] sol = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                before.add(nums[i]);
            }
            else if(nums[i]>pivot){
                after.add(nums[i]);
            }
            else{
                ++count;
            }
        }
        int p = 0;
        int val = 0;
        int q = 0;
        for(int i=0;i<before.size() + after.size()+count;i++){
            if(i<before.size()){
                sol[i] = before.get(p++);
            }
            else{
                if(val<count){
                    sol[i] = pivot;
                    ++val;
                }
                else{
                    sol[i] = after.get(q++);
                }
            }
        }
        
            return sol;
    }
}