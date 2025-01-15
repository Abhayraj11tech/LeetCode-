class Solution { 
    public int minSubArrayLen(int k, int[] arr) { 
        int res = Integer.MAX_VALUE;
        int prefixSum = 0;
        int left = 0;

        for (int right = 0; right < arr.length; ++right) { 
            prefixSum += arr[right];

            while (prefixSum >= k) {
                res = Math.min(res, right - left + 1);
                prefixSum -= arr[left++];
            } 
        }

        return res == Integer.MAX_VALUE ? 0 : res; 
    } 
}
