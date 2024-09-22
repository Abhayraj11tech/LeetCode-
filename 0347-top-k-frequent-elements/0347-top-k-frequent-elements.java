class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         ArrayList<Integer> freq = new ArrayList<Integer>();
        ArrayList<Integer> store = new ArrayList<Integer>();
        ArrayList<Integer> elm = new ArrayList<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        Arrays.sort(nums);

        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if ((i + 1) < nums.length && nums[i + 1] == nums[i]) {
                count++;
            } else {
                freq.add(count);
                store.add(count);
                elm.add(nums[i]);
                count = 1;
            }
        }
        
        for (int i = 0; i < k; i++) {
            int max = Collections.max(freq);
            int idx = store.indexOf(max);
            // System.out.println(idx);
            res.add(elm.get(idx));
            freq.set(idx,Integer.MIN_VALUE);
            store.set(idx,Integer.MIN_VALUE);

        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = res.get(i);
        }
        return ans;
        
    }
}