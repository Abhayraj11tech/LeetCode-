class Solution {
    public int punishmentNumber(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int val = i * i;
            if (check(Integer.toString(val), 0, i, 0)) {
                count += val;
            }
        }
        return count;
    }

    public boolean check(String dt, int idx, int target, int sum) {
        if (idx == dt.length()) {
            return sum == target;
        }
        int num = 0;
        for (int i = idx; i < dt.length(); i++) {
            num = num * 10 + (dt.charAt(i) - '0');
            if (check(dt, i + 1, target, sum + num)) {
                return true;
            }
        }
        return false;
    }
}
