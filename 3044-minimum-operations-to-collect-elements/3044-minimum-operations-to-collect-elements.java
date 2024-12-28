class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int count = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        int i = nums.size()-1;
        while(arr.size()!=k){
            if(nums.get(i)>=1 && nums.get(i)<=k && !arr.contains(nums.get(i))){
                arr.add(nums.get(i));
            }
            ++count;
            --i;
        }
        return count;

    }
}