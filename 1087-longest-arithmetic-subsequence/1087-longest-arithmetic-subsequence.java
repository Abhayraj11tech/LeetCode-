class Solution {
    public int longestArithSeqLength(int[] nums) {
        int ans = 0;
        int n = nums.length;
        HashMap<Integer,Integer>[] map = new HashMap[n];
        for(int i = 0;i<n;i++){
            map[i] = new HashMap<>();
            for(int j = 0;j<i;j++){
                int diff = nums[j]-nums[i];
                map[i].put(diff, map[j].getOrDefault(diff,1)+1);
                ans= Math.max(ans, map[i].get(diff));
            }
        }
        return ans;
    }
}