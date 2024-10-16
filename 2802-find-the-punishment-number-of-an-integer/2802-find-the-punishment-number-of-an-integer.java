class Solution {
    public int punishmentNumber(int n) {
        int sol = 0;

        for(int i = 1; i <= n; i++) {
            int val = i;
            int num = val * val;
            String str = Integer.toString(num);
            if (canPartition(str, val)) {
                sol += num;
            }
        }
        return sol;
    }

    private boolean canPartition(String str, int target) {
        return helper(str, 0, 0, target);
    }

    private boolean helper(String str, int idx, int currentSum, int target) {
        if (idx == str.length()) {
            return currentSum == target;
        }

        for (int i = idx; i < str.length(); i++) {
            String part = str.substring(idx, i + 1);
            int partValue = Integer.parseInt(part);
            if (helper(str, i + 1, currentSum + partValue, target)) {
                return true;
            }
        }

        return false;
    }
}
