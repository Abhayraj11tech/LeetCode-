class Solution {
    public long countQuadruplets(int[] nums) {
        int n = nums.length;
        int[][] val1 = new int[n][n];
        int[][] val2 = new int[n][n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i + 1; j < n; j++) {
                count += (nums[j] > nums[i]) ? 1 : 0;
                val1[i][j] = count;
            }
        }

        for (int l = n - 1; l >= 0; l--) {
            int count = 0;
            for (int k = l - 1; k >= 0; k--) {
                count += (nums[k] < nums[l]) ? 1 : 0;
                val2[k][l] = count;
            }
        }

        long ans = 0;
        for (int j = 1; j < n - 2; j++) {
            for (int k = j + 1; k < n - 1; k++) {
                if (nums[j] < nums[k]) {
                    continue;
                }

                int possibleI = val2[0][k] - val2[j][k];
                int possibleL = val1[j][n - 1] - val1[j][k];

                ans += (possibleI * possibleL);
            }
        }

        return ans;
    }
}
