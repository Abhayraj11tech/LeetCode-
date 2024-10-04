class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
               pos.add(nums[i]);
            }
            else{
                neg.add(nums[i]);
            }
        }
        int p = 0;
        int q = 0;
        int count = 0;
        int [] sol = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(count==0){
                sol[i] = pos.get(p++);
                count = 1;
            }
            else{
                sol[i] = neg.get(q++);
                count = 0;
            }
        }
        return sol;
    }
}