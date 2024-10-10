class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int [] sol = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ArrayList<Integer> arr = new ArrayList<>();
            ArrayList<Integer> brr = new ArrayList<>();
            for(int a=0;a<=i;a++){
                if(!arr.contains(nums[a])){
                    arr.add(nums[a]);
                }
            }
            for(int b=i+1;b<nums.length;b++){
                if(!brr.contains(nums[b])){ 
                brr.add(nums[b]);
                }
            }
            sol[i] = arr.size() - brr.size();
        }
        return sol;

    }
}