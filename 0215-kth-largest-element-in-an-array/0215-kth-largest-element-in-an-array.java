class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
       int idx = 0;
       int sol = 0;
       while(idx!=k)
       {
            sol = pq.remove();
            ++idx;
       }
       return sol;
    }
}