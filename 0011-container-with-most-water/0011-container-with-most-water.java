class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int sol = Integer.MIN_VALUE;
        while (l < r) {
            int wd = r - l;
            int ht = Math.min(height[l], height[r]);
            int val = wd * ht;
            sol = Math.max(sol, val);
            if (height[l] > height[r]) {
                --r;
            } else {
                ++l;
            }
        }
        return sol;
    }
}
