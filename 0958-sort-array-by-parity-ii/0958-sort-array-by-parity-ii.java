class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                odd.add(nums[i]);
            }
            else{
                even.add(nums[i]);
            }
        }
        int p =0 ,q=0;
        int [] sol = new int[nums.length];
          for(int i=0;i<nums.length;i++){
            if(i%2==0){
                sol[i] = even.get(p++);
            }
            else{
                sol[i] = odd.get(q++);
            }
        }
        return sol;

    }
}